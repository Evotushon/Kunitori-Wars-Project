package com.level5.l5id;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.level5.l5id.L5iD;

public class WebViewPopupWindow implements WebViewUIBase {
    /* access modifiers changed from: private */
    public Button mCloseButton = null;
    private Activity mCurrentActivity = null;
    /* access modifiers changed from: private */
    public LinearLayout mLayout = null;
    /* access modifiers changed from: private */
    public PopupWindow mPopupWindow = null;
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
                WebView unused = WebViewPopupWindow.this.mWebView = WebViewFactory.Create(GetCurrentActivity, l5iDWebViewClient);
                WebViewPopupWindow.this.mWebView.setVisibility(0);
                final int systemUiVisibility = GetCurrentActivity.getWindow().getDecorView().getSystemUiVisibility();
                WebViewPopupWindow.this.mWebView.setSystemUiVisibility(systemUiVisibility);
                WebViewPopupWindow.this.mWebView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
                    public void onSystemUiVisibilityChange(int i) {
                        if (WebViewPopupWindow.this.mWebView != null) {
                            WebViewPopupWindow.this.mWebView.setSystemUiVisibility(systemUiVisibility);
                        }
                    }
                });
                Button unused2 = WebViewPopupWindow.this.mCloseButton = new Button(GetCurrentActivity);
                WebViewPopupWindow.this.mCloseButton.setVisibility(0);
                WebViewPopupWindow.this.mCloseButton.setText(str);
                WebViewPopupWindow.this.mCloseButton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        l5iDWebViewClient.OnClickCloseWebView();
                    }
                });
                LinearLayout unused3 = WebViewPopupWindow.this.mLayout = new LinearLayout(GetCurrentActivity);
                WebViewPopupWindow.this.mLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                WebViewPopupWindow.this.mLayout.setOrientation(1);
                WebViewPopupWindow.this.mLayout.setPadding(0, 0, 0, 0);
                WebViewPopupWindow.this.mLayout.setBackgroundColor(-1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.weight = 1.0f;
                WebViewPopupWindow.this.mLayout.addView(WebViewPopupWindow.this.mWebView, layoutParams);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.setMargins(0, 0, 0, 0);
                WebViewPopupWindow.this.mLayout.addView(WebViewPopupWindow.this.mCloseButton, layoutParams2);
                PopupWindow unused4 = WebViewPopupWindow.this.mPopupWindow = new PopupWindow(GetCurrentActivity);
                WebViewPopupWindow.this.mPopupWindow.setContentView(WebViewPopupWindow.this.mLayout);
                WebViewPopupWindow.this.mPopupWindow.setWindowLayoutMode(-1, -1);
                WebViewPopupWindow.this.mPopupWindow.setClippingEnabled(false);
                WebViewPopupWindow.this.mPopupWindow.setOutsideTouchable(true);
                WebViewPopupWindow.this.mPopupWindow.setTouchable(true);
                WebViewPopupWindow.this.mPopupWindow.setFocusable(true);
                WebViewPopupWindow.this.mPopupWindow.update();
            }
        });
    }

    public void destroy() {
        GetCurrentActivity().runOnUiThread(new Runnable() {
            public void run() {
                Log.i("LXP", "PopupWindow Destroy");
                if (WebViewPopupWindow.this.mPopupWindow != null) {
                    WebViewPopupWindow.this.mPopupWindow.dismiss();
                    PopupWindow unused = WebViewPopupWindow.this.mPopupWindow = null;
                }
                if (WebViewPopupWindow.this.mLayout != null) {
                    WebViewPopupWindow.this.mLayout.removeAllViews();
                    LinearLayout unused2 = WebViewPopupWindow.this.mLayout = null;
                }
                if (WebViewPopupWindow.this.mWebView != null) {
                    WebViewPopupWindow.this.mWebView.destroy();
                    WebView unused3 = WebViewPopupWindow.this.mWebView = null;
                }
            }
        });
    }

    public void loadURL(final String str) {
        GetCurrentActivity().runOnUiThread(new Runnable() {
            public void run() {
                WebViewPopupWindow.this.mWebView.loadUrl(str);
            }
        });
    }

    public void setVisibility(final boolean z) {
        final Activity GetCurrentActivity = GetCurrentActivity();
        GetCurrentActivity.runOnUiThread(new Runnable() {
            public void run() {
                if (z) {
                    if (!WebViewPopupWindow.this.mPopupWindow.isShowing()) {
                        WebViewPopupWindow.this.mPopupWindow.showAtLocation(GetCurrentActivity.findViewById(16908290), 80, 0, 0);
                    }
                } else if (WebViewPopupWindow.this.mPopupWindow.isShowing()) {
                    WebViewPopupWindow.this.mPopupWindow.dismiss();
                }
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
        if (webView == null || webView.getVisibility() != 0) {
            return false;
        }
        return true;
    }
}
