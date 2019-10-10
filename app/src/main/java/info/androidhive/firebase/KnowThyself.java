
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

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import de.hdodenhof.circleimageview.CircleImageView;

public class KnowThyself extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();
//    private WebView myWebView;
//    private webView mwebView=new webView();
//    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private Button mButtonChoice5;
    private Button mButtonChoice6;
    private Button mButtonChoice7;


    private String mAnswer;
    private String nAnswer;
    private String n1Answer;
    private String n2Answer;
    private int mScore = 0;
    private int nScore=0;
    private int n1Score=0;
    private int n2Score=0;
    private int mQuestionNumber = 0;

    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;
    private View navHeader;
    Intent i;
    TextView name, email;
    CircleImageView img;
    FirebaseAuth mFirebaseAuth;
    FirebaseUser mFirebaseUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_know_thyself);

//        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button) findViewById(R.id.choice4);
        mButtonChoice5 = (Button)findViewById(R.id.choice5);
        mButtonChoice6 = (Button)findViewById(R.id.choice6);
        mButtonChoice7 = (Button)findViewById(R.id.choice7);

        nv = (NavigationView)findViewById(R.id.nv);
        navHeader = nv.getHeaderView(0);
        dl = (DrawerLayout)findViewById(R.id.main);
        t = new ActionBarDrawerToggle(this, dl,R.string.Open, R.string.Close);
        name= navHeader.findViewById(R.id.name);
        email= navHeader.findViewById(R.id.email);
        img= navHeader.findViewById(R.id.img_profile);

            updateQuestion();
            mButtonChoice1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //My logic for Button goes in here

                    if (mButtonChoice1.getText() == mAnswer) {
                        mScore = mScore + 1;
//                        updateScore(mScore);
                        updateQuestion();
                    }
                    if (mButtonChoice1.getText() == nAnswer) {
                        nScore = nScore + 1;
//                        updateScore1(nScore);
                        updateQuestion();
                    }

                    if (mButtonChoice1.getText() == n1Answer) {
                        n1Score = n1Score + 1;
//                        updateScore1(nScore);
                        updateQuestion();
                    }

                    if (mButtonChoice1.getText() == n2Answer) {
                        n2Score = n2Score + 1;
//                        updateScore1(nScore);
                        updateQuestion();
                    }
                    else {

                        updateQuestion();
                    }
                }
            });


            mButtonChoice2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //My logic for Button goes in here

                    if (mButtonChoice2.getText() == mAnswer) {
                        mScore = mScore + 1;
//                        updateScore(mScore);
                        updateQuestion();


                    }
                    if (mButtonChoice2.getText() == nAnswer) {
                        nScore = nScore + 1;
//                        updateScore1(nScore);
                        updateQuestion();
                    }
                    if (mButtonChoice2.getText() == n1Answer) {
                        n1Score = n1Score + 1;
//                        updateScore1(nScore);
                        updateQuestion();
                    }
                    if (mButtonChoice2.getText() == n2Answer) {
                        n2Score = n2Score + 1;
//                        updateScore1(nScore);
                        updateQuestion();
                    }

                    else {
                        updateQuestion();
                    }
                }
            });

            //End of Button Listener for Button2


            //Start of Button Listener for Button3
            mButtonChoice3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //My logic for Button goes in here

                    if (mButtonChoice3.getText() == mAnswer) {
                        mScore = mScore + 1;
//                        updateScore(mScore);
                        updateQuestion();
                        //This line of code is optiona
//                        Toast.makeText(KnowThyself.this, "correct", Toast.LENGTH_SHORT).show();

                    }
                    if (mButtonChoice3.getText() == nAnswer) {
                        nScore = nScore + 1;
//                        updateScore1(nScore);
                        updateQuestion();
                    }
                    if (mButtonChoice3.getText() == n1Answer) {
                        n1Score = n1Score + 1;
//                        updateScore1(nScore);
                        updateQuestion();
                    }
                    if (mButtonChoice3.getText() == n2Answer) {
                        n2Score = n2Score + 1;
//                        updateScore1(nScore);
                        updateQuestion();
                    }
                    else {
//                        Toast.makeText(KnowThyself.this, "wrong", Toast.LENGTH_SHORT).show();
                        updateQuestion();
                    }
                }
            });

            //End of Button Listener for Button3

            //Start of Button Listener for Button4
            mButtonChoice4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //My logic for Button goes in here

                    if (mButtonChoice4.getText() == mAnswer) {
                        mScore = mScore + 1;
//                        updateScore(mScore);
                        updateQuestion();
                        //This line of code is optional
//                        Toast.makeText(KnowThyself.this, "correct", Toast.LENGTH_SHORT).show();

                    }
                    if (mButtonChoice4.getText() == nAnswer) {
                        nScore = nScore + 1;
//                        updateScore1(nScore);
                        updateQuestion();
                    }
                    if (mButtonChoice4.getText() == n1Answer) {
                        n1Score = n1Score + 1;
//                        updateScore1(nScore);
                        updateQuestion();
                    }
                    if (mButtonChoice4.getText() == n2Answer) {
                        n2Score = n2Score + 1;
//                        updateScore1(nScore);
                        updateQuestion();
                    }
                    else {
//                        Toast.makeText(KnowThyself.this, "wrong", Toast.LENGTH_SHORT).show();
                        updateQuestion();
                    }
                }
            });
            //End of Button Listener for Button4

            //Start of Button Listener for Button5
            mButtonChoice5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //My logic for Button goes in here

                    if (mButtonChoice5.getText() == mAnswer) {
                        mScore = mScore + 1;
//                        updateScore(mScore);
                        updateQuestion();
                        //This line of code is optional
//                        Toast.makeText(KnowThyself.this, "correct", Toast.LENGTH_SHORT).show();

                    }
                    if (mButtonChoice5.getText() == nAnswer) {
                        nScore = nScore + 1;
//                        updateScore1(nScore);
                        updateQuestion();
                    }
                    if (mButtonChoice5.getText() == n1Answer) {
                        n1Score = n1Score + 1;
//                        updateScore1(nScore);
                        updateQuestion();
                    }
                    if (mButtonChoice5.getText() == n2Answer) {
                        n2Score = n2Score + 1;
//                        updateScore1(nScore);
                        updateQuestion();
                    }

                    else {
//                        Toast.makeText(KnowThyself.this, "wrong", Toast.LENGTH_SHORT).show();
                        updateQuestion();
                    }
                }
            });
            //End of Button Listener for Button5

            //Start of Button Listener for Button6
            mButtonChoice6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //My logic for Button goes in here

                    if (mButtonChoice6.getText() == mAnswer) {
                        mScore = mScore + 1;
//                        updateScore(mScore);
                        updateQuestion();
                        //This line of code is optional
//                        Toast.makeText(KnowThyself.this, "correct", Toast.LENGTH_SHORT).show();

                    }
                    if (mButtonChoice6.getText() == nAnswer) {
                        nScore = nScore + 1;
//                        updateScore1(nScore);
                        updateQuestion();
                    }
                    if (mButtonChoice6.getText() == n1Answer) {
                        n1Score = n1Score + 1;
//                        updateScore1(nScore);
                        updateQuestion();
                    }
                    if (mButtonChoice6.getText() == n2Answer) {
                        n2Score = n2Score + 1;
//                        updateScore1(nScore);
                        updateQuestion();
                    }

                    else {
//                        Toast.makeText(KnowThyself.this, "wrong", Toast.LENGTH_SHORT).show();
                        updateQuestion();
                    }
                }
            });
            //End of Button Listener for Button6


            //Start of Button Listener for Button7
            mButtonChoice7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //My logic for Button goes in here

                    if (mButtonChoice7.getText() == mAnswer) {
                        mScore = mScore + 1;
//                        updateScore(mScore);
                        updateQuestion();
                        //This line of code is optional
//                        Toast.makeText(KnowThyself.this, "correct", Toast.LENGTH_SHORT).show();

                    }
                    if (mButtonChoice7.getText() == nAnswer) {
                        nScore = nScore + 1;
//                        updateScore1(nScore);
                        updateQuestion();
                    }
                    if (mButtonChoice7.getText() == n1Answer) {
                        n1Score = n1Score + 1;
//                        updateScore1(nScore);
                        updateQuestion();
                    }
                    if (mButtonChoice7.getText() == n2Answer) {
                        n2Score = n2Score + 1;
//                        updateScore1(nScore);
                        updateQuestion();
                    }

                    else {
                        updateQuestion();
                    }
                }
            });

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
                    break;

                    case R.id.nav_monitor_yourself:
                    {
                        i=new Intent(KnowThyself.this, homepage.class);
                        startActivity(i);
                        break;
                    }

                    case R.id.nav_mood_lifter:
                    {
                        i=new Intent(KnowThyself.this, Mainharika.class);
                        startActivity(i);
                        break;
                    }

                    case R.id.nav_survival_manual:

                    {
                        i=new Intent(KnowThyself.this, SurvivalManual1.class);
                        startActivity(i);
                        break;
                    }

                    case R.id.nav_contact_for_help:
                    {
                        i=new Intent(KnowThyself.this, ContactForHelp.class);
                        startActivity(i);
                        break;
                    }

                    case R.id.nav_settings:
                    {
                        i=new Intent(KnowThyself.this, OtherActivity.class);
                        startActivity(i);
                        break;
                    }

                    case R.id.nav_about_us:
                    {
                        i=new Intent(KnowThyself.this, aboutUs.class);
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

    private void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));
        mButtonChoice5.setText(mQuestionLibrary.getChoice5(mQuestionNumber));
        mButtonChoice6.setText(mQuestionLibrary.getChoice6(mQuestionNumber));
        mButtonChoice7.setText(mQuestionLibrary.getChoice7(mQuestionNumber));
        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        nAnswer = mQuestionLibrary.getCorrectAnswer1(mQuestionNumber);
        n1Answer=mQuestionLibrary.getCorrectAnswer2(mQuestionNumber);
        n2Answer=mQuestionLibrary.getCorrectAnswer3(mQuestionNumber);
        mQuestionNumber++;
        if(mQuestionNumber==53) {
            if(mScore>nScore && mScore>n1Score && mScore>n2Score) {
                Intent intent = new Intent(KnowThyself.this, webView.class);
                startActivity(intent);
            }
            else if (nScore>mScore && nScore>n1Score && nScore>n2Score)
            {
                Intent intent = new Intent(KnowThyself.this, picture.class);
                startActivity(intent);
            }
            else if (n1Score>mScore && n1Score>nScore && n1Score>n2Score)
            {
                Intent intent = new Intent(KnowThyself.this, picture1.class);
                startActivity(intent);
            }

            else
                {
                    Intent intent= new Intent(KnowThyself.this, picture2.class);
                    startActivity(intent);
            }


        }
    }


//    private void updateScore(int point) {
//        mScore=point;
//    }

//    private void updateScore1(int point){
//        nScore=point;
//    }
}