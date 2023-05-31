package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdge {
    private final zzdgd zzgsd = new zzdgd();
    private int zzgse;
    private int zzgsf;
    private int zzgsg;
    private int zzgsh;
    private int zzgsi;

    zzdge() {
    }

    public final void zzarq() {
        this.zzgsg++;
    }

    public final void zzarr() {
        this.zzgsh++;
    }

    public final void zzars() {
        this.zzgse++;
        this.zzgsd.zzgsb = true;
    }

    public final void zzart() {
        this.zzgsf++;
        this.zzgsd.zzgsc = true;
    }

    public final void zzaru() {
        this.zzgsi++;
    }

    public final zzdgd zzarv() {
        zzdgd zzdgd = (zzdgd) this.zzgsd.clone();
        zzdgd zzdgd2 = this.zzgsd;
        zzdgd2.zzgsb = false;
        zzdgd2.zzgsc = false;
        return zzdgd;
    }

    public final String zzarw() {
        return "\n\tPool does not exist: " + this.zzgsg + "\n\tNew pools created: " + this.zzgse + "\n\tPools removed: " + this.zzgsf + "\n\tEntries added: " + this.zzgsi + "\n\tNo entries retrieved: " + this.zzgsh + "\n";
    }
}
