package info.androidhive.firebase;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.IOException;

public class ProfileActivity extends AppCompatActivity {

    private static final int CHOOSE_IMAGE =101 ;
    ImageView iv;
    EditText et;
    Button saveButton;
    Uri uriProfileImg;
    ProgressBar progressBar;
    FirebaseAuth auth;
    FirebaseStorage storage;
    StorageReference storageReference;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        auth=FirebaseAuth.getInstance();
        storage = FirebaseStorage.getInstance();
        storageReference = storage.getReference();

        et=(EditText) findViewById(R.id.editText);
        iv=(ImageView) findViewById(R.id.imageView);
        saveButton=(Button) findViewById(R.id.buttonSave);
        progressBar= (ProgressBar) findViewById(R.id.p);

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showImageChooser();
            }
        });

        loadUserInfo();

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uploadImage();
                saveUserInfo();
            }
        });
    }

    @Override
    protected void onStart() {

        super.onStart();
        if(auth.getCurrentUser() == null){
            finish();
            startActivity(new Intent( this, OtherActivity.class));
        }
    }
    public  void loadUserInfo(){

        FirebaseUser user =auth.getCurrentUser();

        if(user!=null)
        {
            if(user.getPhotoUrl() !=null)
            {
                Glide.with(this).load(user.getPhotoUrl().toString()).into(iv);
            }

            if(user.getDisplayName()!=null)
                et.setText(user.getDisplayName());
        }

    }

    public  void saveUserInfo(){
        String displayname=et.getText().toString();
        if(displayname.isEmpty())
        {
            et.setError("Name required");
            et.requestFocus();
            return;
        }
        FirebaseUser user=auth.getCurrentUser();
        if(user!=null && uriProfileImg!=null){
            UserProfileChangeRequest profile =new UserProfileChangeRequest.Builder().setDisplayName(displayname).setPhotoUri(Uri.parse(String.valueOf(uriProfileImg))).build();

            user.updateProfile(profile).addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    if(task.isSuccessful()){
                        Toast.makeText(ProfileActivity.this, "Profile updated", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(ProfileActivity.this, HomeScreen.class);
                    }
                }
            });
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==CHOOSE_IMAGE && resultCode==RESULT_OK && data!=null && data.getData()!=null){
            uriProfileImg=data.getData();
            try {
                Bitmap bitmap= MediaStore.Images.Media.getBitmap(getContentResolver(), uriProfileImg);
                iv.setImageBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void  uploadImage(){

        if(uriProfileImg!=null){

            progressBar.bringToFront();
            progressBar.setVisibility(View.VISIBLE);

            StorageReference ref = storageReference.child("profilepics/"+System.currentTimeMillis()+ ".jpg");
            ref.putFile(uriProfileImg)
                    .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                            progressBar.setVisibility(View.GONE);
                            Toast.makeText(getApplicationContext(), "Uploaded", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(ProfileActivity.this, HomeScreen.class));
                         }
                     })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            progressBar.setVisibility(View.GONE);
                            Toast.makeText(ProfileActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
        }
    }

    private void showImageChooser(){
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent, "Select Profile Image"), CHOOSE_IMAGE);
    }
}
