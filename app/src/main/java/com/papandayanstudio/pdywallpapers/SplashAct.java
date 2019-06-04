package com.papandayanstudio.pdywallpapers;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashAct extends AppCompatActivity {

    Animation app_splash, ttb;

    TextView app_logo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        app_logo = findViewById(R.id.app_logo);

        app_splash = AnimationUtils.loadAnimation(this, R.anim.app_splash);
        ttb = AnimationUtils.loadAnimation(this, R.anim.ttb);

        app_logo.startAnimation(app_splash);
        app_logo.startAnimation(ttb);


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Merubah activity ke activity lain
                Intent gogetstarted = new Intent(SplashAct.this,MainActivity.class);
                startActivity(gogetstarted);
                finish();
            }
        }, 4000);

    }
}
