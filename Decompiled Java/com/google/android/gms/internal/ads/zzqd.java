package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzqd {
    private final Object lock = new Object();
    private int score;
    private final int zzbos;
    private final int zzbot;
    private final int zzbou;
    private final boolean zzbov;
    private final zzqs zzbow;
    private final zzqz zzbox;
    private ArrayList<String> zzboy = new ArrayList<>();
    private ArrayList<String> zzboz = new ArrayList<>();
    private ArrayList<zzqq> zzbpa = new ArrayList<>();
    private int zzbpb = 0;
    private int zzbpc = 0;
    private int zzbpd = 0;
    private String zzbpe = "";
    private String zzbpf = "";
    private String zzbpg = "";

    public zzqd(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.zzbos = i;
        this.zzbot = i2;
        this.zzbou = i3;
        this.zzbov = z;
        this.zzbow = new zzqs(i4);
        this.zzbox = new zzqz(i5, i6, i7);
    }

    public final boolean zzlw() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzbpd == 0;
        }
        return z;
    }

    public final String zzlx() {
        return this.zzbpe;
    }

    public final String zzly() {
        return this.zzbpf;
    }

    public final String zzlz() {
        return this.zzbpg;
    }

    public final void zzma() {
        synchronized (this.lock) {
            this.score -= 100;
        }
    }

    public final void zzmb() {
        synchronized (this.lock) {
            this.zzbpd--;
        }
    }

    public final void zzmc() {
        synchronized (this.lock) {
            this.zzbpd++;
        }
    }

    public final void zza(String str, boolean z, float f, float f2, float f3, float f4) {
        zzc(str, z, f, f2, f3, f4);
        synchronized (this.lock) {
            if (this.zzbpd < 0) {
                zzawf.zzeb("ActivityContent: negative number of WebViews.");
            }
            zzme();
        }
    }

    public final void zzb(String str, boolean z, float f, float f2, float f3, float f4) {
        zzc(str, z, f, f2, f3, f4);
    }

    private final void zzc(@Nullable String str, boolean z, float f, float f2, float f3, float f4) {
        if (str != null && str.length() >= this.zzbou) {
            synchronized (this.lock) {
                this.zzboy.add(str);
                this.zzbpb += str.length();
                if (z) {
                    this.zzboz.add(str);
                    this.zzbpa.add(new zzqq(f, f2, f3, f4, this.zzboz.size() - 1));
                }
            }
        }
    }

    public final void zzmd() {
        synchronized (this.lock) {
            int zzh = zzh(this.zzbpb, this.zzbpc);
            if (zzh > this.score) {
                this.score = zzh;
            }
        }
    }

    public final void zzme() {
        synchronized (this.lock) {
            int zzh = zzh(this.zzbpb, this.zzbpc);
            if (zzh > this.score) {
                this.score = zzh;
                if (!zzq.zzkz().zzvk().zzvz()) {
                    this.zzbpe = this.zzbow.zza(this.zzboy);
                    this.zzbpf = this.zzbow.zza(this.zzboz);
                }
                if (!zzq.zzkz().zzvk().zzwb()) {
                    this.zzbpg = this.zzbox.zza(this.zzboz, this.zzbpa);
                }
            }
        }
    }

    @VisibleForTesting
    private final int zzh(int i, int i2) {
        if (this.zzbov) {
            return this.zzbot;
        }
        return (i * this.zzbos) + (i2 * this.zzbot);
    }

    public final int getScore() {
        return this.score;
    }

    public final void zzbp(int i) {
        this.zzbpc = i;
    }

    private static String zza(ArrayList<String> arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            sb.append((String) obj);
            sb.append(' ');
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        if (sb2.length() < 100) {
            return sb2;
        }
        return sb2.substring(0, 100);
    }

    public final String toString() {
        int i = this.zzbpc;
        int i2 = this.score;
        int i3 = this.zzbpb;
        String zza = zza(this.zzboy, 100);
        String zza2 = zza(this.zzboz, 100);
        String str = this.zzbpe;
        String str2 = this.zzbpf;
        String str3 = this.zzbpg;
        StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 165 + String.valueOf(zza2).length() + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("ActivityContent fetchId: ");
        sb.append(i);
        sb.append(" score:");
        sb.append(i2);
        sb.append(" total_length:");
        sb.append(i3);
        sb.append("\n text: ");
        sb.append(zza);
        sb.append("\n viewableText");
        sb.append(zza2);
        sb.append("\n signture: ");
        sb.append(str);
        sb.append("\n viewableSignture: ");
        sb.append(str2);
        sb.append("\n viewableSignatureForVertical: ");
        sb.append(str3);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final int zzmf() {
        return this.zzbpb;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqd)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((zzqd) obj).zzbpe;
        return str != null && str.equals(this.zzbpe);
    }

    public final int hashCode() {
        return this.zzbpe.hashCode();
    }
}
