package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeah;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdpg<KeyFormatProtoT extends zzeah, KeyProtoT extends zzeah> {
    private final zzdpi<KeyFormatProtoT, KeyProtoT> zzhdv;

    zzdpg(zzdpi<KeyFormatProtoT, KeyProtoT> zzdpi) {
        this.zzhdv = zzdpi;
    }

    /* access modifiers changed from: package-private */
    public final KeyProtoT zzp(zzdxn zzdxn) throws GeneralSecurityException, zzdzh {
        KeyFormatProtoT zzq = this.zzhdv.zzq(zzdxn);
        this.zzhdv.zzc(zzq);
        return (zzeah) this.zzhdv.zzd(zzq);
    }
}
