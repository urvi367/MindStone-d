package info.androidhive.firebase;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.support.v7.app.AppCompatActivity;
import android.view.View;



public class Quotes_Activity extends AppCompatActivity
{
    ImageView Pic1,Pic2, Pic3,Pic4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quotes_activity);


        Pic1=findViewById(R.id.pic1);
        Pic2=findViewById(R.id.pic2);
        Pic3=findViewById(R.id.pic3);
        Pic4=findViewById(R.id.pic4);

    }
}