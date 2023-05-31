package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbhl extends zzcyw {
    private final /* synthetic */ zzbhf zzene;
    private zzeew<String> zzeqx;
    private zzeew<zzcge> zzern;
    private zzeew<Map<zzdig, zzcge>> zzerp;
    private zzeew<Set<zzbuv<zzdil>>> zzerr;
    private zzeew<Set<zzbuv<zzdil>>> zzery;
    private zzeew zzerz;
    private zzeew<zzdif> zzesa;
    private zzeew<ApplicationInfo> zzesj;
    private final zzdaf zzewo;
    private zzeew<zzcys> zzewp;
    private zzeew<String> zzewq;
    private zzeew<zzczc> zzewr;
    private zzeew<Integer> zzews;
    private zzeew<zzczg> zzewt;
    private zzeew<zzczm> zzewu;
    private zzeew<zzczr> zzewv;
    private zzeew<Boolean> zzeww;
    private zzeew<zzdaa> zzewx;
    private zzeew<zzdae> zzewy;
    private zzeew<zzdas> zzewz;
    private zzeew<zzcge> zzexa;
    private zzeew<zzcge> zzexb;
    private zzeew<zzcge> zzexc;

    private zzbhl(zzbhf zzbhf, zzdaf zzdaf) {
        this.zzene = zzbhf;
        this.zzewo = zzdaf;
        this.zzewp = new zzcyt(zzbjf.zzfdl, this.zzene.zzelm, this.zzene.zzeli, zzdhi.zzasq());
        this.zzewq = new zzdai(zzdaf);
        this.zzewr = new zzcze(zzbha.zzelb, this.zzene.zzelm, this.zzewq, zzdhi.zzasq());
        this.zzews = new zzdaj(zzdaf);
        this.zzewt = new zzczk(zzbjf.zzfdl, this.zzews, this.zzene.zzelm, this.zzene.zzemc, this.zzene.zzeli, zzdhi.zzasq());
        this.zzewu = new zzczo(zzbix.zzfdg, zzdhi.zzasq(), this.zzene.zzelm);
        this.zzewv = new zzczt(zzbiz.zzfdh, zzdhi.zzasq(), this.zzewq);
        this.zzeww = new zzdak(zzdaf);
        this.zzesj = new zzdah(zzdaf);
        this.zzewx = new zzdac(zzbjb.zzfdi, this.zzene.zzeli, this.zzeww, this.zzesj);
        this.zzewy = new zzdag(zzbjd.zzfdj, this.zzene.zzeli, this.zzene.zzelm);
        this.zzewz = new zzdau(zzdhi.zzasq());
        this.zzeqx = new zzdam(zzdaf);
        this.zzern = zzeek.zzaq(zzcfx.zzamt());
        this.zzexa = zzeek.zzaq(zzcfv.zzamr());
        this.zzexb = zzeek.zzaq(zzcfz.zzamv());
        this.zzexc = zzeek.zzaq(zzcgb.zzamx());
        this.zzerp = ((zzeen) ((zzeen) ((zzeen) ((zzeen) zzeel.zzhm(4).zza(zzdig.GMS_SIGNALS, this.zzern)).zza(zzdig.BUILD_URL, this.zzexa)).zza(zzdig.HTTP, this.zzexb)).zza(zzdig.PRE_PROCESS, this.zzexc)).zzbgn();
        this.zzerr = zzeek.zzaq(new zzcgd(this.zzeqx, this.zzene.zzelm, zzdhi.zzasq(), this.zzerp));
        this.zzery = zzees.zzas(0, 1).zzat(this.zzerr).zzbgo();
        this.zzerz = zzdin.zzap(this.zzery);
        this.zzesa = zzeek.zzaq(zzdio.zzs(zzdhi.zzasq(), this.zzene.zzeli, this.zzerz));
    }

    private final zzczv zzaea() {
        return new zzczv((zzzg) zzeep.zza(new zzzg(), "Cannot return null from a non-@Nullable @Provides method"), zzdhi.zzasr(), (List) zzeep.zza(this.zzewo.zzapz(), "Cannot return null from a non-@Nullable @Provides method"));
    }

    private final zzcyy zzaeb() {
        return new zzcyy(zzbjc.zzafs(), zzdhi.zzasr(), (String) zzeep.zza(this.zzewo.zzapw(), "Cannot return null from a non-@Nullable @Provides method"), this.zzewo.zzapx());
    }

    public final zzcyd<JSONObject> zzaec() {
        zzdoe zzasr = zzdhi.zzasr();
        long longValue = ((Long) zzvh.zzpd().zzd(zzzx.zzcnj)).longValue();
        long longValue2 = ((Long) zzvh.zzpd().zzd(zzzx.zzcnr)).longValue();
        return zzcyi.zza(zzasr, zzdly.zza((zzcye) zzeep.zza(new zzcwp(new zzczr(zzbiw.zzafm(), zzdhi.zzasr(), zzdai.zzc(this.zzewo)), 0, (ScheduledExecutorService) this.zzene.zzeli.get()), "Cannot return null from a non-@Nullable @Provides method"), (zzcye) zzeep.zza(new zzcwp(new zzdaa(zzbiy.zzafo(), (ScheduledExecutorService) this.zzene.zzeli.get(), this.zzewo.zzapy(), zzdah.zzb(this.zzewo)), longValue, (ScheduledExecutorService) this.zzene.zzeli.get()), "Cannot return null from a non-@Nullable @Provides method"), (zzcye) zzeep.zza(new zzcwp(new zzdae(zzbja.zzafq(), (ScheduledExecutorService) this.zzene.zzeli.get(), zzbgq.zza(this.zzene.zzelf)), longValue2, (ScheduledExecutorService) this.zzene.zzeli.get()), "Cannot return null from a non-@Nullable @Provides method"), (zzcye) zzeep.zza(new zzcwp(new zzcys(zzbjc.zzafs(), zzbgq.zza(this.zzene.zzelf), (ScheduledExecutorService) this.zzene.zzeli.get(), zzdhi.zzasr()), 0, (ScheduledExecutorService) this.zzene.zzeli.get()), "Cannot return null from a non-@Nullable @Provides method"), (zzcye) zzeep.zza(new zzcwp(new zzdas(zzdhi.zzasr()), 0, (ScheduledExecutorService) this.zzene.zzeli.get()), "Cannot return null from a non-@Nullable @Provides method"), (zzcye) zzeep.zza(zzdal.zzaqd(), "Cannot return null from a non-@Nullable @Provides method"), new zzczc((zzare) null, zzbgq.zza(this.zzene.zzelf), zzdai.zzc(this.zzewo), zzdhi.zzasr()), new zzczm(zzbiu.zzafk(), zzdhi.zzasr(), zzbgq.zza(this.zzene.zzelf)), zzaea(), zzaeb(), new zzczg(zzbjc.zzafs(), this.zzewo.zzaqc(), zzbgq.zza(this.zzene.zzelf), (zzavr) this.zzene.zzemc.get(), (ScheduledExecutorService) this.zzene.zzeli.get(), zzdhi.zzasr()), (zzcye) this.zzene.zzemd.get()));
    }

    public final zzcyd<JSONObject> zzaed() {
        return zzdaq.zza(zzbiw.zzafm(), this.zzene.zzemd.get(), zzaeb(), zzaea(), zzeek.zzar(this.zzewp), zzeek.zzar(this.zzewr), zzeek.zzar(this.zzewt), zzeek.zzar(this.zzewu), zzeek.zzar(this.zzewv), zzeek.zzar(this.zzewx), zzeek.zzar(this.zzewy), zzeek.zzar(this.zzewz), zzdhi.zzasr());
    }

    public final zzdif zzaee() {
        return this.zzesa.get();
    }
}
