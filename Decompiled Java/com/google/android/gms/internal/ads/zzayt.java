package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzayt {
    @GuardedBy("this")
    private final BroadcastReceiver zzdwf = new zzayw(this);
    @GuardedBy("this")
    private final Map<BroadcastReceiver, IntentFilter> zzdwg = new WeakHashMap();
    private boolean zzdwh;
    private boolean zzyb = false;
    private Context zzyz;

    public final synchronized void initialize(Context context) {
        if (!this.zzyb) {
            this.zzyz = context.getApplicationContext();
            if (this.zzyz == null) {
                this.zzyz = context;
            }
            zzzx.initialize(this.zzyz);
            this.zzdwh = ((Boolean) zzvh.zzpd().zzd(zzzx.zzcnc)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.zzyz.registerReceiver(this.zzdwf, intentFilter);
            this.zzyb = true;
        }
    }

    public final synchronized void zza(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.zzdwh) {
            this.zzdwg.put(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public final synchronized void zza(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.zzdwh) {
            this.zzdwg.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    /* access modifiers changed from: private */
    public final synchronized void zzc(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.zzdwg.entrySet()) {
            if (((IntentFilter) next.getValue()).hasAction(intent.getAction())) {
                arrayList.add((BroadcastReceiver) next.getKey());
            }
        }
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ((BroadcastReceiver) obj).onReceive(context, intent);
        }
    }
}
