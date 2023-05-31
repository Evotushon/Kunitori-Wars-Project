package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzbpt {
    private final zzdeu zzfir;
    private Bundle zzfjz;
    @Nullable
    private final String zzfka;
    @Nullable
    private final zzdep zzfkb;
    private final Context zzur;

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static class zza {
        /* access modifiers changed from: private */
        public zzdeu zzfir;
        /* access modifiers changed from: private */
        public Bundle zzfjz;
        /* access modifiers changed from: private */
        @Nullable
        public String zzfka;
        /* access modifiers changed from: private */
        @Nullable
        public zzdep zzfkb;
        /* access modifiers changed from: private */
        public Context zzur;

        public final zza zzcc(Context context) {
            this.zzur = context;
            return this;
        }

        public final zza zza(zzdeu zzdeu) {
            this.zzfir = zzdeu;
            return this;
        }

        public final zza zze(Bundle bundle) {
            this.zzfjz = bundle;
            return this;
        }

        public final zza zzft(String str) {
            this.zzfka = str;
            return this;
        }

        public final zzbpt zzahz() {
            return new zzbpt(this);
        }

        public final zza zza(zzdep zzdep) {
            this.zzfkb = zzdep;
            return this;
        }
    }

    private zzbpt(zza zza2) {
        this.zzur = zza2.zzur;
        this.zzfir = zza2.zzfir;
        this.zzfjz = zza2.zzfjz;
        this.zzfka = zza2.zzfka;
        this.zzfkb = zza2.zzfkb;
    }

    /* access modifiers changed from: package-private */
    public final zza zzahu() {
        return new zza().zzcc(this.zzur).zza(this.zzfir).zzft(this.zzfka).zze(this.zzfjz);
    }

    /* access modifiers changed from: package-private */
    public final zzdeu zzahv() {
        return this.zzfir;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final zzdep zzahw() {
        return this.zzfkb;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final Bundle zzahx() {
        return this.zzfjz;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final String zzahy() {
        return this.zzfka;
    }

    /* access modifiers changed from: package-private */
    public final Context zzcb(Context context) {
        if (this.zzfka != null) {
            return context;
        }
        return this.zzur;
    }
}
