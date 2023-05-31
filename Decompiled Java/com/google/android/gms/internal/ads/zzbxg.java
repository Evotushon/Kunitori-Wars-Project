package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbxg implements zzbqh, zzbuk {
    @Nullable
    private final View view;
    private final zzaui zzbnp;
    private final zzauf zzfhr;
    private final int zzfmh;
    private String zzfmn;
    private final Context zzur;

    public zzbxg(zzauf zzauf, Context context, zzaui zzaui, @Nullable View view2, int i) {
        this.zzfhr = zzauf;
        this.zzur = context;
        this.zzbnp = zzaui;
        this.view = view2;
        this.zzfmh = i;
    }

    public final void onAdLeftApplication() {
    }

    public final void onRewardedVideoCompleted() {
    }

    public final void onRewardedVideoStarted() {
    }

    public final void onAdOpened() {
        View view2 = this.view;
        if (!(view2 == null || this.zzfmn == null)) {
            this.zzbnp.zzg(view2.getContext(), this.zzfmn);
        }
        this.zzfhr.zzam(true);
    }

    public final void onAdClosed() {
        this.zzfhr.zzam(false);
    }

    public final void zzait() {
        this.zzfmn = this.zzbnp.zzaf(this.zzur);
        String valueOf = String.valueOf(this.zzfmn);
        String str = this.zzfmh == 7 ? "/Rewarded" : "/Interstitial";
        this.zzfmn = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
    }

    @ParametersAreNonnullByDefault
    public final void zzb(zzarr zzarr, String str, String str2) {
        if (this.zzbnp.zzad(this.zzur)) {
            try {
                this.zzbnp.zza(this.zzur, this.zzbnp.zzai(this.zzur), this.zzfhr.getAdUnitId(), zzarr.getType(), zzarr.getAmount());
            } catch (RemoteException e) {
                zzawf.zzd("Remote Exception to get reward item.", e);
            }
        }
    }
}
