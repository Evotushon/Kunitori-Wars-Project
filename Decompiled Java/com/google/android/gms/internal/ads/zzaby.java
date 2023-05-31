package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzaby extends zzaci {
    private static final int zzcwe = Color.rgb(12, 174, 206);
    private static final int zzcwf;
    private static final int zzcwg;
    private static final int zzcwh = zzcwe;
    private final int backgroundColor;
    private final int textColor;
    private final int textSize;
    private final String zzcwi;
    private final List<zzacd> zzcwj = new ArrayList();
    private final List<zzacr> zzcwk = new ArrayList();
    private final int zzcwl;
    private final int zzcwm;
    private final boolean zzcwn;

    public zzaby(String str, List<zzacd> list, Integer num, Integer num2, Integer num3, int i, int i2, boolean z) {
        this.zzcwi = str;
        if (list != null) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                zzacd zzacd = list.get(i3);
                this.zzcwj.add(zzacd);
                this.zzcwk.add(zzacd);
            }
        }
        this.backgroundColor = num != null ? num.intValue() : zzcwg;
        this.textColor = num2 != null ? num2.intValue() : zzcwh;
        this.textSize = num3 != null ? num3.intValue() : 12;
        this.zzcwl = i;
        this.zzcwm = i2;
        this.zzcwn = z;
    }

    public final String getText() {
        return this.zzcwi;
    }

    public final List<zzacr> zzrb() {
        return this.zzcwk;
    }

    public final List<zzacd> zzrc() {
        return this.zzcwj;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final int getTextSize() {
        return this.textSize;
    }

    public final int zzrd() {
        return this.zzcwl;
    }

    public final int zzre() {
        return this.zzcwm;
    }

    static {
        int rgb = Color.rgb(204, 204, 204);
        zzcwf = rgb;
        zzcwg = rgb;
    }
}
