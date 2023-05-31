package com.level5.l5id;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.level5.l5id.L5iD;

public class WebViewPlugin implements WebViewUIBase {
    /* access modifiers changed from: private */
    public Button mCloseButton = null;
    private Activity mCurrentActivity = null;
    /* access modifiers changed from: private */
    public LinearLayout mLayout = null;
    /* access modifiers changed from: private */
    public WebView mWebView = null;

    private Activity GetCurrentActivity() {
        return this.mCurrentActivity;
    }

    public void Init(Activity activity, final L5iD.L5iDWebViewClient l5iDWebViewClient, final String str) {
        this.mCurrentActivity = activity;
        final Activity GetCurrentActivity = GetCurrentActivity();
        GetCurrentActivity.runOnUiThread(new Runnable() {
            public void run() {
                WebView unused = WebViewPlugin.this.mWebView = WebViewFactory.Create(GetCurrentActivity, l5iDWebViewClient);
                WebViewPlugin.this.mWebView.setVisibility(0);
                final int systemUiVisibility = GetCurrentActivity.getWindow().getDecorView().getSystemUiVisibility();
                WebViewPlugin.this.mWebView.setSystemUiVisibility(systemUiVisibility);
                WebViewPlugin.this.mWebView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
                    public void onSystemUiVisibilityChange(int i) {
                        if (WebViewPlugin.this.mWebView != null) {
                            WebViewPlugin.this.mWebView.setSystemUiVisibility(systemUiVisibility);
                        }
                    }
                });
                Button unused2 = WebViewPlugin.this.mCloseButton = new Button(GetCurrentActivity);
                WebViewPlugin.this.mCloseButton.setVisibility(0);
                WebViewPlugin.this.mCloseButton.setText(str);
                WebViewPlugin.this.mCloseButton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        l5iDWebViewClient.OnClickCloseWebView();
                    }
                });
                LinearLayout unused3 = WebViewPlugin.this.mLayout = new LinearLayout(GetCurrentActivity);
                WebViewPlugin.this.mLayout.setVisibility(8);
                WebViewPlugin.this.mLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                WebViewPlugin.this.mLayout.setFocusable(true);
                WebViewPlugin.this.mLayout.setFocusableInTouchMode(true);
                WebViewPlugin.this.mLayout.setOrientation(1);
                WebViewPlugin.this.mLayout.setPadding(0, 0, 0, 0);
                WebViewPlugin.this.mLayout.setBackgroundColor(-1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.weight = 1.0f;
                WebViewPlugin.this.mLayout.addView(WebViewPlugin.this.mWebView, layoutParams);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.setMargins(0, 0, 0, 0);
                WebViewPlugin.this.mLayout.addView(WebViewPlugin.this.mCloseButton, layoutParams2);
                GetCurrentActivity.addContentView(WebViewPlugin.this.mLayout, new ViewGroup.LayoutParams(-1, -1));
            }
        });
    }

    public void destroy() {
        GetCurrentActivity().runOnUiThread(new Runnable() {
            public void run() {
                if (WebViewPlugin.this.mLayout != null) {
                    WebViewPlugin.this.mLayout.setVisibility(8);
                    WebViewPlugin.this.mLayout.removeAllViews();
                    LinearLayout unused = WebViewPlugin.this.mLayout = null;
                }
                if (WebViewPlugin.this.mWebView != null) {
                    WebViewPlugin.this.mWebView.destroy();
                    WebView unused2 = WebViewPlugin.this.mWebView = null;
                }
            }
        });
    }

    public void loadURL(final String str) {
        GetCurrentActivity().runOnUiThread(new Runnable() {
            public void run() {
                WebViewPlugin.this.mWebView.loadUrl(str);
            }
        });
    }

    public void setVisibility(final boolean z) {
        GetCurrentActivity().runOnUiThread(new Runnable() {
            public void run() {
                if (z) {
                    WebViewPlugin.this.mLayout.setVisibility(0);
                    WebViewPlugin.this.mWebView.requestFocus();
                    WebViewPlugin.this.mLayout.requestFocus();
                    return;
                }
                WebViewPlugin.this.mLayout.setVisibility(8);
            }
        });
    }

    public void backPage() {
        WebView webView = this.mWebView;
        if (webView != null && webView.canGoBack()) {
            this.mWebView.goBack();
        }
    }

    public boolean IsOpenWebView() {
        WebView webView = this.mWebView;
        return webView != null && webView.getVisibility() == 0;
    }
}
