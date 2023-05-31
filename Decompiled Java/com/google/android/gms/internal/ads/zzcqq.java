package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzcqq implements zzbrj {
    private final /* synthetic */ zzcmd zzgdv;
    private final /* synthetic */ zzazy zzgeg;

    zzcqq(zzcqp zzcqp, zzazy zzazy, zzcmd zzcmd) {
        this.zzgeg = zzazy;
        this.zzgdv = zzcmd;
    }

    public final synchronized void onAdFailedToLoad(int i) {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcpq)).booleanValue()) {
            i = 3;
        }
        zzazy zzazy = this.zzgeg;
        String str = this.zzgdv.zzfik;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("adapter ");
        sb.append(str);
        sb.append(" failed to load");
        zzazy.setException(new zzcpe(sb.toString(), i));
    }

    public final synchronized void onAdLoaded() {
        this.zzgeg.set(null);
    }
}
