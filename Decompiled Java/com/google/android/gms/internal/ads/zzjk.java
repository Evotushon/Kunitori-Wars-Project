package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzlh;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzjk {
    private static final zzll zzani = new zzjj();
    private static final Pattern zzanj = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zzaga = -1;
    public int zzagb = -1;

    public final boolean zzb(zzlh zzlh) {
        for (int i = 0; i < zzlh.length(); i++) {
            zzlh.zza zzas = zzlh.zzas(i);
            if (zzas instanceof zzlj) {
                zzlj zzlj = (zzlj) zzas;
                if (zzb(zzlj.description, zzlj.text)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean zzb(String str, String str2) {
        if (!"iTunSMPB".equals(str)) {
            return false;
        }
        Matcher matcher = zzanj.matcher(str2);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt(matcher.group(1), 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.zzaga = parseInt;
                    this.zzagb = parseInt2;
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    public final boolean zzgq() {
        return (this.zzaga == -1 || this.zzagb == -1) ? false : true;
    }
}
