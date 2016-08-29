package com.example.pond1.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Context context;
    CharSequence text;
    int duration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();
        text = "Hello toast!";
        duration = Toast.LENGTH_SHORT;



        Button button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                text = "Poplular Movie";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                text = "Stock Hawk";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                text = "Build it BIGGER";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                text = "Make your app material";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                text = "Go Ubiquitous";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                text = "Capstone";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }
}
