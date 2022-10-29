package com.example.mahdi.project2;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.p003v7.app.AlertDialog;
import android.support.p003v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

public class activity_learning extends AppCompatActivity {
    public void btnback4(View v4) {
        finish();
    }

    public void btn_tabloo(View vdtabloo) {
        startActivity(new Intent(this, Main_activity_tabloo.class));
    }

    public void btn_click_motale(View vbtn_click_motale) {
        AlertDialog.Builder b_ttottab = new AlertDialog.Builder(this);
        b_ttottab.setTitle((CharSequence) "مطالعه کل جزوه");
        b_ttottab.setPositiveButton((CharSequence) "دانلود فایل pdf", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Uri uri = Uri.EMPTY;
                activity_learning.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://s9.picofile.com/file/8319425718/کتاب_آیین_نامه_رانندگی_پایه_سوم_و_دوم.pdf.html")));
            }
        });
        b_ttottab.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0405R.layout.activity_learning);
        final Intent intenthomeee3 = new Intent(this, MainActivity.class);
        final Intent intentazmoonnnn113 = new Intent(this, activity_Azmoons.class);
        new Intent(this, activity_learning.class);
        ((BottomNavigationView) findViewById(C0405R.C0407id.Wiggetnav1)).setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == C0405R.C0407id.f52a) {
                    activity_learning.this.startActivity(intenthomeee3);
                }
                if (item.getItemId() == C0405R.C0407id.f53b) {
                    activity_learning.this.startActivity(intentazmoonnnn113);
                }
                if (item.getItemId() == C0405R.C0407id.f54c) {
                }
                return true;
            }
        });
    }
}
