package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.internal.ads.zzsz;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzclt implements zzdhq {
    private final boolean zzdzs;
    private final zzclq zzgat;
    private final ArrayList zzgau;
    private final zzsz.zzh zzgav;
    private final zzsz.zzj.zzc zzgaw;

    zzclt(zzclq zzclq, boolean z, ArrayList arrayList, zzsz.zzh zzh, zzsz.zzj.zzc zzc) {
        this.zzgat = zzclq;
        this.zzdzs = z;
        this.zzgau = arrayList;
        this.zzgav = zzh;
        this.zzgaw = zzc;
    }

    public final Object apply(Object obj) {
        zzclq zzclq = this.zzgat;
        boolean z = this.zzdzs;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        byte[] zza = zzclq.zzgan.zza(z, this.zzgau, this.zzgav, this.zzgaw);
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzq.zzlc().currentTimeMillis()));
        contentValues.put("serialized_proto_data", zza);
        sQLiteDatabase.insert("offline_signal_contents", (String) null, contentValues);
        sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", new Object[]{"total_requests"}));
        if (!z) {
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", new Object[]{"failed_requests"}));
        }
        return null;
    }
}
