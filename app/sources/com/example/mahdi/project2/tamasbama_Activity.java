package com.example.mahdi.project2;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.p003v7.app.AlertDialog;
import android.support.p003v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

public class tamasbama_Activity extends AppCompatActivity {
    public void btnback2(View v2) {
        finish();
    }

    public void btntamas(View v3) {
        AlertDialog.Builder dialog1 = new AlertDialog.Builder(this);
        dialog1.setTitle((CharSequence) "راه های ارتباطی");
        dialog1.setMessage((CharSequence) "ایمیل:mahdiyeganeh2112@yahoo.com\nآی دی تلگرام:mehdi8077@");
        dialog1.setPositiveButton((CharSequence) "بستن", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        dialog1.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0405R.layout.activity_tamasbama);
        final Intent intenthomeee4 = new Intent(this, MainActivity.class);
        final Intent intentazmoonnnn114 = new Intent(this, activity_Azmoons.class);
        final Intent intentleaerrrn4 = new Intent(this, activity_learning.class);
        ((BottomNavigationView) findViewById(C0405R.C0407id.Wiggetnav1)).setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == C0405R.C0407id.f52a) {
                    tamasbama_Activity.this.startActivity(intenthomeee4);
                }
                if (item.getItemId() == C0405R.C0407id.f53b) {
                    tamasbama_Activity.this.startActivity(intentazmoonnnn114);
                }
                if (item.getItemId() != C0405R.C0407id.f54c) {
                    return true;
                }
                tamasbama_Activity.this.startActivity(intentleaerrrn4);
                return true;
            }
        });
    }
}
