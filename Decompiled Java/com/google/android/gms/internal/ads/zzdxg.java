package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdxd;
import com.google.android.gms.internal.ads.zzdxg;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public abstract class zzdxg<MessageType extends zzdxd<MessageType, BuilderType>, BuilderType extends zzdxg<MessageType, BuilderType>> implements zzeak {
    /* access modifiers changed from: protected */
    public abstract BuilderType zza(MessageType messagetype);

    public abstract BuilderType zza(zzdxz zzdxz, zzdym zzdym) throws IOException;

    /* renamed from: zzbal */
    public abstract BuilderType clone();

    public BuilderType zza(byte[] bArr, int i, int i2, zzdym zzdym) throws zzdzh {
        try {
            zzdxz zzb = zzdxz.zzb(bArr, 0, i2, false);
            zza(zzb, zzdym);
            zzb.zzfh(0);
            return this;
        } catch (zzdzh e) {
            throw e;
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 60 + "byte array".length());
            sb.append("Reading ");
            sb.append(name);
            sb.append(" from a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    public final /* synthetic */ zzeak zzf(zzeah zzeah) {
        if (zzbcy().getClass().isInstance(zzeah)) {
            return zza((zzdxd) zzeah);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
