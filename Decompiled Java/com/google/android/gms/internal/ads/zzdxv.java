package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzdxv {
    private final byte[] buffer;
    private final zzdyi zzhok;

    private zzdxv(int i) {
        this.buffer = new byte[i];
        this.zzhok = zzdyi.zzv(this.buffer);
    }

    public final zzdxn zzbaz() {
        this.zzhok.zzbcc();
        return new zzdxx(this.buffer);
    }

    public final zzdyi zzbba() {
        return this.zzhok;
    }

    /* synthetic */ zzdxv(int i, zzdxq zzdxq) {
        this(i);
    }
}
