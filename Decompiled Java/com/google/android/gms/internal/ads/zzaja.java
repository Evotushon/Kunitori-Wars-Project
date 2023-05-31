package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzq;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaja {
    /* access modifiers changed from: private */
    public final Object lock;
    /* access modifiers changed from: private */
    public int status;
    private final zzazo zzblu;
    private final String zzdal;
    /* access modifiers changed from: private */
    public zzaxu<zzair> zzdam;
    private zzaxu<zzair> zzdan;
    /* access modifiers changed from: private */
    @Nullable
    public zzajv zzdao;
    private final Context zzur;

    public zzaja(Context context, zzazo zzazo, String str) {
        this.lock = new Object();
        this.status = 1;
        this.zzdal = str;
        this.zzur = context.getApplicationContext();
        this.zzblu = zzazo;
        this.zzdam = new zzajo();
        this.zzdan = new zzajo();
    }

    public zzaja(Context context, zzazo zzazo, String str, zzaxu<zzair> zzaxu, zzaxu<zzair> zzaxu2) {
        this(context, zzazo, str);
        this.zzdam = zzaxu;
        this.zzdan = zzaxu2;
    }

    /* access modifiers changed from: protected */
    public final zzajv zza(@Nullable zzdq zzdq) {
        zzajv zzajv = new zzajv(this.zzdan);
        zzazq.zzdxo.execute(new zzajd(this, zzdq, zzajv));
        zzajv.zza(new zzajn(this, zzajv), new zzajm(this, zzajv));
        return zzajv;
    }

    public final zzajr zzb(@Nullable zzdq zzdq) {
        synchronized (this.lock) {
            synchronized (this.lock) {
                if (this.zzdao != null && this.status == 0) {
                    this.zzdao.zza(new zzajc(this), zzajf.zzdau);
                }
            }
            if (this.zzdao != null) {
                if (this.zzdao.getStatus() != -1) {
                    if (this.status == 0) {
                        zzajr zzsh = this.zzdao.zzsh();
                        return zzsh;
                    } else if (this.status == 1) {
                        this.status = 2;
                        zza((zzdq) null);
                        zzajr zzsh2 = this.zzdao.zzsh();
                        return zzsh2;
                    } else if (this.status == 2) {
                        zzajr zzsh3 = this.zzdao.zzsh();
                        return zzsh3;
                    } else {
                        zzajr zzsh4 = this.zzdao.zzsh();
                        return zzsh4;
                    }
                }
            }
            this.status = 2;
            this.zzdao = zza((zzdq) null);
            zzajr zzsh5 = this.zzdao.zzsh();
            return zzsh5;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzair zzair) {
        if (zzair.isDestroyed()) {
            this.status = 1;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzdq zzdq, zzajv zzajv) {
        zzair zzair;
        try {
            Context context = this.zzur;
            zzazo zzazo = this.zzblu;
            if (zzabu.zzcwa.get().booleanValue()) {
                zzair = new zzaid(context, zzazo);
            } else {
                zzair = new zzait(context, zzazo, zzdq, (zza) null);
            }
            zzair.zza(new zzaje(this, zzajv, zzair));
            zzair.zza("/jsLoaded", new zzajj(this, zzajv, zzair));
            zzayq zzayq = new zzayq();
            zzaji zzaji = new zzaji(this, zzdq, zzair, zzayq);
            zzayq.set(zzaji);
            zzair.zza("/requestReload", zzaji);
            if (this.zzdal.endsWith(".js")) {
                zzair.zzcw(this.zzdal);
            } else if (this.zzdal.startsWith("<html>")) {
                zzair.zzcx(this.zzdal);
            } else {
                zzair.zzcy(this.zzdal);
            }
            zzawo.zzdtx.postDelayed(new zzajl(this, zzajv, zzair), (long) zzajp.zzdbc);
        } catch (Throwable th) {
            zzawf.zzc("Error creating webview.", th);
            zzq.zzkz().zza(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzajv.reject();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzajv r4, com.google.android.gms.internal.ads.zzair r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            int r1 = r4.getStatus()     // Catch:{ all -> 0x002a }
            r2 = -1
            if (r1 == r2) goto L_0x0028
            int r1 = r4.getStatus()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != r2) goto L_0x0012
            goto L_0x0028
        L_0x0012:
            r4.reject()     // Catch:{ all -> 0x002a }
            com.google.android.gms.internal.ads.zzdoe r4 = com.google.android.gms.internal.ads.zzazq.zzdxo     // Catch:{ all -> 0x002a }
            r5.getClass()     // Catch:{ all -> 0x002a }
            java.lang.Runnable r5 = com.google.android.gms.internal.ads.zzajg.zzb(r5)     // Catch:{ all -> 0x002a }
            r4.execute(r5)     // Catch:{ all -> 0x002a }
            java.lang.String r4 = "Could not receive loaded message in a timely manner. Rejecting."
            com.google.android.gms.internal.ads.zzawf.zzee(r4)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaja.zza(com.google.android.gms.internal.ads.zzajv, com.google.android.gms.internal.ads.zzair):void");
    }
}
