package info.androidhive.firebase;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ContactForHelp extends HomeScreen {

    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;
    private View navHeader;
    Intent i;
    TextView name, email;
    private List<contacts> contactsList = new ArrayList<>();
    private  RecyclerView rv;
    private CustomAdapter mAdapter;
    CircleImageView img;
    FirebaseAuth mFirebaseAuth;
    FirebaseUser mFirebaseUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_for_help);

        rv = (RecyclerView) findViewById(R.id.rv);
        mAdapter = new CustomAdapter((contactsList), this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(mLayoutManager);
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.setAdapter(mAdapter);

        data();

        nv = (NavigationView) findViewById(R.id.nv);
        navHeader = nv.getHeaderView(0);
        dl = (DrawerLayout) findViewById(R.id.activity_main);
        t = new ActionBarDrawerToggle(this, dl, R.string.Open, R.string.Close);
        name = navHeader.findViewById(R.id.name);
        email = navHeader.findViewById(R.id.email);
        img= navHeader.findViewById(R.id.img_profile);

        dl.addDrawerListener(t);
        t.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override

            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                switch (id)

                {

                    case R.id.nav_know_thyself:
                    {
                        i=new Intent(ContactForHelp.this, KnowThyself.class);
                        startActivity(i);
                        break;
                    }


                    case R.id.nav_monitor_yourself:
                    {
                        i=new Intent(ContactForHelp.this, homepage.class);
                        startActivity(i);
                        break;
                    }

                    case R.id.nav_mood_lifter:
                    {
                        i=new Intent(ContactForHelp.this, Mainharika.class);
                        startActivity(i);
                        break;
                    }

                    case R.id.nav_survival_manual:

                    {
                        i = new Intent(ContactForHelp.this, SurvivalManual1.class);
                        startActivity(i);
                        break;
                    }

                    case R.id.nav_contact_for_help:
                        break;

                    case R.id.nav_settings: {
                        i = new Intent(ContactForHelp.this, OtherActivity.class);
                        startActivity(i);
                        break;
                    }

                    case R.id.nav_about_us:
                    {
                        i=new Intent(ContactForHelp.this, aboutUs.class);
                        startActivity(i);
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
    private  void data(){
        contacts con = new contacts("Dr Rishikesh V Behere, Psychiatrist, Manoshanti Pune", "078880 49087");
        contactsList.add(con);

        con = new contacts("Animo clinic", "097308 48099");
        contactsList.add(con);

        con = new contacts("Dr Swapnil Deshmukh MBBS, MD", "099232 91312");
        contactsList.add(con);

        con = new contacts("Dr Jaideep Patil", "091309 30300");
        contactsList.add(con);

        con = new contacts("Dr Dhananjay V. Ashturkar, Aastha Hospital", "080 3966 4779");
        contactsList.add(con);

        con = new contacts("Dr Rishikesh V Behere, Psychiatrist, Manoshanti Pune", "078880 49087");
        contactsList.add(con);

        con = new contacts("DR. AJIT NAIK's PSYCHIATRY CLINIC", "098679 45254");
        contactsList.add(con);

        con = new contacts("Mindtree psychiatry clinic", "070577 11633");
        contactsList.add(con);

        con = new contacts("The Beautiful Mind - Specialty Psychiatry Clinic", "099232 57565");
        contactsList.add(con);

        con = new contacts("Dr.Niket Kasar", "08071 265 611");
        contactsList.add(con);

        con = new contacts("Mansanjeevani Clinic", "086058 60882");
        contactsList.add(con);

        con = new contacts("Dr. Sanjay Watve", "020 2567 5972");
        contactsList.add(con);

        con = new contacts("Trimiti Clinic", "077220 44644");
        contactsList.add(con);

        con = new contacts("Dr Rohan Jahagirdar Psychiatrist, Pune", "08071 265 813");
        contactsList.add(con);

        mAdapter.notifyDataSetChanged();
        rv.setAdapter(mAdapter);
    }
}
