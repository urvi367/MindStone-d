package info.androidhive.firebase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class SurvivalManual2 extends AppCompatActivity {

    TextView t1,t2,t4,t6,t8;
    ImageButton i1,i2,i3,i4,e1,e2,e3,tt1,tt2,tt3, back;

    int i;
    char c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survival_manual_page2);

        back= findViewById(R.id.back);
        t1=findViewById(R.id.textView);
        t2=findViewById(R.id.textView2);
        t4=findViewById(R.id.textView4);
        t6=findViewById(R.id.textView6);
        t8=findViewById(R.id.textView8);
        i1=findViewById(R.id.i1);
        i2=findViewById(R.id.i2);
        i3=findViewById(R.id.i3);
        i4=findViewById(R.id.i4);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        e3=findViewById(R.id.e3);
        tt1=findViewById(R.id.t1);
        tt2=findViewById(R.id.t2);
        tt3=findViewById(R.id.t3);

        i=getIntent().getIntExtra("choice", 0);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        if(i==1){
            t1.setText("Anxiety");
            t2.setText("Understand the psychology behind your mood and learn about anxiety.");
            t4.setText("What exactly makes up anxiety?");
            t6.setText("How does anxiety develop?");
            t8.setText("How can anxiety be treated?");

        } else if(i==2){
            t1.setText("Depression");
            t2.setText("Understand the psychology behind your mood and learn about depression.");
            t4.setText("What exactly makes up depression?");
            t6.setText("How does depression develop?");
            t8.setText("How can depression be treated?");

        } else if(i==3){
            t1.setText("Post Traumatic Stress Disorder (PTSD)");
            t2.setText("Understand the psychology behind your mood and learn about PTSD.");
            t4.setText("What exactly makes up PTSD?");
            t6.setText("How does PTSD develop?");
            t8.setText("How can PTSD be treated?");

        } else if(i==4){
            t1.setText("ADHD");
            t2.setText("Understand the psychology behind your mood and learn about ADHD.");
            t4.setText("What exactly makes up ADHD?");
            t6.setText("How does ADHD develop?");
            t8.setText("How can ADHD be treated?");

        } else if(i==5){
            t1.setText("Borderline Personality Disorder");
            t2.setText("Understand the psychology behind your mood and learn about borderline personality disorder.");
            t4.setText("What exactly makes up borderline personality disorder?");
            t6.setText("How does borderline personality disorder develop?");
            t8.setText("How can borderline personality disorder be treated?");
        }

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentt('a');
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentt('f');
            }
        });

        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentt('s');
            }
        });

        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentt('e');
            }
        });

        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentt('b');
            }
        });

        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentt('c');
            }
        });

        e3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentt('r');
            }
        });

        tt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentt('d');
            }
        });

        tt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentt('t');
            }
        });

        tt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentt('m');
            }
        });

    }

    public void intentt(char c){
        if(i==1){
            start(i, c);
        } else if(i==2){
            start(i, c);
        } else if(i==3){
            start(i, c);
        } else if(i==4){
            start(i, c);
        } else if(i==5){
            start(i, c);
        }
    }
    public void start(int i,char c){
        Intent intent=new Intent(SurvivalManual2.this, SurvivalManual3.class);
        intent.putExtra("choice",i );
        intent.putExtra("img", c);
        startActivity(intent);
    }
}
