package com.bray.scoretracker;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebSettings;

public class MainActivity extends Activity {
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView web = new WebView(this);
        setContentView(web);
        WebSettings settings = web.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(true);
        web.setWebChromeClient(new WebChromeClient());
        web.loadUrl("file:///android_asset/index.html");
    }
    @Override public void onBackPressed() { setResult(RESULT_CANCELED); super.onBackPressed(); }
}
