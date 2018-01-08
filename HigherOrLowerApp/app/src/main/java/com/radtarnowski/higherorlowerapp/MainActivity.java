package com.radtarnowski.higherorlowerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randNr;

    private void makeToast(String string) {

        Toast.makeText(MainActivity.this, string,Toast.LENGTH_SHORT).show();
    }
    public void guessFunction(View view) {
        EditText numberEditText = (EditText) (findViewById(R.id.numberEditText));
        int guessNumber = Integer.parseInt(numberEditText.getText().toString());
        if(randNr>guessNumber) {
            makeToast("Higher.");
        }
        else if(randNr<guessNumber) {
            makeToast("Lower.");
        }
        else {
            makeToast("You've guessed it! Try again.");
            numberEditText.setText("");
            Random rand = new Random();
            randNr = rand.nextInt(20) + 1;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        randNr = rand.nextInt(20) + 1;
    }
}
