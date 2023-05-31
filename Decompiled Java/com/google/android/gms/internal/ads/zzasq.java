package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONArray;
import org.json.JSONException;

@SafeParcelable.Class(creator = "RewardItemParcelCreator")
@SafeParcelable.Reserved({1})
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzasq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzasq> CREATOR = new zzasp();
    @SafeParcelable.Field(id = 2)
    public final String type;
    @SafeParcelable.Field(id = 3)
    public final int zzdot;

    public zzasq(RewardItem rewardItem) {
        this(rewardItem.getType(), rewardItem.getAmount());
    }

    @SafeParcelable.Constructor
    public zzasq(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i) {
        this.type = str;
        this.zzdot = i;
    }

    @Nullable
    public static zzasq zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzasq(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.type, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzdot);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzasq)) {
            zzasq zzasq = (zzasq) obj;
            if (!Objects.equal(this.type, zzasq.type) || !Objects.equal(Integer.valueOf(this.zzdot), Integer.valueOf(zzasq.zzdot))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.type, Integer.valueOf(this.zzdot));
    }
}
