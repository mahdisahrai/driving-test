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

public class activity_loading4 extends AppCompatActivity {
    ProgressBar Pbar4;
    WebView Wv4;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0405R.layout.activity_loading4);
        this.Pbar4 = (ProgressBar) findViewById(C0405R.C0407id.ProgressBar4);
        this.Wv4 = (WebView) findViewById(C0405R.C0407id.webview4);
        this.Wv4.getSettings().setJavaScriptEnabled(true);
        this.Wv4.getSettings().setBuiltInZoomControls(true);
        this.Wv4.getSettings().setTextZoom(150);
        this.Wv4.getSettings().setDisplayZoomControls(false);
        this.Wv4.setWebViewClient(new WebViewClient() {
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                Toast.makeText(activity_loading4.this.getBaseContext(), "لطفا کمی صبر کنید...", 0).show();
                activity_loading4.this.Pbar4.setVisibility(0);
            }

            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                activity_loading4.this.Pbar4.setVisibility(8);
            }

            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                super.onReceivedError(view, request, error);
                Toast.makeText(activity_loading4.this.getBaseContext(), "خطا در ارتباط با شبکه...", 0).show();
                activity_loading4.this.Pbar4.setVisibility(8);
            }
        });
        this.Wv4.loadUrl("https://docs.google.com/gview?embedded=true&url=" + "http://xup.ir/images/55680176836534453270.pdf");
    }
}
