package com.radtarnowski.demoapp;

import android.graphics.Picture;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean changedPic = false;
    public void changePictureClick(View view) {

        ImageView img = (ImageView) (findViewById(R.id.imageView));
        if(changedPic == true) {
            img.setImageResource(R.drawable.cat);
            changedPic = false;
        }
        else {
            img.setImageResource(R.drawable.cat2);
            changedPic = true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
