package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "SafeBrowsingConfigParcelCreator")
@SafeParcelable.Reserved({1})
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaua extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaua> CREATOR = new zzatz();
    @SafeParcelable.Field(id = 2)
    public final String zzdpx;
    @SafeParcelable.Field(id = 3)
    public final String zzdpy;
    @SafeParcelable.Field(id = 4)
    public final boolean zzdpz;
    @SafeParcelable.Field(id = 5)
    public final boolean zzdqa;
    @SafeParcelable.Field(id = 6)
    public final List<String> zzdqb;
    @SafeParcelable.Field(id = 7)
    public final boolean zzdqc;
    @SafeParcelable.Field(id = 8)
    public final boolean zzdqd;
    @SafeParcelable.Field(id = 9)
    public final List<String> zzdqe;

    @SafeParcelable.Constructor
    public zzaua(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) List<String> list, @SafeParcelable.Param(id = 7) boolean z3, @SafeParcelable.Param(id = 8) boolean z4, @SafeParcelable.Param(id = 9) List<String> list2) {
        this.zzdpx = str;
        this.zzdpy = str2;
        this.zzdpz = z;
        this.zzdqa = z2;
        this.zzdqb = list;
        this.zzdqc = z3;
        this.zzdqd = z4;
        this.zzdqe = list2 == null ? new ArrayList<>() : list2;
    }

    @Nullable
    public static zzaua zzg(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        return new zzaua(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), zzayf.zza(jSONObject.optJSONArray("allowed_headers"), (List<String>) null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), zzayf.zza(jSONObject.optJSONArray("webview_permissions"), (List<String>) null));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzdpx, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzdpy, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzdpz);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzdqa);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzdqb, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzdqc);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzdqd);
        SafeParcelWriter.writeStringList(parcel, 9, this.zzdqe, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
