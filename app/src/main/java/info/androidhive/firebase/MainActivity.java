package info.androidhive.firebase;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mdes;
    private ImageView mimage;
    private TextView mhead;
    private Button mstart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mdes=findViewById(R.id.des);
        mimage=findViewById(R.id.image);
        mhead=findViewById(R.id.head);
        mstart=findViewById(R.id.start);


        mstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, quizactivityptsd.class));
            }
        });

    }


}
