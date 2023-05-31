package com.google.android.gms.ads.mediation.rtb;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public class RtbSignalData {
    private final Bundle zzcct;
    @Nullable
    private final AdSize zzdi;
    private final List<MediationConfiguration> zzekv;
    private final Context zzur;

    public RtbSignalData(Context context, List<MediationConfiguration> list, Bundle bundle, @Nullable AdSize adSize) {
        this.zzur = context;
        this.zzekv = list;
        this.zzcct = bundle;
        this.zzdi = adSize;
    }

    public Context getContext() {
        return this.zzur;
    }

    @Deprecated
    public MediationConfiguration getConfiguration() {
        List<MediationConfiguration> list = this.zzekv;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.zzekv.get(0);
    }

    public List<MediationConfiguration> getConfigurations() {
        return this.zzekv;
    }

    public Bundle getNetworkExtras() {
        return this.zzcct;
    }

    @Nullable
    public AdSize getAdSize() {
        return this.zzdi;
    }
}
