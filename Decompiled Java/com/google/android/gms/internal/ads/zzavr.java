package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzavr {
    /* access modifiers changed from: private */
    public final Object lock = new Object();
    /* access modifiers changed from: private */
    public zzazo zzblu;
    private final zzawc zzdrf = new zzawc(zzvh.zzpe(), this.zzdro);
    private zzpq zzdrn;
    private final zzawk zzdro = new zzawk();
    /* access modifiers changed from: private */
    @Nullable
    public zzaaa zzdrp = null;
    @Nullable
    private Boolean zzdrq = null;
    private final AtomicInteger zzdrr = new AtomicInteger(0);
    private final zzavw zzdrs = new zzavw((zzavt) null);
    private final Object zzdrt = new Object();
    @GuardedBy("grantedPermissionLock")
    private zzdof<ArrayList<String>> zzdru;
    /* access modifiers changed from: private */
    public Context zzur;
    private boolean zzyb = false;

    @Nullable
    public final zzaaa zzve() {
        zzaaa zzaaa;
        synchronized (this.lock) {
            zzaaa = this.zzdrp;
        }
        return zzaaa;
    }

    public final void zza(Boolean bool) {
        synchronized (this.lock) {
            this.zzdrq = bool;
        }
    }

    public final Boolean zzvf() {
        Boolean bool;
        synchronized (this.lock) {
            bool = this.zzdrq;
        }
        return bool;
    }

    public final void zzvg() {
        this.zzdrs.zzvg();
    }

    @TargetApi(23)
    public final void zzd(Context context, zzazo zzazo) {
        synchronized (this.lock) {
            if (!this.zzyb) {
                this.zzur = context.getApplicationContext();
                this.zzblu = zzazo;
                zzq.zzky().zza(this.zzdrf);
                zzaaa zzaaa = null;
                this.zzdro.zza(this.zzur, (String) null, true);
                zzaqa.zzc(this.zzur, this.zzblu);
                this.zzdrn = new zzpq(context.getApplicationContext(), this.zzblu);
                zzq.zzle();
                if (!zzabf.zzcui.get().booleanValue()) {
                    zzawf.zzee("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                } else {
                    zzaaa = new zzaaa();
                }
                this.zzdrp = zzaaa;
                if (this.zzdrp != null) {
                    zzazu.zza(new zzavt(this).zzvw(), "AppState.registerCsiReporter");
                }
                this.zzyb = true;
                zzvl();
            }
        }
        zzq.zzkv().zzr(context, zzazo.zzbmj);
    }

    @Nullable
    public final Resources getResources() {
        if (this.zzblu.zzdxh) {
            return this.zzur.getResources();
        }
        try {
            zzazk.zzbs(this.zzur).getResources();
            return null;
        } catch (zzazm e) {
            zzawf.zzd("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public final void zza(Throwable th, String str) {
        zzaqa.zzc(this.zzur, this.zzblu).zza(th, str);
    }

    public final void zzb(Throwable th, String str) {
        zzaqa.zzc(this.zzur, this.zzblu).zza(th, str, zzabo.zzcvn.get().floatValue());
    }

    public final void zzvh() {
        this.zzdrr.incrementAndGet();
    }

    public final void zzvi() {
        this.zzdrr.decrementAndGet();
    }

    public final int zzvj() {
        return this.zzdrr.get();
    }

    public final zzawh zzvk() {
        zzawk zzawk;
        synchronized (this.lock) {
            zzawk = this.zzdro;
        }
        return zzawk;
    }

    @Nullable
    public final Context getApplicationContext() {
        return this.zzur;
    }

    public final zzdof<ArrayList<String>> zzvl() {
        if (PlatformVersion.isAtLeastJellyBean() && this.zzur != null) {
            if (!((Boolean) zzvh.zzpd().zzd(zzzx.zzclz)).booleanValue()) {
                synchronized (this.zzdrt) {
                    if (this.zzdru != null) {
                        zzdof<ArrayList<String>> zzdof = this.zzdru;
                        return zzdof;
                    }
                    zzdof<ArrayList<String>> zzd = zzazq.zzdxk.zzd(new zzavu(this));
                    this.zzdru = zzd;
                    return zzd;
                }
            }
        }
        return zzdnt.zzaj(new ArrayList());
    }

    @TargetApi(16)
    private static ArrayList<String> zzan(Context context) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(context.getApplicationInfo().packageName, 4096);
            if (!(packageInfo.requestedPermissions == null || packageInfo.requestedPermissionsFlags == null)) {
                for (int i = 0; i < packageInfo.requestedPermissions.length; i++) {
                    if ((packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(packageInfo.requestedPermissions[i]);
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final zzawc zzvm() {
        return this.zzdrf;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList zzvn() throws Exception {
        return zzan(zzars.zzac(this.zzur));
    }
}
