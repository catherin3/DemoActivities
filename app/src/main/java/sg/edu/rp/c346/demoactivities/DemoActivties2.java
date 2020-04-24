package sg.edu.rp.c346.demoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import org.w3c.dom.Text;
import android.widget.TextView;

public class DemoActivties2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_activties2);

        //Get the intent so as to get the "things" inside the intent
        Intent i = getIntent();

        String[] info = i.getStringArrayExtra("info");
        
        //Get the textView object
        TextView tv1 = findViewById(R.id.textView1);

        //Display the name and age
        tv1.setText("You are "+ info[0]+", age "+ info[1]);

    }
}
