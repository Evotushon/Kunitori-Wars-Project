package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.common.util.Clock;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzbtl {
    @Nullable
    private final zzdcl zzfhw;
    private final Set<zzbuv<zztz>> zzfkx;
    private final Set<zzbuv<zzbqh>> zzfky;
    private final Set<zzbuv<zzbqu>> zzfkz;
    private final Set<zzbuv<zzbrw>> zzfla;
    private final Set<zzbuv<zzbrn>> zzflb;
    private final Set<zzbuv<zzbqm>> zzflc;
    private final Set<zzbuv<zzbqq>> zzfld;
    private final Set<zzbuv<AdMetadataListener>> zzfle;
    private final Set<zzbuv<AppEventListener>> zzflf;
    private final Set<zzbuv<zzbsg>> zzflg;
    private zzbqk zzflh;
    private zzcpc zzfli;

    private zzbtl(zza zza2) {
        this.zzfkx = zza2.zzfkx;
        this.zzfkz = zza2.zzfkz;
        this.zzfla = zza2.zzfla;
        this.zzfky = zza2.zzfky;
        this.zzflb = zza2.zzflb;
        this.zzflc = zza2.zzflc;
        this.zzfld = zza2.zzfld;
        this.zzfle = zza2.zzfle;
        this.zzflf = zza2.zzflf;
        this.zzflg = zza2.zzflj;
        this.zzfhw = zza2.zzfhw;
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static class zza {
        /* access modifiers changed from: private */
        public zzdcl zzfhw;
        /* access modifiers changed from: private */
        public Set<zzbuv<zztz>> zzfkx = new HashSet();
        /* access modifiers changed from: private */
        public Set<zzbuv<zzbqh>> zzfky = new HashSet();
        /* access modifiers changed from: private */
        public Set<zzbuv<zzbqu>> zzfkz = new HashSet();
        /* access modifiers changed from: private */
        public Set<zzbuv<zzbrw>> zzfla = new HashSet();
        /* access modifiers changed from: private */
        public Set<zzbuv<zzbrn>> zzflb = new HashSet();
        /* access modifiers changed from: private */
        public Set<zzbuv<zzbqm>> zzflc = new HashSet();
        /* access modifiers changed from: private */
        public Set<zzbuv<zzbqq>> zzfld = new HashSet();
        /* access modifiers changed from: private */
        public Set<zzbuv<AdMetadataListener>> zzfle = new HashSet();
        /* access modifiers changed from: private */
        public Set<zzbuv<AppEventListener>> zzflf = new HashSet();
        /* access modifiers changed from: private */
        public Set<zzbuv<zzbsg>> zzflj = new HashSet();

        public final zza zza(zzbqh zzbqh, Executor executor) {
            this.zzfky.add(new zzbuv(zzbqh, executor));
            return this;
        }

        public final zza zza(zzbrn zzbrn, Executor executor) {
            this.zzflb.add(new zzbuv(zzbrn, executor));
            return this;
        }

        public final zza zza(zzbqm zzbqm, Executor executor) {
            this.zzflc.add(new zzbuv(zzbqm, executor));
            return this;
        }

        public final zza zza(zzbqq zzbqq, Executor executor) {
            this.zzfld.add(new zzbuv(zzbqq, executor));
            return this;
        }

        public final zza zza(AdMetadataListener adMetadataListener, Executor executor) {
            this.zzfle.add(new zzbuv(adMetadataListener, executor));
            return this;
        }

        public final zza zza(AppEventListener appEventListener, Executor executor) {
            this.zzflf.add(new zzbuv(appEventListener, executor));
            return this;
        }

        public final zza zza(@Nullable zzwf zzwf, Executor executor) {
            if (this.zzflf != null) {
                zzcsj zzcsj = new zzcsj();
                zzcsj.zzb(zzwf);
                this.zzflf.add(new zzbuv(zzcsj, executor));
            }
            return this;
        }

        public final zza zza(zztz zztz, Executor executor) {
            this.zzfkx.add(new zzbuv(zztz, executor));
            return this;
        }

        public final zza zza(zzbqu zzbqu, Executor executor) {
            this.zzfkz.add(new zzbuv(zzbqu, executor));
            return this;
        }

        public final zza zza(zzbrw zzbrw, Executor executor) {
            this.zzfla.add(new zzbuv(zzbrw, executor));
            return this;
        }

        public final zza zza(zzbsg zzbsg, Executor executor) {
            this.zzflj.add(new zzbuv(zzbsg, executor));
            return this;
        }

        public final zza zza(zzdcl zzdcl) {
            this.zzfhw = zzdcl;
            return this;
        }

        public final zzbtl zzais() {
            return new zzbtl(this);
        }
    }

    public final Set<zzbuv<zzbqh>> zzaih() {
        return this.zzfky;
    }

    public final Set<zzbuv<zzbrn>> zzaii() {
        return this.zzflb;
    }

    public final Set<zzbuv<zzbqm>> zzaij() {
        return this.zzflc;
    }

    public final Set<zzbuv<zzbqq>> zzaik() {
        return this.zzfld;
    }

    public final Set<zzbuv<AdMetadataListener>> zzail() {
        return this.zzfle;
    }

    public final Set<zzbuv<AppEventListener>> zzaim() {
        return this.zzflf;
    }

    public final Set<zzbuv<zztz>> zzain() {
        return this.zzfkx;
    }

    public final Set<zzbuv<zzbqu>> zzaio() {
        return this.zzfkz;
    }

    public final Set<zzbuv<zzbrw>> zzaip() {
        return this.zzfla;
    }

    public final Set<zzbuv<zzbsg>> zzaiq() {
        return this.zzflg;
    }

    @Nullable
    public final zzdcl zzair() {
        return this.zzfhw;
    }

    public final zzbqk zzc(Set<zzbuv<zzbqm>> set) {
        if (this.zzflh == null) {
            this.zzflh = new zzbqk(set);
        }
        return this.zzflh;
    }

    public final zzcpc zza(Clock clock) {
        if (this.zzfli == null) {
            this.zzfli = new zzcpc(clock);
        }
        return this.zzfli;
    }
}
