package com.example.mahdi.project2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p003v7.app.AppCompatActivity;
import android.view.View;

public class Activity_Resualt_1 extends AppCompatActivity {
    public void btn_Nemonehqusettion1(View vbtn_Nemonehqusettion1) {
        Uri uri = Uri.EMPTY;
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://s8.picofile.com/file/8331346634/دانلود_رایگان_سوالات_آیین_نامه.pdf.html")));
    }

    public void btn_exe1(View btn_exe1v) {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0405R.layout.activity__resualt_1);
    }

    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
