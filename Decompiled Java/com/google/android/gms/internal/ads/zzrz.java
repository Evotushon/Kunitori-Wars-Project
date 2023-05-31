package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "CacheOfferingCreator")
@SafeParcelable.Reserved({1})
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzrz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzrz> CREATOR = new zzsc();
    @SafeParcelable.Field(id = 2)
    @Nullable
    public final String url;
    @SafeParcelable.Field(id = 3)
    private final long zzbrs;
    @SafeParcelable.Field(id = 4)
    private final String zzbrt;
    @SafeParcelable.Field(id = 5)
    private final String zzbru;
    @SafeParcelable.Field(id = 6)
    private final String zzbrv;
    @SafeParcelable.Field(id = 7)
    private final Bundle zzbrw;
    @SafeParcelable.Field(id = 8)
    public final boolean zzbrx;
    @SafeParcelable.Field(id = 9)
    public long zzbry;

    @Nullable
    public static zzrz zzbz(String str) {
        return zzd(Uri.parse(str));
    }

    @Nullable
    public static zzrz zzd(Uri uri) {
        long j;
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(62);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                zzawf.zzfa(sb.toString());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter(ImagesContract.URL);
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            if (queryParameter2 == null) {
                j = 0;
            } else {
                j = Long.parseLong(queryParameter2);
            }
            long j2 = j;
            Bundle bundle = new Bundle();
            zzq.zzkx();
            for (String next : uri.getQueryParameterNames()) {
                if (next.startsWith("tag.")) {
                    bundle.putString(next.substring(4), uri.getQueryParameter(next));
                }
            }
            return new zzrz(queryParameter, j2, host, str, str2, bundle, equals, 0);
        } catch (NullPointerException | NumberFormatException e) {
            zzawf.zzd("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @SafeParcelable.Constructor
    zzrz(@SafeParcelable.Param(id = 2) @Nullable String str, @SafeParcelable.Param(id = 3) long j, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) String str4, @SafeParcelable.Param(id = 7) Bundle bundle, @SafeParcelable.Param(id = 8) boolean z, @SafeParcelable.Param(id = 9) long j2) {
        this.url = str;
        this.zzbrs = j;
        String str5 = "";
        this.zzbrt = str2 == null ? str5 : str2;
        this.zzbru = str3 == null ? str5 : str3;
        this.zzbrv = str4 != null ? str4 : str5;
        this.zzbrw = bundle == null ? new Bundle() : bundle;
        this.zzbrx = z;
        this.zzbry = j2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.url, false);
        SafeParcelWriter.writeLong(parcel, 3, this.zzbrs);
        SafeParcelWriter.writeString(parcel, 4, this.zzbrt, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzbru, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzbrv, false);
        SafeParcelWriter.writeBundle(parcel, 7, this.zzbrw, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzbrx);
        SafeParcelWriter.writeLong(parcel, 9, this.zzbry);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
