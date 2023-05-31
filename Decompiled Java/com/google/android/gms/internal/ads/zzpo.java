package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzpo {
    private final String zzbmg;
    private final JSONObject zzbmh;
    private final String zzbmi;
    private final String zzbmj;
    private final boolean zzbmk = false;
    private final boolean zzbml;

    public zzpo(String str, zzazo zzazo, String str2, JSONObject jSONObject, boolean z, boolean z2) {
        this.zzbmj = zzazo.zzbmj;
        this.zzbmh = jSONObject;
        this.zzbmi = str;
        this.zzbmg = str2;
        this.zzbml = z2;
    }

    public final String zzko() {
        return this.zzbmg;
    }

    public final String zzkp() {
        return this.zzbmj;
    }

    public final JSONObject zzkq() {
        return this.zzbmh;
    }

    public final String zzkr() {
        return this.zzbmi;
    }

    public final boolean zzks() {
        return this.zzbml;
    }
}
