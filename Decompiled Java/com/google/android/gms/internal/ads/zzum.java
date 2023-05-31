package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "AdValueParcelCreator")
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzum extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzum> CREATOR = new zzup();
    @SafeParcelable.Field(id = 1)
    public final int type;
    @SafeParcelable.Field(id = 2)
    public final int zzabo;
    @SafeParcelable.Field(id = 3)
    public final String zzabp;
    @SafeParcelable.Field(id = 4)
    public final long zzabq;

    @SafeParcelable.Constructor
    public zzum(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) long j) {
        this.type = i;
        this.zzabo = i2;
        this.zzabp = str;
        this.zzabq = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.type);
        SafeParcelWriter.writeInt(parcel, 2, this.zzabo);
        SafeParcelWriter.writeString(parcel, 3, this.zzabp, false);
        SafeParcelWriter.writeLong(parcel, 4, this.zzabq);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static zzum zza(JSONObject jSONObject) throws JSONException {
        return new zzum(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString(FirebaseAnalytics.Param.CURRENCY), jSONObject.getLong("value"));
    }
}
