package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbsy extends zzbtk<AppEventListener> implements zzafg {
    public zzbsy(Set<zzbuv<AppEventListener>> set) {
        super(set);
    }

    public final synchronized void onAppEvent(String str, String str2) {
        zza(new zzbsx(str, str2));
    }
}
