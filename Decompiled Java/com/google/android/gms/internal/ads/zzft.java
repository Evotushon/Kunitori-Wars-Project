package com.google.android.gms.internal.ads;

import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzft {
    private static final String TAG = "zzft";
    private final String className;
    private final String zzaaf;
    private final int zzaag = 2;
    private volatile Method zzaah = null;
    private final Class<?>[] zzaai;
    private CountDownLatch zzaaj = new CountDownLatch(1);
    private final zzei zzuy;

    public zzft(zzei zzei, String str, String str2, Class<?>... clsArr) {
        this.zzuy = zzei;
        this.className = str;
        this.zzaaf = str2;
        this.zzaai = clsArr;
        this.zzuy.zzcc().submit(new zzfw(this));
    }

    /* access modifiers changed from: private */
    public final void zzcw() {
        try {
            Class loadClass = this.zzuy.zzcd().loadClass(zzb(this.zzuy.zzcf(), this.className));
            if (loadClass != null) {
                this.zzaah = loadClass.getMethod(zzb(this.zzuy.zzcf(), this.zzaaf), this.zzaai);
                if (this.zzaah == null) {
                    this.zzaaj.countDown();
                } else {
                    this.zzaaj.countDown();
                }
            }
        } catch (zzdv unused) {
        } catch (UnsupportedEncodingException unused2) {
        } catch (ClassNotFoundException unused3) {
        } catch (NoSuchMethodException unused4) {
        } catch (NullPointerException unused5) {
        } finally {
            this.zzaaj.countDown();
        }
    }

    private final String zzb(byte[] bArr, String str) throws zzdv, UnsupportedEncodingException {
        return new String(this.zzuy.zzce().zza(bArr, str), Constants.ENCODING);
    }

    public final Method zzcx() {
        if (this.zzaah != null) {
            return this.zzaah;
        }
        try {
            if (!this.zzaaj.await(2, TimeUnit.SECONDS)) {
                return null;
            }
            return this.zzaah;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
