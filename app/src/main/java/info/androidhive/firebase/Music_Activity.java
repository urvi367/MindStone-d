package info.androidhive.firebase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Music_Activity extends AppCompatActivity
{
    TextView Song1,Song2,Song3,Song4,Song5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_activity);


        Song1=findViewById(R.id.song1);
        Song2=findViewById(R.id.song2);
        Song3=findViewById(R.id.song3);
        Song4=findViewById(R.id.song4);
        Song5=findViewById(R.id.song5);
    }
}