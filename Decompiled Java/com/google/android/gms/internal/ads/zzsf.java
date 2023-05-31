package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzq;
import java.io.InputStream;
import java.util.concurrent.Future;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzsf {
    /* access modifiers changed from: private */
    public final Object lock = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("lock")
    @Nullable
    public zzsa zzbrm;
    /* access modifiers changed from: private */
    @GuardedBy("lock")
    public boolean zzbrz;
    private final Context zzur;

    zzsf(Context context) {
        this.zzur = context;
    }

    /* access modifiers changed from: package-private */
    public final Future<InputStream> zzb(zzrz zzrz) {
        zzsi zzsi = new zzsi(this);
        zzsh zzsh = new zzsh(this, zzrz, zzsi);
        zzsl zzsl = new zzsl(this, zzsi);
        synchronized (this.lock) {
            this.zzbrm = new zzsa(this.zzur, zzq.zzlj().zzxg(), zzsh, zzsl);
            this.zzbrm.checkAvailabilityAndConnect();
        }
        return zzsi;
    }

    /* access modifiers changed from: private */
    public final void disconnect() {
        synchronized (this.lock) {
            if (this.zzbrm != null) {
                this.zzbrm.disconnect();
                this.zzbrm = null;
                Binder.flushPendingCommands();
            }
        }
    }
}
