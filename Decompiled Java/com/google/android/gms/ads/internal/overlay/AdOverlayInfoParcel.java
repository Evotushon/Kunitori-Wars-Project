package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzafe;
import com.google.android.gms.internal.ads.zzafg;
import com.google.android.gms.internal.ads.zzazo;
import com.google.android.gms.internal.ads.zzbdv;
import com.google.android.gms.internal.ads.zztz;

@SafeParcelable.Class(creator = "AdOverlayInfoCreator")
@SafeParcelable.Reserved({1})
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzn();
    @SafeParcelable.Field(id = 11)
    public final int orientation;
    @SafeParcelable.Field(id = 13)
    public final String url;
    @SafeParcelable.Field(id = 14)
    public final zzazo zzblu;
    @SafeParcelable.Field(getter = "getAdClickListenerAsBinder", id = 3, type = "android.os.IBinder")
    public final zztz zzcch;
    @SafeParcelable.Field(getter = "getAdMetadataGmsgListenerAsBinder", id = 18, type = "android.os.IBinder")
    public final zzafe zzcxu;
    @SafeParcelable.Field(getter = "getAppEventGmsgListenerAsBinder", id = 6, type = "android.os.IBinder")
    public final zzafg zzcxv;
    @SafeParcelable.Field(getter = "getAdWebViewAsBinder", id = 5, type = "android.os.IBinder")
    public final zzbdv zzdae;
    @SafeParcelable.Field(id = 2)
    public final zzb zzdis;
    @SafeParcelable.Field(getter = "getAdOverlayListenerAsBinder", id = 4, type = "android.os.IBinder")
    public final zzp zzdit;
    @SafeParcelable.Field(id = 7)
    public final String zzdiu;
    @SafeParcelable.Field(id = 8)
    public final boolean zzdiv;
    @SafeParcelable.Field(id = 9)
    public final String zzdiw;
    @SafeParcelable.Field(getter = "getLeaveApplicationListenerAsBinder", id = 10, type = "android.os.IBinder")
    public final zzv zzdix;
    @SafeParcelable.Field(id = 12)
    public final int zzdiy;
    @SafeParcelable.Field(id = 16)
    public final String zzdiz;
    @SafeParcelable.Field(id = 17)
    public final zzg zzdja;

    public static void zza(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    public static AdOverlayInfoParcel zzc(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    public AdOverlayInfoParcel(zztz zztz, zzp zzp, zzv zzv, zzbdv zzbdv, int i, zzazo zzazo, String str, zzg zzg, String str2, String str3) {
        this.zzdis = null;
        this.zzcch = null;
        this.zzdit = zzp;
        this.zzdae = zzbdv;
        this.zzcxu = null;
        this.zzcxv = null;
        this.zzdiu = str2;
        this.zzdiv = false;
        this.zzdiw = str3;
        this.zzdix = null;
        this.orientation = i;
        this.zzdiy = 1;
        this.url = null;
        this.zzblu = zzazo;
        this.zzdiz = str;
        this.zzdja = zzg;
    }

    public AdOverlayInfoParcel(zztz zztz, zzp zzp, zzv zzv, zzbdv zzbdv, boolean z, int i, zzazo zzazo) {
        this.zzdis = null;
        this.zzcch = zztz;
        this.zzdit = zzp;
        this.zzdae = zzbdv;
        this.zzcxu = null;
        this.zzcxv = null;
        this.zzdiu = null;
        this.zzdiv = z;
        this.zzdiw = null;
        this.zzdix = zzv;
        this.orientation = i;
        this.zzdiy = 2;
        this.url = null;
        this.zzblu = zzazo;
        this.zzdiz = null;
        this.zzdja = null;
    }

    public AdOverlayInfoParcel(zztz zztz, zzp zzp, zzafe zzafe, zzafg zzafg, zzv zzv, zzbdv zzbdv, boolean z, int i, String str, zzazo zzazo) {
        this.zzdis = null;
        this.zzcch = zztz;
        this.zzdit = zzp;
        this.zzdae = zzbdv;
        this.zzcxu = zzafe;
        this.zzcxv = zzafg;
        this.zzdiu = null;
        this.zzdiv = z;
        this.zzdiw = null;
        this.zzdix = zzv;
        this.orientation = i;
        this.zzdiy = 3;
        this.url = str;
        this.zzblu = zzazo;
        this.zzdiz = null;
        this.zzdja = null;
    }

    public AdOverlayInfoParcel(zztz zztz, zzp zzp, zzafe zzafe, zzafg zzafg, zzv zzv, zzbdv zzbdv, boolean z, int i, String str, String str2, zzazo zzazo) {
        this.zzdis = null;
        this.zzcch = zztz;
        this.zzdit = zzp;
        this.zzdae = zzbdv;
        this.zzcxu = zzafe;
        this.zzcxv = zzafg;
        this.zzdiu = str2;
        this.zzdiv = z;
        this.zzdiw = str;
        this.zzdix = zzv;
        this.orientation = i;
        this.zzdiy = 3;
        this.url = null;
        this.zzblu = zzazo;
        this.zzdiz = null;
        this.zzdja = null;
    }

    public AdOverlayInfoParcel(zzb zzb, zztz zztz, zzp zzp, zzv zzv, zzazo zzazo) {
        this.zzdis = zzb;
        this.zzcch = zztz;
        this.zzdit = zzp;
        this.zzdae = null;
        this.zzcxu = null;
        this.zzcxv = null;
        this.zzdiu = null;
        this.zzdiv = false;
        this.zzdiw = null;
        this.zzdix = zzv;
        this.orientation = -1;
        this.zzdiy = 4;
        this.url = null;
        this.zzblu = zzazo;
        this.zzdiz = null;
        this.zzdja = null;
    }

    @SafeParcelable.Constructor
    AdOverlayInfoParcel(@SafeParcelable.Param(id = 2) zzb zzb, @SafeParcelable.Param(id = 3) IBinder iBinder, @SafeParcelable.Param(id = 4) IBinder iBinder2, @SafeParcelable.Param(id = 5) IBinder iBinder3, @SafeParcelable.Param(id = 6) IBinder iBinder4, @SafeParcelable.Param(id = 7) String str, @SafeParcelable.Param(id = 8) boolean z, @SafeParcelable.Param(id = 9) String str2, @SafeParcelable.Param(id = 10) IBinder iBinder5, @SafeParcelable.Param(id = 11) int i, @SafeParcelable.Param(id = 12) int i2, @SafeParcelable.Param(id = 13) String str3, @SafeParcelable.Param(id = 14) zzazo zzazo, @SafeParcelable.Param(id = 16) String str4, @SafeParcelable.Param(id = 17) zzg zzg, @SafeParcelable.Param(id = 18) IBinder iBinder6) {
        this.zzdis = zzb;
        this.zzcch = (zztz) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.zzdit = (zzp) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder2));
        this.zzdae = (zzbdv) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder3));
        this.zzcxu = (zzafe) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder6));
        this.zzcxv = (zzafg) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder4));
        this.zzdiu = str;
        this.zzdiv = z;
        this.zzdiw = str2;
        this.zzdix = (zzv) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder5));
        this.orientation = i;
        this.zzdiy = i2;
        this.url = str3;
        this.zzblu = zzazo;
        this.zzdiz = str4;
        this.zzdja = zzg;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzdis, i, false);
        SafeParcelWriter.writeIBinder(parcel, 3, ObjectWrapper.wrap(this.zzcch).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 4, ObjectWrapper.wrap(this.zzdit).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 5, ObjectWrapper.wrap(this.zzdae).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 6, ObjectWrapper.wrap(this.zzcxv).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 7, this.zzdiu, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzdiv);
        SafeParcelWriter.writeString(parcel, 9, this.zzdiw, false);
        SafeParcelWriter.writeIBinder(parcel, 10, ObjectWrapper.wrap(this.zzdix).asBinder(), false);
        SafeParcelWriter.writeInt(parcel, 11, this.orientation);
        SafeParcelWriter.writeInt(parcel, 12, this.zzdiy);
        SafeParcelWriter.writeString(parcel, 13, this.url, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzblu, i, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzdiz, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzdja, i, false);
        SafeParcelWriter.writeIBinder(parcel, 18, ObjectWrapper.wrap(this.zzcxu).asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
