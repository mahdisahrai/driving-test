package com.example.mahdi.project2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.p003v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

public class Main_activity_tabloo extends AppCompatActivity {
    public void btnback41(View btnback41v) {
        finish();
    }

    public void btn_tabloo_gall(View vbtn_tabloo_gall) {
        startActivity(new Intent(this, activity_Gallery_Tablo.class));
    }

    public void btn_click_Joz(View btn_click_Joz) {
        startActivity(new Intent(this, activity_tablo.class));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0405R.layout.activity_main_tabloo);
        final Intent intenthomet112c = new Intent(this, MainActivity.class);
        final Intent intentazmoonnnnt112s = new Intent(this, activity_Azmoons.class);
        final Intent intentleaerrrndt112 = new Intent(this, activity_learning.class);
        ((BottomNavigationView) findViewById(C0405R.C0407id.Wiggetnav1)).setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == C0405R.C0407id.f52a) {
                    Main_activity_tabloo.this.startActivity(intenthomet112c);
                }
                if (item.getItemId() == C0405R.C0407id.f53b) {
                    Main_activity_tabloo.this.startActivity(intentazmoonnnnt112s);
                }
                if (item.getItemId() != C0405R.C0407id.f54c) {
                    return true;
                }
                Main_activity_tabloo.this.startActivity(intentleaerrrndt112);
                return true;
            }
        });
    }
}
