package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzclg implements zzdnu<SQLiteDatabase> {
    private final /* synthetic */ zzdhq zzfzv;

    zzclg(zzcle zzcle, zzdhq zzdhq) {
        this.zzfzv = zzdhq;
    }

    public final void zzb(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        zzawf.zzey(valueOf.length() != 0 ? "Failed to get offline signal database: ".concat(valueOf) : new String("Failed to get offline signal database: "));
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        try {
            this.zzfzv.apply((SQLiteDatabase) obj);
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            zzawf.zzey(valueOf.length() != 0 ? "Error executing function on offline signal database: ".concat(valueOf) : new String("Error executing function on offline signal database: "));
        }
    }
}
