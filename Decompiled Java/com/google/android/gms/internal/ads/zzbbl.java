package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzq;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbbl {
    private final zzazo zzdjo;
    private final String zzdkd;
    @Nullable
    private final zzaak zzdzc;
    private boolean zzdzg;
    @Nullable
    private final zzaai zzebu;
    private final zzaxt zzebv = new zzaxy().zza("min_1", Double.MIN_VALUE, 1.0d).zza("1_5", 1.0d, 5.0d).zza("5_10", 5.0d, 10.0d).zza("10_20", 10.0d, 20.0d).zza("20_30", 20.0d, 30.0d).zza("30_max", 30.0d, Double.MAX_VALUE).zzxf();
    private final long[] zzebw;
    private final String[] zzebx;
    private boolean zzeby = false;
    private boolean zzebz = false;
    private boolean zzeca = false;
    private boolean zzecb = false;
    private zzbat zzecc;
    private boolean zzecd;
    private boolean zzece;
    private long zzecf = -1;
    private final Context zzur;

    public zzbbl(Context context, zzazo zzazo, String str, @Nullable zzaak zzaak, @Nullable zzaai zzaai) {
        this.zzur = context;
        this.zzdjo = zzazo;
        this.zzdkd = str;
        this.zzdzc = zzaak;
        this.zzebu = zzaai;
        String str2 = (String) zzvh.zzpd().zzd(zzzx.zzcht);
        if (str2 == null) {
            this.zzebx = new String[0];
            this.zzebw = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        this.zzebx = new String[split.length];
        this.zzebw = new long[split.length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.zzebw[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                zzawf.zzd("Unable to parse frame hash target time number.", e);
                this.zzebw[i] = -1;
            }
        }
    }

    public final void zzb(zzbat zzbat) {
        zzaaf.zza(this.zzdzc, this.zzebu, "vpc2");
        this.zzeby = true;
        zzaak zzaak = this.zzdzc;
        if (zzaak != null) {
            zzaak.zzh("vpn", zzbat.zzxt());
        }
        this.zzecc = zzbat;
    }

    public final void zzew() {
        if (this.zzeby && !this.zzebz) {
            zzaaf.zza(this.zzdzc, this.zzebu, "vfr2");
            this.zzebz = true;
        }
    }

    public final void onStop() {
        if (zzabv.zzcwb.get().booleanValue() && !this.zzecd) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.zzdkd);
            bundle.putString("player", this.zzecc.zzxt());
            for (zzaxv next : this.zzebv.zzxe()) {
                String valueOf = String.valueOf(next.name);
                bundle.putString(valueOf.length() != 0 ? "fps_c_".concat(valueOf) : new String("fps_c_"), Integer.toString(next.count));
                String valueOf2 = String.valueOf(next.name);
                bundle.putString(valueOf2.length() != 0 ? "fps_p_".concat(valueOf2) : new String("fps_p_"), Double.toString(next.zzdvf));
            }
            int i = 0;
            while (true) {
                long[] jArr = this.zzebw;
                if (i < jArr.length) {
                    String str = this.zzebx[i];
                    if (str != null) {
                        String valueOf3 = String.valueOf(Long.valueOf(jArr[i]));
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 3);
                        sb.append("fh_");
                        sb.append(valueOf3);
                        bundle.putString(sb.toString(), str);
                    }
                    i++;
                } else {
                    zzq.zzkv().zza(this.zzur, this.zzdjo.zzbmj, "gmob-apps", bundle, true);
                    this.zzecd = true;
                    return;
                }
            }
        }
    }

    public final void zzc(zzbat zzbat) {
        if (this.zzeca && !this.zzecb) {
            if (zzawf.zzvx() && !this.zzecb) {
                zzawf.zzee("VideoMetricsMixin first frame");
            }
            zzaaf.zza(this.zzdzc, this.zzebu, "vff2");
            this.zzecb = true;
        }
        long nanoTime = zzq.zzlc().nanoTime();
        if (this.zzdzg && this.zzece && this.zzecf != -1) {
            double nanos = (double) TimeUnit.SECONDS.toNanos(1);
            double d = (double) (nanoTime - this.zzecf);
            Double.isNaN(nanos);
            Double.isNaN(d);
            this.zzebv.zza(nanos / d);
        }
        this.zzece = this.zzdzg;
        this.zzecf = nanoTime;
        long longValue = ((Long) zzvh.zzpd().zzd(zzzx.zzchu)).longValue();
        long currentPosition = (long) zzbat.getCurrentPosition();
        int i = 0;
        while (true) {
            String[] strArr = this.zzebx;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i] != null || longValue <= Math.abs(currentPosition - this.zzebw[i])) {
                zzbat zzbat2 = zzbat;
                i++;
            } else {
                String[] strArr2 = this.zzebx;
                int i2 = 8;
                Bitmap bitmap = zzbat.getBitmap(8, 8);
                long j = 63;
                int i3 = 0;
                long j2 = 0;
                while (i3 < i2) {
                    long j3 = j;
                    long j4 = j2;
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j4 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1 : 0) << ((int) j3);
                        i4++;
                        j3--;
                        i2 = 8;
                    }
                    i3++;
                    j2 = j4;
                    i2 = 8;
                    j = j3;
                }
                strArr2[i] = String.format("%016X", new Object[]{Long.valueOf(j2)});
                return;
            }
        }
    }

    public final void zzyn() {
        this.zzdzg = true;
        if (this.zzebz && !this.zzeca) {
            zzaaf.zza(this.zzdzc, this.zzebu, "vfp2");
            this.zzeca = true;
        }
    }

    public final void zzyo() {
        this.zzdzg = false;
    }
}
