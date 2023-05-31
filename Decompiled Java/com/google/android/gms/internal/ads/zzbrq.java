package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.reward.AdMetadataListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbrq extends zzbtk<AdMetadataListener> implements zzafe {
    private Bundle zzfkn = new Bundle();

    public zzbrq(Set<zzbuv<AdMetadataListener>> set) {
        super(set);
    }

    public final synchronized void zza(String str, Bundle bundle) {
        this.zzfkn.putAll(bundle);
        zza(zzbrp.zzfkj);
    }

    public final synchronized Bundle getAdMetadata() {
        return new Bundle(this.zzfkn);
    }
}
