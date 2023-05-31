package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzq;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzctm implements zzcyb<Bundle> {
    private final zzuk zzblv;
    private final List<Parcelable> zzghs;
    private final Context zzur;

    public zzctm(Context context, zzuk zzuk, List<Parcelable> list) {
        this.zzur = context;
        this.zzblv = zzuk;
        this.zzghs = list;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (zzabl.zzcvc.get().booleanValue()) {
            Bundle bundle2 = new Bundle();
            zzq.zzkv();
            bundle2.putString("activity", zzawo.zzav(this.zzur));
            Bundle bundle3 = new Bundle();
            bundle3.putInt("width", this.zzblv.width);
            bundle3.putInt("height", this.zzblv.height);
            bundle2.putBundle("size", bundle3);
            if (this.zzghs.size() > 0) {
                List<Parcelable> list = this.zzghs;
                bundle2.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            bundle.putBundle("view_hierarchy", bundle2);
        }
    }
}
