package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzaqm;
import com.google.android.gms.internal.ads.zzaub;
import com.google.android.gms.internal.ads.zzawo;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzc {
    private boolean zzblb;
    private zzaub zzblc;
    private zzaqm zzbld = null;
    private final Context zzur;

    public zzc(Context context, zzaub zzaub, zzaqm zzaqm) {
        this.zzur = context;
        this.zzblc = zzaub;
        if (this.zzbld == null) {
            this.zzbld = new zzaqm();
        }
    }

    private final boolean zzju() {
        zzaub zzaub = this.zzblc;
        return (zzaub != null && zzaub.zzup().zzdqc) || this.zzbld.zzdms;
    }

    public final void recordClick() {
        this.zzblb = true;
    }

    public final boolean zzjv() {
        return !zzju() || this.zzblb;
    }

    public final void zzbr(@Nullable String str) {
        if (zzju()) {
            if (str == null) {
                str = "";
            }
            zzaub zzaub = this.zzblc;
            if (zzaub != null) {
                zzaub.zza(str, (Map<String, String>) null, 3);
            } else if (this.zzbld.zzdms && this.zzbld.zzdmt != null) {
                for (String next : this.zzbld.zzdmt) {
                    if (!TextUtils.isEmpty(next)) {
                        String replace = next.replace("{NAVIGATION_URL}", Uri.encode(str));
                        zzq.zzkv();
                        zzawo.zzb(this.zzur, "", replace);
                    }
                }
            }
        }
    }
}
