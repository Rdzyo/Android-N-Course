package com.radtarnowski.animations;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public void fade(View view) {

        ImageView darthVader = (ImageView) findViewById(R.id.darthVader);
        //ImageView jedi = (ImageView) findViewById(R.id.jedi);
        darthVader.animate()
                .translationYBy(1000f)
                .translationXBy(1000f)
                .rotation(-720f)
                .setDuration(2000);
        //jedi.animate().alpha(1f).setDuration(2000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView darthVader = (ImageView) findViewById(R.id.darthVader);
        darthVader.animate().translationXBy(-1000f).translationYBy(-1000f);

    }
}
