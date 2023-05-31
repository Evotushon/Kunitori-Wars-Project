package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdgx {
    private final long zzgub = zzq.zzlc().currentTimeMillis();
    private final zzdha zzguc = new zzdha();
    private long zzgud = this.zzgub;
    private int zzgue = 0;
    private int zzguf = 0;
    private int zzgug = 0;

    public final void zzase() {
        this.zzgud = zzq.zzlc().currentTimeMillis();
        this.zzgue++;
    }

    public final void zzasf() {
        this.zzguf++;
        this.zzguc.zzguh = true;
    }

    public final void zzasg() {
        this.zzgug++;
        this.zzguc.zzgug++;
    }

    public final long getCreationTimeMillis() {
        return this.zzgub;
    }

    public final long zzark() {
        return this.zzgud;
    }

    public final int zzarl() {
        return this.zzgue;
    }

    public final zzdha zzash() {
        zzdha zzdha = (zzdha) this.zzguc.clone();
        zzdha zzdha2 = this.zzguc;
        zzdha2.zzguh = false;
        zzdha2.zzgug = 0;
        return zzdha;
    }

    public final String zzarw() {
        return "Created: " + this.zzgub + " Last accessed: " + this.zzgud + " Accesses: " + this.zzgue + "\nEntries retrieved: Valid: " + this.zzguf + " Stale: " + this.zzgug;
    }
}
