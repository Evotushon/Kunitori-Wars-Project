package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzgq implements zzgn {
    private int repeatMode;
    private final zzhe[] zzacx;
    private final zzni zzacy;
    private final zznf zzacz;
    private final zzdkp zzada;
    private final zzgs zzadb;
    private final CopyOnWriteArraySet<zzgm> zzadc;
    private final zzhk zzadd;
    private final zzhl zzade;
    private boolean zzadf;
    private boolean zzadg;
    private int zzadh;
    private int zzadi;
    private int zzadj;
    private boolean zzadk;
    private zzhj zzadl;
    private Object zzadm;
    private zzmu zzadn;
    private zznf zzado;
    private zzhf zzadp;
    private zzgu zzadq;
    private int zzadr;
    private int zzads;
    private long zzadt;

    @SuppressLint({"HandlerLeak"})
    public zzgq(zzhe[] zzheArr, zzni zzni, zzhd zzhd) {
        String str = zzop.zzbhc;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append("Init ExoPlayerLib/2.4.2 [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        zzob.checkState(zzheArr.length > 0);
        this.zzacx = (zzhe[]) zzob.checkNotNull(zzheArr);
        this.zzacy = (zzni) zzob.checkNotNull(zzni);
        this.zzadg = false;
        this.repeatMode = 0;
        this.zzadh = 1;
        this.zzadc = new CopyOnWriteArraySet<>();
        this.zzacz = new zznf(new zznd[zzheArr.length]);
        this.zzadl = zzhj.zzagp;
        this.zzadd = new zzhk();
        this.zzade = new zzhl();
        this.zzadn = zzmu.zzbdl;
        this.zzado = this.zzacz;
        this.zzadp = zzhf.zzagj;
        this.zzada = new zzgt(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.zzadq = new zzgu(0, 0);
        this.zzadb = new zzgs(zzheArr, zzni, zzhd, this.zzadg, 0, this.zzada, this.zzadq, this);
    }

    public final void zza(zzgm zzgm) {
        this.zzadc.add(zzgm);
    }

    public final void zzb(zzgm zzgm) {
        this.zzadc.remove(zzgm);
    }

    public final int getPlaybackState() {
        return this.zzadh;
    }

    public final void zza(zzme zzme) {
        if (!this.zzadl.isEmpty() || this.zzadm != null) {
            this.zzadl = zzhj.zzagp;
            this.zzadm = null;
            Iterator<zzgm> it = this.zzadc.iterator();
            while (it.hasNext()) {
                it.next().zza(this.zzadl, this.zzadm);
            }
        }
        if (this.zzadf) {
            this.zzadf = false;
            this.zzadn = zzmu.zzbdl;
            this.zzado = this.zzacz;
            this.zzacy.zzd((Object) null);
            Iterator<zzgm> it2 = this.zzadc.iterator();
            while (it2.hasNext()) {
                it2.next().zza(this.zzadn, this.zzado);
            }
        }
        this.zzadj++;
        this.zzadb.zza(zzme, true);
    }

    public final void zzg(boolean z) {
        if (this.zzadg != z) {
            this.zzadg = z;
            this.zzadb.zzg(z);
            Iterator<zzgm> it = this.zzadc.iterator();
            while (it.hasNext()) {
                it.next().zza(z, this.zzadh);
            }
        }
    }

    public final boolean zzeg() {
        return this.zzadg;
    }

    public final void seekTo(long j) {
        long j2;
        int zzej = zzej();
        if (zzej < 0 || (!this.zzadl.isEmpty() && zzej >= this.zzadl.zzfa())) {
            throw new zzha(this.zzadl, zzej, j);
        }
        this.zzadi++;
        this.zzadr = zzej;
        if (!this.zzadl.isEmpty()) {
            this.zzadl.zza(zzej, this.zzadd, false);
            if (j == -9223372036854775807L) {
                j2 = this.zzadd.zzagx;
            } else {
                j2 = zzgl.zzdp(j);
            }
            long j3 = this.zzadd.zzagz + j2;
            long j4 = this.zzadl.zza(0, this.zzade, false).zzagy;
            if (j4 != -9223372036854775807L) {
                int i = (j3 > j4 ? 1 : (j3 == j4 ? 0 : -1));
            }
        }
        this.zzads = 0;
        if (j == -9223372036854775807L) {
            this.zzadt = 0;
            this.zzadb.zza(this.zzadl, zzej, -9223372036854775807L);
            return;
        }
        this.zzadt = j;
        this.zzadb.zza(this.zzadl, zzej, zzgl.zzdp(j));
        Iterator<zzgm> it = this.zzadc.iterator();
        while (it.hasNext()) {
            it.next().zzef();
        }
    }

    public final void stop() {
        this.zzadb.stop();
    }

    public final void release() {
        this.zzadb.release();
        this.zzada.removeCallbacksAndMessages((Object) null);
    }

    public final void zza(zzgo... zzgoArr) {
        this.zzadb.zza(zzgoArr);
    }

    public final void zzb(zzgo... zzgoArr) {
        this.zzadb.zzb(zzgoArr);
    }

    private final int zzej() {
        if (this.zzadl.isEmpty() || this.zzadi > 0) {
            return this.zzadr;
        }
        this.zzadl.zza(this.zzadq.zzaeq, this.zzade, false);
        return 0;
    }

    public final long getDuration() {
        if (this.zzadl.isEmpty()) {
            return -9223372036854775807L;
        }
        return zzgl.zzdo(this.zzadl.zza(zzej(), this.zzadd, false).zzagy);
    }

    public final long zzei() {
        if (this.zzadl.isEmpty() || this.zzadi > 0) {
            return this.zzadt;
        }
        this.zzadl.zza(this.zzadq.zzaeq, this.zzade, false);
        return this.zzade.zzfc() + zzgl.zzdo(this.zzadq.zzaes);
    }

    public final long getBufferedPosition() {
        if (this.zzadl.isEmpty() || this.zzadi > 0) {
            return this.zzadt;
        }
        this.zzadl.zza(this.zzadq.zzaeq, this.zzade, false);
        return this.zzade.zzfc() + zzgl.zzdo(this.zzadq.zzaet);
    }

    public final int zzeh() {
        return this.zzacx.length;
    }

    /* access modifiers changed from: package-private */
    public final void zza(Message message) {
        boolean z = true;
        switch (message.what) {
            case 0:
                this.zzadj--;
                return;
            case 1:
                this.zzadh = message.arg1;
                Iterator<zzgm> it = this.zzadc.iterator();
                while (it.hasNext()) {
                    it.next().zza(this.zzadg, this.zzadh);
                }
                return;
            case 2:
                if (message.arg1 == 0) {
                    z = false;
                }
                this.zzadk = z;
                Iterator<zzgm> it2 = this.zzadc.iterator();
                while (it2.hasNext()) {
                    it2.next().zzf(this.zzadk);
                }
                return;
            case 3:
                if (this.zzadj == 0) {
                    zznk zznk = (zznk) message.obj;
                    this.zzadf = true;
                    this.zzadn = zznk.zzben;
                    this.zzado = zznk.zzbeo;
                    this.zzacy.zzd(zznk.zzbep);
                    Iterator<zzgm> it3 = this.zzadc.iterator();
                    while (it3.hasNext()) {
                        it3.next().zza(this.zzadn, this.zzado);
                    }
                    return;
                }
                return;
            case 4:
                int i = this.zzadi - 1;
                this.zzadi = i;
                if (i == 0) {
                    this.zzadq = (zzgu) message.obj;
                    if (message.arg1 != 0) {
                        Iterator<zzgm> it4 = this.zzadc.iterator();
                        while (it4.hasNext()) {
                            it4.next().zzef();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.zzadi == 0) {
                    this.zzadq = (zzgu) message.obj;
                    Iterator<zzgm> it5 = this.zzadc.iterator();
                    while (it5.hasNext()) {
                        it5.next().zzef();
                    }
                    return;
                }
                return;
            case 6:
                zzgw zzgw = (zzgw) message.obj;
                this.zzadi -= zzgw.zzaff;
                if (this.zzadj == 0) {
                    this.zzadl = zzgw.zzadl;
                    this.zzadm = zzgw.zzadm;
                    this.zzadq = zzgw.zzadq;
                    Iterator<zzgm> it6 = this.zzadc.iterator();
                    while (it6.hasNext()) {
                        it6.next().zza(this.zzadl, this.zzadm);
                    }
                    return;
                }
                return;
            case 7:
                zzhf zzhf = (zzhf) message.obj;
                if (!this.zzadp.equals(zzhf)) {
                    this.zzadp = zzhf;
                    Iterator<zzgm> it7 = this.zzadc.iterator();
                    while (it7.hasNext()) {
                        it7.next().zza(zzhf);
                    }
                    return;
                }
                return;
            case 8:
                zzgk zzgk = (zzgk) message.obj;
                Iterator<zzgm> it8 = this.zzadc.iterator();
                while (it8.hasNext()) {
                    it8.next().zza(zzgk);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
