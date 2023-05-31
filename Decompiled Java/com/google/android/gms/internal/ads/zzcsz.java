package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbpt;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzcta;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcsz extends zzave {
    private static final List<String> zzghb = new ArrayList(Arrays.asList(new String[]{"/aclk", "/pcs/click"}));
    private static final List<String> zzghc = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com"}));
    private static final List<String> zzghd = new ArrayList(Arrays.asList(new String[]{"/pagead/adview", "/pcs/view", "/pagead/conversion"}));
    private static final List<String> zzghe = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"}));
    private zzazo zzblr;
    private zzdq zzfds;
    private zzbgk zzghf;
    private Context zzur;

    public zzcsz(zzbgk zzbgk, Context context, zzdq zzdq, zzazo zzazo) {
        this.zzghf = zzbgk;
        this.zzur = context;
        this.zzfds = zzdq;
        this.zzblr = zzazo;
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzavh zzavh, zzava zzava) {
        this.zzur = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        Context context = this.zzur;
        String str = zzavh.zzbri;
        String str2 = zzavh.zzbmg;
        zzuk zzuk = zzavh.zzdqz;
        zzuh zzuh = zzavh.zzdra;
        zzcsw zzact = this.zzghf.zzact();
        zzbpt.zza zzcc = new zzbpt.zza().zzcc(context);
        zzdew zzdew = new zzdew();
        if (str == null) {
            str = "adUnitId";
        }
        zzdew zzgn = zzdew.zzgn(str);
        if (zzuh == null) {
            zzuh = new zzug().zzop();
        }
        zzdew zzg = zzgn.zzg(zzuh);
        if (zzuk == null) {
            zzuk = new zzuk();
        }
        zzdnt.zza(zzact.zzf(zzcc.zza(zzg.zzd(zzuk).zzarb()).zzahz()).zza(new zzcta(new zzcta.zza().zzgm(str2))).zzf(new zzbtl.zza().zzais()).zzafi().zzafh(), new zzcsy(this, zzava), this.zzghf.zzacf());
    }

    public final void zzan(IObjectWrapper iObjectWrapper) {
        zzabt.zzqz();
    }

    public final IObjectWrapper zzb(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        zzabt.zzqz();
        return iObjectWrapper;
    }

    public final IObjectWrapper zzao(IObjectWrapper iObjectWrapper) {
        zzabt.zzqz();
        return iObjectWrapper;
    }
}
