package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaak {
    private final Object lock = new Object();
    @VisibleForTesting
    boolean zzcsx = true;
    private final List<zzaai> zzcsy = new LinkedList();
    private final Map<String, String> zzcsz = new LinkedHashMap();
    @Nullable
    private zzaak zzcta;

    public zzaak(boolean z, String str, String str2) {
        this.zzcsz.put("action", str);
        this.zzcsz.put(FirebaseAnalytics.Param.AD_FORMAT, str2);
    }

    public final void zzc(@Nullable zzaak zzaak) {
        synchronized (this.lock) {
            this.zzcta = zzaak;
        }
    }

    @Nullable
    public final zzaai zzex(long j) {
        if (!this.zzcsx) {
            return null;
        }
        return new zzaai(j, (String) null, (zzaai) null);
    }

    public final boolean zza(zzaai zzaai, long j, String... strArr) {
        synchronized (this.lock) {
            for (String zzaai2 : strArr) {
                this.zzcsy.add(new zzaai(j, zzaai2, zzaai));
            }
        }
        return true;
    }

    public final String zzqu() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.lock) {
            for (zzaai next : this.zzcsy) {
                long time = next.getTime();
                String zzqs = next.zzqs();
                zzaai zzqt = next.zzqt();
                if (zzqt != null && time > 0) {
                    sb2.append(zzqs);
                    sb2.append('.');
                    sb2.append(time - zzqt.getTime());
                    sb2.append(',');
                }
            }
            this.zzcsy.clear();
            if (!TextUtils.isEmpty((CharSequence) null)) {
                sb2.append((String) null);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            sb = sb2.toString();
        }
        return sb;
    }

    public final void zzh(String str, String str2) {
        zzaaa zzve;
        if (this.zzcsx && !TextUtils.isEmpty(str2) && (zzve = zzq.zzkz().zzve()) != null) {
            synchronized (this.lock) {
                zzaae zzcr = zzve.zzcr(str);
                Map<String, String> map = this.zzcsz;
                map.put(str, zzcr.zzg(map.get(str), str2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final Map<String, String> zzqv() {
        synchronized (this.lock) {
            zzaaa zzve = zzq.zzkz().zzve();
            if (zzve != null) {
                if (this.zzcta != null) {
                    Map<String, String> zza = zzve.zza(this.zzcsz, this.zzcta.zzqv());
                    return zza;
                }
            }
            Map<String, String> map = this.zzcsz;
            return map;
        }
    }
}
