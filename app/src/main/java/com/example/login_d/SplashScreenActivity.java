package com.example.login_d;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashScreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        TextView appNameTextView = findViewById(R.id.appNameTextView);
        Animation popUpAnimation = AnimationUtils.loadAnimation(this, R.anim.pop_up);
        appNameTextView.startAnimation(popUpAnimation);

        int SPLASH_DISPLAY_LENGTH = 3000; // Reducing splash screen delay to 3 seconds
        new Handler().postDelayed(() -> {
            Intent mainIntent = new Intent(SplashScreenActivity.this, MainActivity.class);
            startActivity(mainIntent);
            finish();
        }, SPLASH_DISPLAY_LENGTH);
    }
}





