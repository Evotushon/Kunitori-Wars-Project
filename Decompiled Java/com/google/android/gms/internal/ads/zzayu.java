package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzayu implements Callable<String> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ Context zzdwi;

    zzayu(zzays zzays, Context context, Context context2) {
        this.zzdwi = context;
        this.val$context = context2;
    }

    public final /* synthetic */ Object call() throws Exception {
        SharedPreferences sharedPreferences;
        boolean z = false;
        if (this.zzdwi != null) {
            zzawf.zzee("Attempting to read user agent from Google Play Services.");
            sharedPreferences = this.zzdwi.getSharedPreferences("admob_user_agent", 0);
        } else {
            zzawf.zzee("Attempting to read user agent from local cache.");
            sharedPreferences = this.val$context.getSharedPreferences("admob_user_agent", 0);
            z = true;
        }
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            zzawf.zzee("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.val$context);
            if (z) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                zzawf.zzee("Persisting user agent.");
            }
        }
        return string;
    }
}
