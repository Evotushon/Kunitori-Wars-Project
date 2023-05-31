package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public abstract class zzdhr<E> {
    /* access modifiers changed from: private */
    public static final zzdof<?> zzgup = zzdnt.zzaj(null);
    /* access modifiers changed from: private */
    public final ScheduledExecutorService zzffm;
    /* access modifiers changed from: private */
    public final zzdoe zzfrv;
    /* access modifiers changed from: private */
    public final zzdid<E> zzguq;

    public zzdhr(zzdoe zzdoe, ScheduledExecutorService scheduledExecutorService, zzdid<E> zzdid) {
        this.zzfrv = zzdoe;
        this.zzffm = scheduledExecutorService;
        this.zzguq = zzdid;
    }

    /* access modifiers changed from: protected */
    public abstract String zzv(E e);

    public final zzdhv zzu(E e) {
        return new zzdhv(this, e);
    }

    public final <I> zzdhx<I> zza(E e, zzdof<I> zzdof) {
        return new zzdhx(this, e, (String) null, zzdof, Collections.singletonList(zzdof), zzdof, (zzdhu) null);
    }

    public final zzdht zza(E e, zzdof<?>... zzdofArr) {
        return new zzdht(this, e, Arrays.asList(zzdofArr));
    }
}
