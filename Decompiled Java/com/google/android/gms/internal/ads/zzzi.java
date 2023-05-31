package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public abstract class zzzi<T> {
    private final String zzcc;
    private final int zzcgk;
    private final T zzcgl;

    private zzzi(int i, String str, T t) {
        this.zzcgk = i;
        this.zzcc = str;
        this.zzcgl = t;
        zzvh.zzpc().zza(this);
    }

    /* access modifiers changed from: protected */
    public abstract T zza(SharedPreferences sharedPreferences);

    public abstract T zza(Bundle bundle);

    public abstract void zza(SharedPreferences.Editor editor, T t);

    /* access modifiers changed from: protected */
    public abstract T zzb(JSONObject jSONObject);

    public final String getKey() {
        return this.zzcc;
    }

    public final T zzqi() {
        return this.zzcgl;
    }

    public static zzzi<Boolean> zza(int i, String str, Boolean bool) {
        return new zzzl(1, str, bool);
    }

    public static zzzi<Integer> zza(int i, String str, int i2) {
        return new zzzk(1, str, Integer.valueOf(i2));
    }

    public static zzzi<Long> zzb(int i, String str, long j) {
        return new zzzn(1, str, Long.valueOf(j));
    }

    public static zzzi<Float> zza(int i, String str, float f) {
        return new zzzm(1, str, Float.valueOf(0.0f));
    }

    public static zzzi<String> zza(int i, String str, String str2) {
        return new zzzp(1, str, str2);
    }

    public static zzzi<String> zzb(int i, String str) {
        zzzi<String> zza = zza(1, str, (String) null);
        zzvh.zzpc().zzc(zza);
        return zza;
    }

    public final int getSource() {
        return this.zzcgk;
    }

    /* synthetic */ zzzi(int i, String str, Object obj, zzzl zzzl) {
        this(i, str, obj);
    }
}
