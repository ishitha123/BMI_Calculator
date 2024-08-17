package com.example.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//import android.widget.EditText

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create objects for all the views and buttons you created in the xml file
        EditText editTextWeight = findViewById(R.id.weight);
        EditText editTextHeight = findViewById(R.id.height);
        Button button = findViewById(R.id.btnSubmit);
        TextView textViewResult = findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float height = Float.parseFloat(String.valueOf(editTextHeight.getText()));
                float weight = Float.parseFloat(String.valueOf(editTextWeight.getText()));
                float bmi = (weight / (height * height)) * 703;
                textViewResult.setText(String.valueOf(bmi));
            }
        });
    }
}