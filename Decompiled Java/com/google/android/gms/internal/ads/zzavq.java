package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzavq {
    private final Object lock = new Object();
    /* access modifiers changed from: private */
    public final Clock zzbmz;
    private final String zzdkf;
    @GuardedBy("lock")
    private boolean zzdlp = false;
    @GuardedBy("lock")
    private long zzdlt = -1;
    private final zzawc zzdrf;
    @GuardedBy("lock")
    private final LinkedList<zzavp> zzdrg;
    private final String zzdrh;
    @GuardedBy("lock")
    private long zzdri = -1;
    @GuardedBy("lock")
    private long zzdrj = -1;
    @GuardedBy("lock")
    private long zzdrk = 0;
    @GuardedBy("lock")
    private long zzdrl = -1;
    @GuardedBy("lock")
    private long zzdrm = -1;

    zzavq(Clock clock, zzawc zzawc, String str, String str2) {
        this.zzbmz = clock;
        this.zzdrf = zzawc;
        this.zzdrh = str;
        this.zzdkf = str2;
        this.zzdrg = new LinkedList<>();
    }

    public final void zze(zzuh zzuh) {
        synchronized (this.lock) {
            this.zzdrl = this.zzbmz.elapsedRealtime();
            this.zzdrf.zza(zzuh, this.zzdrl);
        }
    }

    public final void zzey(long j) {
        synchronized (this.lock) {
            this.zzdrm = j;
            if (this.zzdrm != -1) {
                this.zzdrf.zzb(this);
            }
        }
    }

    public final void zzva() {
        synchronized (this.lock) {
            if (this.zzdrm != -1 && this.zzdri == -1) {
                this.zzdri = this.zzbmz.elapsedRealtime();
                this.zzdrf.zzb(this);
            }
            this.zzdrf.zzva();
        }
    }

    public final void zzvb() {
        synchronized (this.lock) {
            if (this.zzdrm != -1) {
                zzavp zzavp = new zzavp(this);
                zzavp.zzuz();
                this.zzdrg.add(zzavp);
                this.zzdrk++;
                this.zzdrf.zzvb();
                this.zzdrf.zzb(this);
            }
        }
    }

    public final void zzvc() {
        synchronized (this.lock) {
            if (this.zzdrm != -1 && !this.zzdrg.isEmpty()) {
                zzavp last = this.zzdrg.getLast();
                if (last.zzux() == -1) {
                    last.zzuy();
                    this.zzdrf.zzb(this);
                }
            }
        }
    }

    public final void zzan(boolean z) {
        synchronized (this.lock) {
            if (this.zzdrm != -1) {
                this.zzdrj = this.zzbmz.elapsedRealtime();
            }
        }
    }

    public final Bundle toBundle() {
        Bundle bundle;
        synchronized (this.lock) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.zzdrh);
            bundle.putString("slotid", this.zzdkf);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.zzdrl);
            bundle.putLong("tresponse", this.zzdrm);
            bundle.putLong("timp", this.zzdri);
            bundle.putLong("tload", this.zzdrj);
            bundle.putLong("pcc", this.zzdrk);
            bundle.putLong("tfetch", this.zzdlt);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzdrg.iterator();
            while (it.hasNext()) {
                arrayList.add(((zzavp) it.next()).toBundle());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    public final String zzvd() {
        return this.zzdrh;
    }
}
