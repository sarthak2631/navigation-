package com.example.navigatetodifferentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView myImage;
    private TextView myTextView;
    private Button mybutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myImage = (ImageView) findViewById(R.id.dogImage);
        myTextView = (TextView) findViewById(R.id.dogText);
        mybutton = (Button) findViewById(R.id.nextButton);

        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myintent = new Intent(MainActivity.this,secondActivity.class);
                startActivity(myintent);

            }
        });
    }
}