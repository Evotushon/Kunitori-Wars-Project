package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzqs {
    private final int zzbqp;
    private final int zzbqq;
    private final int zzbqr;
    private final zzqp zzbqs = new zzqw();

    public zzqs(int i) {
        this.zzbqq = i;
        this.zzbqp = 6;
        this.zzbqr = 0;
    }

    public final String zza(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            sb.append(((String) obj).toLowerCase(Locale.US));
            sb.append(10);
        }
        return zzbx(sb.toString());
    }

    @VisibleForTesting
    private final String zzbx(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        zzqu zzqu = new zzqu();
        PriorityQueue priorityQueue = new PriorityQueue(this.zzbqq, new zzqr(this));
        for (String zzd : split) {
            String[] zzd2 = zzqt.zzd(zzd, false);
            if (zzd2.length != 0) {
                zzqy.zza(zzd2, this.zzbqq, this.zzbqp, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzqu.write(this.zzbqs.zzbw(((zzqx) it.next()).zzbqw));
            } catch (IOException e) {
                zzawf.zzc("Error while writing hash to byteStream", e);
            }
        }
        return zzqu.toString();
    }
}
