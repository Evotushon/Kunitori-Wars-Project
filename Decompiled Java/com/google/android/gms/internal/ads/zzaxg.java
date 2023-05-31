package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzq;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaxg {
    private Handler handler;
    private int state;
    private String zzbmj;
    private String zzbri;
    private String zzdiz;
    @Nullable
    private String zzdmj;
    private int zzduh;
    private PointF zzdui;
    private PointF zzduj;
    private Runnable zzduk;
    private final Context zzur;

    public zzaxg(Context context) {
        this.state = 0;
        this.zzduk = new zzaxf(this);
        this.zzur = context;
        this.zzduh = ViewConfiguration.get(context).getScaledTouchSlop();
        zzq.zzlj().zzxg();
        this.handler = zzq.zzlj().getHandler();
    }

    public zzaxg(Context context, String str) {
        this(context);
        this.zzdiz = str;
    }

    public final void zzd(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.state = 0;
            this.zzdui = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.state;
        if (i != -1) {
            boolean z = true;
            if (i == 0 && actionMasked == 5) {
                this.state = 5;
                this.zzduj = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.handler.postDelayed(this.zzduk, ((Long) zzvh.zzpd().zzd(zzzx.zzcoi)).longValue());
            } else if (this.state == 5) {
                if (pointerCount == 2) {
                    if (actionMasked == 2) {
                        boolean z2 = false;
                        for (int i2 = 0; i2 < historySize; i2++) {
                            if (!zza(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2))) {
                                z2 = true;
                            }
                        }
                        if (zza(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1))) {
                            z = z2;
                        }
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    this.state = -1;
                    this.handler.removeCallbacks(this.zzduk);
                }
            }
        }
    }

    private final boolean zza(float f, float f2, float f3, float f4) {
        return Math.abs(this.zzdui.x - f) < ((float) this.zzduh) && Math.abs(this.zzdui.y - f2) < ((float) this.zzduh) && Math.abs(this.zzduj.x - f3) < ((float) this.zzduh) && Math.abs(this.zzduj.y - f4) < ((float) this.zzduh);
    }

    public final void showDialog() {
        try {
            if (!(this.zzur instanceof Activity)) {
                zzawf.zzez("Can not create dialog without Activity Context");
                return;
            }
            String str = !TextUtils.isEmpty(zzq.zzlf().zzxc()) ? "Creative Preview (Enabled)" : "Creative Preview";
            String str2 = zzq.zzlf().zzxd() ? "Troubleshooting (Enabled)" : "Troubleshooting";
            ArrayList arrayList = new ArrayList();
            int zza = zza((List<String>) arrayList, "Ad Information", true);
            int zza2 = zza((List<String>) arrayList, str, true);
            int zza3 = zza((List<String>) arrayList, str2, true);
            AlertDialog.Builder builder = new AlertDialog.Builder(this.zzur, zzq.zzkx().zzww());
            builder.setTitle("Select a Debug Mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new zzaxi(this, zza, zza2, zza3));
            builder.create().show();
        } catch (WindowManager.BadTokenException e) {
            zzawf.zza("", e);
        }
    }

    public final void setAdUnitId(String str) {
        this.zzbri = str;
    }

    public final void zzx(String str) {
        this.zzbmj = str;
    }

    public final void zzep(String str) {
        this.zzdiz = str;
    }

    public final void zzeq(String str) {
        this.zzdmj = str;
    }

    private static int zza(List<String> list, String str, boolean z) {
        list.add(str);
        return list.size() - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.zzdiz);
        sb.append(",DebugSignal: ");
        sb.append(this.zzdmj);
        sb.append(",AFMA Version: ");
        sb.append(this.zzbmj);
        sb.append(",Ad Unit ID: ");
        sb.append(this.zzbri);
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzwz() {
        zzq.zzlf().zza(this.zzur, this.zzbri, this.zzbmj, this.zzdmj);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzxa() {
        zzq.zzlf().zze(this.zzur, this.zzbri, this.zzbmj);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str, DialogInterface dialogInterface, int i) {
        zzq.zzkv();
        zzawo.zza(this.zzur, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006e, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void zza(int r1, int r2, int r3, android.content.DialogInterface r4, int r5) {
        /*
            r0 = this;
            if (r5 != r1) goto L_0x009b
            android.content.Context r1 = r0.zzur
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 != 0) goto L_0x000e
            java.lang.String r1 = "Can not create dialog without Activity Context"
            com.google.android.gms.internal.ads.zzawf.zzez(r1)
            return
        L_0x000e:
            java.lang.String r1 = r0.zzdiz
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0071
            java.lang.String r2 = "\\+"
            java.lang.String r3 = "%20"
            java.lang.String r1 = r1.replaceAll(r2, r3)
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            android.net.Uri$Builder r1 = r2.encodedQuery(r1)
            android.net.Uri r1 = r1.build()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.google.android.gms.ads.internal.zzq.zzkv()
            java.util.Map r1 = com.google.android.gms.internal.ads.zzawo.zzi((android.net.Uri) r1)
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x003f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0062
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            java.lang.String r5 = " = "
            r2.append(r5)
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            java.lang.String r4 = "\n\n"
            r2.append(r4)
            goto L_0x003f
        L_0x0062:
            java.lang.String r1 = r2.toString()
            java.lang.String r1 = r1.trim()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            java.lang.String r1 = "No debug information"
        L_0x0073:
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            android.content.Context r3 = r0.zzur
            r2.<init>(r3)
            r2.setMessage(r1)
            java.lang.String r3 = "Ad Information"
            r2.setTitle(r3)
            com.google.android.gms.internal.ads.zzaxh r3 = new com.google.android.gms.internal.ads.zzaxh
            r3.<init>(r0, r1)
            java.lang.String r1 = "Share"
            r2.setPositiveButton(r1, r3)
            android.content.DialogInterface$OnClickListener r1 = com.google.android.gms.internal.ads.zzaxk.zzduo
            java.lang.String r3 = "Close"
            r2.setNegativeButton(r3, r1)
            android.app.AlertDialog r1 = r2.create()
            r1.show()
            return
        L_0x009b:
            if (r5 != r2) goto L_0x00ad
            java.lang.String r1 = "Debug mode [Creative Preview] selected."
            com.google.android.gms.internal.ads.zzawf.zzeb(r1)
            com.google.android.gms.internal.ads.zzdoe r1 = com.google.android.gms.internal.ads.zzazq.zzdxk
            com.google.android.gms.internal.ads.zzaxj r2 = new com.google.android.gms.internal.ads.zzaxj
            r2.<init>(r0)
            r1.execute(r2)
            return
        L_0x00ad:
            if (r5 != r3) goto L_0x00be
            java.lang.String r1 = "Debug mode [Troubleshooting] selected."
            com.google.android.gms.internal.ads.zzawf.zzeb(r1)
            com.google.android.gms.internal.ads.zzdoe r1 = com.google.android.gms.internal.ads.zzazq.zzdxk
            com.google.android.gms.internal.ads.zzaxm r2 = new com.google.android.gms.internal.ads.zzaxm
            r2.<init>(r0)
            r1.execute(r2)
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaxg.zza(int, int, int, android.content.DialogInterface, int):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzxb() {
        this.state = 4;
        showDialog();
    }
}
