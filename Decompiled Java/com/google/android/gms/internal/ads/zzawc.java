package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzawc implements zzqk {
    private final Object lock = new Object();
    private final zzawh zzdsq;
    private final zzawa zzdsw;
    @VisibleForTesting
    private final zzavy zzdsx;
    @VisibleForTesting
    private final HashSet<zzavq> zzdsy = new HashSet<>();
    @VisibleForTesting
    private final HashSet<zzavz> zzdsz = new HashSet<>();

    public zzawc(String str, zzawh zzawh) {
        this.zzdsx = new zzavy(str, zzawh);
        this.zzdsq = zzawh;
        this.zzdsw = new zzawa();
    }

    public final void zzb(zzavq zzavq) {
        synchronized (this.lock) {
            this.zzdsy.add(zzavq);
        }
    }

    public final void zzb(HashSet<zzavq> hashSet) {
        synchronized (this.lock) {
            this.zzdsy.addAll(hashSet);
        }
    }

    public final Bundle zza(Context context, zzavx zzavx) {
        HashSet hashSet = new HashSet();
        synchronized (this.lock) {
            hashSet.addAll(this.zzdsy);
            this.zzdsy.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.zzdsx.zzo(context, this.zzdsw.zzvv()));
        Bundle bundle2 = new Bundle();
        Iterator<zzavz> it = this.zzdsz.iterator();
        if (!it.hasNext()) {
            bundle.putBundle("slots", bundle2);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(((zzavq) it2.next()).toBundle());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            zzavx.zza(hashSet);
            return bundle;
        }
        zzavz next = it.next();
        throw new NoSuchMethodError();
    }

    public final void zzp(boolean z) {
        long currentTimeMillis = zzq.zzlc().currentTimeMillis();
        if (z) {
            if (currentTimeMillis - this.zzdsq.zzwg() > ((Long) zzvh.zzpd().zzd(zzzx.zzcjv)).longValue()) {
                this.zzdsx.zzdsn = -1;
                return;
            }
            this.zzdsx.zzdsn = this.zzdsq.zzwh();
            return;
        }
        this.zzdsq.zzez(currentTimeMillis);
        this.zzdsq.zzcq(this.zzdsx.zzdsn);
    }

    public final void zzvb() {
        synchronized (this.lock) {
            this.zzdsx.zzvb();
        }
    }

    public final void zzva() {
        synchronized (this.lock) {
            this.zzdsx.zzva();
        }
    }

    public final void zza(zzuh zzuh, long j) {
        synchronized (this.lock) {
            this.zzdsx.zza(zzuh, j);
        }
    }

    public final zzavq zza(Clock clock, String str) {
        return new zzavq(clock, this, this.zzdsw.zzvu(), str);
    }
}
