package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public class MediationConfiguration {
    private final Bundle zzejn;
    private final AdFormat zzejr;

    public MediationConfiguration(AdFormat adFormat, Bundle bundle) {
        this.zzejr = adFormat;
        this.zzejn = bundle;
    }

    public AdFormat getFormat() {
        return this.zzejr;
    }

    public Bundle getServerParameters() {
        return this.zzejn;
    }
}
