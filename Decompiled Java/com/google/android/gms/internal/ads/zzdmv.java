package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
abstract class zzdmv<I, O, F, T> extends zzdnn<O> implements Runnable {
    @NullableDecl
    private zzdof<? extends I> zzhbj;
    @NullableDecl
    private F zzhca;

    static <I, O> zzdof<O> zza(zzdof<I> zzdof, zzdng<? super I, ? extends O> zzdng, Executor executor) {
        zzdlg.checkNotNull(executor);
        zzdmy zzdmy = new zzdmy(zzdof, zzdng);
        zzdof.addListener(zzdmy, zzdoh.zza(executor, zzdmy));
        return zzdmy;
    }

    /* access modifiers changed from: package-private */
    public abstract void setResult(@NullableDecl T t);

    /* access modifiers changed from: package-private */
    @NullableDecl
    public abstract T zzc(F f, @NullableDecl I i) throws Exception;

    static <I, O> zzdof<O> zza(zzdof<I> zzdof, zzdku<? super I, ? extends O> zzdku, Executor executor) {
        zzdlg.checkNotNull(zzdku);
        zzdmx zzdmx = new zzdmx(zzdof, zzdku);
        zzdof.addListener(zzdmx, zzdoh.zza(executor, zzdmx));
        return zzdmx;
    }

    zzdmv(zzdof<? extends I> zzdof, F f) {
        this.zzhbj = (zzdof) zzdlg.checkNotNull(zzdof);
        this.zzhca = zzdlg.checkNotNull(f);
    }

    public final void run() {
        zzdof<? extends I> zzdof = this.zzhbj;
        F f = this.zzhca;
        boolean z = true;
        boolean isCancelled = isCancelled() | (zzdof == null);
        if (f != null) {
            z = false;
        }
        if (!isCancelled && !z) {
            this.zzhbj = null;
            if (zzdof.isCancelled()) {
                setFuture(zzdof);
                return;
            }
            try {
                try {
                    Object zzc = zzc(f, zzdnt.zza(zzdof));
                    this.zzhca = null;
                    setResult(zzc);
                } catch (Throwable th) {
                    this.zzhca = null;
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e) {
                setException(e.getCause());
            } catch (RuntimeException e2) {
                setException(e2);
            } catch (Error e3) {
                setException(e3);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void afterDone() {
        maybePropagateCancellationTo(this.zzhbj);
        this.zzhbj = null;
        this.zzhca = null;
    }

    /* access modifiers changed from: protected */
    public final String pendingToString() {
        String str;
        zzdof<? extends I> zzdof = this.zzhbj;
        F f = this.zzhca;
        String pendingToString = super.pendingToString();
        if (zzdof != null) {
            String valueOf = String.valueOf(zzdof);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (f != null) {
            String valueOf2 = String.valueOf(f);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(valueOf2).length());
            sb2.append(str);
            sb2.append("function=[");
            sb2.append(valueOf2);
            sb2.append("]");
            return sb2.toString();
        } else if (pendingToString == null) {
            return null;
        } else {
            String valueOf3 = String.valueOf(str);
            String valueOf4 = String.valueOf(pendingToString);
            return valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
        }
    }
}
