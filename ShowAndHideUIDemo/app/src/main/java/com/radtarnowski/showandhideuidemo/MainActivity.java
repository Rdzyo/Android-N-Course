package com.radtarnowski.showandhideuidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button showText;
    Button hideText;

    public void showText(View view) {
        showText  = (Button) findViewById(R.id.button);
        hideText = (Button) findViewById(R.id.button2);
        textView = (TextView) findViewById(R.id.textView);
        textView.setVisibility(View.VISIBLE);
        showText.setVisibility(View.INVISIBLE);
        hideText.setVisibility(View.VISIBLE);
    }

    public void hideTextView(View view) {
        showText  = (Button) findViewById(R.id.button);
        hideText = (Button) findViewById(R.id.button2);
        textView = (TextView) findViewById(R.id.textView);
        textView.setVisibility(View.INVISIBLE);
        showText.setVisibility(View.VISIBLE);
        hideText.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showText  = (Button) findViewById(R.id.button);
        hideText = (Button) findViewById(R.id.button2);

            showText.setVisibility(View.INVISIBLE);
            hideText.setVisibility(View.VISIBLE);


    }
}
