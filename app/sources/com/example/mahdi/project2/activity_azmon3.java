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

public class activity_azmon3 extends AppCompatActivity {
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
    long agetime3;
    public AlertDialog.Builder alertAzmon3;

    /* renamed from: c1 */
    CheckBox f74c1;
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
    CheckBox f75c2;
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
    CheckBox f76c3;
    CheckBox c30;

    /* renamed from: c4 */
    CheckBox f77c4;

    /* renamed from: c5 */
    CheckBox f78c5;

    /* renamed from: c6 */
    CheckBox f79c6;

    /* renamed from: c7 */
    CheckBox f80c7;

    /* renamed from: c8 */
    CheckBox f81c8;

    /* renamed from: c9 */
    CheckBox f82c9;
    public Intent iazmon3;
    public Intent issa;
    public MediaPlayer mediaPlayerstart3;
    public MediaPlayer mediaPlayerstop3;
    ProgressBar progressBar4;
    public Timer timer3;
    TextView txt3;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0405R.layout.activity_azmon3);
        this.issa = new Intent(this, MainActivity.class);
        this.mediaPlayerstop3 = MediaPlayer.create(this, C0405R.raw.stop);
        this.mediaPlayerstart3 = MediaPlayer.create(this, C0405R.raw.start);
        this.mediaPlayerstart3.start();
        this.progressBar4 = (ProgressBar) findViewById(C0405R.C0407id.progressBar3);
        final Intent intentResult3 = new Intent(this, Activity_Resualt_3.class);
        Toast.makeText(getBaseContext(), "لطفا به سوالات پاسخ دهید.", 1).show();
        this.Ch1 = (CheckBox) findViewById(C0405R.C0407id.checkALEFff1);
        this.Chh1 = (CheckBox) findViewById(C0405R.C0407id.checkBbb1);
        this.Chhh1 = (CheckBox) findViewById(C0405R.C0407id.checkjjj1);
        this.Ch2 = (CheckBox) findViewById(C0405R.C0407id.checkDdd2);
        this.Chh2 = (CheckBox) findViewById(C0405R.C0407id.checkBbb2);
        this.Chhh2 = (CheckBox) findViewById(C0405R.C0407id.checkJjj2);
        this.Ch3 = (CheckBox) findViewById(C0405R.C0407id.checkALEFff3);
        this.Chh3 = (CheckBox) findViewById(C0405R.C0407id.checkBbb3);
        this.Chhh3 = (CheckBox) findViewById(C0405R.C0407id.checkJjj3);
        this.Ch4 = (CheckBox) findViewById(C0405R.C0407id.checkALEFff4);
        this.Chh4 = (CheckBox) findViewById(C0405R.C0407id.checkJjj4);
        this.Chhh4 = (CheckBox) findViewById(C0405R.C0407id.checkBb4);
        this.Ch5 = (CheckBox) findViewById(C0405R.C0407id.checkBbb5);
        this.Chh5 = (CheckBox) findViewById(C0405R.C0407id.checkJjj5);
        this.Chhh5 = (CheckBox) findViewById(C0405R.C0407id.checkALEFff5);
        this.Ch6 = (CheckBox) findViewById(C0405R.C0407id.checkBbb6);
        this.Chh6 = (CheckBox) findViewById(C0405R.C0407id.checkALEFff6);
        this.Chhh6 = (CheckBox) findViewById(C0405R.C0407id.checkJjj6);
        this.Ch7 = (CheckBox) findViewById(C0405R.C0407id.checkBbb7);
        this.Chh7 = (CheckBox) findViewById(C0405R.C0407id.checkJjj7);
        this.Chhh7 = (CheckBox) findViewById(C0405R.C0407id.checkDdd7);
        this.Ch8 = (CheckBox) findViewById(C0405R.C0407id.checkJjj8);
        this.Chh8 = (CheckBox) findViewById(C0405R.C0407id.checkALEFff8);
        this.Chhh8 = (CheckBox) findViewById(C0405R.C0407id.checkDdd8);
        this.Ch9 = (CheckBox) findViewById(C0405R.C0407id.checkBbb9);
        this.Chh9 = (CheckBox) findViewById(C0405R.C0407id.checkJjj9);
        this.Chhh9 = (CheckBox) findViewById(C0405R.C0407id.checkDdd9);
        this.Ch10 = (CheckBox) findViewById(C0405R.C0407id.checkALEFff10);
        this.Chh10 = (CheckBox) findViewById(C0405R.C0407id.checkJjj10);
        this.Chhh10 = (CheckBox) findViewById(C0405R.C0407id.checkDdd10);
        this.Ch11 = (CheckBox) findViewById(C0405R.C0407id.checkddd11);
        this.Chh11 = (CheckBox) findViewById(C0405R.C0407id.checkJjj11);
        this.Chhh11 = (CheckBox) findViewById(C0405R.C0407id.checkBbb11);
        this.Ch12 = (CheckBox) findViewById(C0405R.C0407id.checkALEFff12);
        this.Chh12 = (CheckBox) findViewById(C0405R.C0407id.checkJjj12);
        this.Chhh12 = (CheckBox) findViewById(C0405R.C0407id.checkDdd12);
        this.Ch13 = (CheckBox) findViewById(C0405R.C0407id.checkJjj13);
        this.Chh13 = (CheckBox) findViewById(C0405R.C0407id.checkBbb13);
        this.Chhh13 = (CheckBox) findViewById(C0405R.C0407id.checkDdd13);
        this.Ch14 = (CheckBox) findViewById(C0405R.C0407id.checkALEFff14);
        this.Chh14 = (CheckBox) findViewById(C0405R.C0407id.checkBbb14);
        this.Chhh14 = (CheckBox) findViewById(C0405R.C0407id.checkJjj14);
        this.Ch15 = (CheckBox) findViewById(C0405R.C0407id.checkALEFff15);
        this.Chh15 = (CheckBox) findViewById(C0405R.C0407id.checkBbb15);
        this.Chhh15 = (CheckBox) findViewById(C0405R.C0407id.checkJjj15);
        this.Ch16 = (CheckBox) findViewById(C0405R.C0407id.checkJjj16);
        this.Chh16 = (CheckBox) findViewById(C0405R.C0407id.checkBbb16);
        this.Chhh16 = (CheckBox) findViewById(C0405R.C0407id.checkDdd16);
        this.Ch17 = (CheckBox) findViewById(C0405R.C0407id.checkJjj17);
        this.Chh17 = (CheckBox) findViewById(C0405R.C0407id.checkBbb17);
        this.Chhh17 = (CheckBox) findViewById(C0405R.C0407id.checkDdd17);
        this.Ch18 = (CheckBox) findViewById(C0405R.C0407id.checkALEFff18);
        this.Chh18 = (CheckBox) findViewById(C0405R.C0407id.checkBbb18);
        this.Chhh18 = (CheckBox) findViewById(C0405R.C0407id.checkDdd18);
        this.Ch19 = (CheckBox) findViewById(C0405R.C0407id.checkALEFff19);
        this.Chh19 = (CheckBox) findViewById(C0405R.C0407id.checkBbb19);
        this.Chhh19 = (CheckBox) findViewById(C0405R.C0407id.checkJjj19);
        this.Ch20 = (CheckBox) findViewById(C0405R.C0407id.checkBbb20);
        this.Chh20 = (CheckBox) findViewById(C0405R.C0407id.checkJjj20);
        this.Chhh20 = (CheckBox) findViewById(C0405R.C0407id.checkALEFff20);
        this.Ch21 = (CheckBox) findViewById(C0405R.C0407id.checkDdd21);
        this.Chh21 = (CheckBox) findViewById(C0405R.C0407id.checkJjj21);
        this.Chhh21 = (CheckBox) findViewById(C0405R.C0407id.checkALEFff21);
        this.Ch22 = (CheckBox) findViewById(C0405R.C0407id.checkBbb22);
        this.Chh22 = (CheckBox) findViewById(C0405R.C0407id.checkJjj22);
        this.Chhh22 = (CheckBox) findViewById(C0405R.C0407id.checkALEFff22);
        this.Ch23 = (CheckBox) findViewById(C0405R.C0407id.checkBbb23);
        this.Chh23 = (CheckBox) findViewById(C0405R.C0407id.checkDdd23);
        this.Chhh23 = (CheckBox) findViewById(C0405R.C0407id.checkJjj23);
        this.Ch24 = (CheckBox) findViewById(C0405R.C0407id.checkALEFff24);
        this.Chh24 = (CheckBox) findViewById(C0405R.C0407id.checkBbb24);
        this.Chhh24 = (CheckBox) findViewById(C0405R.C0407id.checkDdd24);
        this.Ch25 = (CheckBox) findViewById(C0405R.C0407id.checkDdd25);
        this.Chh25 = (CheckBox) findViewById(C0405R.C0407id.checkALEFff25);
        this.Chhh25 = (CheckBox) findViewById(C0405R.C0407id.checkBbb25);
        this.Ch26 = (CheckBox) findViewById(C0405R.C0407id.checkDdd26);
        this.Chh26 = (CheckBox) findViewById(C0405R.C0407id.checkJjj26);
        this.Chhh26 = (CheckBox) findViewById(C0405R.C0407id.checkBbb26);
        this.Ch27 = (CheckBox) findViewById(C0405R.C0407id.checkDdd27);
        this.Chh27 = (CheckBox) findViewById(C0405R.C0407id.checkJjj27);
        this.Chhh27 = (CheckBox) findViewById(C0405R.C0407id.checkBbb27);
        this.Ch28 = (CheckBox) findViewById(C0405R.C0407id.checkALEFff28);
        this.Chh28 = (CheckBox) findViewById(C0405R.C0407id.checkJjj28);
        this.Chhh28 = (CheckBox) findViewById(C0405R.C0407id.checkBbb28);
        this.Ch29 = (CheckBox) findViewById(C0405R.C0407id.checkALEFff29);
        this.Chh29 = (CheckBox) findViewById(C0405R.C0407id.checkDdd29);
        this.Chhh29 = (CheckBox) findViewById(C0405R.C0407id.checkJjj29);
        this.Ch30 = (CheckBox) findViewById(C0405R.C0407id.checkBbb30);
        this.Chh30 = (CheckBox) findViewById(C0405R.C0407id.checkDdd30);
        this.Chhh30 = (CheckBox) findViewById(C0405R.C0407id.checkJjj30);
        this.f74c1 = (CheckBox) findViewById(C0405R.C0407id.checkDdd1);
        this.f75c2 = (CheckBox) findViewById(C0405R.C0407id.checkALEFff2);
        this.f76c3 = (CheckBox) findViewById(C0405R.C0407id.checkDdd3);
        this.f77c4 = (CheckBox) findViewById(C0405R.C0407id.checkDdd4);
        this.f78c5 = (CheckBox) findViewById(C0405R.C0407id.checkDdd5);
        this.f79c6 = (CheckBox) findViewById(C0405R.C0407id.checkDdd6);
        this.f80c7 = (CheckBox) findViewById(C0405R.C0407id.checkALEFff7);
        this.f81c8 = (CheckBox) findViewById(C0405R.C0407id.checkBbb8);
        this.f82c9 = (CheckBox) findViewById(C0405R.C0407id.checkALEFff9);
        this.c10 = (CheckBox) findViewById(C0405R.C0407id.checkBbb10);
        this.c11 = (CheckBox) findViewById(C0405R.C0407id.checkALEFff11);
        this.c12 = (CheckBox) findViewById(C0405R.C0407id.checkBbb12);
        this.c13 = (CheckBox) findViewById(C0405R.C0407id.checkALEFff13);
        this.c14 = (CheckBox) findViewById(C0405R.C0407id.checkDdd14);
        this.c15 = (CheckBox) findViewById(C0405R.C0407id.checkDdd15);
        this.c16 = (CheckBox) findViewById(C0405R.C0407id.checkALEFff16);
        this.c17 = (CheckBox) findViewById(C0405R.C0407id.checkALEFff17);
        this.c18 = (CheckBox) findViewById(C0405R.C0407id.checkJjj18);
        this.c19 = (CheckBox) findViewById(C0405R.C0407id.checkDdd19);
        this.c20 = (CheckBox) findViewById(C0405R.C0407id.checkDdd20);
        this.c21 = (CheckBox) findViewById(C0405R.C0407id.checkBbb21);
        this.c22 = (CheckBox) findViewById(C0405R.C0407id.checkDdd22);
        this.c23 = (CheckBox) findViewById(C0405R.C0407id.checkALEFff23);
        this.c24 = (CheckBox) findViewById(C0405R.C0407id.checkJjj24);
        this.c25 = (CheckBox) findViewById(C0405R.C0407id.checkJjj25);
        this.c26 = (CheckBox) findViewById(C0405R.C0407id.checkALEFff26);
        this.c27 = (CheckBox) findViewById(C0405R.C0407id.checkALEFff27);
        this.c28 = (CheckBox) findViewById(C0405R.C0407id.checkDdd28);
        this.c29 = (CheckBox) findViewById(C0405R.C0407id.checkBbb29);
        this.c30 = (CheckBox) findViewById(C0405R.C0407id.checkALEFff30);
        ((Button) findViewById(C0405R.C0407id.clickazmoncheck3)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(activity_azmon3.this.getBaseContext(), "لطفا به همه سوالات پاسخ دهید", 0).show();
                try {
                    if (activity_azmon3.this.f74c1.isChecked() && activity_azmon3.this.f75c2.isChecked() && activity_azmon3.this.f76c3.isChecked() && activity_azmon3.this.f77c4.isChecked() && activity_azmon3.this.f78c5.isChecked() && activity_azmon3.this.f79c6.isChecked() && activity_azmon3.this.f80c7.isChecked() && activity_azmon3.this.f81c8.isChecked() && activity_azmon3.this.f82c9.isChecked() && activity_azmon3.this.c10.isChecked() && activity_azmon3.this.c11.isChecked() && activity_azmon3.this.c12.isChecked() && activity_azmon3.this.c13.isChecked() && activity_azmon3.this.c14.isChecked() && activity_azmon3.this.c15.isChecked() && activity_azmon3.this.c16.isChecked() && activity_azmon3.this.c17.isChecked() && activity_azmon3.this.c18.isChecked() && activity_azmon3.this.c19.isChecked() && activity_azmon3.this.c20.isChecked() && activity_azmon3.this.c21.isChecked() && activity_azmon3.this.c22.isChecked() && activity_azmon3.this.c23.isChecked() && activity_azmon3.this.c24.isChecked() && activity_azmon3.this.c25.isChecked() && activity_azmon3.this.c26.isChecked() && activity_azmon3.this.c27.isChecked() && activity_azmon3.this.c28.isChecked() && activity_azmon3.this.c29.isChecked() && activity_azmon3.this.c30.isChecked()) {
                        Toast.makeText(activity_azmon3.this.getBaseContext(), "آفرین بر شما. نمره عالی را جهت قبولی کسب کردید", 1).show();
                        activity_azmon3.this.progressBar4.setVisibility(0);
                        activity_azmon3.this.startActivity(intentResult3);
                    } else if (activity_azmon3.this.Ch1.isChecked() || activity_azmon3.this.Ch2.isChecked() || activity_azmon3.this.Ch3.isChecked() || activity_azmon3.this.Ch4.isChecked() || activity_azmon3.this.Ch5.isChecked() || activity_azmon3.this.Ch6.isChecked() || activity_azmon3.this.Ch7.isChecked() || activity_azmon3.this.Ch8.isChecked() || activity_azmon3.this.Ch9.isChecked() || activity_azmon3.this.Ch10.isChecked() || activity_azmon3.this.Ch11.isChecked() || activity_azmon3.this.Ch12.isChecked() || activity_azmon3.this.Ch13.isChecked() || activity_azmon3.this.Ch14.isChecked() || activity_azmon3.this.Ch15.isChecked() || activity_azmon3.this.Ch16.isChecked() || activity_azmon3.this.Ch17.isChecked() || activity_azmon3.this.Ch18.isChecked() || activity_azmon3.this.Ch19.isChecked() || activity_azmon3.this.Ch20.isChecked() || activity_azmon3.this.Ch21.isChecked() || activity_azmon3.this.Ch22.isChecked() || activity_azmon3.this.Ch23.isChecked() || activity_azmon3.this.Ch24.isChecked() || activity_azmon3.this.Ch25.isChecked() || activity_azmon3.this.Ch26.isChecked() || activity_azmon3.this.Ch27.isChecked() || activity_azmon3.this.Ch28.isChecked() || activity_azmon3.this.Ch29.isChecked() || activity_azmon3.this.Ch30.isChecked() || activity_azmon3.this.Chh1.isChecked() || activity_azmon3.this.Chh2.isChecked() || activity_azmon3.this.Chh3.isChecked() || activity_azmon3.this.Chh4.isChecked() || activity_azmon3.this.Chh5.isChecked() || activity_azmon3.this.Chh6.isChecked() || activity_azmon3.this.Chh7.isChecked() || activity_azmon3.this.Chh8.isChecked() || activity_azmon3.this.Chh9.isChecked() || activity_azmon3.this.Chh10.isChecked() || activity_azmon3.this.Chh11.isChecked() || activity_azmon3.this.Chh12.isChecked() || activity_azmon3.this.Chh13.isChecked() || activity_azmon3.this.Chh14.isChecked() || activity_azmon3.this.Chh15.isChecked() || activity_azmon3.this.Chh16.isChecked() || activity_azmon3.this.Chh17.isChecked() || activity_azmon3.this.Chh18.isChecked() || activity_azmon3.this.Chh19.isChecked() || activity_azmon3.this.Chh20.isChecked() || activity_azmon3.this.Chh21.isChecked() || activity_azmon3.this.Chh22.isChecked() || activity_azmon3.this.Chh23.isChecked() || activity_azmon3.this.Chh24.isChecked() || activity_azmon3.this.Chh25.isChecked() || activity_azmon3.this.Chh26.isChecked() || activity_azmon3.this.Chh27.isChecked() || activity_azmon3.this.Chh28.isChecked() || activity_azmon3.this.Chh29.isChecked() || activity_azmon3.this.Chh30.isChecked() || activity_azmon3.this.Chhh1.isChecked() || activity_azmon3.this.Chhh2.isChecked() || activity_azmon3.this.Chhh3.isChecked() || activity_azmon3.this.Chhh4.isChecked() || activity_azmon3.this.Chhh5.isChecked() || activity_azmon3.this.Chhh6.isChecked() || activity_azmon3.this.Chhh7.isChecked() || activity_azmon3.this.Chhh8.isChecked() || activity_azmon3.this.Chhh9.isChecked() || activity_azmon3.this.Chhh10.isChecked() || activity_azmon3.this.Chhh11.isChecked() || activity_azmon3.this.Chhh12.isChecked() || activity_azmon3.this.Chhh13.isChecked() || activity_azmon3.this.Chhh14.isChecked() || activity_azmon3.this.Chhh15.isChecked() || activity_azmon3.this.Chhh16.isChecked() || activity_azmon3.this.Chhh17.isChecked() || activity_azmon3.this.Chhh18.isChecked() || activity_azmon3.this.Chhh19.isChecked() || activity_azmon3.this.Chhh20.isChecked() || activity_azmon3.this.Chhh21.isChecked() || activity_azmon3.this.Chhh22.isChecked() || activity_azmon3.this.Chhh23.isChecked() || activity_azmon3.this.Chhh24.isChecked() || activity_azmon3.this.Chhh25.isChecked() || activity_azmon3.this.Chhh26.isChecked() || activity_azmon3.this.Chhh27.isChecked() || activity_azmon3.this.Chhh28.isChecked() || activity_azmon3.this.Chhh29.isChecked() || activity_azmon3.this.Chhh30.isChecked()) {
                        Toast.makeText(activity_azmon3.this.getBaseContext(), "جواب های شما نادرست است لطفا بیشتر دقت کنید.", 0).show();
                    }
                } catch (Exception e) {
                }
            }
        });
        ((Button) findViewById(C0405R.C0407id.clickazmonchecktrue3)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                activity_azmon3.this.f74c1.setChecked(true);
                activity_azmon3.this.f75c2.setChecked(true);
                activity_azmon3.this.f76c3.setChecked(true);
                activity_azmon3.this.f77c4.setChecked(true);
                activity_azmon3.this.f78c5.setChecked(true);
                activity_azmon3.this.f79c6.setChecked(true);
                activity_azmon3.this.f80c7.setChecked(true);
                activity_azmon3.this.f81c8.setChecked(true);
                activity_azmon3.this.f82c9.setChecked(true);
                activity_azmon3.this.c10.setChecked(true);
                activity_azmon3.this.c11.setChecked(true);
                activity_azmon3.this.c12.setChecked(true);
                activity_azmon3.this.c13.setChecked(true);
                activity_azmon3.this.c14.setChecked(true);
                activity_azmon3.this.c15.setChecked(true);
                activity_azmon3.this.c16.setChecked(true);
                activity_azmon3.this.c17.setChecked(true);
                activity_azmon3.this.c18.setChecked(true);
                activity_azmon3.this.c19.setChecked(true);
                activity_azmon3.this.c20.setChecked(true);
                activity_azmon3.this.c21.setChecked(true);
                activity_azmon3.this.c22.setChecked(true);
                activity_azmon3.this.c23.setChecked(true);
                activity_azmon3.this.c24.setChecked(true);
                activity_azmon3.this.c25.setChecked(true);
                activity_azmon3.this.c26.setChecked(true);
                activity_azmon3.this.c27.setChecked(true);
                activity_azmon3.this.c28.setChecked(true);
                activity_azmon3.this.c29.setChecked(true);
                activity_azmon3.this.c30.setChecked(true);
                activity_azmon3.this.f74c1.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon3.this.f75c2.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon3.this.f76c3.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon3.this.f77c4.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon3.this.f78c5.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon3.this.f79c6.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon3.this.f80c7.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon3.this.f81c8.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon3.this.f82c9.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon3.this.c10.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon3.this.c11.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon3.this.c12.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon3.this.c13.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon3.this.c14.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon3.this.c15.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon3.this.c16.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon3.this.c17.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon3.this.c18.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon3.this.c19.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon3.this.c20.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon3.this.c21.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon3.this.c22.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon3.this.c23.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon3.this.c24.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon3.this.c25.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon3.this.c26.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon3.this.c27.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon3.this.c28.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon3.this.c29.setBackgroundColor(Color.parseColor("#FF1F9916"));
                activity_azmon3.this.c30.setBackgroundColor(Color.parseColor("#FF1F9916"));
            }
        });
        ((Button) findViewById(C0405R.C0407id.clickazmoncheckfalse3)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                activity_azmon3.this.f74c1.setChecked(false);
                activity_azmon3.this.f75c2.setChecked(false);
                activity_azmon3.this.f76c3.setChecked(false);
                activity_azmon3.this.f77c4.setChecked(false);
                activity_azmon3.this.f78c5.setChecked(false);
                activity_azmon3.this.f79c6.setChecked(false);
                activity_azmon3.this.f80c7.setChecked(false);
                activity_azmon3.this.f81c8.setChecked(false);
                activity_azmon3.this.f82c9.setChecked(false);
                activity_azmon3.this.c10.setChecked(false);
                activity_azmon3.this.c11.setChecked(false);
                activity_azmon3.this.c12.setChecked(false);
                activity_azmon3.this.c13.setChecked(false);
                activity_azmon3.this.c14.setChecked(false);
                activity_azmon3.this.c15.setChecked(false);
                activity_azmon3.this.c16.setChecked(false);
                activity_azmon3.this.c17.setChecked(false);
                activity_azmon3.this.c18.setChecked(false);
                activity_azmon3.this.c19.setChecked(false);
                activity_azmon3.this.c20.setChecked(false);
                activity_azmon3.this.c21.setChecked(false);
                activity_azmon3.this.c22.setChecked(false);
                activity_azmon3.this.c23.setChecked(false);
                activity_azmon3.this.c24.setChecked(false);
                activity_azmon3.this.c25.setChecked(false);
                activity_azmon3.this.c26.setChecked(false);
                activity_azmon3.this.c27.setChecked(false);
                activity_azmon3.this.c28.setChecked(false);
                activity_azmon3.this.c29.setChecked(false);
                activity_azmon3.this.c30.setChecked(false);
                activity_azmon3.this.f74c1.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon3.this.f75c2.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon3.this.f76c3.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon3.this.f77c4.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon3.this.f78c5.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon3.this.f79c6.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon3.this.f80c7.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon3.this.f81c8.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon3.this.f82c9.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon3.this.c10.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon3.this.c11.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon3.this.c12.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon3.this.c13.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon3.this.c14.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon3.this.c15.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon3.this.c16.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon3.this.c17.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon3.this.c18.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon3.this.c19.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon3.this.c20.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon3.this.c21.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon3.this.c22.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon3.this.c23.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon3.this.c24.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon3.this.c25.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon3.this.c26.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon3.this.c27.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon3.this.c28.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon3.this.c29.setBackgroundColor(Color.parseColor("#ff5a595b"));
                activity_azmon3.this.c30.setBackgroundColor(Color.parseColor("#ff5a595b"));
            }
        });
        this.iazmon3 = new Intent(this, activity_azmon2.class);
        this.alertAzmon3 = new AlertDialog.Builder(this);
        this.alertAzmon3.setTitle("شروع مجدد");
        this.alertAzmon3.setMessage("آیا قصد دارید مجدد همین آزمون را انجام دهید؟");
        final Intent intenthomeeeAaAA2 = new Intent(this, MainActivity.class);
        final Intent intentazmoonnnn11Abbb2 = new Intent(this, activity_Azmoons.class);
        final Intent intentleaerrrnAccc2 = new Intent(this, activity_learning.class);
        ((BottomNavigationView) findViewById(C0405R.C0407id.Wiggetnav1)).setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == C0405R.C0407id.f52a) {
                    activity_azmon3.this.startActivity(intenthomeeeAaAA2);
                }
                if (item.getItemId() == C0405R.C0407id.f53b) {
                    activity_azmon3.this.startActivity(intentazmoonnnn11Abbb2);
                }
                if (item.getItemId() != C0405R.C0407id.f54c) {
                    return true;
                }
                activity_azmon3.this.startActivity(intentleaerrrnAccc2);
                return true;
            }
        });
        this.txt3 = (TextView) findViewById(C0405R.C0407id.txt_timer1);
        this.txt3.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.txt3.setTextAlignment(4);
        gettime();
    }

    /* access modifiers changed from: package-private */
    public void gettime() {
        this.agetime3 = 1200000;
        this.timer3 = new Timer();
        this.timer3.schedule(new TimerTask() {
            public void run() {
                activity_azmon3.this.runOnUiThread(new Runnable() {
                    public void run() {
                        activity_azmon3.this.agetime3 -= 1000;
                        activity_azmon3.this.txt3.setText(activity_azmon3.this.getStr(activity_azmon3.this.agetime3));
                        activity_azmon3.this.txt3.setTextAlignment(4);
                        activity_azmon3.this.txt3.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                        if (activity_azmon3.this.agetime3 == 0) {
                            activity_azmon3.this.timer3.cancel();
                            activity_azmon3.this.txt3.setText("00 : 00");
                            activity_azmon3.this.txt3.setTextAlignment(4);
                            activity_azmon3.this.txt3.setTextColor(Color.parseColor("#FF7F1010"));
                            activity_azmon3.this.mediaPlayerstop3.start();
                            Toast.makeText(activity_azmon3.this.getBaseContext(), "زمان پاسخ گویی به پایان رسید.", 1).show();
                            activity_azmon3.this.alertAzmon3.setPositiveButton("خیر", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    activity_azmon3.this.finish();
                                }
                            });
                            activity_azmon3.this.alertAzmon3.setNeutralButton("بله", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    activity_azmon3.this.startActivity(activity_azmon3.this.iazmon3);
                                }
                            });
                            activity_azmon3.this.alertAzmon3.show();
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
        this.timer3.cancel();
        new AlertDialog.Builder(this).setTitle("خروج").setMessage("آیا قصد دارید از آزمون خارج شوید؟").setPositiveButton("بله", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                activity_azmon3.this.startActivity(activity_azmon3.this.issa);
                activity_azmon3.this.finish();
            }
        }).create().show();
    }
}
