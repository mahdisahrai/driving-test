package com.example.mahdi.project2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p003v7.app.AppCompatActivity;
import android.view.View;

public class activity_resualt_2 extends AppCompatActivity {
    public void btn_Nemonehqusettion2(View vbtn_Nemonehqusettion2) {
        Uri uri = Uri.EMPTY;
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://s8.picofile.com/file/8331346634/دانلود_رایگان_سوالات_آیین_نامه.pdf.html")));
    }

    public void btn_exe2(View btn_exe1v2) {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0405R.layout.activity_resualt_2);
    }

    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
