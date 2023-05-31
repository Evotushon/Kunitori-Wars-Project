package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeah;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzdph<PrimitiveT, KeyProtoT extends zzeah> implements zzdpe<PrimitiveT> {
    private final zzdpj<KeyProtoT> zzhdw;
    private final Class<PrimitiveT> zzhdx;

    public zzdph(zzdpj<KeyProtoT> zzdpj, Class<PrimitiveT> cls) {
        if (zzdpj.zzavd().contains(cls) || Void.class.equals(cls)) {
            this.zzhdw = zzdpj;
            this.zzhdx = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{zzdpj.toString(), cls.getName()}));
    }

    public final PrimitiveT zzm(zzdxn zzdxn) throws GeneralSecurityException {
        try {
            return zzb(this.zzhdw.zzr(zzdxn));
        } catch (zzdzh e) {
            String valueOf = String.valueOf(this.zzhdw.zzavb().getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e);
        }
    }

    public final PrimitiveT zza(zzeah zzeah) throws GeneralSecurityException {
        String valueOf = String.valueOf(this.zzhdw.zzavb().getName());
        String concat = valueOf.length() != 0 ? "Expected proto of type ".concat(valueOf) : new String("Expected proto of type ");
        if (this.zzhdw.zzavb().isInstance(zzeah)) {
            return zzb(zzeah);
        }
        throw new GeneralSecurityException(concat);
    }

    public final zzeah zzn(zzdxn zzdxn) throws GeneralSecurityException {
        try {
            return zzauz().zzp(zzdxn);
        } catch (zzdzh e) {
            String valueOf = String.valueOf(this.zzhdw.zzavf().zzava().getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e);
        }
    }

    public final String getKeyType() {
        return this.zzhdw.getKeyType();
    }

    public final zzduc zzo(zzdxn zzdxn) throws GeneralSecurityException {
        try {
            return (zzduc) ((zzdyz) zzduc.zzayk().zzhe(this.zzhdw.getKeyType()).zzaf(zzauz().zzp(zzdxn).zzbai()).zzb(this.zzhdw.zzavc()).zzbcx());
        } catch (zzdzh e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    public final Class<PrimitiveT> zzauy() {
        return this.zzhdx;
    }

    private final PrimitiveT zzb(KeyProtoT keyprotot) throws GeneralSecurityException {
        if (!Void.class.equals(this.zzhdx)) {
            this.zzhdw.zze(keyprotot);
            return this.zzhdw.zza(keyprotot, this.zzhdx);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    private final zzdpg<?, KeyProtoT> zzauz() {
        return new zzdpg<>(this.zzhdw.zzavf());
    }
}
