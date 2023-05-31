package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.InputStream;
import javax.annotation.concurrent.GuardedBy;

@SafeParcelable.Class(creator = "CacheEntryParcelCreator")
@SafeParcelable.Reserved({1})
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzry extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzry> CREATOR = new zzrx();
    @GuardedBy("this")
    @SafeParcelable.Field(getter = "getContentFileDescriptor", id = 2)
    @Nullable
    private ParcelFileDescriptor zzbrr;

    public zzry() {
        this((ParcelFileDescriptor) null);
    }

    @SafeParcelable.Constructor
    public zzry(@SafeParcelable.Param(id = 2) @Nullable ParcelFileDescriptor parcelFileDescriptor) {
        this.zzbrr = parcelFileDescriptor;
    }

    public final synchronized boolean zzmu() {
        return this.zzbrr != null;
    }

    @Nullable
    public final synchronized InputStream zzmv() {
        if (this.zzbrr == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.zzbrr);
        this.zzbrr = null;
        return autoCloseInputStream;
    }

    private final synchronized ParcelFileDescriptor zzmw() {
        return this.zzbrr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, zzmw(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
