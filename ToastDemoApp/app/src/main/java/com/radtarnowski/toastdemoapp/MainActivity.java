package com.radtarnowski.toastdemoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void viewNameClick(View view){

        EditText nameTextField = (EditText) (findViewById(R.id.nameText));
        Toast.makeText(MainActivity.this, "Hello there, " + nameTextField.getText().toString(), Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
