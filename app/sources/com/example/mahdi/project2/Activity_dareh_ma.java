package com.example.mahdi.project2;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.p003v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Activity_dareh_ma extends AppCompatActivity {
    public void btnback1(View v1) {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0405R.layout.activity_dareh_ma);
        ((TextView) findViewById(C0405R.C0407id.txt_darbareh)).setTypeface(Typeface.createFromAsset(getAssets(), "font2.ttf"));
        final Intent intenthom = new Intent(this, MainActivity.class);
        final Intent intentazmoo = new Intent(this, activity_Azmoons.class);
        final Intent intentleae = new Intent(this, activity_learning.class);
        ((BottomNavigationView) findViewById(C0405R.C0407id.Wiggetnav1)).setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == C0405R.C0407id.f52a) {
                    Activity_dareh_ma.this.startActivity(intenthom);
                }
                if (item.getItemId() == C0405R.C0407id.f53b) {
                    Activity_dareh_ma.this.startActivity(intentazmoo);
                }
                if (item.getItemId() != C0405R.C0407id.f54c) {
                    return true;
                }
                Activity_dareh_ma.this.startActivity(intentleae);
                return true;
            }
        });
    }
}
