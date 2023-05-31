package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public abstract class zzgj implements zzhe, zzhh {
    private int index;
    private int state;
    private final int zzacj;
    private zzhg zzack;
    private zzmn zzacl;
    private long zzacm;
    private boolean zzacn = true;
    private boolean zzaco;

    public zzgj(int i) {
        this.zzacj = i;
    }

    /* access modifiers changed from: protected */
    public void onStarted() throws zzgk {
    }

    /* access modifiers changed from: protected */
    public void onStopped() throws zzgk {
    }

    public void zza(int i, Object obj) throws zzgk {
    }

    /* access modifiers changed from: protected */
    public void zza(long j, boolean z) throws zzgk {
    }

    /* access modifiers changed from: protected */
    public void zza(zzgz[] zzgzArr, long j) throws zzgk {
    }

    public final zzhh zzdu() {
        return this;
    }

    public zzof zzdv() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void zze(boolean z) throws zzgk {
    }

    public int zzeb() throws zzgk {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void zzec() {
    }

    public final int getTrackType() {
        return this.zzacj;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final int getState() {
        return this.state;
    }

    public final void zza(zzhg zzhg, zzgz[] zzgzArr, zzmn zzmn, long j, boolean z, long j2) throws zzgk {
        zzob.checkState(this.state == 0);
        this.zzack = zzhg;
        this.state = 1;
        zze(z);
        zza(zzgzArr, zzmn, j2);
        zza(j, z);
    }

    public final void start() throws zzgk {
        boolean z = true;
        if (this.state != 1) {
            z = false;
        }
        zzob.checkState(z);
        this.state = 2;
        onStarted();
    }

    public final void zza(zzgz[] zzgzArr, zzmn zzmn, long j) throws zzgk {
        zzob.checkState(!this.zzaco);
        this.zzacl = zzmn;
        this.zzacn = false;
        this.zzacm = j;
        zza(zzgzArr, j);
    }

    public final zzmn zzdw() {
        return this.zzacl;
    }

    public final boolean zzdx() {
        return this.zzacn;
    }

    public final void zzdy() {
        this.zzaco = true;
    }

    public final boolean zzdz() {
        return this.zzaco;
    }

    public final void zzea() throws IOException {
        this.zzacl.zzhp();
    }

    public final void zzdm(long j) throws zzgk {
        this.zzaco = false;
        this.zzacn = false;
        zza(j, false);
    }

    public final void stop() throws zzgk {
        zzob.checkState(this.state == 2);
        this.state = 1;
        onStopped();
    }

    public final void disable() {
        boolean z = true;
        if (this.state != 1) {
            z = false;
        }
        zzob.checkState(z);
        this.state = 0;
        this.zzacl = null;
        this.zzaco = false;
        zzec();
    }

    /* access modifiers changed from: protected */
    public final zzhg zzed() {
        return this.zzack;
    }

    /* access modifiers changed from: protected */
    public final int getIndex() {
        return this.index;
    }

    /* access modifiers changed from: protected */
    public final int zza(zzhb zzhb, zziv zziv, boolean z) {
        int zzb = this.zzacl.zzb(zzhb, zziv, z);
        if (zzb == -4) {
            if (zziv.zzgd()) {
                this.zzacn = true;
                if (this.zzaco) {
                    return -4;
                }
                return -3;
            }
            zziv.zzamu += this.zzacm;
        } else if (zzb == -5) {
            zzgz zzgz = zzhb.zzagi;
            if (zzgz.zzagc != Long.MAX_VALUE) {
                zzhb.zzagi = zzgz.zzds(zzgz.zzagc + this.zzacm);
            }
        }
        return zzb;
    }

    /* access modifiers changed from: protected */
    public final void zzdn(long j) {
        this.zzacl.zzeh(j - this.zzacm);
    }

    /* access modifiers changed from: protected */
    public final boolean zzee() {
        return this.zzacn ? this.zzaco : this.zzacl.isReady();
    }
}
