package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Map;

@SafeParcelable.Class(creator = "HttpRequestParcelCreator")
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzagl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzagl> CREATOR = new zzagk();
    @SafeParcelable.Field(id = 1)
    private final String url;
    @SafeParcelable.Field(id = 2)
    private final String[] zzcyy;
    @SafeParcelable.Field(id = 3)
    private final String[] zzcyz;

    @SafeParcelable.Constructor
    zzagl(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String[] strArr, @SafeParcelable.Param(id = 3) String[] strArr2) {
        this.url = str;
        this.zzcyy = strArr;
        this.zzcyz = strArr2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.url, false);
        SafeParcelWriter.writeStringArray(parcel, 2, this.zzcyy, false);
        SafeParcelWriter.writeStringArray(parcel, 3, this.zzcyz, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static zzagl zzh(zzq<?> zzq) throws zzb {
        Map<String, String> headers = zzq.getHeaders();
        int size = headers.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Map.Entry next : headers.entrySet()) {
            strArr[i] = (String) next.getKey();
            strArr2[i] = (String) next.getValue();
            i++;
        }
        return new zzagl(zzq.getUrl(), strArr, strArr2);
    }
}
