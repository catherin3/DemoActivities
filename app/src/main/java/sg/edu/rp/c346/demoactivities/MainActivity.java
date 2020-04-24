package sg.edu.rp.c346.demoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get the button and set the onClickListener
        Button btnDone = (Button) findViewById(R.id.buttonDone);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get the EditText that user keys in name
                EditText etName = (EditText) findViewById(R.id.editTextName);

                //Get the EditText that user keys in age
                EditText etAge = (EditText) findViewById(R.id.editTextAge);

                //Put the name and age into an array
                String[] info = {etName.getText().toString(),etAge.getText().toString()};

                //Create an intent to start another called
                // DemoActivities
                Intent i = new Intent(MainActivity.this,DemoActivties2.class);

                //Pass the String array holding the name and age to new activity
                i.putExtra("info",info);

                //Start the new activity
                startActivity(i);
            }
        });

    }
}
