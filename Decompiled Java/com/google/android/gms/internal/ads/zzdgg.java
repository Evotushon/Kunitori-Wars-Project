package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@SafeParcelable.Class(creator = "PoolConfigurationCreator")
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdgg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdgg> CREATOR = new zzdgh();
    private final zzdgf[] zzgsn;
    private final int[] zzgso;
    private final int[] zzgsp;
    @SafeParcelable.Field(getter = "getFormatInt", id = 1)
    private final int zzgsq;
    public final zzdgf zzgsr;
    @SafeParcelable.Field(id = 2)
    public final int zzgss;
    @SafeParcelable.Field(id = 3)
    public final int zzgst;
    @SafeParcelable.Field(id = 4)
    public final int zzgsu;
    @SafeParcelable.Field(id = 5)
    public final String zzgsv;
    @SafeParcelable.Field(getter = "getPoolDiscardStrategyInt", id = 6)
    private final int zzgsw;
    public final int zzgsx;
    @SafeParcelable.Field(getter = "getPrecacheStartTriggerInt", id = 7)
    private final int zzgsy;
    private final int zzgsz;
    @Nullable
    public final Context zzur;

    private zzdgg(@Nullable Context context, zzdgf zzdgf, int i, int i2, int i3, String str, String str2, String str3) {
        int i4;
        this.zzgsn = zzdgf.values();
        this.zzgso = zzdgi.zzary();
        this.zzgsp = zzdgi.zzarz();
        this.zzur = context;
        this.zzgsq = zzdgf.ordinal();
        this.zzgsr = zzdgf;
        this.zzgss = i;
        this.zzgst = i2;
        this.zzgsu = i3;
        this.zzgsv = str;
        if ("oldest".equals(str2)) {
            i4 = zzdgi.zzgta;
        } else if ("lru".equals(str2) || !"lfu".equals(str2)) {
            i4 = zzdgi.zzgtb;
        } else {
            i4 = zzdgi.zzgtc;
        }
        this.zzgsx = i4;
        this.zzgsw = this.zzgsx - 1;
        "onAdClosed".equals(str3);
        this.zzgsz = zzdgi.zzgte;
        this.zzgsy = this.zzgsz - 1;
    }

    @SafeParcelable.Constructor
    public zzdgg(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) int i4, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) int i5, @SafeParcelable.Param(id = 7) int i6) {
        this.zzgsn = zzdgf.values();
        this.zzgso = zzdgi.zzary();
        this.zzgsp = zzdgi.zzarz();
        this.zzur = null;
        this.zzgsq = i;
        this.zzgsr = this.zzgsn[i];
        this.zzgss = i2;
        this.zzgst = i3;
        this.zzgsu = i4;
        this.zzgsv = str;
        this.zzgsw = i5;
        this.zzgsx = this.zzgso[i5];
        this.zzgsy = i6;
        this.zzgsz = this.zzgsp[i6];
    }

    public static zzdgg zza(zzdgf zzdgf, Context context) {
        if (zzdgf == zzdgf.Rewarded) {
            return new zzdgg(context, zzdgf, ((Integer) zzvh.zzpd().zzd(zzzx.zzcrl)).intValue(), ((Integer) zzvh.zzpd().zzd(zzzx.zzcrr)).intValue(), ((Integer) zzvh.zzpd().zzd(zzzx.zzcrt)).intValue(), (String) zzvh.zzpd().zzd(zzzx.zzcrv), (String) zzvh.zzpd().zzd(zzzx.zzcrn), (String) zzvh.zzpd().zzd(zzzx.zzcrp));
        } else if (zzdgf == zzdgf.Interstitial) {
            return new zzdgg(context, zzdgf, ((Integer) zzvh.zzpd().zzd(zzzx.zzcrm)).intValue(), ((Integer) zzvh.zzpd().zzd(zzzx.zzcrs)).intValue(), ((Integer) zzvh.zzpd().zzd(zzzx.zzcru)).intValue(), (String) zzvh.zzpd().zzd(zzzx.zzcrw), (String) zzvh.zzpd().zzd(zzzx.zzcro), (String) zzvh.zzpd().zzd(zzzx.zzcrq));
        } else if (zzdgf != zzdgf.AppOpen) {
            return null;
        } else {
            return new zzdgg(context, zzdgf, ((Integer) zzvh.zzpd().zzd(zzzx.zzcrz)).intValue(), ((Integer) zzvh.zzpd().zzd(zzzx.zzcsb)).intValue(), ((Integer) zzvh.zzpd().zzd(zzzx.zzcsc)).intValue(), (String) zzvh.zzpd().zzd(zzzx.zzcrx), (String) zzvh.zzpd().zzd(zzzx.zzcry), (String) zzvh.zzpd().zzd(zzzx.zzcsa));
        }
    }

    public static boolean zzarx() {
        return ((Boolean) zzvh.zzpd().zzd(zzzx.zzcrk)).booleanValue();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzgsq);
        SafeParcelWriter.writeInt(parcel, 2, this.zzgss);
        SafeParcelWriter.writeInt(parcel, 3, this.zzgst);
        SafeParcelWriter.writeInt(parcel, 4, this.zzgsu);
        SafeParcelWriter.writeString(parcel, 5, this.zzgsv, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzgsw);
        SafeParcelWriter.writeInt(parcel, 7, this.zzgsy);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
