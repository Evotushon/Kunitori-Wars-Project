package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.instream.InstreamAd;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzahy {
    private final zzvq zzabe;
    private final Context zzur;

    public zzahy(Context context, String str) {
        this((Context) Preconditions.checkNotNull(context, "context cannot be null"), zzvh.zzpa().zzb(context, str, new zzall()));
    }

    private zzahy(Context context, zzvq zzvq) {
        this.zzur = context;
        this.zzabe = zzvq;
    }

    public final zzahy zza(InstreamAd.InstreamAdLoadCallback instreamAdLoadCallback) {
        try {
            this.zzabe.zza((zzaht) new zzahw(instreamAdLoadCallback));
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
        return this;
    }

    public final zzahy zza(zzahx zzahx) {
        try {
            this.zzabe.zza(new zzahl(zzahx));
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
        return this;
    }

    public final zzahz zzsd() {
        try {
            return new zzahz(this.zzur, this.zzabe.zzpi());
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
            return null;
        }
    }
}
