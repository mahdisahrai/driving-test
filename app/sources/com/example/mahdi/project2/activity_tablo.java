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
import android.widget.Toast;

public class activity_tablo extends AppCompatActivity {
    Intent intentGallery_Tablo;
    Intent intentload1;
    Intent intentload2;
    Intent intentload3;
    Intent intentload4;
    Intent intentload5;
    Intent intentload6;
    Intent intentload7;

    public void btnback5(View backkk5) {
        finish();
    }

    public void btn_Ektari(View viewbtn_Ektari) {
        this.intentload1 = new Intent(this, Activity_Loading1.class);
        AlertDialog.Builder a_Ektari = new AlertDialog.Builder(this);
        a_Ektari.setTitle((CharSequence) "تابلو های اخطاری");
        a_Ektari.setPositiveButton((CharSequence) "بارگذاری فایل pdf", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                activity_tablo.this.startActivity(activity_tablo.this.intentload1);
            }
        });
        a_Ektari.setNeutralButton((CharSequence) "دانلود فایل ورد و pdf با فرمت zip", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Uri uri = Uri.EMPTY;
                activity_tablo.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.uploadina.com/80d2767b8e43dd5a/اخطاری.zip")));
            }
        });
        a_Ektari.show();
    }

    public void btn_entezami(View viewbtn_entezami) {
        this.intentload2 = new Intent(this, activity__loading2.class);
        AlertDialog.Builder a_entezami = new AlertDialog.Builder(this);
        a_entezami.setTitle((CharSequence) "تابلو های انتظامی");
        a_entezami.setPositiveButton((CharSequence) "بارگذاری فایل pdf", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                activity_tablo.this.startActivity(activity_tablo.this.intentload2);
            }
        });
        a_entezami.setNeutralButton((CharSequence) "دانلود فایل ورد و pdf با فرمت zip", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Uri uri = Uri.EMPTY;
                activity_tablo.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.uploadina.com/0bee3dc0200fc1a1/انتظامی.zip")));
            }
        });
        a_entezami.show();
    }

    public void btn_news(View vbtn_news) {
        this.intentload3 = new Intent(this, activity_loading3.class);
        AlertDialog.Builder a_news = new AlertDialog.Builder(this);
        a_news.setTitle((CharSequence) "تابلو های اخباری");
        a_news.setPositiveButton((CharSequence) "بارگذاری فایل pdf", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                activity_tablo.this.startActivity(activity_tablo.this.intentload3);
            }
        });
        a_news.setNeutralButton((CharSequence) "دانلود فایل ورد و pdf با فرمت zip", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Uri uri = Uri.EMPTY;
                activity_tablo.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.uploadina.com/4fd2d7058098507c/اخباری.zip")));
            }
        });
        a_news.show();
    }

    public void btn_hepermasir(View viewbtn_hepermasir) {
        this.intentload4 = new Intent(this, activity_loading4.class);
        AlertDialog.Builder a_hepermasir = new AlertDialog.Builder(this);
        a_hepermasir.setTitle((CharSequence) "تابلو های راهنما مسیر");
        a_hepermasir.setPositiveButton((CharSequence) "بارگذاری فایل pdf", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                activity_tablo.this.startActivity(activity_tablo.this.intentload4);
            }
        });
        a_hepermasir.setNeutralButton((CharSequence) "دانلود فایل ورد و pdf با فرمت zip", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Uri uri = Uri.EMPTY;
                activity_tablo.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.uploadina.com/bf6c5cd0064177ee/راهنمای_مسیر.zip")));
            }
        });
        a_hepermasir.show();
    }

    public void btn_mokamle(View viewbtn_mokamle) {
        this.intentload5 = new Intent(this, activity_loading5.class);
        AlertDialog.Builder a_mokamle = new AlertDialog.Builder(this);
        a_mokamle.setTitle((CharSequence) "تابلو های مکمل");
        a_mokamle.setPositiveButton((CharSequence) "بارگذاری فایل pdf", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                activity_tablo.this.startActivity(activity_tablo.this.intentload5);
            }
        });
        a_mokamle.setNeutralButton((CharSequence) "دانلود فایل ورد و pdf با فرمت zip", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Uri uri = Uri.EMPTY;
                activity_tablo.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.uploadina.com/02ede150264244c5/مکمل.zip")));
            }
        });
        a_mokamle.show();
    }

    public void btn_Local(View viewbtn_Local) {
        this.intentload6 = new Intent(this, activity_loading6.class);
        AlertDialog.Builder a_locaal = new AlertDialog.Builder(this);
        a_locaal.setTitle((CharSequence) "تابلو های محلی");
        a_locaal.setPositiveButton((CharSequence) "بارگذاری فایل pdf", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                activity_tablo.this.startActivity(activity_tablo.this.intentload6);
            }
        });
        a_locaal.setNeutralButton((CharSequence) "دانلود فایل ورد و pdf با فرمت zip", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Uri uri = Uri.EMPTY;
                activity_tablo.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.uploadina.com/0e10d9e4a9defd6d/محلی.zip")));
            }
        });
        a_locaal.show();
    }

    public void btn_tagss(View vbtn_tagss) {
        this.intentload7 = new Intent(this, activity_loading7.class);
        AlertDialog.Builder a_tasgg = new AlertDialog.Builder(this);
        a_tasgg.setTitle((CharSequence) "تابلو های برچسب ها");
        a_tasgg.setPositiveButton((CharSequence) "بارگذاری فایل pdf", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                activity_tablo.this.startActivity(activity_tablo.this.intentload7);
            }
        });
        a_tasgg.setNeutralButton((CharSequence) "دانلود فایل ورد و pdf با فرمت zip", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Uri uri = Uri.EMPTY;
                activity_tablo.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.uploadina.com/31fb93eea200e89f/برچسب_ها.zip")));
            }
        });
        a_tasgg.show();
    }

    public void btn_ttottab(View vbtn_ttottab) {
        this.intentGallery_Tablo = new Intent(this, activity_Gallery_Tablo.class);
        AlertDialog.Builder a_ttottab = new AlertDialog.Builder(this);
        a_ttottab.setTitle((CharSequence) "همه تابلو ها");
        a_ttottab.setPositiveButton((CharSequence) "دانلود فایل های ورد و pdf با فرمت zip", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Uri uri = Uri.EMPTY;
                activity_tablo.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.uploadina.com/ab43ff639b30b6fe/Total_tablos.zip")));
            }
        });
        a_ttottab.setNeutralButton((CharSequence) "نمایش تابلو ها به صورت آلبوم تصاویر", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                activity_tablo.this.startActivity(activity_tablo.this.intentGallery_Tablo);
            }
        });
        a_ttottab.show();
    }

    public void btn_Nemonehqusettion(View viewbtn_Nemonehqusettion) {
        AlertDialog.Builder a_Nemonehqusettion = new AlertDialog.Builder(this);
        a_Nemonehqusettion.setTitle((CharSequence) "نمونه سوال");
        a_Nemonehqusettion.setPositiveButton((CharSequence) "دانلود نمونه سوال آیین نامه", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Uri uri = Uri.EMPTY;
                activity_tablo.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://s8.picofile.com/file/8331346634/دانلود_رایگان_سوالات_آیین_نامه.pdf.html")));
            }
        });
        a_Nemonehqusettion.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0405R.layout.activity_tablo);
        Toast.makeText(getApplication(), "کاربر عزیز در صورت لزوم می توانید از کافه بازار اپلیکیشن هایی را جهت بارگذاری فایل pdf یا doc یا zip دانلود کنید. ", 1).show();
        final Intent intenthomet1 = new Intent(this, MainActivity.class);
        final Intent intentazmoonnnnt1 = new Intent(this, activity_Azmoons.class);
        final Intent intentleaerrrnt1 = new Intent(this, activity_learning.class);
        ((BottomNavigationView) findViewById(C0405R.C0407id.Wiggetnav1)).setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == C0405R.C0407id.f52a) {
                    activity_tablo.this.startActivity(intenthomet1);
                }
                if (item.getItemId() == C0405R.C0407id.f53b) {
                    activity_tablo.this.startActivity(intentazmoonnnnt1);
                }
                if (item.getItemId() != C0405R.C0407id.f54c) {
                    return true;
                }
                activity_tablo.this.startActivity(intentleaerrrnt1);
                return true;
            }
        });
    }
}
