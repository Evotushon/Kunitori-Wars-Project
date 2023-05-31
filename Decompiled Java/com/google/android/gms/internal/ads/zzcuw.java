package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcuw implements zzcye<zzcut> {
    private final zzdoe zzfrv;
    private final Context zzur;

    public zzcuw(zzdoe zzdoe, Context context) {
        this.zzfrv = zzdoe;
        this.zzur = context;
    }

    public final zzdof<zzcut> zzapb() {
        return this.zzfrv.zzd(new zzcuv(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcut zzape() throws Exception {
        AudioManager audioManager = (AudioManager) this.zzur.getSystemService("audio");
        return new zzcut(audioManager.getMode(), audioManager.isMusicActive(), audioManager.isSpeakerphoneOn(), audioManager.getStreamVolume(3), audioManager.getRingerMode(), audioManager.getStreamVolume(2), zzq.zzla().zzpj(), zzq.zzla().zzpk());
    }
}
