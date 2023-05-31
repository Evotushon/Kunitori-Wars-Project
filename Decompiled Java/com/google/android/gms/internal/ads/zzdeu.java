package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdeu {
    public final zzuk zzblv;
    public final zzach zzdff;
    @Nullable
    public final zzahl zzdlk;
    public final int zzggu;
    @Nullable
    public final zzwl zzgqo;
    @Nullable
    public final zzzc zzgqp;
    public final zzuh zzgqq;
    public final String zzgqr;
    public final ArrayList<String> zzgqs;
    public final ArrayList<String> zzgqt;
    public final zzur zzgqu;
    public final PublisherAdViewOptions zzgqv;
    public final zzwf zzgqw;
    public final Set<String> zzgqx;

    private zzdeu(zzdew zzdew) {
        zzzc zzzc;
        this.zzblv = zzdew.zzblv;
        this.zzgqr = zzdew.zzgqr;
        this.zzgqo = zzdew.zzgqo;
        this.zzgqq = new zzuh(zzdew.zzgqq.versionCode, zzdew.zzgqq.zzccm, zzdew.zzgqq.extras, zzdew.zzgqq.zzccn, zzdew.zzgqq.zzcco, zzdew.zzgqq.zzccp, zzdew.zzgqq.zzabv, zzdew.zzgqq.zzbkp || zzdew.zzbkp, zzdew.zzgqq.zzccq, zzdew.zzgqq.zzccr, zzdew.zzgqq.zzmk, zzdew.zzgqq.zzccs, zzdew.zzgqq.zzcct, zzdew.zzgqq.zzccu, zzdew.zzgqq.zzccv, zzdew.zzgqq.zzccw, zzdew.zzgqq.zzccx, zzdew.zzgqq.zzccy, zzdew.zzgqq.zzcda, zzdew.zzgqq.zzabw, zzdew.zzgqq.zzabx, zzdew.zzgqq.zzccz);
        zzach zzach = null;
        if (zzdew.zzgqp != null) {
            zzzc = zzdew.zzgqp;
        } else {
            zzzc = zzdew.zzdff != null ? zzdew.zzdff.zzcwt : null;
        }
        this.zzgqp = zzzc;
        this.zzgqs = zzdew.zzgqs;
        this.zzgqt = zzdew.zzgqt;
        if (zzdew.zzgqs != null) {
            if (zzdew.zzdff == null) {
                zzach = new zzach(new NativeAdOptions.Builder().build());
            } else {
                zzach = zzdew.zzdff;
            }
        }
        this.zzdff = zzach;
        this.zzgqu = zzdew.zzgqu;
        this.zzggu = zzdew.zzggu;
        this.zzgqv = zzdew.zzgqv;
        this.zzgqw = zzdew.zzgqw;
        this.zzdlk = zzdew.zzdlk;
        this.zzgqx = zzdew.zzgqx;
    }

    public final zzael zzaqx() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzgqv;
        if (publisherAdViewOptions == null) {
            return null;
        }
        return publisherAdViewOptions.zzjs();
    }
}
