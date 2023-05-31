package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzd;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
final class zzaj implements ServiceConnection {
    final /* synthetic */ BillingClientImpl zza;
    private final Object zzb = new Object();
    private boolean zzc = false;
    private BillingClientStateListener zzd;

    /* synthetic */ zzaj(BillingClientImpl billingClientImpl, BillingClientStateListener billingClientStateListener, zzai zzai) {
        this.zza = billingClientImpl;
        this.zzd = billingClientStateListener;
    }

    private final void zzd(BillingResult billingResult) {
        synchronized (this.zzb) {
            BillingClientStateListener billingClientStateListener = this.zzd;
            if (billingClientStateListener != null) {
                billingClientStateListener.onBillingSetupFinished(billingResult);
            }
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzb.zzm("BillingClient", "Billing service connected.");
        this.zza.zzf = zzd.zzo(iBinder);
        BillingClientImpl billingClientImpl = this.zza;
        if (billingClientImpl.zzL(new zzah(this), 30000, new zzag(this), billingClientImpl.zzF()) == null) {
            zzd(this.zza.zzH());
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        zzb.zzn("BillingClient", "Billing service disconnected.");
        this.zza.zzf = null;
        this.zza.zza = 0;
        synchronized (this.zzb) {
            BillingClientStateListener billingClientStateListener = this.zzd;
            if (billingClientStateListener != null) {
                billingClientStateListener.onBillingServiceDisconnected();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        r0 = new android.os.Bundle();
        r0.putString("accountName", (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r4 = r11.zza.zze.getPackageName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        r6 = 17;
        r7 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        if (r6 < 3) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        if (r0 != null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r7 = r11.zza.zzf.zzr(r6, r4, "subs");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        r7 = r11.zza.zzf.zzc(r6, r4, "subs", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r7 != 0) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
        r6 = r6 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
        r8 = r11.zza;
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0059, code lost:
        if (r6 < 5) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005b, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005d, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005e, code lost:
        r8.zzi = r9;
        r8 = r11.zza;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0063, code lost:
        if (r6 < 3) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0065, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0067, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0068, code lost:
        r8.zzh = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006b, code lost:
        if (r6 >= 3) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006d, code lost:
        com.google.android.gms.internal.play_billing.zzb.zzm("BillingClient", "In-app billing API does not support subscription on this device.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0074, code lost:
        r6 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0076, code lost:
        if (r6 < 3) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0078, code lost:
        if (r0 != null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007a, code lost:
        r7 = r11.zza.zzf.zzr(r6, r4, "inapp");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0087, code lost:
        r7 = r11.zza.zzf.zzc(r6, r4, "inapp", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0093, code lost:
        if (r7 != 0) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0095, code lost:
        r11.zza.zzj = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009b, code lost:
        r6 = r6 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009e, code lost:
        r0 = r11.zza;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a4, code lost:
        if (r0.zzj < 17) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a6, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a8, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a9, code lost:
        r0.zzs = r4;
        r0 = r11.zza;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b4, code lost:
        if (r0.zzj < 16) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b6, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b8, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b9, code lost:
        r0.zzr = r4;
        r0 = r11.zza;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c4, code lost:
        if (r0.zzj < 15) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c6, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c8, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c9, code lost:
        r0.zzq = r4;
        r0 = r11.zza;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d4, code lost:
        if (r0.zzj < 14) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d6, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d8, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d9, code lost:
        r0.zzp = r4;
        r0 = r11.zza;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e4, code lost:
        if (r0.zzj < 12) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e6, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00e8, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00e9, code lost:
        r0.zzo = r4;
        r0 = r11.zza;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f4, code lost:
        if (r0.zzj < 10) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f6, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00f8, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00f9, code lost:
        r0.zzn = r4;
        r0 = r11.zza;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0104, code lost:
        if (r0.zzj < 9) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0106, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0108, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0109, code lost:
        r0.zzm = r4;
        r0 = r11.zza;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0114, code lost:
        if (r0.zzj < 8) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0116, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0118, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0119, code lost:
        r0.zzl = r4;
        r0 = r11.zza;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0123, code lost:
        if (r0.zzj < 6) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0126, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0127, code lost:
        r0.zzk = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0130, code lost:
        if (r11.zza.zzj >= 3) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0132, code lost:
        com.google.android.gms.internal.play_billing.zzb.zzn("BillingClient", "In-app billing API version 3 is not supported on this device.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0139, code lost:
        if (r7 != 0) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x013b, code lost:
        r11.zza.zza = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0142, code lost:
        r11.zza.zza = 0;
        r11.zza.zzf = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x014d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x014e, code lost:
        r7 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x014f, code lost:
        com.google.android.gms.internal.play_billing.zzb.zzo("BillingClient", "Exception while checking if billing is supported; try to reconnect", r0);
        r11.zza.zza = 0;
        r11.zza.zzf = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0160, code lost:
        if (r7 != 0) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0162, code lost:
        zzd(com.android.billingclient.api.zzat.zzl);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0168, code lost:
        zzd(com.android.billingclient.api.zzat.zza);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x016d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        if (android.text.TextUtils.isEmpty((java.lang.CharSequence) null) != false) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0168  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object zza() throws java.lang.Exception {
        /*
            r11 = this;
            java.lang.Object r0 = r11.zzb
            monitor-enter(r0)
            boolean r1 = r11.zzc     // Catch:{ all -> 0x016e }
            r2 = 0
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x016e }
            return r2
        L_0x000a:
            monitor-exit(r0)     // Catch:{ all -> 0x016e }
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x001c
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "accountName"
            r0.putString(r1, r2)
            goto L_0x001d
        L_0x001c:
            r0 = r2
        L_0x001d:
            r1 = 3
            r3 = 0
            com.android.billingclient.api.BillingClientImpl r4 = r11.zza     // Catch:{ Exception -> 0x014d }
            android.content.Context r4 = r4.zze     // Catch:{ Exception -> 0x014d }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ Exception -> 0x014d }
            r5 = 17
            r6 = 17
            r7 = 3
        L_0x002e:
            if (r6 < r1) goto L_0x0054
            if (r0 != 0) goto L_0x003f
            com.android.billingclient.api.BillingClientImpl r8 = r11.zza     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.play_billing.zze r8 = r8.zzf     // Catch:{ Exception -> 0x0051 }
            java.lang.String r9 = "subs"
            int r7 = r8.zzr(r6, r4, r9)     // Catch:{ Exception -> 0x0051 }
            goto L_0x004b
        L_0x003f:
            com.android.billingclient.api.BillingClientImpl r8 = r11.zza     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.play_billing.zze r8 = r8.zzf     // Catch:{ Exception -> 0x0051 }
            java.lang.String r9 = "subs"
            int r7 = r8.zzc(r6, r4, r9, r0)     // Catch:{ Exception -> 0x0051 }
        L_0x004b:
            if (r7 != 0) goto L_0x004e
            goto L_0x0055
        L_0x004e:
            int r6 = r6 + -1
            goto L_0x002e
        L_0x0051:
            r0 = move-exception
            goto L_0x014f
        L_0x0054:
            r6 = 0
        L_0x0055:
            com.android.billingclient.api.BillingClientImpl r8 = r11.zza     // Catch:{ Exception -> 0x0051 }
            r9 = 5
            r10 = 1
            if (r6 < r9) goto L_0x005d
            r9 = 1
            goto L_0x005e
        L_0x005d:
            r9 = 0
        L_0x005e:
            r8.zzi = r9     // Catch:{ Exception -> 0x0051 }
            com.android.billingclient.api.BillingClientImpl r8 = r11.zza     // Catch:{ Exception -> 0x0051 }
            if (r6 < r1) goto L_0x0067
            r9 = 1
            goto L_0x0068
        L_0x0067:
            r9 = 0
        L_0x0068:
            r8.zzh = r9     // Catch:{ Exception -> 0x0051 }
            if (r6 >= r1) goto L_0x0074
            java.lang.String r6 = "BillingClient"
            java.lang.String r8 = "In-app billing API does not support subscription on this device."
            com.google.android.gms.internal.play_billing.zzb.zzm(r6, r8)     // Catch:{ Exception -> 0x0051 }
        L_0x0074:
            r6 = 17
        L_0x0076:
            if (r6 < r1) goto L_0x009e
            if (r0 != 0) goto L_0x0087
            com.android.billingclient.api.BillingClientImpl r8 = r11.zza     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.play_billing.zze r8 = r8.zzf     // Catch:{ Exception -> 0x0051 }
            java.lang.String r9 = "inapp"
            int r7 = r8.zzr(r6, r4, r9)     // Catch:{ Exception -> 0x0051 }
            goto L_0x0093
        L_0x0087:
            com.android.billingclient.api.BillingClientImpl r8 = r11.zza     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.play_billing.zze r8 = r8.zzf     // Catch:{ Exception -> 0x0051 }
            java.lang.String r9 = "inapp"
            int r7 = r8.zzc(r6, r4, r9, r0)     // Catch:{ Exception -> 0x0051 }
        L_0x0093:
            if (r7 != 0) goto L_0x009b
            com.android.billingclient.api.BillingClientImpl r0 = r11.zza     // Catch:{ Exception -> 0x0051 }
            r0.zzj = r6     // Catch:{ Exception -> 0x0051 }
            goto L_0x009e
        L_0x009b:
            int r6 = r6 + -1
            goto L_0x0076
        L_0x009e:
            com.android.billingclient.api.BillingClientImpl r0 = r11.zza     // Catch:{ Exception -> 0x0051 }
            int r4 = r0.zzj     // Catch:{ Exception -> 0x0051 }
            if (r4 < r5) goto L_0x00a8
            r4 = 1
            goto L_0x00a9
        L_0x00a8:
            r4 = 0
        L_0x00a9:
            r0.zzs = r4     // Catch:{ Exception -> 0x0051 }
            com.android.billingclient.api.BillingClientImpl r0 = r11.zza     // Catch:{ Exception -> 0x0051 }
            int r4 = r0.zzj     // Catch:{ Exception -> 0x0051 }
            r5 = 16
            if (r4 < r5) goto L_0x00b8
            r4 = 1
            goto L_0x00b9
        L_0x00b8:
            r4 = 0
        L_0x00b9:
            r0.zzr = r4     // Catch:{ Exception -> 0x0051 }
            com.android.billingclient.api.BillingClientImpl r0 = r11.zza     // Catch:{ Exception -> 0x0051 }
            int r4 = r0.zzj     // Catch:{ Exception -> 0x0051 }
            r5 = 15
            if (r4 < r5) goto L_0x00c8
            r4 = 1
            goto L_0x00c9
        L_0x00c8:
            r4 = 0
        L_0x00c9:
            r0.zzq = r4     // Catch:{ Exception -> 0x0051 }
            com.android.billingclient.api.BillingClientImpl r0 = r11.zza     // Catch:{ Exception -> 0x0051 }
            int r4 = r0.zzj     // Catch:{ Exception -> 0x0051 }
            r5 = 14
            if (r4 < r5) goto L_0x00d8
            r4 = 1
            goto L_0x00d9
        L_0x00d8:
            r4 = 0
        L_0x00d9:
            r0.zzp = r4     // Catch:{ Exception -> 0x0051 }
            com.android.billingclient.api.BillingClientImpl r0 = r11.zza     // Catch:{ Exception -> 0x0051 }
            int r4 = r0.zzj     // Catch:{ Exception -> 0x0051 }
            r5 = 12
            if (r4 < r5) goto L_0x00e8
            r4 = 1
            goto L_0x00e9
        L_0x00e8:
            r4 = 0
        L_0x00e9:
            r0.zzo = r4     // Catch:{ Exception -> 0x0051 }
            com.android.billingclient.api.BillingClientImpl r0 = r11.zza     // Catch:{ Exception -> 0x0051 }
            int r4 = r0.zzj     // Catch:{ Exception -> 0x0051 }
            r5 = 10
            if (r4 < r5) goto L_0x00f8
            r4 = 1
            goto L_0x00f9
        L_0x00f8:
            r4 = 0
        L_0x00f9:
            r0.zzn = r4     // Catch:{ Exception -> 0x0051 }
            com.android.billingclient.api.BillingClientImpl r0 = r11.zza     // Catch:{ Exception -> 0x0051 }
            int r4 = r0.zzj     // Catch:{ Exception -> 0x0051 }
            r5 = 9
            if (r4 < r5) goto L_0x0108
            r4 = 1
            goto L_0x0109
        L_0x0108:
            r4 = 0
        L_0x0109:
            r0.zzm = r4     // Catch:{ Exception -> 0x0051 }
            com.android.billingclient.api.BillingClientImpl r0 = r11.zza     // Catch:{ Exception -> 0x0051 }
            int r4 = r0.zzj     // Catch:{ Exception -> 0x0051 }
            r5 = 8
            if (r4 < r5) goto L_0x0118
            r4 = 1
            goto L_0x0119
        L_0x0118:
            r4 = 0
        L_0x0119:
            r0.zzl = r4     // Catch:{ Exception -> 0x0051 }
            com.android.billingclient.api.BillingClientImpl r0 = r11.zza     // Catch:{ Exception -> 0x0051 }
            int r4 = r0.zzj     // Catch:{ Exception -> 0x0051 }
            r5 = 6
            if (r4 < r5) goto L_0x0126
            goto L_0x0127
        L_0x0126:
            r10 = 0
        L_0x0127:
            r0.zzk = r10     // Catch:{ Exception -> 0x0051 }
            com.android.billingclient.api.BillingClientImpl r0 = r11.zza     // Catch:{ Exception -> 0x0051 }
            int r0 = r0.zzj     // Catch:{ Exception -> 0x0051 }
            if (r0 >= r1) goto L_0x0139
            java.lang.String r0 = "BillingClient"
            java.lang.String r1 = "In-app billing API version 3 is not supported on this device."
            com.google.android.gms.internal.play_billing.zzb.zzn(r0, r1)     // Catch:{ Exception -> 0x0051 }
        L_0x0139:
            if (r7 != 0) goto L_0x0142
            com.android.billingclient.api.BillingClientImpl r0 = r11.zza     // Catch:{ Exception -> 0x0051 }
            r1 = 2
            r0.zza = r1     // Catch:{ Exception -> 0x0051 }
            goto L_0x0160
        L_0x0142:
            com.android.billingclient.api.BillingClientImpl r0 = r11.zza     // Catch:{ Exception -> 0x0051 }
            r0.zza = r3     // Catch:{ Exception -> 0x0051 }
            com.android.billingclient.api.BillingClientImpl r0 = r11.zza     // Catch:{ Exception -> 0x0051 }
            r0.zzf = r2     // Catch:{ Exception -> 0x0051 }
            goto L_0x0160
        L_0x014d:
            r0 = move-exception
            r7 = 3
        L_0x014f:
            java.lang.String r1 = "BillingClient"
            java.lang.String r4 = "Exception while checking if billing is supported; try to reconnect"
            com.google.android.gms.internal.play_billing.zzb.zzo(r1, r4, r0)
            com.android.billingclient.api.BillingClientImpl r0 = r11.zza
            r0.zza = r3
            com.android.billingclient.api.BillingClientImpl r0 = r11.zza
            r0.zzf = r2
        L_0x0160:
            if (r7 != 0) goto L_0x0168
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzat.zzl
            r11.zzd(r0)
            goto L_0x016d
        L_0x0168:
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzat.zza
            r11.zzd(r0)
        L_0x016d:
            return r2
        L_0x016e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x016e }
            goto L_0x0172
        L_0x0171:
            throw r1
        L_0x0172:
            goto L_0x0171
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.zzaj.zza():java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb() {
        this.zza.zza = 0;
        this.zza.zzf = null;
        zzd(zzat.zzn);
    }

    /* access modifiers changed from: package-private */
    public final void zzc() {
        synchronized (this.zzb) {
            this.zzd = null;
            this.zzc = true;
        }
    }
}
