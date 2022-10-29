package com.example.mahdi.project2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.p000v4.view.GravityCompat;
import android.support.p000v4.widget.DrawerLayout;
import android.support.p003v7.app.ActionBarDrawerToggle;
import android.support.p003v7.app.AlertDialog;
import android.support.p003v7.app.AppCompatActivity;
import android.support.p003v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.io.File;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    public Intent intentazmoon11;
    public Intent intenthome;
    public Intent intentleaern;

    public void btnazmoon(View vvvvdsvsd) {
        startActivity(new Intent(this, activity_Azmoons.class));
    }

    public void btnlearn(View vsddvsvdvds) {
        startActivity(new Intent(this, activity_learning.class));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0405R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(C0405R.C0407id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(C0405R.C0407id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, C0405R.string.navigation_drawer_open, C0405R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        ((NavigationView) findViewById(C0405R.C0407id.nav_view)).setNavigationItemSelectedListener(this);
        this.intenthome = new Intent(this, MainActivity.class);
        this.intentazmoon11 = new Intent(this, activity_Azmoons.class);
        this.intentleaern = new Intent(this, activity_learning.class);
        ((BottomNavigationView) findViewById(C0405R.C0407id.Wiggetnav1)).setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == C0405R.C0407id.f52a) {
                }
                if (item.getItemId() == C0405R.C0407id.f53b) {
                    MainActivity.this.startActivity(MainActivity.this.intentazmoon11);
                }
                if (item.getItemId() != C0405R.C0407id.f54c) {
                    return true;
                }
                MainActivity.this.startActivity(MainActivity.this.intentleaern);
                return true;
            }
        });
    }

    public void onBackPressed() {
        new AlertDialog.Builder(this).setTitle("خروج").setMessage("آیا قصد دارید از آزمون خارج شوید؟").setPositiveButton("بله", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                MainActivity.this.finishAffinity();
            }
        }).setNeutralButton("خیر", (DialogInterface.OnClickListener) null).create().show();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0405R.C0408menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        return super.onOptionsItemSelected(item);
    }

    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == C0405R.C0407id.Exit) {
            AlertDialog.Builder alertExit = new AlertDialog.Builder(this);
            alertExit.setTitle((CharSequence) "آیا قصد دارید از برنامه خارج شوید؟");
            alertExit.setPositiveButton((CharSequence) "خیر", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                }
            });
            alertExit.setNegativeButton((CharSequence) "بله", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    MainActivity.this.finishAffinity();
                }
            });
            alertExit.show();
        } else if (id == C0405R.C0407id.darbarehma) {
            startActivity(new Intent(this, Activity_dareh_ma.class));
        } else if (id == C0405R.C0407id.tamasbam) {
            startActivity(new Intent(this, tamasbama_Activity.class));
        } else if (id == C0405R.C0407id.azzmon) {
            startActivity(new Intent(this, activity_Azmoons.class));
        } else if (id == C0405R.C0407id.learnnn) {
            startActivity(new Intent(this, activity_learning.class));
        } else if (id == C0405R.C0407id.nav_sentfiirend) {
            try {
                File srcFile = new File(getPackageManager().getApplicationInfo(getPackageName(), 0).publicSourceDir);
                try {
                    Intent intentshare = new Intent();
                    intentshare.setAction("android.intent.action.SEND");
                    intentshare.setType("aplication/vnd.android.package-archive");
                    intentshare.putExtra("android.intent.extra.STREAM", Uri.fromFile(srcFile));
                    startActivity(Intent.createChooser(intentshare, "send file..."));
                } catch (PackageManager.NameNotFoundException e) {
                    e = e;
                    File file = srcFile;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                e = e2;
                e.printStackTrace();
                ((DrawerLayout) findViewById(C0405R.C0407id.drawer_layout)).closeDrawer((int) GravityCompat.START);
                return true;
            }
        }
        ((DrawerLayout) findViewById(C0405R.C0407id.drawer_layout)).closeDrawer((int) GravityCompat.START);
        return true;
    }
}
