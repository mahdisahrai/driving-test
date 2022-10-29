package com.example.mahdi.project2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.p000v4.view.ViewCompat;
import android.support.p003v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public class Activity_azmon1 extends AppCompatActivity {
    CheckBox Ch1;
    CheckBox Ch10;
    CheckBox Ch11;
    CheckBox Ch12;
    CheckBox Ch13;
    CheckBox Ch14;
    CheckBox Ch15;
    CheckBox Ch16;
    CheckBox Ch17;
    CheckBox Ch18;
    CheckBox Ch19;
    CheckBox Ch2;
    CheckBox Ch20;
    CheckBox Ch21;
    CheckBox Ch22;
    CheckBox Ch23;
    CheckBox Ch24;
    CheckBox Ch25;
    CheckBox Ch26;
    CheckBox Ch27;
    CheckBox Ch28;
    CheckBox Ch29;
    CheckBox Ch3;
    CheckBox Ch30;
    CheckBox Ch4;
    CheckBox Ch5;
    CheckBox Ch6;
    CheckBox Ch7;
    CheckBox Ch8;
    CheckBox Ch9;
    CheckBox Chh1;
    CheckBox Chh10;
    CheckBox Chh11;
    CheckBox Chh12;
    CheckBox Chh13;
    CheckBox Chh14;
    CheckBox Chh15;
    CheckBox Chh16;
    CheckBox Chh17;
    CheckBox Chh18;
    CheckBox Chh19;
    CheckBox Chh2;
    CheckBox Chh20;
    CheckBox Chh21;
    CheckBox Chh22;
    CheckBox Chh23;
    CheckBox Chh24;
    CheckBox Chh25;
    CheckBox Chh26;
    CheckBox Chh27;
    CheckBox Chh28;
    CheckBox Chh29;
    CheckBox Chh3;
    CheckBox Chh30;
    CheckBox Chh4;
    CheckBox Chh5;
    CheckBox Chh6;
    CheckBox Chh7;
    CheckBox Chh8;
    CheckBox Chh9;
    CheckBox Chhh1;
    CheckBox Chhh10;
    CheckBox Chhh11;
    CheckBox Chhh12;
    CheckBox Chhh13;
    CheckBox Chhh14;
    CheckBox Chhh15;
    CheckBox Chhh16;
    CheckBox Chhh17;
    CheckBox Chhh18;
    CheckBox Chhh19;
    CheckBox Chhh2;
    CheckBox Chhh20;
    CheckBox Chhh21;
    CheckBox Chhh22;
    CheckBox Chhh23;
    CheckBox Chhh24;
    CheckBox Chhh25;
    CheckBox Chhh26;
    CheckBox Chhh27;
    CheckBox Chhh28;
    CheckBox Chhh29;
    CheckBox Chhh3;
    CheckBox Chhh30;
    CheckBox Chhh4;
    CheckBox Chhh5;
    CheckBox Chhh6;
    CheckBox Chhh7;
    CheckBox Chhh8;
    CheckBox Chhh9;
    long agetime;
    public AlertDialog.Builder alertAzmon1;

    /* renamed from: c1 */
    CheckBox f43c1;
    CheckBox c10;
    CheckBox c11;
    CheckBox c12;
    CheckBox c13;
    CheckBox c14;
    CheckBox c15;
    CheckBox c16;
    CheckBox c17;
    CheckBox c18;
    CheckBox c19;

    /* renamed from: c2 */
    CheckBox f44c2;
    CheckBox c20;
    CheckBox c21;
    CheckBox c22;
    CheckBox c23;
    CheckBox c24;
    CheckBox c25;
    CheckBox c26;
    CheckBox c27;
    CheckBox c28;
    CheckBox c29;

    /* renamed from: c3 */
    CheckBox f45c3;
    CheckBox c30;

    /* renamed from: c4 */
    CheckBox f46c4;

    /* renamed from: c5 */
    CheckBox f47c5;

    /* renamed from: c6 */
    CheckBox f48c6;

    /* renamed from: c7 */
    CheckBox f49c7;

    /* renamed from: c8 */
    CheckBox f50c8;

    /* renamed from: c9 */
    CheckBox f51c9;
    public Intent iazmon1;
    public MediaPlayer mediaPlayerstart1;
    public MediaPlayer mediaPlayerstop1;
    ProgressBar progressBar2;
    public Timer timer;
    TextView txt1;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0405R.layout.activity_azmon1);
        this.mediaPlayerstop1 = MediaPlayer.create(this, C0405R.raw.stop);
        this.mediaPlayerstart1 = MediaPlayer.create(this, C0405R.raw.start);
        this.mediaPlayerstart1.start();
        Toast.makeText(getBaseContext(), "لطفا به سوالات پاسخ دهید.", 1).show();
        this.progressBar2 = (ProgressBar) findViewById(C0405R.C0407id.progressBar2);
        final Intent intentResult1 = new Intent(this, Activity_Resualt_1.class);
        this.Ch1 = (CheckBox) findViewById(C0405R.C0407id.checkALEF1);
        this.Chh1 = (CheckBox) findViewById(C0405R.C0407id.checkB1);
        this.Chhh1 = (CheckBox) findViewById(C0405R.C0407id.checkjim1);
        this.Ch2 = (CheckBox) findViewById(C0405R.C0407id.checkALEF2);
        this.Chh2 = (CheckBox) findViewById(C0405R.C0407id.checkB2);
        this.Chhh2 = (CheckBox) findViewById(C0405R.C0407id.checkD2);
        this.Ch3 = (CheckBox) findViewById(C0405R.C0407id.checkALEF3);
        this.Chh3 = (CheckBox) findViewById(C0405R.C0407id.checkJ3);
        this.Chhh3 = (CheckBox) findViewById(C0405R.C0407id.checkD3);
        this.Ch4 = (CheckBox) findViewById(C0405R.C0407id.checkALEF4);
        this.Chh4 = (CheckBox) findViewById(C0405R.C0407id.checkJ4);
        this.Chhh4 = (CheckBox) findViewById(C0405R.C0407id.checkD4);
        this.Ch5 = (CheckBox) findViewById(C0405R.C0407id.checkB5);
        this.Chh5 = (CheckBox) findViewById(C0405R.C0407id.checkJ5);
        this.Chhh5 = (CheckBox) findViewById(C0405R.C0407id.checkD5);
        this.Ch6 = (CheckBox) findViewById(C0405R.C0407id.checkB6);
        this.Chh6 = (CheckBox) findViewById(C0405R.C0407id.checkALEF6);
        this.Chhh6 = (CheckBox) findViewById(C0405R.C0407id.checkD6);
        this.Ch7 = (CheckBox) findViewById(C0405R.C0407id.checkB7);
        this.Chh7 = (CheckBox) findViewById(C0405R.C0407id.checkJ7);
        this.Chhh7 = (CheckBox) findViewById(C0405R.C0407id.checkD7);
        this.Ch8 = (CheckBox) findViewById(C0405R.C0407id.checkALEF8);
        this.Chh8 = (CheckBox) findViewById(C0405R.C0407id.checkB8);
        this.Chhh8 = (CheckBox) findViewById(C0405R.C0407id.checkD8);
        this.Ch9 = (CheckBox) findViewById(C0405R.C0407id.checkALEF9);
        this.Chh9 = (CheckBox) findViewById(C0405R.C0407id.checkJ9);
        this.Chhh9 = (CheckBox) findViewById(C0405R.C0407id.checkD9);
        this.Ch10 = (CheckBox) findViewById(C0405R.C0407id.checkALEF10);
        this.Chh10 = (CheckBox) findViewById(C0405R.C0407id.checkJ10);
        this.Chhh10 = (CheckBox) findViewById(C0405R.C0407id.checkD10);
        this.Ch11 = (CheckBox) findViewById(C0405R.C0407id.checkALEF11);
        this.Chh11 = (CheckBox) findViewById(C0405R.C0407id.checkJ11);
        this.Chhh11 = (CheckBox) findViewById(C0405R.C0407id.checkd11);
        this.Ch12 = (CheckBox) findViewById(C0405R.C0407id.checkB12);
        this.Chh12 = (CheckBox) findViewById(C0405R.C0407id.checkJ12);
        this.Chhh12 = (CheckBox) findViewById(C0405R.C0407id.checkD12);
        this.Ch13 = (CheckBox) findViewById(C0405R.C0407id.checkALEF13);
        this.Chh13 = (CheckBox) findViewById(C0405R.C0407id.checkB13);
        this.Chhh13 = (CheckBox) findViewById(C0405R.C0407id.checkD13);
        this.Ch14 = (CheckBox) findViewById(C0405R.C0407id.checkALEF14);
        this.Chh14 = (CheckBox) findViewById(C0405R.C0407id.checkB14);
        this.Chhh14 = (CheckBox) findViewById(C0405R.C0407id.checkD14);
        this.Ch15 = (CheckBox) findViewById(C0405R.C0407id.checkALEF15);
        this.Chh15 = (CheckBox) findViewById(C0405R.C0407id.checkB15);
        this.Chhh15 = (CheckBox) findViewById(C0405R.C0407id.checkJ15);
        this.Ch16 = (CheckBox) findViewById(C0405R.C0407id.checkALEF16);
        this.Chh16 = (CheckBox) findViewById(C0405R.C0407id.checkB16);
        this.Chhh16 = (CheckBox) findViewById(C0405R.C0407id.checkD16);
        this.Ch17 = (CheckBox) findViewById(C0405R.C0407id.checkALEF17);
        this.Chh17 = (CheckBox) findViewById(C0405R.C0407id.checkB17);
        this.Chhh17 = (CheckBox) findViewById(C0405R.C0407id.checkJ17);
        this.Ch18 = (CheckBox) findViewById(C0405R.C0407id.checkALEF18);
        this.Chh18 = (CheckBox) findViewById(C0405R.C0407id.checkB18);
        this.Chhh18 = (CheckBox) findViewById(C0405R.C0407id.checkD18);
        this.Ch19 = (CheckBox) findViewById(C0405R.C0407id.checkALEF19);
        this.Chh19 = (CheckBox) findViewById(C0405R.C0407id.checkB19);
        this.Chhh19 = (CheckBox) findViewById(C0405R.C0407id.checkJ19);
        this.Ch20 = (CheckBox) findViewById(C0405R.C0407id.checkB20);
        this.Chh20 = (CheckBox) findViewById(C0405R.C0407id.checkJ20);
        this.Chhh20 = (CheckBox) findViewById(C0405R.C0407id.checkD20);
        this.Ch21 = (CheckBox) findViewById(C0405R.C0407id.checkALEF21);
        this.Chh21 = (CheckBox) findViewById(C0405R.C0407id.checkB21);
        this.Chhh21 = (CheckBox) findViewById(C0405R.C0407id.checkJ21);
        this.Ch22 = (CheckBox) findViewById(C0405R.C0407id.checkALEF22);
        this.Chh22 = (CheckBox) findViewById(C0405R.C0407id.checkJ22);
        this.Chhh22 = (CheckBox) findViewById(C0405R.C0407id.checkD22);
        this.Ch23 = (CheckBox) findViewById(C0405R.C0407id.checkALEF23);
        this.Chh23 = (CheckBox) findViewById(C0405R.C0407id.checkB23);
        this.Chhh23 = (CheckBox) findViewById(C0405R.C0407id.checkJ23);
        this.Ch24 = (CheckBox) findViewById(C0405R.C0407id.checkALEF24);
        this.Chh24 = (CheckBox) findViewById(C0405R.C0407id.checkJ24);
        this.Chhh24 = (CheckBox) findViewById(C0405R.C0407id.checkD24);
        this.Ch25 = (CheckBox) findViewById(C0405R.C0407id.checkALEF25);
        this.Chh25 = (CheckBox) findViewById(C0405R.C0407id.checkJ25);
        this.Chhh25 = (CheckBox) findViewById(C0405R.C0407id.checkB25);
        this.Ch26 = (CheckBox) findViewById(C0405R.C0407id.checkB26);
        this.Chh26 = (CheckBox) findViewById(C0405R.C0407id.checkJ26);
        this.Chhh26 = (CheckBox) findViewById(C0405R.C0407id.checkD26);
        this.Ch27 = (CheckBox) findViewById(C0405R.C0407id.checkALEF27);
        this.Chh27 = (CheckBox) findViewById(C0405R.C0407id.checkJ27);
        this.Chhh27 = (CheckBox) findViewById(C0405R.C0407id.checkD27);
        this.Ch28 = (CheckBox) findViewById(C0405R.C0407id.checkALEF28);
        this.Chh28 = (CheckBox) findViewById(C0405R.C0407id.checkJ28);
        this.Chhh28 = (CheckBox) findViewById(C0405R.C0407id.checkD28);
        this.Ch29 = (CheckBox) findViewById(C0405R.C0407id.checkALEF29);
        this.Chh29 = (CheckBox) findViewById(C0405R.C0407id.checkB29);
        this.Chhh29 = (CheckBox) findViewById(C0405R.C0407id.checkD29);
        this.Ch30 = (CheckBox) findViewById(C0405R.C0407id.checkALEF30);
        this.Chh30 = (CheckBox) findViewById(C0405R.C0407id.checkB30);
        this.Chhh30 = (CheckBox) findViewById(C0405R.C0407id.checkD30);
        this.f43c1 = (CheckBox) findViewById(C0405R.C0407id.checkD1);
        this.f44c2 = (CheckBox) findViewById(C0405R.C0407id.checkJim2);
        this.f45c3 = (CheckBox) findViewById(C0405R.C0407id.checkB3);
        this.f46c4 = (CheckBox) findViewById(C0405R.C0407id.checkB4);
        this.f47c5 = (CheckBox) findViewById(C0405R.C0407id.checkALEF5);
        this.f48c6 = (CheckBox) findViewById(C0405R.C0407id.checkJ6);
        this.f49c7 = (CheckBox) findViewById(C0405R.C0407id.checkALEF7);
        this.f50c8 = (CheckBox) findViewById(C0405R.C0407id.checkJ8);
        this.f51c9 = (CheckBox) findViewById(C0405R.C0407id.checkB9);
        this.c10 = (CheckBox) findViewById(C0405R.C0407id.checkB10);
        this.c11 = (CheckBox) findViewById(C0405R.C0407id.checkB11);
        this.c12 = (CheckBox) findViewById(C0405R.C0407id.checkALEF11);
        this.c13 = (CheckBox) findViewById(C0405R.C0407id.checkJ13);
        this.c14 = (CheckBox) findViewById(C0405R.C0407id.checkJ14);
        this.c15 = (CheckBox) findViewById(C0405R.C0407id.checkD15);
        this.c16 = (CheckBox) findViewById(C0405R.C0407id.checkJ16);
        this.c17 = (CheckBox) findViewById(C0405R.C0407id.checkD17);
        this.c18 = (CheckBox) findViewById(C0405R.C0407id.checkJ18);
        this.c19 = (CheckBox) findViewById(C0405R.C0407id.checkD19);
        this.c20 = (CheckBox) findViewById(C0405R.C0407id.checkALEF20);
        this.c21 = (CheckBox) findViewById(C0405R.C0407id.checkD21);
        this.c22 = (CheckBox) findViewById(C0405R.C0407id.checkB22);
        this.c23 = (CheckBox) findViewById(C0405R.C0407id.checkD23);
        this.c24 = (CheckBox) findViewById(C0405R.C0407id.checkB24);
        this.c25 = (CheckBox) findViewById(C0405R.C0407id.checkD25);
        this.c26 = (CheckBox) findViewById(C0405R.C0407id.checkALEF26);
        this.c27 = (CheckBox) findViewById(C0405R.C0407id.checkB27);
        this.c28 = (CheckBox) findViewById(C0405R.C0407id.checkB28);
        this.c29 = (CheckBox) findViewById(C0405R.C0407id.checkJ29);
        this.c30 = (CheckBox) findViewById(C0405R.C0407id.checkJ30);
        ((Button) findViewById(C0405R.C0407id.clickazmoncheck1)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (Activity_azmon1.this.f43c1.isChecked() && Activity_azmon1.this.f44c2.isChecked() && Activity_azmon1.this.f45c3.isChecked() && Activity_azmon1.this.f46c4.isChecked() && Activity_azmon1.this.f47c5.isChecked() && Activity_azmon1.this.f48c6.isChecked() && Activity_azmon1.this.f49c7.isChecked() && Activity_azmon1.this.f50c8.isChecked() && Activity_azmon1.this.f51c9.isChecked() && Activity_azmon1.this.c10.isChecked() && Activity_azmon1.this.c11.isChecked() && Activity_azmon1.this.c12.isChecked() && Activity_azmon1.this.c13.isChecked() && Activity_azmon1.this.c14.isChecked() && Activity_azmon1.this.c15.isChecked() && Activity_azmon1.this.c16.isChecked() && Activity_azmon1.this.c17.isChecked() && Activity_azmon1.this.c18.isChecked() && Activity_azmon1.this.c19.isChecked() && Activity_azmon1.this.c20.isChecked() && Activity_azmon1.this.c21.isChecked() && Activity_azmon1.this.c22.isChecked() && Activity_azmon1.this.c23.isChecked() && Activity_azmon1.this.c24.isChecked() && Activity_azmon1.this.c25.isChecked() && Activity_azmon1.this.c26.isChecked() && Activity_azmon1.this.c27.isChecked() && Activity_azmon1.this.c28.isChecked() && Activity_azmon1.this.c29.isChecked() && Activity_azmon1.this.c30.isChecked()) {
                    Toast.makeText(Activity_azmon1.this.getBaseContext(), "آفرین بر شما. نمره عالی را جهت قبولی کسب کردید", 1).show();
                    Activity_azmon1.this.progressBar2.setVisibility(0);
                    Activity_azmon1.this.startActivity(intentResult1);
                } else if (Activity_azmon1.this.Ch1.isChecked() || Activity_azmon1.this.Ch2.isChecked() || Activity_azmon1.this.Ch3.isChecked() || Activity_azmon1.this.Ch4.isChecked() || Activity_azmon1.this.Ch5.isChecked() || Activity_azmon1.this.Ch6.isChecked() || Activity_azmon1.this.Ch7.isChecked() || Activity_azmon1.this.Ch8.isChecked() || Activity_azmon1.this.Ch9.isChecked() || Activity_azmon1.this.Ch10.isChecked() || Activity_azmon1.this.Ch11.isChecked() || Activity_azmon1.this.Ch12.isChecked() || Activity_azmon1.this.Ch13.isChecked() || Activity_azmon1.this.Ch14.isChecked() || Activity_azmon1.this.Ch15.isChecked() || Activity_azmon1.this.Ch16.isChecked() || Activity_azmon1.this.Ch17.isChecked() || Activity_azmon1.this.Ch18.isChecked() || Activity_azmon1.this.Ch19.isChecked() || Activity_azmon1.this.Ch20.isChecked() || Activity_azmon1.this.Ch21.isChecked() || Activity_azmon1.this.Ch22.isChecked() || Activity_azmon1.this.Ch23.isChecked() || Activity_azmon1.this.Ch24.isChecked() || Activity_azmon1.this.Ch25.isChecked() || Activity_azmon1.this.Ch26.isChecked() || Activity_azmon1.this.Ch27.isChecked() || Activity_azmon1.this.Ch28.isChecked() || Activity_azmon1.this.Ch29.isChecked() || Activity_azmon1.this.Ch30.isChecked() || Activity_azmon1.this.Chh1.isChecked() || Activity_azmon1.this.Chh2.isChecked() || Activity_azmon1.this.Chh3.isChecked() || Activity_azmon1.this.Chh4.isChecked() || Activity_azmon1.this.Chh5.isChecked() || Activity_azmon1.this.Chh6.isChecked() || Activity_azmon1.this.Chh7.isChecked() || Activity_azmon1.this.Chh8.isChecked() || Activity_azmon1.this.Chh9.isChecked() || Activity_azmon1.this.Chh10.isChecked() || Activity_azmon1.this.Chh11.isChecked() || Activity_azmon1.this.Chh12.isChecked() || Activity_azmon1.this.Chh13.isChecked() || Activity_azmon1.this.Chh14.isChecked() || Activity_azmon1.this.Chh15.isChecked() || Activity_azmon1.this.Chh16.isChecked() || Activity_azmon1.this.Chh17.isChecked() || Activity_azmon1.this.Chh18.isChecked() || Activity_azmon1.this.Chh19.isChecked() || Activity_azmon1.this.Chh20.isChecked() || Activity_azmon1.this.Chh21.isChecked() || Activity_azmon1.this.Chh22.isChecked() || Activity_azmon1.this.Chh23.isChecked() || Activity_azmon1.this.Chh24.isChecked() || Activity_azmon1.this.Chh25.isChecked() || Activity_azmon1.this.Chh26.isChecked() || Activity_azmon1.this.Chh27.isChecked() || Activity_azmon1.this.Chh28.isChecked() || Activity_azmon1.this.Chh29.isChecked() || Activity_azmon1.this.Chh30.isChecked() || Activity_azmon1.this.Chhh1.isChecked() || Activity_azmon1.this.Chhh2.isChecked() || Activity_azmon1.this.Chhh3.isChecked() || Activity_azmon1.this.Chhh4.isChecked() || Activity_azmon1.this.Chhh5.isChecked() || Activity_azmon1.this.Chhh6.isChecked() || Activity_azmon1.this.Chhh7.isChecked() || Activity_azmon1.this.Chhh8.isChecked() || Activity_azmon1.this.Chhh9.isChecked() || Activity_azmon1.this.Chhh10.isChecked() || Activity_azmon1.this.Chhh11.isChecked() || Activity_azmon1.this.Chhh12.isChecked() || Activity_azmon1.this.Chhh13.isChecked() || Activity_azmon1.this.Chhh14.isChecked() || Activity_azmon1.this.Chhh15.isChecked() || Activity_azmon1.this.Chhh16.isChecked() || Activity_azmon1.this.Chhh17.isChecked() || Activity_azmon1.this.Chhh18.isChecked() || Activity_azmon1.this.Chhh19.isChecked() || Activity_azmon1.this.Chhh20.isChecked() || Activity_azmon1.this.Chhh21.isChecked() || Activity_azmon1.this.Chhh22.isChecked() || Activity_azmon1.this.Chhh23.isChecked() || Activity_azmon1.this.Chhh24.isChecked() || Activity_azmon1.this.Chhh25.isChecked() || Activity_azmon1.this.Chhh26.isChecked() || Activity_azmon1.this.Chhh27.isChecked() || Activity_azmon1.this.Chhh28.isChecked() || Activity_azmon1.this.Chhh29.isChecked() || Activity_azmon1.this.Chhh30.isChecked()) {
                    Toast.makeText(Activity_azmon1.this.getBaseContext(), "جواب های شما نادرست است لطفا بیشتر دقت کنید.", 0).show();
                } else {
                    Toast.makeText(Activity_azmon1.this.getBaseContext(), "لطفا به همه سوالات پاسخ دهید", 0).show();
                }
            }
        });
        ((Button) findViewById(C0405R.C0407id.clickazmonchecktrue)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Activity_azmon1.this.f43c1.setChecked(true);
                Activity_azmon1.this.f44c2.setChecked(true);
                Activity_azmon1.this.f45c3.setChecked(true);
                Activity_azmon1.this.f46c4.setChecked(true);
                Activity_azmon1.this.f47c5.setChecked(true);
                Activity_azmon1.this.f48c6.setChecked(true);
                Activity_azmon1.this.f49c7.setChecked(true);
                Activity_azmon1.this.f50c8.setChecked(true);
                Activity_azmon1.this.f51c9.setChecked(true);
                Activity_azmon1.this.c10.setChecked(true);
                Activity_azmon1.this.c11.setChecked(true);
                Activity_azmon1.this.c12.setChecked(true);
                Activity_azmon1.this.c13.setChecked(true);
                Activity_azmon1.this.c14.setChecked(true);
                Activity_azmon1.this.c15.setChecked(true);
                Activity_azmon1.this.c16.setChecked(true);
                Activity_azmon1.this.c17.setChecked(true);
                Activity_azmon1.this.c18.setChecked(true);
                Activity_azmon1.this.c19.setChecked(true);
                Activity_azmon1.this.c20.setChecked(true);
                Activity_azmon1.this.c21.setChecked(true);
                Activity_azmon1.this.c22.setChecked(true);
                Activity_azmon1.this.c23.setChecked(true);
                Activity_azmon1.this.c24.setChecked(true);
                Activity_azmon1.this.c25.setChecked(true);
                Activity_azmon1.this.c26.setChecked(true);
                Activity_azmon1.this.c27.setChecked(true);
                Activity_azmon1.this.c28.setChecked(true);
                Activity_azmon1.this.c29.setChecked(true);
                Activity_azmon1.this.c30.setChecked(true);
                Activity_azmon1.this.f43c1.setBackgroundColor(Color.parseColor("#FF1F9916"));
                Activity_azmon1.this.f44c2.setBackgroundColor(Color.parseColor("#FF1F9916"));
                Activity_azmon1.this.f45c3.setBackgroundColor(Color.parseColor("#FF1F9916"));
                Activity_azmon1.this.f46c4.setBackgroundColor(Color.parseColor("#FF1F9916"));
                Activity_azmon1.this.f47c5.setBackgroundColor(Color.parseColor("#FF1F9916"));
                Activity_azmon1.this.f48c6.setBackgroundColor(Color.parseColor("#FF1F9916"));
                Activity_azmon1.this.f49c7.setBackgroundColor(Color.parseColor("#FF1F9916"));
                Activity_azmon1.this.f50c8.setBackgroundColor(Color.parseColor("#FF1F9916"));
                Activity_azmon1.this.f51c9.setBackgroundColor(Color.parseColor("#FF1F9916"));
                Activity_azmon1.this.c10.setBackgroundColor(Color.parseColor("#FF1F9916"));
                Activity_azmon1.this.c11.setBackgroundColor(Color.parseColor("#FF1F9916"));
                Activity_azmon1.this.c12.setBackgroundColor(Color.parseColor("#FF1F9916"));
                Activity_azmon1.this.c13.setBackgroundColor(Color.parseColor("#FF1F9916"));
                Activity_azmon1.this.c14.setBackgroundColor(Color.parseColor("#FF1F9916"));
                Activity_azmon1.this.c15.setBackgroundColor(Color.parseColor("#FF1F9916"));
                Activity_azmon1.this.c16.setBackgroundColor(Color.parseColor("#FF1F9916"));
                Activity_azmon1.this.c17.setBackgroundColor(Color.parseColor("#FF1F9916"));
                Activity_azmon1.this.c18.setBackgroundColor(Color.parseColor("#FF1F9916"));
                Activity_azmon1.this.c19.setBackgroundColor(Color.parseColor("#FF1F9916"));
                Activity_azmon1.this.c20.setBackgroundColor(Color.parseColor("#FF1F9916"));
                Activity_azmon1.this.c21.setBackgroundColor(Color.parseColor("#FF1F9916"));
                Activity_azmon1.this.c22.setBackgroundColor(Color.parseColor("#FF1F9916"));
                Activity_azmon1.this.c23.setBackgroundColor(Color.parseColor("#FF1F9916"));
                Activity_azmon1.this.c24.setBackgroundColor(Color.parseColor("#FF1F9916"));
                Activity_azmon1.this.c25.setBackgroundColor(Color.parseColor("#FF1F9916"));
                Activity_azmon1.this.c26.setBackgroundColor(Color.parseColor("#FF1F9916"));
                Activity_azmon1.this.c27.setBackgroundColor(Color.parseColor("#FF1F9916"));
                Activity_azmon1.this.c28.setBackgroundColor(Color.parseColor("#FF1F9916"));
                Activity_azmon1.this.c29.setBackgroundColor(Color.parseColor("#FF1F9916"));
                Activity_azmon1.this.c30.setBackgroundColor(Color.parseColor("#FF1F9916"));
            }
        });
        ((Button) findViewById(C0405R.C0407id.clickazmoncheckfalse)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Activity_azmon1.this.f43c1.setChecked(false);
                Activity_azmon1.this.f44c2.setChecked(false);
                Activity_azmon1.this.f45c3.setChecked(false);
                Activity_azmon1.this.f46c4.setChecked(false);
                Activity_azmon1.this.f47c5.setChecked(false);
                Activity_azmon1.this.f48c6.setChecked(false);
                Activity_azmon1.this.f49c7.setChecked(false);
                Activity_azmon1.this.f50c8.setChecked(false);
                Activity_azmon1.this.f51c9.setChecked(false);
                Activity_azmon1.this.c10.setChecked(false);
                Activity_azmon1.this.c11.setChecked(false);
                Activity_azmon1.this.c12.setChecked(false);
                Activity_azmon1.this.c13.setChecked(false);
                Activity_azmon1.this.c14.setChecked(false);
                Activity_azmon1.this.c15.setChecked(false);
                Activity_azmon1.this.c16.setChecked(false);
                Activity_azmon1.this.c17.setChecked(false);
                Activity_azmon1.this.c18.setChecked(false);
                Activity_azmon1.this.c19.setChecked(false);
                Activity_azmon1.this.c20.setChecked(false);
                Activity_azmon1.this.c21.setChecked(false);
                Activity_azmon1.this.c22.setChecked(false);
                Activity_azmon1.this.c23.setChecked(false);
                Activity_azmon1.this.c24.setChecked(false);
                Activity_azmon1.this.c25.setChecked(false);
                Activity_azmon1.this.c26.setChecked(false);
                Activity_azmon1.this.c27.setChecked(false);
                Activity_azmon1.this.c28.setChecked(false);
                Activity_azmon1.this.c29.setChecked(false);
                Activity_azmon1.this.c30.setChecked(false);
                Activity_azmon1.this.f43c1.setBackgroundColor(Color.parseColor("#ff5a595b"));
                Activity_azmon1.this.f44c2.setBackgroundColor(Color.parseColor("#ff5a595b"));
                Activity_azmon1.this.f45c3.setBackgroundColor(Color.parseColor("#ff5a595b"));
                Activity_azmon1.this.f46c4.setBackgroundColor(Color.parseColor("#ff5a595b"));
                Activity_azmon1.this.f47c5.setBackgroundColor(Color.parseColor("#ff5a595b"));
                Activity_azmon1.this.f48c6.setBackgroundColor(Color.parseColor("#ff5a595b"));
                Activity_azmon1.this.f49c7.setBackgroundColor(Color.parseColor("#ff5a595b"));
                Activity_azmon1.this.f50c8.setBackgroundColor(Color.parseColor("#ff5a595b"));
                Activity_azmon1.this.f51c9.setBackgroundColor(Color.parseColor("#ff5a595b"));
                Activity_azmon1.this.c10.setBackgroundColor(Color.parseColor("#ff5a595b"));
                Activity_azmon1.this.c11.setBackgroundColor(Color.parseColor("#ff5a595b"));
                Activity_azmon1.this.c12.setBackgroundColor(Color.parseColor("#ff5a595b"));
                Activity_azmon1.this.c13.setBackgroundColor(Color.parseColor("#ff5a595b"));
                Activity_azmon1.this.c14.setBackgroundColor(Color.parseColor("#ff5a595b"));
                Activity_azmon1.this.c15.setBackgroundColor(Color.parseColor("#ff5a595b"));
                Activity_azmon1.this.c16.setBackgroundColor(Color.parseColor("#ff5a595b"));
                Activity_azmon1.this.c17.setBackgroundColor(Color.parseColor("#ff5a595b"));
                Activity_azmon1.this.c18.setBackgroundColor(Color.parseColor("#ff5a595b"));
                Activity_azmon1.this.c19.setBackgroundColor(Color.parseColor("#ff5a595b"));
                Activity_azmon1.this.c20.setBackgroundColor(Color.parseColor("#ff5a595b"));
                Activity_azmon1.this.c21.setBackgroundColor(Color.parseColor("#ff5a595b"));
                Activity_azmon1.this.c22.setBackgroundColor(Color.parseColor("#ff5a595b"));
                Activity_azmon1.this.c23.setBackgroundColor(Color.parseColor("#ff5a595b"));
                Activity_azmon1.this.c24.setBackgroundColor(Color.parseColor("#ff5a595b"));
                Activity_azmon1.this.c25.setBackgroundColor(Color.parseColor("#ff5a595b"));
                Activity_azmon1.this.c26.setBackgroundColor(Color.parseColor("#ff5a595b"));
                Activity_azmon1.this.c27.setBackgroundColor(Color.parseColor("#ff5a595b"));
                Activity_azmon1.this.c28.setBackgroundColor(Color.parseColor("#ff5a595b"));
                Activity_azmon1.this.c29.setBackgroundColor(Color.parseColor("#ff5a595b"));
                Activity_azmon1.this.c30.setBackgroundColor(Color.parseColor("#ff5a595b"));
            }
        });
        this.iazmon1 = new Intent(this, Activity_azmon1.class);
        this.alertAzmon1 = new AlertDialog.Builder(this);
        this.alertAzmon1.setTitle("شروع مجدد");
        this.alertAzmon1.setMessage("آیا قصد دارید مجدد همین آزمون را انجام دهید؟");
        final Intent intenthomeeeA1 = new Intent(this, MainActivity.class);
        final Intent intentazmoonnnn11A1 = new Intent(this, activity_Azmoons.class);
        final Intent intentleaerrrnA1 = new Intent(this, activity_learning.class);
        ((BottomNavigationView) findViewById(C0405R.C0407id.Wiggetnav1)).setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == C0405R.C0407id.f52a) {
                    Activity_azmon1.this.startActivity(intenthomeeeA1);
                }
                if (item.getItemId() == C0405R.C0407id.f53b) {
                    Activity_azmon1.this.startActivity(intentazmoonnnn11A1);
                }
                if (item.getItemId() != C0405R.C0407id.f54c) {
                    return true;
                }
                Activity_azmon1.this.startActivity(intentleaerrrnA1);
                return true;
            }
        });
        this.txt1 = (TextView) findViewById(C0405R.C0407id.txt_timer1);
        this.txt1.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.txt1.setTextAlignment(4);
        gettime();
    }

    /* access modifiers changed from: package-private */
    public void gettime() {
        this.agetime = 1200000;
        this.timer = new Timer();
        this.timer.schedule(new TimerTask() {
            public void run() {
                Activity_azmon1.this.runOnUiThread(new Runnable() {
                    public void run() {
                        Activity_azmon1.this.agetime -= 1000;
                        Activity_azmon1.this.txt1.setText(Activity_azmon1.this.getStr(Activity_azmon1.this.agetime));
                        Activity_azmon1.this.txt1.setTextAlignment(4);
                        Activity_azmon1.this.txt1.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                        if (Activity_azmon1.this.agetime == 0) {
                            Activity_azmon1.this.timer.cancel();
                            Activity_azmon1.this.txt1.setText("00 : 00");
                            Activity_azmon1.this.txt1.setTextAlignment(4);
                            Activity_azmon1.this.txt1.setTextColor(Color.parseColor("#FF7F1010"));
                            Activity_azmon1.this.mediaPlayerstop1.start();
                            Toast.makeText(Activity_azmon1.this.getBaseContext(), "زمان پاسخ گویی به پایان رسید.", 1).show();
                            Activity_azmon1.this.alertAzmon1.setPositiveButton("خیر", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    Activity_azmon1.this.finish();
                                }
                            });
                            Activity_azmon1.this.alertAzmon1.setNeutralButton("بله", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    Activity_azmon1.this.startActivity(Activity_azmon1.this.iazmon1);
                                }
                            });
                            Activity_azmon1.this.alertAzmon1.show();
                        }
                    }
                });
            }
        }, 0, 1000);
    }

    public String getStr(long agetime2) {
        long secouund = agetime2 / 1000;
        return String.format(Locale.ENGLISH, "%02d", new Object[]{Long.valueOf(secouund % 60)}) + " : " + String.format(Locale.ENGLISH, "%02d", new Object[]{Long.valueOf(secouund / 60)});
    }

    public void onBackPressed() {
        this.timer.cancel();
        new AlertDialog.Builder(this).setTitle("خروج").setMessage("آیا قصد دارید از آزمون خارج شوید؟").setPositiveButton("بله", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Activity_azmon1.super.onBackPressed();
            }
        }).create().show();
    }
}
