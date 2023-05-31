package jp.co.koeitecmo.ktgl.android.http.client.request;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import java.net.HttpURLConnection;
import java.util.List;
import jp.co.koeitecmo.ktgl.android.util.Log;

public class Cookie {
    private CookieManager manager_ = CookieManager.getInstance();
    private CookieSyncManager syncManager_;
    private String uri_;

    public Cookie(Context context) {
        this.syncManager_ = CookieSyncManager.createInstance(context);
        this.syncManager_.sync();
        this.manager_.removeExpiredCookie();
    }

    public final void invalidate(String str) {
        String cookie = this.manager_.getCookie(str);
        if (cookie != null) {
            for (String split : cookie.split(";")) {
                String[] split2 = split.split("=");
                if (split2.length > 0) {
                    this.manager_.setCookie(str, split2[0] + "=; Expires=Sun, 06-Nov-1994 08:49:37 GMT");
                }
            }
            this.manager_.removeExpiredCookie();
        }
    }

    public final void dump(String str) {
        String cookie = this.manager_.getCookie(str);
        if (cookie != null) {
            Log.i("Cookies from " + str + " are " + cookie);
            return;
        }
        Log.i("No Cookie from " + str);
    }

    public final void load(HttpURLConnection httpURLConnection) {
        this.uri_ = httpURLConnection.getURL().toString();
        String cookie = this.manager_.getCookie(this.uri_);
        if (cookie != null) {
            httpURLConnection.setRequestProperty("Cookie", cookie);
        }
    }

    public final void save(Response response) {
        List<String> headers = response.getHeaders("Set-Cookie");
        if (headers != null) {
            for (String cookie : headers) {
                this.manager_.setCookie(this.uri_, cookie);
                if (this.manager_.getCookie(this.uri_) == null) {
                    Log.e("failed to retrieve the cookies.");
                }
            }
        }
    }
}
