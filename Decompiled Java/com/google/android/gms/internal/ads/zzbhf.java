package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbhf extends zzbgk {
    /* access modifiers changed from: private */
    public zzeew<zzbgk> zzela;
    /* access modifiers changed from: private */
    public final zzbgn zzelf;
    /* access modifiers changed from: private */
    public zzeew<Executor> zzelg;
    private zzeew<ThreadFactory> zzelh;
    /* access modifiers changed from: private */
    public zzeew<ScheduledExecutorService> zzeli;
    /* access modifiers changed from: private */
    public zzeew<zzdoe> zzelj;
    /* access modifiers changed from: private */
    public zzeew<Clock> zzelk;
    /* access modifiers changed from: private */
    public zzeew<zzcnk> zzell;
    /* access modifiers changed from: private */
    public zzeew<Context> zzelm;
    /* access modifiers changed from: private */
    public zzeew<zzazo> zzeln;
    /* access modifiers changed from: private */
    public zzeew<zzcmc<zzdfb, zzcnl>> zzelo;
    /* access modifiers changed from: private */
    public zzeew<zzcrq> zzelp;
    private zzeew<WeakReference<Context>> zzelq;
    /* access modifiers changed from: private */
    public zzeew<String> zzelr;
    private zzeew<String> zzels;
    /* access modifiers changed from: private */
    public zzeew<zzazl> zzelt;
    /* access modifiers changed from: private */
    public zzeew<zzcgx> zzelu;
    private zzeew<zzcgy> zzelv;
    /* access modifiers changed from: private */
    public zzeew<zzcho> zzelw;
    /* access modifiers changed from: private */
    public zzeew<zzaui> zzelx;
    private zzeew<zzceu> zzely;
    private zzeew<zzbik> zzelz;
    /* access modifiers changed from: private */
    public zzeew<zzdq> zzema;
    private zzeew<zzcsz> zzemb;
    /* access modifiers changed from: private */
    public zzeew<zzavr> zzemc;
    /* access modifiers changed from: private */
    public zzeew zzemd;
    /* access modifiers changed from: private */
    public zzeew<zzdfl> zzeme;
    /* access modifiers changed from: private */
    public zzeew<zzcha> zzemf;
    /* access modifiers changed from: private */
    public zzeew<zzdoe> zzemg;
    private zzeew zzemh;
    /* access modifiers changed from: private */
    public zzeew<zzcvg<zzcyh>> zzemi;
    private zzeew<zzcva> zzemj;
    /* access modifiers changed from: private */
    public zzeew<zzcvg<zzcux>> zzemk;
    /* access modifiers changed from: private */
    public zzeew<zzdeg> zzeml;
    /* access modifiers changed from: private */
    public zzeew<zzbjh> zzemm;
    /* access modifiers changed from: private */
    public zzeew<zzarl> zzemn;
    /* access modifiers changed from: private */
    public zzeew<HashMap<String, zzcks>> zzemo;
    /* access modifiers changed from: private */
    public zzeew<zza> zzemp;
    /* access modifiers changed from: private */
    public zzeew<zzcmc<zzdfb, zzcni>> zzemq;
    /* access modifiers changed from: private */
    public zzeew<zzapm> zzemr;
    /* access modifiers changed from: private */
    public zzeew<zzakk> zzems;
    /* access modifiers changed from: private */
    public zzeew<zzaud> zzemt;
    /* access modifiers changed from: private */
    public zzeew<zzbsf> zzemu;
    /* access modifiers changed from: private */
    public zzeew<zzdfw> zzemv;
    /* access modifiers changed from: private */
    public zzeew<zzdgo> zzemw;
    /* access modifiers changed from: private */
    public zzeew<zzdjh> zzemx;

    private zzbhf(zzbgn zzbgn, zzbih zzbih, zzdiq zzdiq, zzbio zzbio, zzdff zzdff) {
        this.zzelf = zzbgn;
        this.zzelg = zzeek.zzaq(zzdhc.zzask());
        this.zzelh = zzeek.zzaq(zzdho.zzasw());
        this.zzeli = zzeek.zzaq(new zzdhl(this.zzelh));
        this.zzelj = zzeek.zzaq(zzdhe.zzasm());
        this.zzelk = zzeek.zzaq(new zzdfi(zzdff));
        this.zzell = zzeek.zzaq(zzcnn.zzaog());
        this.zzelm = new zzbgq(zzbgn);
        this.zzeln = new zzbgy(zzbgn);
        this.zzelo = zzeek.zzaq(new zzbgu(zzbgn, this.zzell));
        this.zzelp = zzeek.zzaq(new zzcru(zzdhi.zzasq()));
        this.zzelq = new zzbgp(zzbgn);
        this.zzelr = zzeek.zzaq(new zzbgw(zzbgn));
        this.zzels = zzeek.zzaq(new zzbgv(zzbgn));
        this.zzelt = zzeet.zzaq(new zzbit(this.zzels));
        this.zzelu = zzeek.zzaq(new zzcgz(zzdhi.zzasq(), this.zzelt, this.zzelm));
        this.zzelv = zzeek.zzaq(new zzchb(this.zzelr, this.zzelu));
        this.zzelw = zzeek.zzaq(new zzcia(this.zzelg, this.zzelm, this.zzelq, zzdhi.zzasq(), this.zzell, this.zzeli, this.zzelv, this.zzeln));
        this.zzelx = zzeek.zzaq(new zzbje(zzbio));
        this.zzely = zzeek.zzaq(new zzcey(zzdhi.zzasq()));
        this.zzelz = zzeek.zzaq(new zzbip(this.zzelm, this.zzeln, this.zzell, this.zzelo, this.zzelp, this.zzelw, this.zzelx, this.zzely));
        this.zzela = zzeem.zzbe(this);
        this.zzema = zzeek.zzaq(new zzbgs(zzbgn));
        this.zzemb = zzeek.zzaq(new zzctb(this.zzela, this.zzelm, this.zzema, this.zzeln));
        this.zzemc = zzeek.zzaq(new zzbgo(zzbgn));
        this.zzemd = zzeek.zzaq(new zzczp(this.zzelm));
        this.zzeme = zzeek.zzaq(new zzdfq(this.zzelm, this.zzeln, this.zzemc));
        this.zzemf = zzeek.zzaq(new zzchd(this.zzelk));
        this.zzemg = zzeek.zzaq(zzdhk.zzast());
        this.zzemh = new zzcym(zzdhi.zzasq(), this.zzelm);
        this.zzemi = zzeek.zzaq(new zzcvh(this.zzemh, this.zzelk));
        this.zzemj = new zzcvc(zzdhi.zzasq(), this.zzelm);
        this.zzemk = zzeek.zzaq(new zzcvi(this.zzemj, this.zzelk));
        this.zzeml = zzeek.zzaq(new zzcvk(this.zzelk));
        this.zzemm = new zzbgt(zzbgn, this.zzela);
        this.zzemn = new zzbhb(this.zzelm);
        this.zzemo = zzeek.zzaq(zzbhc.zzeld);
        this.zzemp = new zzbij(zzbih);
        this.zzemq = zzeek.zzaq(new zzbgr(zzbgn, this.zzell));
        this.zzemr = new zzbii(zzbih);
        this.zzems = zzeek.zzaq(new zzdip(zzdiq, this.zzelm, this.zzeln));
        this.zzemt = new zzbil(zzbih);
        this.zzemu = new zzblh(this.zzeli, this.zzelk);
        this.zzemv = zzeek.zzaq(zzdfy.zzarh());
        this.zzemw = zzeek.zzaq(zzdgq.zzasb());
        this.zzemx = zzeek.zzaq(new zzbir(this.zzelm));
    }

    public final Executor zzacf() {
        return this.zzelg.get();
    }

    public final ScheduledExecutorService zzacg() {
        return this.zzeli.get();
    }

    public final Executor zzach() {
        return zzdhi.zzasr();
    }

    public final zzdoe zzaci() {
        return this.zzelj.get();
    }

    public final zzbsf zzacj() {
        return zzblh.zza(this.zzeli.get(), this.zzelk.get());
    }

    public final zzcnk zzack() {
        return this.zzell.get();
    }

    public final zzbik zzacl() {
        return this.zzelz.get();
    }

    public final zzbmf zzacm() {
        return new zzbhr(this);
    }

    public final zzbkx zzacn() {
        return new zzbho(this);
    }

    public final zzdbi zzaco() {
        return new zzbhp(this);
    }

    public final zzbws zzacp() {
        return new zzbhy(this);
    }

    public final zzbxr zzacq() {
        return new zzbhh(this);
    }

    public final zzcdt zzacr() {
        return new zzbib(this);
    }

    public final zzddz zzacs() {
        return new zzbhz(this);
    }

    public final zzcsw zzact() {
        return new zzbig(this);
    }

    /* access modifiers changed from: protected */
    public final zzcyw zza(zzdaf zzdaf) {
        zzeep.checkNotNull(zzdaf);
        return new zzbhl(this, zzdaf);
    }
}
