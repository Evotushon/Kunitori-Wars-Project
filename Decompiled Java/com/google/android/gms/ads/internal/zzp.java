package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.zzazh;
import com.google.android.gms.internal.ads.zzdq;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzp extends AsyncTask<Void, Void, String> {
    private final /* synthetic */ zzl zzblt;

    private zzp(zzl zzl) {
        this.zzblt = zzl;
    }

    /* access modifiers changed from: private */
    /* renamed from: zza */
    public final String doInBackground(Void... voidArr) {
        try {
            zzdq unused = this.zzblt.zzbma = (zzdq) this.zzblt.zzblw.get(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzazh.zzd("", e);
        }
        return this.zzblt.zzkj();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        if (this.zzblt.zzbly != null && str != null) {
            this.zzblt.zzbly.loadUrl(str);
        }
    }

    /* synthetic */ zzp(zzl zzl, zzk zzk) {
        this(zzl);
    }
}
