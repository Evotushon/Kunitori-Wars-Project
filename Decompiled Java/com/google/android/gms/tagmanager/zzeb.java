package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@VisibleForTesting
final class zzeb implements zzcb {
    /* access modifiers changed from: private */
    public static final String zzxj = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL,'%s' INTEGER NOT NULL);", new Object[]{"gtm_hits", "hit_id", "hit_time", "hit_url", "hit_first_send_time"});
    private final zzed zzaie;
    private volatile zzbe zzaif;
    private final zzcc zzaig;
    /* access modifiers changed from: private */
    public final String zzaih;
    private long zzaii;
    private final int zzaij;
    /* access modifiers changed from: private */
    public final Context zzrm;
    /* access modifiers changed from: private */
    public Clock zzsd;

    zzeb(zzcc zzcc, Context context) {
        this(zzcc, context, "gtm_urls.db", 2000);
    }

    @VisibleForTesting
    private zzeb(zzcc zzcc, Context context, String str, int i) {
        this.zzrm = context.getApplicationContext();
        this.zzaih = str;
        this.zzaig = zzcc;
        this.zzsd = DefaultClock.getInstance();
        this.zzaie = new zzed(this, this.zzrm, this.zzaih);
        this.zzaif = new zzfu(this.zzrm, new zzec(this));
        this.zzaii = 0;
        this.zzaij = 2000;
    }

    public final void zzb(long j, String str) {
        long currentTimeMillis = this.zzsd.currentTimeMillis();
        if (currentTimeMillis > this.zzaii + 86400000) {
            this.zzaii = currentTimeMillis;
            SQLiteDatabase zzau = zzau("Error opening database for deleteStaleHits.");
            if (zzau != null) {
                zzau.delete("gtm_hits", "HIT_TIME < ?", new String[]{Long.toString(this.zzsd.currentTimeMillis() - 2592000000L)});
                this.zzaig.zze(zziv() == 0);
            }
        }
        int zziv = (zziv() - this.zzaij) + 1;
        if (zziv > 0) {
            List<String> zzz = zzz(zziv);
            int size = zzz.size();
            StringBuilder sb = new StringBuilder(51);
            sb.append("Store full, deleting ");
            sb.append(size);
            sb.append(" hits to make room.");
            zzdi.zzab(sb.toString());
            zza((String[]) zzz.toArray(new String[0]));
        }
        SQLiteDatabase zzau2 = zzau("Error opening database for putHit");
        if (zzau2 != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("hit_time", Long.valueOf(j));
            contentValues.put("hit_url", str);
            contentValues.put("hit_first_send_time", 0);
            try {
                zzau2.insert("gtm_hits", (String) null, contentValues);
                this.zzaig.zze(false);
            } catch (SQLiteException unused) {
                zzdi.zzac("Error storing hit");
            }
        }
    }

    private final List<String> zzz(int i) {
        ArrayList arrayList = new ArrayList();
        if (i <= 0) {
            zzdi.zzac("Invalid maxHits specified. Skipping");
            return arrayList;
        }
        SQLiteDatabase zzau = zzau("Error opening database for peekHitIds.");
        if (zzau == null) {
            return arrayList;
        }
        Cursor cursor = null;
        try {
            Cursor query = zzau.query("gtm_hits", new String[]{"hit_id"}, (String) null, (String[]) null, (String) null, (String) null, String.format("%s ASC", new Object[]{"hit_id"}), Integer.toString(i));
            if (query.moveToFirst()) {
                do {
                    arrayList.add(String.valueOf(query.getLong(0)));
                } while (query.moveToNext());
            }
            if (query != null) {
                query.close();
            }
        } catch (SQLiteException e) {
            String valueOf = String.valueOf(e.getMessage());
            zzdi.zzac(valueOf.length() != 0 ? "Error in peekHits fetching hitIds: ".concat(valueOf) : new String("Error in peekHits fetching hitIds: "));
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x013f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0140, code lost:
        r14 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0143, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fa A[Catch:{ all -> 0x0135 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ff A[Catch:{ all -> 0x0135 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0116 A[Catch:{ all -> 0x0135 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x013f A[ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x003a] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x015c A[Catch:{ all -> 0x016f }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0161 A[Catch:{ all -> 0x016f }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0172  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<com.google.android.gms.tagmanager.zzbw> zzaa(int r19) {
        /*
            r18 = this;
            java.lang.String r0 = "%s ASC"
            java.lang.String r1 = "hit_id"
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r3 = "Error opening database for peekHits"
            r4 = r18
            android.database.sqlite.SQLiteDatabase r3 = r4.zzau(r3)
            if (r3 != 0) goto L_0x0014
            return r2
        L_0x0014:
            java.lang.String r6 = "gtm_hits"
            java.lang.String r5 = "hit_time"
            java.lang.String r7 = "hit_first_send_time"
            java.lang.String[] r7 = new java.lang.String[]{r1, r5, r7}     // Catch:{ SQLiteException -> 0x014a, all -> 0x0147 }
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r15 = 1
            java.lang.Object[] r5 = new java.lang.Object[r15]     // Catch:{ SQLiteException -> 0x014a, all -> 0x0147 }
            r13 = 0
            r5[r13] = r1     // Catch:{ SQLiteException -> 0x014a, all -> 0x0147 }
            java.lang.String r12 = java.lang.String.format(r0, r5)     // Catch:{ SQLiteException -> 0x014a, all -> 0x0147 }
            r16 = 40
            java.lang.String r17 = java.lang.Integer.toString(r16)     // Catch:{ SQLiteException -> 0x014a, all -> 0x0147 }
            r5 = r3
            r14 = 0
            r13 = r17
            android.database.Cursor r13 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ SQLiteException -> 0x014a, all -> 0x0147 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0143, all -> 0x013f }
            r12.<init>()     // Catch:{ SQLiteException -> 0x0143, all -> 0x013f }
            boolean r2 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x013c, all -> 0x013f }
            if (r2 == 0) goto L_0x006b
        L_0x0045:
            com.google.android.gms.tagmanager.zzbw r2 = new com.google.android.gms.tagmanager.zzbw     // Catch:{ SQLiteException -> 0x0066, all -> 0x0062 }
            long r6 = r13.getLong(r14)     // Catch:{ SQLiteException -> 0x0066, all -> 0x0062 }
            long r8 = r13.getLong(r15)     // Catch:{ SQLiteException -> 0x0066, all -> 0x0062 }
            r5 = 2
            long r10 = r13.getLong(r5)     // Catch:{ SQLiteException -> 0x0066, all -> 0x0062 }
            r5 = r2
            r5.<init>(r6, r8, r10)     // Catch:{ SQLiteException -> 0x0066, all -> 0x0062 }
            r12.add(r2)     // Catch:{ SQLiteException -> 0x0066, all -> 0x0062 }
            boolean r2 = r13.moveToNext()     // Catch:{ SQLiteException -> 0x0066, all -> 0x0062 }
            if (r2 != 0) goto L_0x0045
            goto L_0x006b
        L_0x0062:
            r0 = move-exception
            r14 = r13
            goto L_0x0170
        L_0x0066:
            r0 = move-exception
            r2 = r12
            r14 = r13
            goto L_0x014c
        L_0x006b:
            if (r13 == 0) goto L_0x0070
            r13.close()
        L_0x0070:
            java.lang.String r6 = "gtm_hits"
            java.lang.String r2 = "hit_url"
            java.lang.String[] r7 = new java.lang.String[]{r1, r2}     // Catch:{ SQLiteException -> 0x00e7, all -> 0x00e4 }
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.Object[] r2 = new java.lang.Object[r15]     // Catch:{ SQLiteException -> 0x00e7, all -> 0x00e4 }
            r2[r14] = r1     // Catch:{ SQLiteException -> 0x00e7, all -> 0x00e4 }
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ SQLiteException -> 0x00e7, all -> 0x00e4 }
            java.lang.String r1 = java.lang.Integer.toString(r16)     // Catch:{ SQLiteException -> 0x00e7, all -> 0x00e4 }
            r5 = r3
            r2 = r12
            r12 = r0
            r3 = r13
            r13 = r1
            android.database.Cursor r13 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00de }
            boolean r0 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x00dc }
            if (r0 == 0) goto L_0x00d6
            r0 = 0
        L_0x0098:
            r1 = r13
            android.database.sqlite.SQLiteCursor r1 = (android.database.sqlite.SQLiteCursor) r1     // Catch:{ SQLiteException -> 0x00dc }
            android.database.CursorWindow r1 = r1.getWindow()     // Catch:{ SQLiteException -> 0x00dc }
            int r1 = r1.getNumRows()     // Catch:{ SQLiteException -> 0x00dc }
            if (r1 <= 0) goto L_0x00b3
            java.lang.Object r1 = r2.get(r0)     // Catch:{ SQLiteException -> 0x00dc }
            com.google.android.gms.tagmanager.zzbw r1 = (com.google.android.gms.tagmanager.zzbw) r1     // Catch:{ SQLiteException -> 0x00dc }
            java.lang.String r3 = r13.getString(r15)     // Catch:{ SQLiteException -> 0x00dc }
            r1.zzbc(r3)     // Catch:{ SQLiteException -> 0x00dc }
            goto L_0x00ce
        L_0x00b3:
            java.lang.String r1 = "HitString for hitId %d too large.  Hit will be deleted."
            java.lang.Object[] r3 = new java.lang.Object[r15]     // Catch:{ SQLiteException -> 0x00dc }
            java.lang.Object r5 = r2.get(r0)     // Catch:{ SQLiteException -> 0x00dc }
            com.google.android.gms.tagmanager.zzbw r5 = (com.google.android.gms.tagmanager.zzbw) r5     // Catch:{ SQLiteException -> 0x00dc }
            long r5 = r5.zzih()     // Catch:{ SQLiteException -> 0x00dc }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ SQLiteException -> 0x00dc }
            r3[r14] = r5     // Catch:{ SQLiteException -> 0x00dc }
            java.lang.String r1 = java.lang.String.format(r1, r3)     // Catch:{ SQLiteException -> 0x00dc }
            com.google.android.gms.tagmanager.zzdi.zzac(r1)     // Catch:{ SQLiteException -> 0x00dc }
        L_0x00ce:
            int r0 = r0 + 1
            boolean r1 = r13.moveToNext()     // Catch:{ SQLiteException -> 0x00dc }
            if (r1 != 0) goto L_0x0098
        L_0x00d6:
            if (r13 == 0) goto L_0x00db
            r13.close()
        L_0x00db:
            return r2
        L_0x00dc:
            r0 = move-exception
            goto L_0x00ea
        L_0x00de:
            r0 = move-exception
            r13 = r3
            goto L_0x0136
        L_0x00e1:
            r0 = move-exception
            r13 = r3
            goto L_0x00ea
        L_0x00e4:
            r0 = move-exception
            r3 = r13
            goto L_0x0136
        L_0x00e7:
            r0 = move-exception
            r2 = r12
            r3 = r13
        L_0x00ea:
            java.lang.String r1 = "Error in peekHits fetching hit url: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0135 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0135 }
            int r3 = r0.length()     // Catch:{ all -> 0x0135 }
            if (r3 == 0) goto L_0x00ff
            java.lang.String r0 = r1.concat(r0)     // Catch:{ all -> 0x0135 }
            goto L_0x0104
        L_0x00ff:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0135 }
            r0.<init>(r1)     // Catch:{ all -> 0x0135 }
        L_0x0104:
            com.google.android.gms.tagmanager.zzdi.zzac(r0)     // Catch:{ all -> 0x0135 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0135 }
            r0.<init>()     // Catch:{ all -> 0x0135 }
            r12 = r2
            java.util.ArrayList r12 = (java.util.ArrayList) r12     // Catch:{ all -> 0x0135 }
            int r1 = r12.size()     // Catch:{ all -> 0x0135 }
            r2 = 0
        L_0x0114:
            if (r14 >= r1) goto L_0x012f
            java.lang.Object r3 = r12.get(r14)     // Catch:{ all -> 0x0135 }
            int r14 = r14 + 1
            com.google.android.gms.tagmanager.zzbw r3 = (com.google.android.gms.tagmanager.zzbw) r3     // Catch:{ all -> 0x0135 }
            java.lang.String r5 = r3.zzij()     // Catch:{ all -> 0x0135 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0135 }
            if (r5 == 0) goto L_0x012b
            if (r2 != 0) goto L_0x012f
            r2 = 1
        L_0x012b:
            r0.add(r3)     // Catch:{ all -> 0x0135 }
            goto L_0x0114
        L_0x012f:
            if (r13 == 0) goto L_0x0134
            r13.close()
        L_0x0134:
            return r0
        L_0x0135:
            r0 = move-exception
        L_0x0136:
            if (r13 == 0) goto L_0x013b
            r13.close()
        L_0x013b:
            throw r0
        L_0x013c:
            r0 = move-exception
            r2 = r12
            goto L_0x0144
        L_0x013f:
            r0 = move-exception
            r3 = r13
            r14 = r3
            goto L_0x0170
        L_0x0143:
            r0 = move-exception
        L_0x0144:
            r3 = r13
            r14 = r3
            goto L_0x014c
        L_0x0147:
            r0 = move-exception
            r14 = 0
            goto L_0x0170
        L_0x014a:
            r0 = move-exception
            r14 = 0
        L_0x014c:
            java.lang.String r1 = "Error in peekHits fetching hitIds: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x016f }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x016f }
            int r3 = r0.length()     // Catch:{ all -> 0x016f }
            if (r3 == 0) goto L_0x0161
            java.lang.String r0 = r1.concat(r0)     // Catch:{ all -> 0x016f }
            goto L_0x0166
        L_0x0161:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x016f }
            r0.<init>(r1)     // Catch:{ all -> 0x016f }
        L_0x0166:
            com.google.android.gms.tagmanager.zzdi.zzac(r0)     // Catch:{ all -> 0x016f }
            if (r14 == 0) goto L_0x016e
            r14.close()
        L_0x016e:
            return r2
        L_0x016f:
            r0 = move-exception
        L_0x0170:
            if (r14 == 0) goto L_0x0175
            r14.close()
        L_0x0175:
            goto L_0x0177
        L_0x0176:
            throw r0
        L_0x0177:
            goto L_0x0176
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzeb.zzaa(int):java.util.List");
    }

    private final void zza(String[] strArr) {
        SQLiteDatabase zzau;
        if (strArr != null && strArr.length != 0 && (zzau = zzau("Error opening database for deleteHits.")) != null) {
            boolean z = true;
            try {
                zzau.delete("gtm_hits", String.format("HIT_ID in (%s)", new Object[]{TextUtils.join(",", Collections.nCopies(strArr.length, "?"))}), strArr);
                zzcc zzcc = this.zzaig;
                if (zziv() != 0) {
                    z = false;
                }
                zzcc.zze(z);
            } catch (SQLiteException unused) {
                zzdi.zzac("Error deleting hits");
            }
        }
    }

    /* access modifiers changed from: private */
    public final void zze(long j) {
        zza(new String[]{String.valueOf(j)});
    }

    /* access modifiers changed from: private */
    public final void zzb(long j, long j2) {
        SQLiteDatabase zzau = zzau("Error opening database for getNumStoredHits.");
        if (zzau != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("hit_first_send_time", Long.valueOf(j2));
            try {
                zzau.update("gtm_hits", contentValues, "hit_id=?", new String[]{String.valueOf(j)});
            } catch (SQLiteException unused) {
                StringBuilder sb = new StringBuilder(69);
                sb.append("Error setting HIT_FIRST_DISPATCH_TIME for hitId: ");
                sb.append(j);
                zzdi.zzac(sb.toString());
                zze(j);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.String[], android.database.Cursor] */
    private final int zziv() {
        SQLiteDatabase zzau = zzau("Error opening database for getNumStoredHits.");
        int i = 0;
        if (zzau == null) {
            return 0;
        }
        ? r2 = 0;
        try {
            Cursor rawQuery = zzau.rawQuery("SELECT COUNT(*) from gtm_hits", r2);
            if (rawQuery.moveToFirst()) {
                i = (int) rawQuery.getLong(0);
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
        } catch (SQLiteException unused) {
            zzdi.zzac("Error getting numStoredHits");
            if (r2 != 0) {
                r2.close();
            }
        } catch (Throwable th) {
            if (r2 != 0) {
                r2.close();
            }
            throw th;
        }
        return i;
    }

    private final int zziw() {
        SQLiteDatabase zzau = zzau("Error opening database for getNumStoredHits.");
        int i = 0;
        if (zzau == null) {
            return 0;
        }
        Cursor cursor = null;
        try {
            Cursor query = zzau.query("gtm_hits", new String[]{"hit_id", "hit_first_send_time"}, "hit_first_send_time=0", (String[]) null, (String) null, (String) null, (String) null);
            i = query.getCount();
            if (query != null) {
                query.close();
            }
        } catch (SQLiteException unused) {
            zzdi.zzac("Error getting num untried hits");
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        return i;
    }

    public final void dispatch() {
        zzdi.zzab("GTM Dispatch running...");
        if (this.zzaif.zzhy()) {
            List<zzbw> zzaa = zzaa(40);
            if (zzaa.isEmpty()) {
                zzdi.zzab("...nothing to dispatch");
                this.zzaig.zze(true);
                return;
            }
            this.zzaif.zzd(zzaa);
            if (zziw() > 0) {
                zzfn.zzjq().dispatch();
            }
        }
    }

    private final SQLiteDatabase zzau(String str) {
        try {
            return this.zzaie.getWritableDatabase();
        } catch (SQLiteException unused) {
            zzdi.zzac(str);
            return null;
        }
    }
}
