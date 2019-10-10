package info.androidhive.firebase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class anxiety extends AppCompatActivity {

    private TextView mdes;
    private ImageView mimage;
    private TextView mhead;
    private Button mstart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4);

        mdes=findViewById(R.id.textView);
        mimage=findViewById(R.id.imageView);
        mhead=findViewById(R.id.textView2);
        mstart=findViewById(R.id.button);




        mstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(anxiety.this, quizanxiety.class));
            }
        });

    }



}
