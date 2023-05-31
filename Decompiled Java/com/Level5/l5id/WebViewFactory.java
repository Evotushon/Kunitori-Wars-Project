package com.level5.l5id;

import android.app.Activity;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewFactory {
    public static WebView Create(Activity activity, WebViewClient webViewClient) {
        WebView webView = new WebView(activity);
        webView.setVisibility(8);
        webView.setFocusable(true);
        webView.setFocusableInTouchMode(true);
        if (activity.getActionBar() == null) {
            webView.setOnLongClickListener(new View.OnLongClickListener() {
                public boolean onLongClick(View view) {
                    return true;
                }
            });
            webView.setLongClickable(false);
        }
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(webViewClient);
        WebSettings settings = webView.getSettings();
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setSupportZoom(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setSaveFormData(false);
        settings.setJavaScriptEnabled(true);
        return webView;
    }
}
