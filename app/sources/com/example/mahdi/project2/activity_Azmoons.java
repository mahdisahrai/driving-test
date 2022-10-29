package com.example.mahdi.project2;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.p003v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class activity_Azmoons extends AppCompatActivity {
    Intent intentqusetion1;
    Intent intentqusetion2;
    Intent intentqusetion3;
    Intent intentqusetion4;

    public void btnazmon1(View vbtnazmon1) {
        this.intentqusetion1 = new Intent(this, Activity_azmon1.class);
        Toast.makeText(getApplicationContext(), "لطفا برای شروع آزمون اول کلیک کنید", 0).show();
        Button butbtnazmon1 = (Button) findViewById(C0405R.C0407id.btnazmon1);
        butbtnazmon1.setBackgroundResource(C0405R.mipmap.btnnazmon1);
        butbtnazmon1.setTextSize(0, 0.0f);
        butbtnazmon1.setTextColor(2);
        butbtnazmon1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                activity_Azmoons.this.startActivity(activity_Azmoons.this.intentqusetion1);
                activity_Azmoons.this.finish();
            }
        });
    }

    public void btnazmon2(View vbtnazmon2) {
        this.intentqusetion2 = new Intent(this, activity_azmon2.class);
        Toast.makeText(getApplicationContext(), "لطفا برای شروع آزمون دوم کلیک کنید", 0).show();
        Button butbtnazmon2 = (Button) findViewById(C0405R.C0407id.btnazmon2);
        butbtnazmon2.setBackgroundResource(C0405R.mipmap.btnnazmon1);
        butbtnazmon2.setText("آزمون دوم");
        butbtnazmon2.setTextSize(0, 0.0f);
        butbtnazmon2.setTextColor(2);
        butbtnazmon2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                activity_Azmoons.this.startActivity(activity_Azmoons.this.intentqusetion2);
                activity_Azmoons.this.finish();
            }
        });
    }

    public void btnazmon3(View vbtnazmon3) {
        Toast.makeText(getApplicationContext(), "لطفا برای شروع آزمون سوم کلیک کنید", 0).show();
        this.intentqusetion3 = new Intent(this, activity_azmon3.class);
        Button butbtnazmon3 = (Button) findViewById(C0405R.C0407id.btnazmon3);
        butbtnazmon3.setBackgroundResource(C0405R.mipmap.btnnazmon1);
        butbtnazmon3.setText("آزمون سوم");
        butbtnazmon3.setTextSize(0, 0.0f);
        butbtnazmon3.setTextColor(2);
        butbtnazmon3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                activity_Azmoons.this.startActivity(activity_Azmoons.this.intentqusetion3);
            }
        });
    }

    public void btnazmon4(View vbtnazmon4) {
        Toast.makeText(getApplicationContext(), "لطفا برای دانلود آزمون های بیشتر کلیک کنید", 0).show();
        Button butbtnazmon4 = (Button) findViewById(C0405R.C0407id.btnazmon4);
        butbtnazmon4.setBackgroundResource(C0405R.mipmap.btnnazmon1);
        butbtnazmon4.setText("آزمون های بیشتر");
        butbtnazmon4.setTextSize(0, 0.0f);
        butbtnazmon4.setTextColor(2);
        Uri uri = Uri.EMPTY;
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://s8.picofile.com/file/8331346634/دانلود_رایگان_سوالات_آیین_نامه.pdf.html")));
    }

    public void btnback3(View v3) {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0405R.layout.activity__azmoons);
        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "font1.ttf");
        ((Button) findViewById(C0405R.C0407id.btnazmon1)).setTypeface(typeface1);
        ((Button) findViewById(C0405R.C0407id.btnazmon2)).setTypeface(typeface1);
        ((Button) findViewById(C0405R.C0407id.btnazmon3)).setTypeface(typeface1);
        ((Button) findViewById(C0405R.C0407id.btnazmon4)).setTypeface(typeface1);
        final Intent intenthome1 = new Intent(this, MainActivity.class);
        final Intent intentleaern3 = new Intent(this, activity_learning.class);
        ((BottomNavigationView) findViewById(C0405R.C0407id.Wiggetnav1)).setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == C0405R.C0407id.f52a) {
                    activity_Azmoons.this.startActivity(intenthome1);
                }
                if (item.getItemId() == C0405R.C0407id.f53b) {
                }
                if (item.getItemId() != C0405R.C0407id.f54c) {
                    return true;
                }
                activity_Azmoons.this.startActivity(intentleaern3);
                return true;
            }
        });
    }
}
