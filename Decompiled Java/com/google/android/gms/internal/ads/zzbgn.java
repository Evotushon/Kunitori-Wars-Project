package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzh;
import com.google.android.gms.ads.internal.zzq;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzbgn {
    private final zzazo zzblr;
    private final WeakReference<Context> zzekx;
    private final Context zzyz;

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static class zza {
        /* access modifiers changed from: private */
        public zzazo zzblr;
        /* access modifiers changed from: private */
        public WeakReference<Context> zzekx;
        /* access modifiers changed from: private */
        public Context zzyz;

        public final zza zza(zzazo zzazo) {
            this.zzblr = zzazo;
            return this;
        }

        public final zza zzbv(Context context) {
            this.zzekx = new WeakReference<>(context);
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.zzyz = context;
            return this;
        }
    }

    private zzbgn(zza zza2) {
        this.zzblr = zza2.zzblr;
        this.zzyz = zza2.zzyz;
        this.zzekx = zza2.zzekx;
    }

    /* access modifiers changed from: package-private */
    public final Context zzacu() {
        return this.zzyz;
    }

    /* access modifiers changed from: package-private */
    public final WeakReference<Context> zzacv() {
        return this.zzekx;
    }

    /* access modifiers changed from: package-private */
    public final zzazo zzacw() {
        return this.zzblr;
    }

    /* access modifiers changed from: package-private */
    public final String zzacx() {
        return zzq.zzkv().zzr(this.zzyz, this.zzblr.zzbmj);
    }

    public final zzdq zzacy() {
        return new zzdq(new zzh(this.zzyz, this.zzblr));
    }
}
