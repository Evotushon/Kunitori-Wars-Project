package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbkb implements zzp, zzbqt, zzbqu, zzpt {
    private final Clock zzbmz;
    private final zzbjs zzfek;
    private final zzbjz zzfel;
    private final Set<zzbdv> zzfem = new HashSet();
    private final zzakw<JSONObject, JSONObject> zzfen;
    private final Executor zzfeo;
    private final AtomicBoolean zzfep = new AtomicBoolean(false);
    @GuardedBy("this")
    private final zzbkd zzfeq = new zzbkd();
    private boolean zzfer = false;
    private WeakReference<?> zzfes = new WeakReference<>(this);

    public zzbkb(zzakt zzakt, zzbjz zzbjz, Executor executor, zzbjs zzbjs, Clock clock) {
        this.zzfek = zzbjs;
        this.zzfen = zzakt.zzb("google.afma.activeView.handleUpdate", zzakj.zzdbu, zzakj.zzdbu);
        this.zzfel = zzbjz;
        this.zzfeo = executor;
        this.zzbmz = clock;
    }

    public final void zztj() {
    }

    public final void zztk() {
    }

    public final synchronized void zzafw() {
        if (!(this.zzfes.get() != null)) {
            zzafy();
        } else if (!this.zzfer && this.zzfep.get()) {
            try {
                this.zzfeq.timestamp = this.zzbmz.elapsedRealtime();
                JSONObject zza = this.zzfel.zzj(this.zzfeq);
                for (zzbdv zzbka : this.zzfem) {
                    this.zzfeo.execute(new zzbka(zzbka, zza));
                }
                zzazu.zzb(this.zzfen.zzf(zza), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e) {
                zzawf.zza("Failed to call ActiveViewJS", e);
            }
        }
    }

    private final void zzafx() {
        for (zzbdv zze : this.zzfem) {
            this.zzfek.zze(zze);
        }
        this.zzfek.zzafv();
    }

    public final synchronized void zzafy() {
        zzafx();
        this.zzfer = true;
    }

    public final synchronized void zzf(zzbdv zzbdv) {
        this.zzfem.add(zzbdv);
        this.zzfek.zzd(zzbdv);
    }

    public final void zzo(Object obj) {
        this.zzfes = new WeakReference<>(obj);
    }

    public final synchronized void zza(zzpu zzpu) {
        this.zzfeq.zzbnz = zzpu.zzbnz;
        this.zzfeq.zzffb = zzpu;
        zzafw();
    }

    public final synchronized void zzby(@Nullable Context context) {
        this.zzfeq.zzfey = true;
        zzafw();
    }

    public final synchronized void zzbz(@Nullable Context context) {
        this.zzfeq.zzfey = false;
        zzafw();
    }

    public final synchronized void zzca(@Nullable Context context) {
        this.zzfeq.zzffa = "u";
        zzafw();
        zzafx();
        this.zzfer = true;
    }

    public final synchronized void onPause() {
        this.zzfeq.zzfey = true;
        zzafw();
    }

    public final synchronized void onResume() {
        this.zzfeq.zzfey = false;
        zzafw();
    }

    public final synchronized void onAdImpression() {
        if (this.zzfep.compareAndSet(false, true)) {
            this.zzfek.zza(this);
            zzafw();
        }
    }
}
