package com.sa3ud.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {




    public static final int SPLASH_DELAY_MILLIS=2000;


    ImageView splashLogo;
    TextView tvSplash;
    Animation topAnim,bottomAnim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        splashLogo = findViewById(R.id.iv_splash_logo);
        tvSplash = findViewById(R.id.tv_splash);

        topAnim = AnimationUtils.loadAnimation(SplashActivity.this, R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(SplashActivity.this, R.anim.bottom_animation);


        //Set animation to elements
        splashLogo.setAnimation(topAnim);
        tvSplash.setAnimation(bottomAnim);


        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();

            }
        },SPLASH_DELAY_MILLIS);
    }


}