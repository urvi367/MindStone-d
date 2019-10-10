package info.androidhive.firebase;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Stories_Activity extends AppCompatActivity {
    TextView Story1, Story2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stories_activity);

        Story1 = findViewById(R.id.story1);
        Story2 = findViewById(R.id.story2);

    }
}
