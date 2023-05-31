package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcty implements zzcye<zzctv> {
    private final zzavr zzbmv;
    private final zzdeu zzfir;
    private final zzcye<zzcyh> zzgia;
    private final Context zzur;

    public zzcty(zzcvg<zzcyh> zzcvg, zzdeu zzdeu, Context context, zzavr zzavr) {
        this.zzgia = zzcvg;
        this.zzfir = zzdeu;
        this.zzur = context;
        this.zzbmv = zzavr;
    }

    public final zzdof<zzctv> zzapb() {
        return zzdnt.zzb(this.zzgia.zzapb(), new zzctx(this), (Executor) zzazq.zzdxp);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzctv zza(zzcyh zzcyh) {
        boolean z;
        String str;
        int i;
        int i2;
        float f;
        String str2;
        int i3;
        int i4;
        int i5;
        DisplayMetrics displayMetrics;
        zzuk zzuk = this.zzfir.zzblv;
        if (zzuk.zzcdd != null) {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (zzuk zzuk2 : zzuk.zzcdd) {
                if (!zzuk2.zzcde && !z2) {
                    str = zzuk2.zzabk;
                    z2 = true;
                }
                if (zzuk2.zzcde && !z3) {
                    z3 = true;
                    z = true;
                }
                if (z2 && z3) {
                    break;
                }
            }
        } else {
            str = zzuk.zzabk;
            z = zzuk.zzcde;
        }
        Resources resources = this.zzur.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f = 0.0f;
            i2 = 0;
            i = 0;
        } else {
            float f2 = displayMetrics.density;
            int i6 = displayMetrics.widthPixels;
            i = displayMetrics.heightPixels;
            str2 = this.zzbmv.zzvk().zzwl();
            i2 = i6;
            f = f2;
        }
        StringBuilder sb = new StringBuilder();
        if (zzuk.zzcdd != null) {
            boolean z4 = false;
            for (zzuk zzuk3 : zzuk.zzcdd) {
                if (zzuk3.zzcde) {
                    z4 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    if (zzuk3.width != -1 || f == 0.0f) {
                        i4 = zzuk3.width;
                    } else {
                        i4 = (int) (((float) zzuk3.widthPixels) / f);
                    }
                    sb.append(i4);
                    sb.append("x");
                    if (zzuk3.height == -2) {
                        if (f != 0.0f) {
                            i5 = (int) (((float) zzuk3.heightPixels) / f);
                            sb.append(i5);
                        }
                    }
                    i5 = zzuk3.height;
                    sb.append(i5);
                }
            }
            if (z4) {
                if (sb.length() != 0) {
                    i3 = 0;
                    sb.insert(0, "|");
                } else {
                    i3 = 0;
                }
                sb.insert(i3, "320x50");
            }
        }
        return new zzctv(zzuk, str, z, sb.toString(), f, i2, i, str2);
    }
}
