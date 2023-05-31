package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeah;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public abstract class zzdpi<KeyFormatProtoT extends zzeah, KeyT> {
    private final Class<KeyFormatProtoT> zzhdy;

    public zzdpi(Class<KeyFormatProtoT> cls) {
        this.zzhdy = cls;
    }

    public abstract void zzc(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

    public abstract KeyT zzd(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

    public abstract KeyFormatProtoT zzq(zzdxn zzdxn) throws zzdzh;

    public final Class<KeyFormatProtoT> zzava() {
        return this.zzhdy;
    }
}
