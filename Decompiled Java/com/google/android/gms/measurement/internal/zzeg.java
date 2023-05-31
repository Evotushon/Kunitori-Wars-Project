package com.google.android.gms.measurement.internal;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.6.0 */
public final class zzeg<V> {
    private static final Object zzf = new Object();
    private final String zza;
    private final zzee<V> zzb;
    private final V zzc;
    private final V zzd;
    private final Object zze;
    @GuardedBy("overrideLock")
    private volatile V zzg;
    @GuardedBy("cachingLock")
    private volatile V zzh;

    private zzeg(@NonNull String str, @NonNull V v, @NonNull V v2, @Nullable zzee<V> zzee) {
        this.zze = new Object();
        this.zzg = null;
        this.zzh = null;
        this.zza = str;
        this.zzc = v;
        this.zzd = v2;
        this.zzb = zzee;
    }

    public final String zza() {
        return this.zza;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x004a */
    public final V zza(@androidx.annotation.Nullable V r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.zze
            monitor-enter(r0)
            V r1 = r3.zzg     // Catch:{ all -> 0x0071 }
            monitor-exit(r0)     // Catch:{ all -> 0x0071 }
            if (r4 == 0) goto L_0x0009
            return r4
        L_0x0009:
            com.google.android.gms.measurement.internal.zzx r4 = com.google.android.gms.measurement.internal.zzeh.zza
            if (r4 != 0) goto L_0x0010
            V r4 = r3.zzc
            return r4
        L_0x0010:
            java.lang.Object r4 = zzf
            monitor-enter(r4)
            boolean r0 = com.google.android.gms.measurement.internal.zzx.zza()     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x0024
            V r0 = r3.zzh     // Catch:{ all -> 0x006e }
            if (r0 != 0) goto L_0x0020
            V r0 = r3.zzc     // Catch:{ all -> 0x006e }
            goto L_0x0022
        L_0x0020:
            V r0 = r3.zzh     // Catch:{ all -> 0x006e }
        L_0x0022:
            monitor-exit(r4)     // Catch:{ all -> 0x006e }
            return r0
        L_0x0024:
            monitor-exit(r4)     // Catch:{ all -> 0x006e }
            java.util.List r4 = com.google.android.gms.measurement.internal.zzat.zzco     // Catch:{ SecurityException -> 0x005c }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SecurityException -> 0x005c }
        L_0x002d:
            boolean r0 = r4.hasNext()     // Catch:{ SecurityException -> 0x005c }
            if (r0 == 0) goto L_0x005c
            java.lang.Object r0 = r4.next()     // Catch:{ SecurityException -> 0x005c }
            com.google.android.gms.measurement.internal.zzeg r0 = (com.google.android.gms.measurement.internal.zzeg) r0     // Catch:{ SecurityException -> 0x005c }
            boolean r1 = com.google.android.gms.measurement.internal.zzx.zza()     // Catch:{ SecurityException -> 0x005c }
            if (r1 != 0) goto L_0x0054
            r1 = 0
            com.google.android.gms.measurement.internal.zzee<V> r2 = r0.zzb     // Catch:{ IllegalStateException -> 0x004a }
            if (r2 == 0) goto L_0x004a
            com.google.android.gms.measurement.internal.zzee<V> r2 = r0.zzb     // Catch:{ IllegalStateException -> 0x004a }
            java.lang.Object r1 = r2.zza()     // Catch:{ IllegalStateException -> 0x004a }
        L_0x004a:
            java.lang.Object r2 = zzf     // Catch:{ SecurityException -> 0x005c }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x005c }
            r0.zzh = r1     // Catch:{ all -> 0x0051 }
            monitor-exit(r2)     // Catch:{ all -> 0x0051 }
            goto L_0x002d
        L_0x0051:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0051 }
            throw r4     // Catch:{ SecurityException -> 0x005c }
        L_0x0054:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ SecurityException -> 0x005c }
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch:{ SecurityException -> 0x005c }
            throw r4     // Catch:{ SecurityException -> 0x005c }
        L_0x005c:
            com.google.android.gms.measurement.internal.zzee<V> r4 = r3.zzb
            if (r4 != 0) goto L_0x0063
            V r4 = r3.zzc
            return r4
        L_0x0063:
            java.lang.Object r4 = r4.zza()     // Catch:{ SecurityException -> 0x006b, IllegalStateException -> 0x0068 }
            return r4
        L_0x0068:
            V r4 = r3.zzc
            return r4
        L_0x006b:
            V r4 = r3.zzc
            return r4
        L_0x006e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006e }
            throw r0
        L_0x0071:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0071 }
            goto L_0x0075
        L_0x0074:
            throw r4
        L_0x0075:
            goto L_0x0074
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzeg.zza(java.lang.Object):java.lang.Object");
    }
}
