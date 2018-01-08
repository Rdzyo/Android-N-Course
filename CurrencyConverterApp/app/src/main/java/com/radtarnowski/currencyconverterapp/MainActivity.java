package com.radtarnowski.currencyconverterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertFunction(View view) {

        valueConverter();

    }
    private void valueConverter() {

        EditText currencyValue = (EditText) (findViewById(R.id.currencyValue));
        String valueToConvert = currencyValue.getText().toString();
        Double value = Double.parseDouble(valueToConvert);
        Double convertedValue = value*3.45;
        Toast.makeText(MainActivity.this, String.format("%.2f",convertedValue) + "zł",Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
