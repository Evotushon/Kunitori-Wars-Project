package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdis {
    private final Executor executor;
    private final String zzbmj;
    private final Clock zzbmz;
    private final String zzcei;
    private final String zzdjw;
    private final zzdq zzfds;
    private final zzdep zzfkb;
    private final zzcpc zzfli;
    private final zzazl zzgwg;
    private final Context zzur;

    public zzdis(Executor executor2, zzazl zzazl, zzcpc zzcpc, zzazo zzazo, String str, String str2, Context context, @Nullable zzdep zzdep, Clock clock, zzdq zzdq) {
        this.executor = executor2;
        this.zzgwg = zzazl;
        this.zzfli = zzcpc;
        this.zzbmj = zzazo.zzbmj;
        this.zzdjw = str;
        this.zzcei = str2;
        this.zzur = context;
        this.zzfkb = zzdep;
        this.zzbmz = clock;
        this.zzfds = zzdq;
    }

    public final void zza(zzdeq zzdeq, zzdei zzdei, List<String> list) {
        zza(zzdeq, zzdei, false, "", list);
    }

    public final void zza(zzdeq zzdeq, @Nullable zzdei zzdei, boolean z, String str, List<String> list) {
        ArrayList arrayList = new ArrayList();
        String str2 = z ? "1" : "0";
        for (String zzc : list) {
            String zzc2 = zzc(zzc(zzc(zzc, "@gw_adlocid@", zzdeq.zzgql.zzfir.zzgqr), "@gw_adnetrefresh@", str2), "@gw_sdkver@", this.zzbmj);
            if (zzdei != null) {
                zzc2 = zzaux.zzb(zzc(zzc(zzc(zzc2, "@gw_qdata@", zzdei.zzddv), "@gw_adnetid@", zzdei.zzafi), "@gw_allocid@", zzdei.zzdcu), this.zzur, zzdei.zzdmq);
            }
            String zzc3 = zzc(zzc(zzc(zzc2, "@gw_adnetstatus@", this.zzfli.zzaoh()), "@gw_seqnum@", this.zzdjw), "@gw_sessid@", this.zzcei);
            if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcmo)).booleanValue() && !TextUtils.isEmpty(str)) {
                if (this.zzfds.zzb(Uri.parse(zzc3))) {
                    zzc3 = Uri.parse(zzc3).buildUpon().appendQueryParameter("ms", str).build().toString();
                }
            }
            arrayList.add(zzc3);
        }
        zzh(arrayList);
    }

    public final void zza(zzdeq zzdeq, zzdei zzdei, List<String> list, zzarr zzarr) {
        long currentTimeMillis = this.zzbmz.currentTimeMillis();
        try {
            String type = zzarr.getType();
            String num = Integer.toString(zzarr.getAmount());
            ArrayList arrayList = new ArrayList();
            zzdep zzdep = this.zzfkb;
            String str = "";
            String zzgr = zzdep == null ? str : zzgr(zzdep.zzdpa);
            zzdep zzdep2 = this.zzfkb;
            if (zzdep2 != null) {
                str = zzgr(zzdep2.zzdpb);
            }
            for (String zzc : list) {
                arrayList.add(zzaux.zzb(zzc(zzc(zzc(zzc(zzc(zzc(zzc, "@gw_rwd_userid@", Uri.encode(zzgr)), "@gw_rwd_custom_data@", Uri.encode(str)), "@gw_tmstmp@", Long.toString(currentTimeMillis)), "@gw_rwd_itm@", Uri.encode(type)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.zzbmj), this.zzur, zzdei.zzdmq));
            }
            zzh(arrayList);
        } catch (RemoteException unused) {
        }
    }

    public final void zzh(List<String> list) {
        for (String zzeo : list) {
            zzeo(zzeo);
        }
    }

    public final void zzeo(String str) {
        this.executor.execute(new zzdir(this, str));
    }

    private static String zzc(String str, String str2, @Nullable String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    @Nullable
    private static String zzgr(@Nullable String str) {
        return (TextUtils.isEmpty(str) || !zzazb.isEnabled()) ? str : "fakeForAdDebugLog";
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzgs(String str) {
        this.zzgwg.zzeo(str);
    }
}
