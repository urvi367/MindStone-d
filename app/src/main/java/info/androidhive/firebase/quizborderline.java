package info.androidhive.firebase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class quizborderline extends AppCompatActivity {

    public borderlinequest mquestionare = new borderlinequest();

    public int length;

    ProgressBar prg;



    private TextView mQuestionview,t3;
    private Button mchoice1;
    private Button mchoice2;
    private Button mchoice3;
    private Button mchoice4;
    private Button mchoice5;




    public int mscore = 0;
    public int mqno = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ptsdquiz);




        mQuestionview=(TextView)findViewById(R.id.question);
        t3=(TextView)findViewById(R.id.textView3);
        mchoice1=(Button)findViewById(R.id.choice1);
        mchoice2=(Button)findViewById(R.id.choice2);
        mchoice3=(Button)findViewById(R.id.choice3);
        mchoice4=(Button)findViewById(R.id.choice4);
        mchoice5=(Button)findViewById(R.id.choice5);
        prg=(ProgressBar)findViewById(R.id.progressBar);

        updatequestion();
        mchoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mscore=mscore+0;
                updatequestion();
                prg.incrementProgressBy(100);


            }
        });

        mchoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mscore=mscore+1;
                updatequestion();
                prg.incrementProgressBy(100);
            }
        });

        mchoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mscore=mscore+2;
                updatequestion();
                prg.incrementProgressBy(100);
            }
        });

        mchoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mscore=mscore+3;
                updatequestion();
                prg.incrementProgressBy(100);
            }
        });

        mchoice5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mscore=mscore+4;
                updatequestion();
                prg.incrementProgressBy(100);
            }
        });




    }

    private void updatequestion()
    {
        if (mqno<7)
        {
            mQuestionview.setText(mquestionare.getQuestion(mqno));
            mchoice1.setText(mquestionare.getchoice1(mqno));
            mchoice2.setText(mquestionare.getchoice2(mqno));
            mchoice3.setText(mquestionare.getchoice3(mqno));
            mchoice4.setText(mquestionare.getchoice4(mqno));
            mchoice5.setText(mquestionare.getchoice5(mqno));
            mqno++;
            t3.setText(String.valueOf(mscore));

        }
        else if(mqno>=7)
        {

            Intent intent=new Intent(quizborderline.this,resultptsd.class);
            intent.putExtra("score",mscore); //Put your score to your next Intent
            startActivity(intent);
        }



    }







}







