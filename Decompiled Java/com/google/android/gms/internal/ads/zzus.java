package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public class zzus {
    /* access modifiers changed from: private */
    public final zzuf zzcdl;
    /* access modifiers changed from: private */
    public final zzuc zzcdm;
    /* access modifiers changed from: private */
    public final zzyh zzcdn;
    /* access modifiers changed from: private */
    public final zzaev zzcdo;
    /* access modifiers changed from: private */
    public final zzasf zzcdp;
    private final zzatj zzcdq;
    /* access modifiers changed from: private */
    public final zzapc zzcdr;
    /* access modifiers changed from: private */
    public final zzaeu zzcds;

    public zzus(zzuf zzuf, zzuc zzuc, zzyh zzyh, zzaev zzaev, zzasf zzasf, zzatj zzatj, zzapc zzapc, zzaeu zzaeu) {
        this.zzcdl = zzuf;
        this.zzcdm = zzuc;
        this.zzcdn = zzyh;
        this.zzcdo = zzaev;
        this.zzcdp = zzasf;
        this.zzcdq = zzatj;
        this.zzcdr = zzapc;
        this.zzcds = zzaeu;
    }

    /* access modifiers changed from: private */
    public static void zza(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzvh.zzoz().zza(context, zzvh.zzpf().zzbmj, "gmob-apps", bundle, true);
    }

    public final zzvx zza(Context context, zzuk zzuk, String str, zzalk zzalk) {
        return (zzvx) new zzuw(this, context, zzuk, str, zzalk).zzd(context, false);
    }

    public final zzvq zzb(Context context, String str, zzalk zzalk) {
        return (zzvq) new zzvb(this, context, str, zzalk).zzd(context, false);
    }

    public final zzacv zza(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzacv) new zzvd(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzacy zza(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        return (zzacy) new zzvc(this, view, hashMap, hashMap2).zzd(view.getContext(), false);
    }

    public final zzast zzc(Context context, String str, zzalk zzalk) {
        return (zzast) new zzuu(this, context, str, zzalk).zzd(context, false);
    }

    @Nullable
    public final zzapb zzb(Activity activity) {
        zzux zzux = new zzux(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            zzazh.zzey("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return (zzapb) zzux.zzd(activity, z);
    }
}
