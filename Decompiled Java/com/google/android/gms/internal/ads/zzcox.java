package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public abstract class zzcox<AdT> implements zzcly<AdT> {
    /* access modifiers changed from: protected */
    public abstract zzdof<AdT> zza(zzdeu zzdeu, Bundle bundle);

    public final boolean zza(zzdeq zzdeq, zzdei zzdei) {
        return !TextUtils.isEmpty(zzdei.zzgpt.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    public final zzdof<AdT> zzb(zzdeq zzdeq, zzdei zzdei) {
        zzdei zzdei2 = zzdei;
        String optString = zzdei2.zzgpt.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        zzdeu zzdeu = zzdeq.zzgql.zzfir;
        zzdew zzgn = new zzdew().zzg(zzdeu.zzgqq).zzd(zzdeu.zzblv).zzc(zzdeu.zzgqo).zzgn(zzdeu.zzgqr).zzc(zzdeu.zzgqp).zzb(zzdeu.zzgqs).zzc(zzdeu.zzgqt).zzb(zzdeu.zzdff).zzb(zzdeu.zzgqu).zzb(zzdeu.zzgqv).zzgn(optString);
        Bundle zzm = zzm(zzdeu.zzgqq.zzcct);
        Bundle zzm2 = zzm(zzm.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        zzm2.putInt("gw", 1);
        String optString2 = zzdei2.zzgpt.optString("mad_hac", (String) null);
        if (optString2 != null) {
            zzm2.putString("mad_hac", optString2);
        }
        String optString3 = zzdei2.zzgpt.optString("adJson", (String) null);
        if (optString3 != null) {
            zzm2.putString("_ad", optString3);
        }
        zzm2.putBoolean("_noRefresh", true);
        Iterator<String> keys = zzdei2.zzgpw.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = zzdei2.zzgpw.optString(next, (String) null);
            if (next != null) {
                zzm2.putString(next, optString4);
            }
        }
        zzm.putBundle("com.google.ads.mediation.admob.AdMobAdapter", zzm2);
        zzuh zzuh = r5;
        zzuh zzuh2 = new zzuh(zzdeu.zzgqq.versionCode, zzdeu.zzgqq.zzccm, zzm2, zzdeu.zzgqq.zzccn, zzdeu.zzgqq.zzcco, zzdeu.zzgqq.zzccp, zzdeu.zzgqq.zzabv, zzdeu.zzgqq.zzbkp, zzdeu.zzgqq.zzccq, zzdeu.zzgqq.zzccr, zzdeu.zzgqq.zzmk, zzdeu.zzgqq.zzccs, zzm, zzdeu.zzgqq.zzccu, zzdeu.zzgqq.zzccv, zzdeu.zzgqq.zzccw, zzdeu.zzgqq.zzccx, zzdeu.zzgqq.zzccy, zzdeu.zzgqq.zzcda, zzdeu.zzgqq.zzabw, zzdeu.zzgqq.zzabx, zzdeu.zzgqq.zzccz);
        zzdeu zzarb = zzgn.zzg(zzuh).zzarb();
        Bundle bundle = new Bundle();
        zzdeq zzdeq2 = zzdeq;
        zzdek zzdek = zzdeq2.zzgqm.zzgqj;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList(zzdek.zzdds));
        bundle2.putInt("refresh_interval", zzdek.zzgqf);
        bundle2.putString("gws_query_id", zzdek.zzcac);
        bundle.putBundle("parent_common_config", bundle2);
        String str = zzdeq2.zzgql.zzfir.zzgqr;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        zzdei zzdei3 = zzdei;
        bundle3.putString("allocation_id", zzdei3.zzdcu);
        bundle3.putStringArrayList("click_urls", new ArrayList(zzdei3.zzddp));
        bundle3.putStringArrayList("imp_urls", new ArrayList(zzdei3.zzddq));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList(zzdei3.zzdlr));
        bundle3.putStringArrayList("fill_urls", new ArrayList(zzdei3.zzgpo));
        bundle3.putStringArrayList("video_start_urls", new ArrayList(zzdei3.zzdme));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList(zzdei3.zzdmf));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList(zzdei3.zzgpn));
        bundle3.putString(FirebaseAnalytics.Param.TRANSACTION_ID, zzdei3.zzddf);
        bundle3.putString("valid_from_timestamp", zzdei3.zzddg);
        bundle3.putBoolean("is_closable_area_disabled", zzdei3.zzblo);
        if (zzdei3.zzdmd != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzdei3.zzdmd.zzdot);
            bundle4.putString("rb_type", zzdei3.zzdmd.type);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zza(zzarb, bundle);
    }

    private static Bundle zzm(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }
}
