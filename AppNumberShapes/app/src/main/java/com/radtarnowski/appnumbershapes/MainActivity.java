package com.radtarnowski.appnumbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void checkNumberFunction(View view) {
        String message = "";
        EditText usersNumber = (EditText) (findViewById(R.id.numberEditText));
        if (usersNumber.getText().toString().isEmpty()) {
            message = "Please enter the number!";
        } else {
            Number inputNumber = new Number();
            inputNumber.number = Integer.parseInt(usersNumber.getText().toString());
            if (inputNumber.isTriangular()) {

                if (inputNumber.isSquare()) {
                    message = "It's both triangular and square";

                } else {
                    message = "It's triangular number.";
                }
            } else {
                if (inputNumber.isSquare()) {
                    message = "It's square number.";
                } else {
                    message = "It's neither square nor triangular";
                }
            }

        }
        Toast.makeText(getApplicationContext(), message,Toast.LENGTH_LONG).show();
    }
        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }
}
    class Number {
        int number;

        public boolean isSquare() {

            double squareRoot = Math.sqrt(number);

            if(squareRoot == Math.floor(squareRoot)) {
                return true;
            }
            else {
                return false;
            }
        }

        public boolean isTriangular() {
            int i = 1;
            int triangularNumber = 1;

            while (triangularNumber < number) {
                i++;
                triangularNumber = triangularNumber + i;
            }
            if(triangularNumber==number) {
                return true;
            }
            else {
                return false;
            }
        }
    }




