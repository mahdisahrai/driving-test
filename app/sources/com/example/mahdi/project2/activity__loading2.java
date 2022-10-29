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

public class activity__loading2 extends AppCompatActivity {
    ProgressBar Pbar2;
    WebView Wv2;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0405R.layout.activity__loading2);
        this.Pbar2 = (ProgressBar) findViewById(C0405R.C0407id.ProgressBar2);
        this.Wv2 = (WebView) findViewById(C0405R.C0407id.webview2);
        this.Wv2.getSettings().setJavaScriptEnabled(true);
        this.Wv2.getSettings().setBuiltInZoomControls(true);
        this.Wv2.getSettings().setTextZoom(150);
        this.Wv2.getSettings().setDisplayZoomControls(false);
        this.Wv2.setWebViewClient(new WebViewClient() {
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                Toast.makeText(activity__loading2.this.getBaseContext(), "لطفا کمی صبر کنید...", 0).show();
                activity__loading2.this.Pbar2.setVisibility(0);
            }

            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                activity__loading2.this.Pbar2.setVisibility(8);
            }

            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                super.onReceivedError(view, request, error);
                Toast.makeText(activity__loading2.this.getBaseContext(), "خطا در ارتباط با شبکه...", 0).show();
                activity__loading2.this.Pbar2.setVisibility(8);
            }
        });
        this.Wv2.loadUrl("https://docs.google.com/gview?embedded=true&url=" + "http://xup.ir/images/22847101528253123410.pdf");
    }
}
