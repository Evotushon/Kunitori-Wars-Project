package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzaek;
import com.google.android.gms.internal.ads.zzael;
import com.google.android.gms.internal.ads.zzuo;
import com.google.android.gms.internal.ads.zzwe;
import com.google.android.gms.internal.ads.zzwf;
import com.google.android.gms.internal.ads.zzza;

@SafeParcelable.Class(creator = "PublisherAdViewOptionsCreator")
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzc();
    @SafeParcelable.Field(getter = "getManualImpressionsEnabled", id = 1)
    private final boolean zzbkp;
    @SafeParcelable.Field(getter = "getAppEventListenerBinder", id = 2, type = "android.os.IBinder")
    @Nullable
    private final zzwf zzbkq;
    @Nullable
    private AppEventListener zzbkr;
    @SafeParcelable.Field(getter = "getDelayedBannerAdListenerBinder", id = 3)
    @Nullable
    private final IBinder zzbks;

    private PublisherAdViewOptions(Builder builder) {
        this.zzbkp = builder.zzbkp;
        this.zzbkr = builder.zzbkr;
        AppEventListener appEventListener = this.zzbkr;
        zzza zzza = null;
        this.zzbkq = appEventListener != null ? new zzuo(appEventListener) : null;
        this.zzbks = builder.zzbkt != null ? new zzza(builder.zzbkt) : zzza;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    public static final class Builder {
        /* access modifiers changed from: private */
        public boolean zzbkp = false;
        /* access modifiers changed from: private */
        @Nullable
        public AppEventListener zzbkr;
        /* access modifiers changed from: private */
        @Nullable
        public ShouldDelayBannerRenderingListener zzbkt;

        public final Builder setManualImpressionsEnabled(boolean z) {
            this.zzbkp = z;
            return this;
        }

        public final Builder setAppEventListener(AppEventListener appEventListener) {
            this.zzbkr = appEventListener;
            return this;
        }

        @KeepForSdk
        public final Builder setShouldDelayBannerRenderingListener(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            this.zzbkt = shouldDelayBannerRenderingListener;
            return this;
        }

        public final PublisherAdViewOptions build() {
            return new PublisherAdViewOptions(this);
        }
    }

    @SafeParcelable.Constructor
    PublisherAdViewOptions(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) @Nullable IBinder iBinder, @SafeParcelable.Param(id = 3) @Nullable IBinder iBinder2) {
        this.zzbkp = z;
        this.zzbkq = iBinder != null ? zzwe.zze(iBinder) : null;
        this.zzbks = iBinder2;
    }

    @Nullable
    public final AppEventListener getAppEventListener() {
        return this.zzbkr;
    }

    public final boolean getManualImpressionsEnabled() {
        return this.zzbkp;
    }

    @Nullable
    public final zzwf zzjr() {
        return this.zzbkq;
    }

    @Nullable
    public final zzael zzjs() {
        return zzaek.zzy(this.zzbks);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, getManualImpressionsEnabled());
        zzwf zzwf = this.zzbkq;
        SafeParcelWriter.writeIBinder(parcel, 2, zzwf == null ? null : zzwf.asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 3, this.zzbks, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
