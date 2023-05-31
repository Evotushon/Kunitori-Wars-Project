package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzatw implements zzdnu<Void> {
    private final /* synthetic */ zzdof zzdpw;

    zzatw(zzats zzats, zzdof zzdof) {
        this.zzdpw = zzdof;
    }

    public final void zzb(Throwable th) {
        zzats.zzdpi.remove(this.zzdpw);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        Void voidR = (Void) obj;
        zzats.zzdpi.remove(this.zzdpw);
    }
}
