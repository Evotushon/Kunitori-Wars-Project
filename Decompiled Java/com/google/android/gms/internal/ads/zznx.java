package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.zzoa;
import java.io.IOException;

@SuppressLint({"HandlerLeak"})
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zznx<T extends zzoa> extends zzdkp implements Runnable {
    private volatile boolean zzaee;
    private final T zzbga;
    private final zzny<T> zzbgb;
    public final int zzbgc;
    private final long zzbgd;
    private IOException zzbge;
    private int zzbgf;
    private volatile Thread zzbgg;
    private final /* synthetic */ zznv zzbgh;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zznx(zznv zznv, Looper looper, T t, zzny<T> zzny, int i, long j) {
        super(looper);
        this.zzbgh = zznv;
        this.zzbga = t;
        this.zzbgb = zzny;
        this.zzbgc = i;
        this.zzbgd = j;
    }

    public final void zzbc(int i) throws IOException {
        IOException iOException = this.zzbge;
        if (iOException != null && this.zzbgf > i) {
            throw iOException;
        }
    }

    public final void zzek(long j) {
        zzob.checkState(this.zzbgh.zzbfw == null);
        zznx unused = this.zzbgh.zzbfw = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            execute();
        }
    }

    public final void zzl(boolean z) {
        this.zzaee = z;
        this.zzbge = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            this.zzbga.cancelLoad();
            if (this.zzbgg != null) {
                this.zzbgg.interrupt();
            }
        }
        if (z) {
            finish();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzbgb.zza(this.zzbga, elapsedRealtime, elapsedRealtime - this.zzbgd, true);
        }
    }

    public final void run() {
        try {
            this.zzbgg = Thread.currentThread();
            if (!this.zzbga.zzhu()) {
                String valueOf = String.valueOf(this.zzbga.getClass().getSimpleName());
                zzoq.beginSection(valueOf.length() != 0 ? "load:".concat(valueOf) : new String("load:"));
                this.zzbga.zzhv();
                zzoq.endSection();
            }
            if (!this.zzaee) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.zzaee) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (InterruptedException unused) {
            zzob.checkState(this.zzbga.zzhu());
            if (!this.zzaee) {
                sendEmptyMessage(2);
            }
        } catch (Exception e2) {
            Log.e("LoadTask", "Unexpected exception loading stream", e2);
            if (!this.zzaee) {
                obtainMessage(3, new zznz(e2)).sendToTarget();
            }
        } catch (OutOfMemoryError e3) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e3);
            if (!this.zzaee) {
                obtainMessage(3, new zznz(e3)).sendToTarget();
            }
        } catch (Error e4) {
            Log.e("LoadTask", "Unexpected error loading stream", e4);
            if (!this.zzaee) {
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        } catch (Throwable th) {
            zzoq.endSection();
            throw th;
        }
    }

    public final void handleMessage(Message message) {
        int i;
        if (!this.zzaee) {
            if (message.what == 0) {
                execute();
            } else if (message.what != 4) {
                finish();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.zzbgd;
                if (this.zzbga.zzhu()) {
                    this.zzbgb.zza(this.zzbga, elapsedRealtime, j, false);
                    return;
                }
                int i2 = message.what;
                if (i2 == 1) {
                    this.zzbgb.zza(this.zzbga, elapsedRealtime, j, false);
                } else if (i2 == 2) {
                    this.zzbgb.zza(this.zzbga, elapsedRealtime, j);
                } else if (i2 == 3) {
                    this.zzbge = (IOException) message.obj;
                    int zza = this.zzbgb.zza(this.zzbga, elapsedRealtime, j, this.zzbge);
                    if (zza == 3) {
                        IOException unused = this.zzbgh.zzbfx = this.zzbge;
                    } else if (zza != 2) {
                        if (zza == 1) {
                            i = 1;
                        } else {
                            i = this.zzbgf + 1;
                        }
                        this.zzbgf = i;
                        zzek((long) Math.min((this.zzbgf - 1) * 1000, 5000));
                    }
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    private final void execute() {
        this.zzbge = null;
        this.zzbgh.zzbfv.execute(this.zzbgh.zzbfw);
    }

    private final void finish() {
        zznx unused = this.zzbgh.zzbfw = null;
    }
}
