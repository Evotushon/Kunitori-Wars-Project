package com.level5.l5id;

public interface WebViewUIBase {
    boolean IsOpenWebView();

    void backPage();

    void destroy();

    void loadURL(String str);

    void setVisibility(boolean z);
}
