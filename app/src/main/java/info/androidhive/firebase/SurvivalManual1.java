package info.androidhive.firebase;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import de.hdodenhof.circleimageview.CircleImageView;

public class SurvivalManual1 extends HomeScreen {

    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;
    private View navHeader;
    TextView name, email;
    ImageButton anxiety, depression, adhd, borderline_personality, ptsd;
    int i;
    Intent ii;
    CircleImageView img;
    FirebaseAuth mFirebaseAuth;
    FirebaseUser mFirebaseUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survival_manual_page1);

        anxiety= findViewById(R.id.imageButton2);
        depression= findViewById(R.id.imageButton3);
        borderline_personality= findViewById(R.id.imageButton6);
        adhd= findViewById(R.id.imageButton5);
        ptsd= findViewById(R.id.imageButton4);

        nv = (NavigationView)findViewById(R.id.nv);
        navHeader = nv.getHeaderView(0);
        dl = (DrawerLayout)findViewById(R.id.smdl);
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
                        ii=new Intent(SurvivalManual1.this, KnowThyself.class);
                        startActivity(ii);
                        break;
                    }

                    case R.id.nav_monitor_yourself:
                    {
                        ii=new Intent(SurvivalManual1.this, homepage.class);
                        startActivity(ii);
                        break;
                    }

                    case R.id.nav_mood_lifter:
                    {
                        ii=new Intent(SurvivalManual1.this, Mainharika.class);
                        startActivity(ii);
                        break;
                    }

                    case R.id.nav_survival_manual:
                        break;

                    case R.id.nav_contact_for_help:
                    {
                        ii=new Intent(SurvivalManual1.this, ContactForHelp.class);
                        startActivity(ii);
                        break;
                    }

                    case R.id.nav_settings:
                    {
                        ii=new Intent(SurvivalManual1.this, OtherActivity.class);
                        startActivity(ii);
                        break;
                    }

                    case R.id.nav_about_us:
                    {
                        ii=new Intent(SurvivalManual1.this, aboutUs.class);
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

        anxiety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i=1;
                start(i);
            }
        });

        depression.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i=2;
                start(i);
            }
        });

        borderline_personality.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i=5;
                start(i);
            }
        });

        adhd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i=4;
                start(i);
            }
        });

        ptsd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i=3;
                start(i);
            }
        });
    }

    public void start(int i){
        Intent intent=new Intent(SurvivalManual1.this, SurvivalManual2.class);
        intent.putExtra("choice",i );
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(t.onOptionsItemSelected(item))

            return true;

        return super.onOptionsItemSelected(item);

    }
}
