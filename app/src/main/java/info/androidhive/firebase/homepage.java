package info.androidhive.firebase;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import de.hdodenhof.circleimageview.CircleImageView;

public class homepage extends AppCompatActivity {

    private ScrollView mscroll;
    private ImageButton mb1;
    private ImageButton mb2;

    private ImageButton mb3;
    private ImageButton mb4;
    private ImageButton mb5;
    private TextView t1,t2,t3,t4,t5;

    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;
    private View navHeader;
    TextView name, email;
    Intent ii;
    CircleImageView img;
    FirebaseAuth mFirebaseAuth;
    FirebaseUser mFirebaseUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        mb1=(ImageButton)findViewById(R.id.button1);
        mb2=(ImageButton)findViewById(R.id.button2);
        mb3=(ImageButton)findViewById(R.id.button3);
        mb4=(ImageButton)findViewById(R.id.button4);
        mb5=(ImageButton)findViewById(R.id.button5);
        t1=(TextView)findViewById(R.id.textView11) ;
        t2=(TextView)findViewById(R.id.textView12) ;
        t3=(TextView)findViewById(R.id.textView13) ;
        t4=(TextView)findViewById(R.id.textView14) ;
        t5=(TextView)findViewById(R.id.textView15) ;

        mb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(homepage.this,MainActivity.class));
            }
        });

        mb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(homepage.this,borderline.class));
            }
        });

        mb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(homepage.this,anxiety.class));
            }
        });

        mb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(homepage.this,adhd.class));
            }
        });

        mb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(homepage.this,depression.class));
            }
        });


        nv = (NavigationView)findViewById(R.id.nv);
        navHeader = nv.getHeaderView(0);
        dl = (DrawerLayout)findViewById(R.id.vv);
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
                        ii=new Intent(homepage.this, KnowThyself.class);
                        startActivity(ii);
                        break;
                    }

                    case R.id.nav_monitor_yourself:
                        break;

                    case R.id.nav_mood_lifter:
                    {
                        ii=new Intent(homepage.this, Mainharika.class);
                        startActivity(ii);
                        break;
                    }

                    case R.id.nav_survival_manual:
                    {
                        ii=new Intent(homepage.this, SurvivalManual1.class);
                        startActivity(ii);
                        break;
                    }

                    case R.id.nav_contact_for_help:
                    {
                        ii=new Intent(homepage.this, ContactForHelp.class);
                        startActivity(ii);
                        break;
                    }

                    case R.id.nav_settings:
                    {
                        ii=new Intent(homepage.this, OtherActivity.class);
                        startActivity(ii);
                        break;
                    }

                    case R.id.nav_about_us:
                    {
                        ii=new Intent(homepage.this, aboutUs.class);
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
                Glide.with(this).load(mFirebaseUser.getPhotoUrl().toString()).into(img);

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
