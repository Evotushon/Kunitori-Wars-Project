package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzaxz implements zzy {
    private final /* synthetic */ String zzdvm;
    private final /* synthetic */ zzaye zzdvn;

    zzaxz(zzaxx zzaxx, String str, zzaye zzaye) {
        this.zzdvm = str;
        this.zzdvn = zzaye;
    }

    public final void zzc(zzae zzae) {
        String str = this.zzdvm;
        String zzae2 = zzae.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(zzae2).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(zzae2);
        zzawf.zzfa(sb.toString());
        this.zzdvn.zzb(null);
    }
}
