package com.example.mahdi.project2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.p003v7.app.AppCompatActivity;

public class activity_Splash extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0405R.layout.activity__splash);
        new Handler().postDelayed(new Runnable() {
            public void run() {
                activity_Splash.this.startActivity(new Intent(activity_Splash.this, MainActivity.class));
                activity_Splash.this.finish();
            }
        }, 2850);
    }
}
