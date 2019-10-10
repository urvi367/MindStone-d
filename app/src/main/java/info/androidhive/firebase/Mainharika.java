package info.androidhive.firebase;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import de.hdodenhof.circleimageview.CircleImageView;

public class Mainharika extends AppCompatActivity {

    ImageButton MEMES,QUOTES,STORIES,MUSIC;
    TextView memes,quotes,stories,music;
    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;
    private View navHeader;
    Intent ii;
    TextView name, email;
    CircleImageView img;
    FirebaseAuth mFirebaseAuth;
    FirebaseUser mFirebaseUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harika);

        MEMES=findViewById(R.id.memesimage);
        QUOTES=findViewById(R.id.Quotesimage);
        STORIES=findViewById(R.id.Storiesimage);
        MUSIC=findViewById(R.id.Musicimage);

        memes=findViewById(R.id.Memestext);
        quotes=findViewById((R.id.Quotestext));
        stories=findViewById(R.id.Storiestext);
        music=findViewById(R.id.Musictext);

        MUSIC.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent i = new Intent(Mainharika.this, Music_Activity.class);
                                         startActivity(i);
                                     }
                                 });
         STORIES.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Intent i= new Intent(  Mainharika.this,Stories_Activity.class);
                                            startActivity(i);
                                        }
                                    });
        MEMES.setOnClickListener(new View.OnClickListener() {
       @Override
             public void onClick(View v) {
               Intent i = new Intent(Mainharika.this,Memes_Activity.class);
                 startActivity(i);
             }
         });

         QUOTES.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent i= new Intent(Mainharika.this,Quotes_Activity.class);
                 startActivity(i);
             }
         });


        nv = (NavigationView)findViewById(R.id.nv);
        navHeader = nv.getHeaderView(0);
        dl = (DrawerLayout)findViewById(R.id.hh);
        t = new ActionBarDrawerToggle(this, dl,R.string.Open, R.string.Close);
        name= navHeader.findViewById(R.id.name);
        email= navHeader.findViewById(R.id.email);
        img= navHeader.findViewById(R.id.img_profile);

        dl.addDrawerListener(t);
        t.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override

            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                switch(id)

                {

                    case R.id.nav_know_thyself:
                    {
                        ii=new Intent(Mainharika.this, KnowThyself.class);
                        startActivity(ii);
                        break;
                    }

                    case R.id.nav_monitor_yourself:
                    {
                        ii=new Intent(Mainharika.this, homepage.class);
                        startActivity(ii);
                        break;
                    }
                    case R.id.nav_mood_lifter:
                        break;

                    case R.id.nav_survival_manual:

                    {
                        ii=new Intent(Mainharika.this, SurvivalManual1.class);
                        startActivity(ii);
                        break;
                    }

                    case R.id.nav_contact_for_help:
                    {
                        ii=new Intent(Mainharika.this, ContactForHelp.class);
                        startActivity(ii);
                        break;
                    }

                    case R.id.nav_settings:
                    {
                        ii=new Intent(Mainharika.this, OtherActivity.class);
                        startActivity(ii);
                        break;
                    }

                    case R.id.nav_about_us:
                    {
                        ii=new Intent(Mainharika.this, aboutUs.class);
                        startActivity(ii);
                        break;
                    }

                    default:

                        return true;

                }
                return true;
            }
        });

        mFirebaseAuth = FirebaseAuth.getInstance();
        mFirebaseUser = mFirebaseAuth.getCurrentUser();

        if(mFirebaseUser!=null)
        {
            if(mFirebaseUser.getPhotoUrl() !=null)
            {
                Glide.with(this).load(mFirebaseUser.getPhotoUrl().toString()).into(img);
            }

            if(mFirebaseUser.getDisplayName()!=null)
                name.setText(mFirebaseUser.getDisplayName());

            if(mFirebaseUser.getEmail()!=null)
                email.setText(mFirebaseUser.getEmail());
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(t.onOptionsItemSelected(item))

            return true;

        return super.onOptionsItemSelected(item);

    }
}