package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdga {
    private final int maxEntries;
    private final LinkedList<zzdgk<?>> zzgru = new LinkedList<>();
    private final int zzgrv;
    private final zzdgx zzgrw;

    public zzdga(int i, int i2) {
        this.maxEntries = i;
        this.zzgrv = i2;
        this.zzgrw = new zzdgx();
    }

    public final boolean zzb(zzdgk<?> zzdgk) {
        this.zzgrw.zzase();
        zzaro();
        if (this.zzgru.size() == this.maxEntries) {
            return false;
        }
        this.zzgru.add(zzdgk);
        return true;
    }

    public final zzdgk<?> zzarj() {
        this.zzgrw.zzase();
        zzaro();
        if (this.zzgru.isEmpty()) {
            return null;
        }
        zzdgk<?> remove = this.zzgru.remove();
        if (remove != null) {
            this.zzgrw.zzasf();
        }
        return remove;
    }

    public final int size() {
        zzaro();
        return this.zzgru.size();
    }

    public final long getCreationTimeMillis() {
        return this.zzgrw.getCreationTimeMillis();
    }

    public final long zzark() {
        return this.zzgrw.zzark();
    }

    public final int zzarl() {
        return this.zzgrw.zzarl();
    }

    public final String zzarm() {
        return this.zzgrw.zzarw();
    }

    public final zzdha zzarn() {
        return this.zzgrw.zzash();
    }

    private final void zzaro() {
        while (!this.zzgru.isEmpty()) {
            if (zzq.zzlc().currentTimeMillis() - this.zzgru.getFirst().zzgtm >= ((long) this.zzgrv)) {
                this.zzgrw.zzasg();
                this.zzgru.remove();
            } else {
                return;
            }
        }
    }
}
