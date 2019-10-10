package info.androidhive.firebase;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


import org.w3c.dom.Text;

import java.util.Objects;

public class resultptsd extends MainActivity {
private TextView mresult;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        TextView mresult = (TextView) findViewById(R.id.Result);

       Intent intent=getIntent();

        int score=intent.getIntExtra("score",0);
       // mresult.setText(String.valueOf(score));


        if(score>=0&&score<=3)
        {
            mresult.setText("YOUR LEVEL IS : \n NONE");
        }

        if(score>=4&&score<=7)
        {
            mresult.setText("YOUR LEVEL IS : \n MILD");
        }

        if(score>=8&&score<=14)
        {
            mresult.setText("YOUR LEVEL IS : \n MODERATE");
        }

        if(score>=15&&score<=21)
        {
            mresult.setText("YOUR LEVEL IS : \n SEVERE");
        }

        if(score>=22&&score<=28)
        {
            mresult.setText("YOUR LEVEL IS : \n EXTREME");
        }







    }
}