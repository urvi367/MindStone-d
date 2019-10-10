package info.androidhive.firebase;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class Memes_Activity extends AppCompatActivity
{
    ImageView Pic1,Pic2, Pic3,Pic4,Pic5,Pic6,Pic7,Pic8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.memes_activity);


        Pic1=findViewById(R.id.meme1);
        Pic2=findViewById(R.id.meme2);
        Pic3=findViewById(R.id.meme3);
        Pic4=findViewById(R.id.meme4);
        Pic5=findViewById(R.id.meme5);
        Pic6=findViewById(R.id.meme6);
        Pic7=findViewById(R.id.meme7);
        Pic8=findViewById(R.id.meme8);

    }
}


