package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzect;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzect<M extends zzect<M>> extends zzeda {
    protected zzecv zzhzu;

    /* access modifiers changed from: protected */
    public int zzon() {
        if (this.zzhzu != null) {
            for (int i = 0; i < this.zzhzu.size(); i++) {
                this.zzhzu.zzhd(i).zzon();
            }
        }
        return 0;
    }

    public void zza(zzecr zzecr) throws IOException {
        if (this.zzhzu != null) {
            for (int i = 0; i < this.zzhzu.size(); i++) {
                this.zzhzu.zzhd(i).zza(zzecr);
            }
        }
    }

    public final /* synthetic */ zzeda zzbfq() throws CloneNotSupportedException {
        return (zzect) clone();
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzect zzect = (zzect) super.clone();
        zzecx.zza(this, zzect);
        return zzect;
    }
}
