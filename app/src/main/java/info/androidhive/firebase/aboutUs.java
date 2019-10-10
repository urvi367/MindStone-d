package info.androidhive.firebase;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import de.hdodenhof.circleimageview.CircleImageView;

public class aboutUs extends AppCompatActivity {

    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;
    private View navHeader;
    Intent i;
    TextView name, email;
    CircleImageView img;
    FirebaseAuth mFirebaseAuth;
    FirebaseUser mFirebaseUser;
    TextView t1,t2,t3,t4,t5,t6;
    ImageView im;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.about_us);

        nv = (NavigationView)findViewById(R.id.nv);
        navHeader = nv.getHeaderView(0);
        dl = (DrawerLayout)findViewById(R.id.aaa);
        t = new ActionBarDrawerToggle(this, dl,R.string.Open, R.string.Close);
        name= navHeader.findViewById(R.id.name);
        email= navHeader.findViewById(R.id.email);
        img= navHeader.findViewById(R.id.img_profile);
        im=findViewById(R.id.imageView2);
        t1=findViewById(R.id.textView1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t4=findViewById(R.id.t4);
        t5=findViewById(R.id.t5);
        t6=findViewById(R.id.t6);

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
                        i=new Intent(aboutUs.this, KnowThyself.class);
                        startActivity(i);
                        break;
                    }

                    case R.id.nav_monitor_yourself:
                    {
                        i=new Intent(aboutUs.this, homepage.class);
                        startActivity(i);
                        break;
                    }

                    case R.id.nav_mood_lifter:
                    {
                        i=new Intent(aboutUs.this, Mainharika.class);
                        startActivity(i);
                        break;
                    }

                    case R.id.nav_survival_manual:

                    {
                        i=new Intent(aboutUs.this, SurvivalManual1.class);
                        startActivity(i);
                        break;
                    }

                    case R.id.nav_contact_for_help:
                    {
                        i=new Intent(aboutUs.this, ContactForHelp.class);
                        startActivity(i);
                        break;
                    }

                    case R.id.nav_settings:
                    {
                        i=new Intent(aboutUs.this, OtherActivity.class);
                        startActivity(i);
                        break;
                    }

                    case R.id.nav_about_us:
                    break;

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
