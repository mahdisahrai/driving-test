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

public class activity_azmon2 extends AppCompatActivity {
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
    long agetime2;
    public AlertDialog.Builder alertAzmon2;

    /* renamed from: c1 */
    CheckBox f65c1;
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
    CheckBox f66c2;
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
    CheckBox f67c3;
    CheckBox c30;

    /* renamed from: c4 */
    CheckBox f68c4;

    /* renamed from: c5 */
    CheckBox f69c5;

    /* renamed from: c6 */
    CheckBox f70c6;

    /* renamed from: c7 */
    CheckBox f71c7;

    /* renamed from: c8 */
    CheckBox f72c8;

    /* renamed from: c9 */
    CheckBox f73c9;
    public Intent iazmon2;
    public MediaPlayer mediaPlayerstart2;
    public MediaPlayer mediaPlayerstop2;
    ProgressBar progressBar3;
    public Timer timer2;
    TextView txt2;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0405R.layout.activity_azmon2);
        this.mediaPlayerstop2 = MediaPlayer.create(this, C0405R.raw.stop);
        this.mediaPlayerstart2 = MediaPlayer.create(this, C0405R.raw.start);
        this.mediaPlayerstart2.start();
        Toast.makeText(getBaseContext(), "لطفا به سوالات پاسخ دهید.", 1).show();
        this.progressBar3 = (ProgressBar) findViewById(C0405R.C0407id.progressBar3);
        final Intent intentResult2 = new Intent(this, activity_resualt_2.class);
        this.Ch1 = (CheckBox) findViewById(C0405R.C0407id.checkALEFf1);
        this.Chh1 = (CheckBox) findViewById(C0405R.C0407id.checkDd1);
        this.Chhh1 = (CheckBox) findViewById(C0405R.C0407id.checkjj1);
        this.Ch2 = (CheckBox) findViewById(C0405R.C0407id.checkALEFf2);
        this.Chh2 = (CheckBox) findViewById(C0405R.C0407id.checkBb2);
        this.Chhh2 = (CheckBox) findViewById(C0405R.C0407id.checkJj2);
        this.Ch3 = (CheckBox) findViewById(C0405R.C0407id.checkALEFf3);
        this.Chh3 = (CheckBox) findViewById(C0405R.C0407id.checkBb3);
        this.Chhh3 = (CheckBox) findViewById(C0405R.C0407id.checkDd3);
        this.Ch4 = (CheckBox) findViewById(C0405R.C0407id.checkALEFf4);
        this.Chh4 = (CheckBox) findViewById(C0405R.C0407id.checkJj4);
        this.Chhh4 = (CheckBox) findViewById(C0405R.C0407id.checkDd4);
        this.Ch5 = (CheckBox) findViewById(C0405R.C0407id.checkBb5);
        this.Chh5 = (CheckBox) findViewById(C0405R.C0407id.checkJj5);
        this.Chhh5 = (CheckBox) findViewById(C0405R.C0407id.checkALEFf5);
        this.Ch6 = (CheckBox) findViewById(C0405R.C0407id.checkBb6);
        this.Chh6 = (CheckBox) findViewById(C0405R.C0407id.checkALEFf6);
        this.Chhh6 = (CheckBox) findViewById(C0405R.C0407id.checkJj6);
        this.Ch7 = (CheckBox) findViewById(C0405R.C0407id.checkBb7);
        this.Chh7 = (CheckBox) findViewById(C0405R.C0407id.checkALEFf7);
        this.Chhh7 = (CheckBox) findViewById(C0405R.C0407id.checkDd7);
        this.Ch8 = (CheckBox) findViewById(C0405R.C0407id.checkJj8);
        this.Chh8 = (CheckBox) findViewById(C0405R.C0407id.checkBb8);
        this.Chhh8 = (CheckBox) findViewById(C0405R.C0407id.checkDd8);
        this.Ch9 = (CheckBox) findViewById(C0405R.C0407id.checkALEFf9);
        this.Chh9 = (CheckBox) findViewById(C0405R.C0407id.checkJj9);
        this.Chhh9 = (CheckBox) findViewById(C0405R.C0407id.checkDd9);
        this.Ch10 = (CheckBox) findViewById(C0405R.C0407id.checkBb10);
        this.Chh10 = (CheckBox) findViewById(C0405R.C0407id.checkJj10);
        this.Chhh10 = (CheckBox) findViewById(C0405R.C0407id.checkDd10);
        this.Ch11 = (CheckBox) findViewById(C0405R.C0407id.checkALEFf11);
        this.Chh11 = (CheckBox) findViewById(C0405R.C0407id.checkJj11);
        this.Chhh11 = (CheckBox) findViewById(C0405R.C0407id.checkBb11);
        this.Ch12 = (CheckBox) findViewById(C0405R.C0407id.checkALEFf12);
        this.Chh12 = (CheckBox) findViewById(C0405R.C0407id.checkJj12);
        this.Chhh12 = (CheckBox) findViewById(C0405R.C0407id.checkBb12);
        this.Ch13 = (CheckBox) findViewById(C0405R.C0407id.checkJj13);
        this.Chh13 = (CheckBox) findViewById(C0405R.C0407id.checkBb13);
        this.Chhh13 = (CheckBox) findViewById(C0405R.C0407id.checkDd13);
        this.Ch14 = (CheckBox) findViewById(C0405R.C0407id.checkALEFf14);
        this.Chh14 = (CheckBox) findViewById(C0405R.C0407id.checkBb14);
        this.Chhh14 = (CheckBox) findViewById(C0405R.C0407id.checkJj14);
        this.Ch15 = (CheckBox) findViewById(C0405R.C0407id.checkALEFf15);
        this.Chh15 = (CheckBox) findViewById(C0405R.C0407id.checkBb15);
        this.Chhh15 = (CheckBox) findViewById(C0405R.C0407id.checkDd15);
        this.Ch16 = (CheckBox) findViewById(C0405R.C0407id.checkJj16);
        this.Chh16 = (CheckBox) findViewById(C0405R.C0407id.checkBb16);
        this.Chhh16 = (CheckBox) findViewById(C0405R.C0407id.checkDd16);
        this.Ch17 = (CheckBox) findViewById(C0405R.C0407id.checkALEFf17);
        this.Chh17 = (CheckBox) findViewById(C0405R.C0407id.checkBb17);
        this.Chhh17 = (CheckBox) findViewById(C0405R.C0407id.checkDd17);
        this.Ch18 = (CheckBox) findViewById(C0405R.C0407id.checkALEFf18);
        this.Chh18 = (CheckBox) findViewById(C0405R.C0407id.checkBb18);
        this.Chhh18 = (CheckBox) findViewById(C0405R.C0407id.checkJj18);
        this.Ch19 = (CheckBox) findViewById(C0405R.C0407id.checkALEFf19);
        this.Chh19 = (CheckBox) findViewById(C0405R.C0407id.checkBb19);
        this.Chhh19 = (CheckBox) findViewById(C0405R.C0407id.checkJj19);
        this.Ch20 = (CheckBox) findViewById(C0405R.C0407id.checkDd20);
        this.Chh20 = (CheckBox) findViewById(C0405R.C0407id.checkJj20);
        this.Chhh20 = (CheckBox) findViewById(C0405R.C0407id.checkALEFf20);
        this.Ch21 = (CheckBox) findViewById(C0405R.C0407id.checkDd21);
        this.Chh21 = (CheckBox) findViewById(C0405R.C0407id.checkJj21);
        this.Chhh21 = (CheckBox) findViewById(C0405R.C0407id.checkALEFf21);
        this.Ch22 = (CheckBox) findViewById(C0405R.C0407id.checkDd22);
        this.Chh22 = (CheckBox) findViewById(C0405R.C0407id.checkJj22);
        this.Chhh22 = (CheckBox) findViewById(C0405R.C0407id.checkALEFf22);
        this.Ch23 = (CheckBox) findViewById(C0405R.C0407id.checkBb23);
        this.Chh23 = (CheckBox) findViewById(C0405R.C0407id.checkDd23);
        this.Chhh23 = (CheckBox) findViewById(C0405R.C0407id.checkJ23);
        this.Ch24 = (CheckBox) findViewById(C0405R.C0407id.checkALEFf24);
        this.Chh24 = (CheckBox) findViewById(C0405R.C0407id.checkBb24);
        this.Chhh24 = (CheckBox) findViewById(C0405R.C0407id.checkDd24);
        this.Ch25 = (CheckBox) findViewById(C0405R.C0407id.checkDd25);
        this.Chh25 = (CheckBox) findViewById(C0405R.C0407id.checkJj25);
        this.Chhh25 = (CheckBox) findViewById(C0405R.C0407id.checkBb25);
        this.Ch26 = (CheckBox) findViewById(C0405R.C0407id.checkDd26);
        this.Chh26 = (CheckBox) findViewById(C0405R.C0407id.checkJj26);
        this.Chhh26 = (CheckBox) findViewById(C0405R.C0407id.checkALEF26);
        this.Ch27 = (CheckBox) findViewById(C0405R.C0407id.checkALEFf27);
        this.Chh27 = (CheckBox) findViewById(C0405R.C0407id.checkJj27);
        this.Chhh27 = (CheckBox) findViewById(C0405R.C0407id.checkDd27);
        this.Ch28 = (CheckBox) findViewById(C0405R.C0407id.checkALEFf28);
        this.Chh28 = (CheckBox) findViewById(C0405R.C0407id.checkBb28);
        this.Chhh28 = (CheckBox) findViewById(C0405R.C0407id.checkDd28);
        this.Ch29 = (CheckBox) findViewById(C0405R.C0407id.checkALEFf29);
        this.Chh29 = (CheckBox) findViewById(C0405R.C0407id.checkBb29);
        this.Chhh29 = (CheckBox) findViewById(C0405R.C0407id.checkDd29);
        this.Ch30 = (CheckBox) findViewById(C0405R.C0407id.checkALEFf30);
        this.Chh30 = (CheckBox) findViewById(C0405R.C0407id.checkBb30);
        this.Chhh30 = (CheckBox) findViewById(C0405R.C0407id.checkDd30);
        this.f65c1 = (CheckBox) findViewById(C0405R.C0407id.checkBb1);
        this.f66c2 = (CheckBox) findViewById(C0405R.C0407id.checkDd2);
        this.f67c3 = (CheckBox) findViewById(C0405R.C0407id.checkJj3);
        this.f68c4 = (CheckBox) findViewById(C0405R.C0407id.checkBb4);
        this.f69c5 = (CheckBox) findViewById(C0405R.C0407id.checkDd5);
        this.f70c6 = (CheckBox) findViewById(C0405R.C0407id.checkDd6);
        this.f71c7 = (CheckBox) findViewById(C0405R.C0407id.checkJj7);
        this.f72c8 = (CheckBox) findViewById(C0405R.C0407id.checkALEFf8);
        this.f73c9 = (CheckBox) findViewById(C0405R.C0407id.checkBb9);
        this.c10 = (CheckBox) findViewById(C0405R.C0407id.checkALEFf10);
        this.c11 = (CheckBox) findViewById(C0405R.C0407id.checkdd11);
        this.c12 = (CheckBox) findViewById(C0405R.C0407id.checkDd12);
        this.c13 = (CheckBox) findViewById(C0405R.C0407id.checkALEFf13);
        this.c14 = (CheckBox) findViewById(C0405R.C0407id.checkDd14);
        this.c15 = (CheckBox) findViewById(C0405R.C0407id.checkJj15);
        this.c16 = (CheckBox) findViewById(C0405R.C0407id.checkALEFf16);
        this.c17 = (CheckBox) findViewById(C0405R.C0407id.checkJj17);
        this.c18 = (CheckBox) findViewById(C0405R.C0407id.checkDd18);
        this.c19 = (CheckBox) findViewById(C0405R.C0407id.checkDd19);
        this.c20 = (CheckBox) findViewById(C0405R.C0407id.checkBb20);
        this.c21 = (CheckBox) findViewById(C0405R.C0407id.checkBb21);
        this.c22 = (CheckBox) findViewById(C0405R.C0407id.checkBb22);
        this.c23 = (CheckBox) findViewById(C0405R.C0407id.checkALEFf23);
        this.c24 = (CheckBox) findViewById(C0405R.C0407id.checkJj24);
        this.c25 = (CheckBox) findViewById(C0405R.C0407id.checkALEFf25);
        this.c26 = (CheckBox) findViewById(C0405R.C0407id.checkBb26);
        this.c27 = (CheckBox) findViewById(C0405R.C0407id.checkDd27);
        this.c28 = (CheckBox) findViewById(C0405R.C0407id.checkJj28);
        this.c29 = (CheckBox) findViewById(C0405R.C0407id.checkJj29);
        this.c30 = (CheckBox) findViewById(C0405R.C0407id.checkJj30);
        ((Button) findViewById(C0405R.C0407id.clickazmoncheck2)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(activity_azmon2.this.getBaseContext(), "لطفا به همه سوالات پاسخ دهید", 0).show();
                try {
                    if (activity_azmon2.this.f65c1.isChecked() && activity_azmon2.this.f66c2.isChecked() && activity_azmon2.this.f67c3.isChecked() && activity_azmon2.this.f68c4.isChecked() && activity_azmon2.this.f69c5.isChecked() && activity_azmon2.this.f70c6.isChecked() && activity_azmon2.this.f71c7.isChecked() && activity_azmon2.this.f72c8.isChecked() && activity_azmon2.this.f73c9.isChecked() && activity_azmon2.this.c10.isChecked() && activity_azmon2.this.c11.isChecked() && activity_azmon2.this.c12.isChecked() && activity_azmon2.this.c13.isChecked() && activity_azmon2.this.c14.isChecked() && activity_azmon2.this.c15.isChecked() && activity_azmon2.this.c16.isChecked() && activity_azmon2.this.c17.isChecked() && activity_azmon2.this.c18.isChecked() && activity_azmon2.this.c19.isChecked() && activity_azmon2.this.c20.isChecked() && activity_azmon2.this.c21.isChecked() && activity_azmon2.this.c22.isChecked() && activity_azmon2.this.c23.isChecked() && activity_azmon2.this.c24.isChecked() && activity_azmon2.this.c25.isChecked() && activity_azmon2.this.c26.isChecked() && activity_azmon2.this.c27.isChecked() && activity_azmon2.this.c28.isChecked() && activity_azmon2.this.c29.isChecked() && activity_azmon2.this.c30.isChecked()) {
                        Toast.makeText(activity_azmon2.this.getBaseContext(), "آفرین بر شما. نمره عالی را جهت قبولی کسب کردید", 1).show();
                        activity_azmon2.this.progressBar3.setVisibility(0);
                        activity_azmon2.this.startActivity(intentResult2);
                    } else if (activity_azmon2.this.Ch1.isChecked() || activity_azmon2.this.Ch2.isChecked() || activity_azmon2.this.Ch3.isChecked() || activity_azmon2.this.Ch4.isChecked() || activity_azmon2.this.Ch5.isChecked() || activity_azmon2.this.Ch6.isChecked() || activity_azmon2.this.Ch7.isChecked() || activity_azmon2.this.Ch8.isChecked() || activity_azmon2.this.Ch9.isChecked() || activity_azmon2.this.Ch10.isChecked() || activity_azmon2.this.Ch11.isChecked() || activity_azmon2.this.Ch12.isChecked() || activity_azmon2.this.Ch13.isChecked() || activity_azmon2.this.Ch14.isChecked() || activity_azmon2.this.Ch15.isChecked() || activity_azmon2.this.Ch16.isChecked() || activity_azmon2.this.Ch17.isChecked() || activity_azmon2.this.Ch18.isChecked() || activity_azmon2.this.Ch19.isChecked() || activity_azmon2.this.Ch20.isChecked() || activity_azmon2.this.Ch21.isChecked() || activity_azmon2.this.Ch22.isChecked() || activity_azmon2.this.Ch23.isChecked() || activity_azmon2.this.Ch24.isChecked() || activity_azmon2.this.Ch25.isChecked() || activity_azmon2.this.Ch26.isChecked() || activity_azmon2.this.Ch27.isChecked() || activity_azmon2.this.Ch28.isChecked() || activity_azmon2.this.Ch29.isChecked() || activity_azmon2.this.Ch30.isChecked() || activity_azmon2.this.Chh1.isChecked() || activity_azmon2.this.Chh2.isChecked() || activity_azmon2.this.Chh3.isChecked() || activity_azmon2.this.Chh4.isChecked() || activity_azmon2.this.Chh5.isChecked() || activity_azmon2.this.Chh6.isChecked() || activity_azmon2.this.Chh7.isChecked() || activity_azmon2.this.Chh8.isChecked() || activity_azmon2.this.Chh9.isChecked() || activity_azmon2.this.Chh10.isChecked() || activity_azmon2.this.Chh11.isChecked() || activity_azmon2.this.Chh12.isChecked() || activity_azmon2.this.Chh13.isChecked() || activity_azmon2.this.Chh14.isChecked() || activity_azmon2.this.Chh15.isChecked() || activity_azmon2.this.Chh16.isChecked() || activity_azmon2.this.Chh17.isChecked() || activity_azmon2.this.Chh18.isChecked() || activity_azmon2.this.Chh19.isChecked() || activity_azmon2.this.Chh20.isChecked() || activity_azmon2.this.Chh21.isChecked() || activity_azmon2.this.Chh22.isChecked() || activity_azmon2.this.Chh23.isChecked() || activity_azmon2.this.Chh24.isChecked() || activity_azmon2.this.Chh25.isChecked() || activity_azmon2.this.Chh26.isChecked() || activity_azmon2.this.Chh27.isChecked() || activity_azmon2.this.Chh28.isChecked() || activity_azmon2.this.Chh29.isChecked() || activity_azmon2.this.Chh30.isChecked() || activity_azmon2.this.Chhh1.isChecked() || activity_azmon2.this.Chhh2.isChecked() || activity_azmon2.this.Chhh3.isChecked() || activity_azmon2.this.Chhh4.isChecked() || activity_azmon2.this.Chhh5.isChecked() || activity_azmon2.this.Chhh6.isChecked() || activity_azmon2.this.Chhh7.isChecked() || activity_azmon2.this.Chhh8.isChecked() || activity_azmon2.this.Chhh9.isChecked() || activity_azmon2.this.Chhh10.isChecked() || activity_azmon2.this.Chhh11.isChecked() || activity_azmon2.this.Chhh12.isChecked() || activity_azmon2.this.Chhh13.isChecked() || activity_azmon2.this.Chhh14.isChecked() || activity_azmon2.this.Chhh15.isChecked() || activity_azmon2.this.Chhh16.isChecked() || activity_azmon2.this.Chhh17.isChecked() || activity_azmon2.this.Chhh18.isChecked() || activity_azmon2.this.Chhh19.isChecked() || activity_azmon2.this.Chhh20.isChecked() || activity_azmon2.this.Chhh21.isChecked() || activity_azmon2.this.Chhh22.isChecked() || activity_azmon2.this.Chhh23.isChecked() || activity_azmon2.this.Chhh24.isChecked() || activity_azmon2.this.Chhh25.isChecked() || activity_azmon2.this.Chhh26.isChecked() || activity_azmon2.this.Chhh27.isChecked() || activity_azmon2.this.Chhh28.isChecked() || activity_azmon2.this.Chhh29.isChecked() || activity_azmon2.this.Chhh30.isChecked()) {
                        Toast.makeText(activity_azmon2.this.getBaseContext(), "جواب های شما نادرست است لطفا بیشتر دقت کنید.", 0).show();
                    }
                } catch (Exception e) {
                }
            }
        });
        ((Button) findViewById(C0405R.C0407id.clickazmonchecktrue2)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                activity_azmon2.this.f65c1.setChecked(true);
                activity_azmon2.this.f66c2.setChecked(true);
                activity_azmon2.this.f67c3.setChecked(true);
                activity_azmon2.this.f68c4.setChecked(true);
                activity_azmon2.this.f69c5.setChecked(true);
                activity_azmon2.this.f70c6.setChecked(true);
                activity_azmon2.this.f71c7.setChecked(true);
                activity_azmon2.this.f72c8.setChecked(true);
                activity_azmon2.this.f73c9.setChecked(true);
                activity_azmon2.this.c10.setChecked(true);
                activity_azmon2.this.c11.setChecked(true);
                activity_azmon2.this.c12.setChecked(true);
                activity_azmon2.this.c13.setChecked(true);
                activity_azmon2.this.c14.setChecked(true);
                activity_azmon2.this.c15.setChecked(true);
                activity_azmon2.this.c16.setChecked(true);
                activity_azmon2.this.c17.setChecked(true);
                activity_azmon2.this.c18.setChecked(true);
                activity_azmon2.this.c19.setChecked(true);
                activity_azmon2.this.c20.setChecked(true);
                activity_azmon2.this.c21.setChecked(true);
                activity_azmon2.this.c22.setChecked(true);
                activity_azmon2.this.c23.setChecked(true);
                activity_azmon2.this.c24.setChecked(true);
                activity_azmon2.this.c25.setChecked(true);
                activity_azmon2.this.c26.setChecked(true);
                activity_azmon2.this.c27.setChecked(true);
                activity_azmon2.this.c28.setChecked(true);
                activity_azmon2.this.c29.setChecked(true);
                activity_azmon2.this.c30.setChecked(true);
                activity_azmon2.this.f65c1.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon2.this.f66c2.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon2.this.f67c3.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon2.this.f68c4.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon2.this.f69c5.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon2.this.f70c6.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon2.this.f71c7.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon2.this.f72c8.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon2.this.f73c9.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon2.this.c10.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon2.this.c11.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon2.this.c12.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon2.this.c13.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon2.this.c14.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon2.this.c15.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon2.this.c16.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon2.this.c17.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon2.this.c18.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon2.this.c19.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon2.this.c20.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon2.this.c21.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon2.this.c22.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon2.this.c23.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon2.this.c24.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon2.this.c25.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon2.this.c26.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon2.this.c27.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon2.this.c28.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon2.this.c29.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon2.this.c30.setBackgroundColor(Color.parseColor("#FF1F9916"));
            }
        });
        ((Button) findViewById(C0405R.C0407id.clickazmoncheckfalse2)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                activity_azmon2.this.f65c1.setChecked(false);
                activity_azmon2.this.f66c2.setChecked(false);
                activity_azmon2.this.f67c3.setChecked(false);
                activity_azmon2.this.f68c4.setChecked(false);
                activity_azmon2.this.f69c5.setChecked(false);
                activity_azmon2.this.f70c6.setChecked(false);
                activity_azmon2.this.f71c7.setChecked(false);
                activity_azmon2.this.f72c8.setChecked(false);
                activity_azmon2.this.f73c9.setChecked(false);
                activity_azmon2.this.c10.setChecked(false);
                activity_azmon2.this.c11.setChecked(false);
                activity_azmon2.this.c12.setChecked(false);
                activity_azmon2.this.c13.setChecked(false);
                activity_azmon2.this.c14.setChecked(false);
                activity_azmon2.this.c15.setChecked(false);
                activity_azmon2.this.c16.setChecked(false);
                activity_azmon2.this.c17.setChecked(false);
                activity_azmon2.this.c18.setChecked(false);
                activity_azmon2.this.c19.setChecked(false);
                activity_azmon2.this.c20.setChecked(false);
                activity_azmon2.this.c21.setChecked(false);
                activity_azmon2.this.c22.setChecked(false);
                activity_azmon2.this.c23.setChecked(false);
                activity_azmon2.this.c24.setChecked(false);
                activity_azmon2.this.c25.setChecked(false);
                activity_azmon2.this.c26.setChecked(false);
                activity_azmon2.this.c27.setChecked(false);
                activity_azmon2.this.c28.setChecked(false);
                activity_azmon2.this.c29.setChecked(false);
                activity_azmon2.this.c30.setChecked(false);
                activity_azmon2.this.f65c1.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon2.this.f66c2.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon2.this.f67c3.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon2.this.f68c4.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon2.this.f69c5.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon2.this.f70c6.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon2.this.f71c7.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon2.this.f72c8.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon2.this.f73c9.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon2.this.c10.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon2.this.c11.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon2.this.c12.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon2.this.c13.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon2.this.c14.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon2.this.c15.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon2.this.c16.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon2.this.c17.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon2.this.c18.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon2.this.c19.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon2.this.c20.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon2.this.c21.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon2.this.c22.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon2.this.c23.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon2.this.c24.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon2.this.c25.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon2.this.c26.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon2.this.c27.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon2.this.c28.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon2.this.c29.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon2.this.c30.setBackgroundColor(Color.parseColor("#ff5a595b"));
            }
        });
        this.iazmon2 = new Intent(this, activity_azmon2.class);
        this.alertAzmon2 = new AlertDialog.Builder(this);
        this.alertAzmon2.setTitle("شروع مجدد");
        this.alertAzmon2.setMessage("آیا قصد دارید مجدد همین آزمون را انجام دهید؟");
        final Intent intenthomeeeAa2 = new Intent(this, MainActivity.class);
        final Intent intentazmoonnnn11Ab2 = new Intent(this, activity_Azmoons.class);
        final Intent intentleaerrrnAc2 = new Intent(this, activity_learning.class);
        ((BottomNavigationView) findViewById(C0405R.C0407id.Wiggetnav1)).setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == C0405R.C0407id.f52a) {
                    activity_azmon2.this.startActivity(intenthomeeeAa2);
                }
                if (item.getItemId() == C0405R.C0407id.f53b) {
                    activity_azmon2.this.startActivity(intentazmoonnnn11Ab2);
                }
                if (item.getItemId() != C0405R.C0407id.f54c) {
                    return true;
                }
                activity_azmon2.this.startActivity(intentleaerrrnAc2);
                return true;
            }
        });
        this.txt2 = (TextView) findViewById(C0405R.C0407id.txt_timer1);
        this.txt2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.txt2.setTextAlignment(4);
        gettime();
    }

    /* access modifiers changed from: package-private */
    public void gettime() {
        this.agetime2 = 1200000;
        this.timer2 = new Timer();
        this.timer2.schedule(new TimerTask() {
            public void run() {
                activity_azmon2.this.runOnUiThread(new Runnable() {
                    public void run() {
                        activity_azmon2.this.agetime2 -= 1000;
                        activity_azmon2.this.txt2.setText(activity_azmon2.this.getStr(activity_azmon2.this.agetime2));
                        activity_azmon2.this.txt2.setTextAlignment(4);
                        activity_azmon2.this.txt2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                        if (activity_azmon2.this.agetime2 == 0) {
                            activity_azmon2.this.timer2.cancel();
                            activity_azmon2.this.txt2.setText("00 : 00");
                            activity_azmon2.this.txt2.setTextAlignment(4);
                            activity_azmon2.this.txt2.setTextColor(Color.parseColor("#FF7F1010"));
                            activity_azmon2.this.mediaPlayerstop2.start();
                            Toast.makeText(activity_azmon2.this.getBaseContext(), "زمان پاسخ گویی به پایان رسید.", 1).show();
                            activity_azmon2.this.alertAzmon2.setPositiveButton("خیر", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    activity_azmon2.this.finish();
                                }
                            });
                            activity_azmon2.this.alertAzmon2.setNeutralButton("بله", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    activity_azmon2.this.startActivity(activity_azmon2.this.iazmon2);
                                }
                            });
                            activity_azmon2.this.alertAzmon2.show();
                        }
                    }
                });
            }
        }, 0, 1000);
    }

    public String getStr(long agetime) {
        long secouund = agetime / 1000;
        return String.format(Locale.ENGLISH, "%02d", new Object[]{Long.valueOf(secouund % 60)}) + " : " + String.format(Locale.ENGLISH, "%02d", new Object[]{Long.valueOf(secouund / 60)});
    }

    public void onBackPressed() {
        this.timer2.cancel();
        new AlertDialog.Builder(this).setTitle("خروج").setMessage("آیا قصد دارید از آزمون خارج شوید؟").setPositiveButton("بله", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                activity_azmon2.super.onBackPressed();
            }
        }).create().show();
    }
}
