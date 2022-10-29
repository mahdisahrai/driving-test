package com.example.mahdi.project2;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.p003v7.app.AppCompatActivity;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

public class Activity_Loading1 extends AppCompatActivity {
    ProgressBar Pbar1;
    WebView Wv1;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0405R.layout.activity__loading1);
        this.Pbar1 = (ProgressBar) findViewById(C0405R.C0407id.ProgressBar1);
        this.Wv1 = (WebView) findViewById(C0405R.C0407id.webview1);
        this.Wv1.getSettings().setJavaScriptEnabled(true);
        this.Wv1.getSettings().setBuiltInZoomControls(true);
        this.Wv1.getSettings().setTextZoom(150);
        this.Wv1.getSettings().setDisplayZoomControls(false);
        this.Wv1.setWebViewClient(new WebViewClient() {
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                Toast.makeText(Activity_Loading1.this.getBaseContext(), "لطفا کمی صبر کنید...", 0).show();
                Activity_Loading1.this.Pbar1.setVisibility(0);
            }

            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                Activity_Loading1.this.Pbar1.setVisibility(8);
            }

            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                super.onReceivedError(view, request, error);
                Toast.makeText(Activity_Loading1.this.getBaseContext(), "خطا در ارتباط با شبکه...", 0).show();
                Activity_Loading1.this.Pbar1.setVisibility(8);
            }
        });
        this.Wv1.loadUrl("https://docs.google.com/gview?embedded=true&url=" + "http://xup.ir/images/05582850393613161190.pdf");
    }
}
