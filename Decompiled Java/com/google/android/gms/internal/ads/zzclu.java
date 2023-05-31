package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.internal.ads.zzsp;
import com.google.android.gms.internal.ads.zzsz;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzclu {
    private zzazo zzdjo;
    private zzcle zzgap;
    private zzsn zzgax;
    private Context zzur;

    public zzclu(Context context, zzazo zzazo, zzsn zzsn, zzcle zzcle) {
        this.zzur = context;
        this.zzdjo = zzazo;
        this.zzgax = zzsn;
        this.zzgap = zzcle;
    }

    public final void zzaob() {
        try {
            this.zzgap.zza(new zzclx(this));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            zzawf.zzey(valueOf.length() != 0 ? "Error in offline signals database startup: ".concat(valueOf) : new String("Error in offline signals database startup: "));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void zza(SQLiteDatabase sQLiteDatabase) throws Exception {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        ArrayList<zzsz.zzj.zza> zzb = zzclv.zzb(sQLiteDatabase);
        int i = 0;
        zzsz.zzj zzj = (zzsz.zzj) ((zzdyz) zzsz.zzj.zznt().zzcb(this.zzur.getPackageName()).zzcc(Build.MODEL).zzcd(zzclv.zza(sQLiteDatabase2, 0)).zzc(zzb).zzce(zzclv.zza(sQLiteDatabase2, 1)).zzes(zzq.zzlc().currentTimeMillis()).zzet(zzclv.zzb(sQLiteDatabase2, 2)).zzbcx());
        ArrayList arrayList = zzb;
        int size = arrayList.size();
        long j = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            zzsz.zzj.zza zza = (zzsz.zzj.zza) obj;
            if (zza.zznv() == zztf.ENUM_TRUE && zza.getTimestamp() > j) {
                j = zza.getTimestamp();
            }
        }
        if (j != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j));
            sQLiteDatabase2.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", (String[]) null);
        }
        this.zzgax.zza((zzsq) new zzclw(zzj));
        zztu zztu = new zztu();
        zztu.zzcba = Integer.valueOf(this.zzdjo.zzdxf);
        zztu.zzcbb = Integer.valueOf(this.zzdjo.zzdxg);
        if (!this.zzdjo.zzdxh) {
            i = 2;
        }
        zztu.zzcbc = Integer.valueOf(i);
        this.zzgax.zza((zzsq) new zzclz(zztu));
        this.zzgax.zza(zzsp.zza.C0019zza.OFFLINE_UPLOAD);
        sQLiteDatabase2.delete("offline_signal_contents", (String) null, (String[]) null);
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("value", 0);
        sQLiteDatabase2.update("offline_signal_statistics", contentValues2, "statistic_name = ?", new String[]{"failed_requests"});
        ContentValues contentValues3 = new ContentValues();
        contentValues3.put("value", 0);
        sQLiteDatabase2.update("offline_signal_statistics", contentValues3, "statistic_name = ?", new String[]{"total_requests"});
        return null;
    }
}
