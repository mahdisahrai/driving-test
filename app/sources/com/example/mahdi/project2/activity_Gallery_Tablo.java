package com.example.mahdi.project2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.p003v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

public class activity_Gallery_Tablo extends AppCompatActivity {
    public void btnback6(View viewbtnback6) {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0405R.layout.activity__gallery__tablo);
        final Intent intenthomeee5 = new Intent(this, MainActivity.class);
        final Intent intentazmoonnnn115 = new Intent(this, activity_Azmoons.class);
        final Intent intentleaerrrn5 = new Intent(this, activity_learning.class);
        ((BottomNavigationView) findViewById(C0405R.C0407id.Wiggetnav1)).setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == C0405R.C0407id.f52a) {
                    activity_Gallery_Tablo.this.startActivity(intenthomeee5);
                }
                if (item.getItemId() == C0405R.C0407id.f53b) {
                    activity_Gallery_Tablo.this.startActivity(intentazmoonnnn115);
                }
                if (item.getItemId() != C0405R.C0407id.f54c) {
                    return true;
                }
                activity_Gallery_Tablo.this.startActivity(intentleaerrrn5);
                return true;
            }
        });
    }
}
