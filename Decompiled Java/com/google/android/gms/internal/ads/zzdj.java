package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.PointerIconCompat;
import com.google.android.gms.internal.ads.zzbo;
import com.google.android.gms.internal.ads.zzbs;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public abstract class zzdj implements zzdg {
    protected static volatile zzei zzuy;
    protected MotionEvent zzvq;
    protected LinkedList<MotionEvent> zzvr = new LinkedList<>();
    protected long zzvs = 0;
    protected long zzvt = 0;
    protected long zzvu = 0;
    protected long zzvv = 0;
    protected long zzvw = 0;
    protected long zzvx = 0;
    protected long zzvy = 0;
    protected double zzvz;
    private double zzwa;
    private double zzwb;
    protected float zzwc;
    protected float zzwd;
    protected float zzwe;
    protected float zzwf;
    private boolean zzwg = false;
    protected boolean zzwh = false;
    protected DisplayMetrics zzwi;

    protected zzdj(Context context) {
        try {
            if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcmd)).booleanValue()) {
                zzck.zzbm();
            } else {
                zzeo.zzb(zzuy);
            }
            this.zzwi = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    public abstract long zza(StackTraceElement[] stackTraceElementArr) throws zzeh;

    /* access modifiers changed from: protected */
    public abstract zzbs.zza.zzb zza(Context context, zzbo.zza zza);

    /* access modifiers changed from: protected */
    public abstract zzbs.zza.zzb zzb(Context context, View view, Activity activity);

    /* access modifiers changed from: protected */
    public abstract zzeq zzb(MotionEvent motionEvent) throws zzeh;

    public void zzb(View view) {
    }

    /* access modifiers changed from: protected */
    public abstract zzbs.zza.zzb zzc(Context context, View view, Activity activity);

    public String zzb(Context context) {
        if (zzep.isMainThread()) {
            if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcmf)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return zza(context, (String) null, zzee.zzxh, (View) null, (Activity) null, (byte[]) null);
    }

    public String zza(Context context, View view, Activity activity) {
        return zza(context, (String) null, zzee.zzxi, view, activity, (byte[]) null);
    }

    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, (Activity) null);
    }

    public String zza(Context context, String str, View view, Activity activity) {
        return zza(context, str, zzee.zzxj, view, activity, (byte[]) null);
    }

    public void zza(MotionEvent motionEvent) {
        boolean z = false;
        if (this.zzwg) {
            zzca();
            this.zzwg = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zzvz = 0.0d;
            this.zzwa = (double) motionEvent.getRawX();
            this.zzwb = (double) motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = (double) motionEvent.getRawX();
            double rawY = (double) motionEvent.getRawY();
            double d = this.zzwa;
            Double.isNaN(rawX);
            double d2 = rawX - d;
            double d3 = this.zzwb;
            Double.isNaN(rawY);
            double d4 = rawY - d3;
            this.zzvz += Math.sqrt((d2 * d2) + (d4 * d4));
            this.zzwa = rawX;
            this.zzwb = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 == 0) {
            this.zzwc = motionEvent.getX();
            this.zzwd = motionEvent.getY();
            this.zzwe = motionEvent.getRawX();
            this.zzwf = motionEvent.getRawY();
            this.zzvs++;
        } else if (action2 == 1) {
            this.zzvq = MotionEvent.obtain(motionEvent);
            this.zzvr.add(this.zzvq);
            if (this.zzvr.size() > 6) {
                this.zzvr.remove().recycle();
            }
            this.zzvu++;
            this.zzvw = zza(new Throwable().getStackTrace());
        } else if (action2 == 2) {
            this.zzvt += (long) (motionEvent.getHistorySize() + 1);
            try {
                zzeq zzb = zzb(motionEvent);
                if ((zzb == null || zzb.zzyq == null || zzb.zzyt == null) ? false : true) {
                    this.zzvx += zzb.zzyq.longValue() + zzb.zzyt.longValue();
                }
                if (!(this.zzwi == null || zzb == null || zzb.zzyr == null || zzb.zzyu == null)) {
                    z = true;
                }
                if (z) {
                    this.zzvy += zzb.zzyr.longValue() + zzb.zzyu.longValue();
                }
            } catch (zzeh unused) {
            }
        } else if (action2 == 3) {
            this.zzvv++;
        }
        this.zzwh = true;
    }

    public void zza(int i, int i2, int i3) {
        if (this.zzvq != null) {
            if (((Boolean) zzvh.zzpd().zzd(zzzx.zzclq)).booleanValue()) {
                zzca();
            } else {
                this.zzvq.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.zzwi;
        if (displayMetrics != null) {
            this.zzvq = MotionEvent.obtain(0, (long) i3, 1, ((float) i) * displayMetrics.density, this.zzwi.density * ((float) i2), 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.zzvq = null;
        }
        this.zzwh = false;
    }

    private final void zzca() {
        this.zzvw = 0;
        this.zzvs = 0;
        this.zzvt = 0;
        this.zzvu = 0;
        this.zzvv = 0;
        this.zzvx = 0;
        this.zzvy = 0;
        if (this.zzvr.size() > 0) {
            Iterator it = this.zzvr.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.zzvr.clear();
        } else {
            MotionEvent motionEvent = this.zzvq;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.zzvq = null;
    }

    private final String zza(Context context, String str, int i, View view, Activity activity, byte[] bArr) {
        String str2;
        zzde zzde;
        int i2;
        int i3;
        int i4;
        int i5;
        Context context2 = context;
        int i6 = i;
        View view2 = view;
        Activity activity2 = activity;
        long currentTimeMillis = System.currentTimeMillis();
        boolean booleanValue = ((Boolean) zzvh.zzpd().zzd(zzzx.zzcls)).booleanValue();
        zzbs.zza.zzb zzb = null;
        if (booleanValue) {
            zzde = zzuy != null ? zzuy.zzch() : null;
            str2 = ((Boolean) zzvh.zzpd().zzd(zzzx.zzcmd)).booleanValue() ? "be" : "te";
        } else {
            zzde = null;
            str2 = null;
        }
        try {
            if (i6 == zzee.zzxj) {
                zzb = zzc(context2, view2, activity2);
                this.zzwg = true;
                i5 = PointerIconCompat.TYPE_HAND;
            } else if (i6 == zzee.zzxi) {
                zzb = zzb(context2, view2, activity2);
                i5 = PointerIconCompat.TYPE_TEXT;
            } else {
                zzb = zza(context2, (zzbo.zza) null);
                i5 = 1000;
            }
            if (booleanValue && zzde != null) {
                zzde.zza(i5, -1, System.currentTimeMillis() - currentTimeMillis, str2);
            }
        } catch (Exception e) {
            Exception exc = e;
            if (booleanValue && zzde != null) {
                if (i6 == zzee.zzxj) {
                    i4 = PointerIconCompat.TYPE_HELP;
                } else if (i6 == zzee.zzxi) {
                    i4 = PointerIconCompat.TYPE_VERTICAL_TEXT;
                } else {
                    i4 = i6 == zzee.zzxh ? PointerIconCompat.TYPE_CONTEXT_MENU : -1;
                }
                zzde.zza(i4, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (zzb != null) {
            try {
                if (((zzbs.zza) ((zzdyz) zzb.zzbcx())).zzbda() != 0) {
                    String zzj = zzck.zzj((zzbs.zza) ((zzdyz) zzb.zzbcx()), str);
                    if (!booleanValue || zzde == null) {
                        return zzj;
                    }
                    if (i6 == zzee.zzxj) {
                        i3 = PointerIconCompat.TYPE_CELL;
                    } else if (i6 == zzee.zzxi) {
                        i3 = PointerIconCompat.TYPE_ALIAS;
                    } else {
                        i3 = i6 == zzee.zzxh ? PointerIconCompat.TYPE_WAIT : -1;
                    }
                    zzde.zza(i3, -1, System.currentTimeMillis() - currentTimeMillis2, str2);
                    return zzj;
                }
            } catch (Exception e2) {
                Exception exc2 = e2;
                String num = Integer.toString(7);
                if (!booleanValue || zzde == null) {
                    return num;
                }
                if (i6 == zzee.zzxj) {
                    i2 = PointerIconCompat.TYPE_CROSSHAIR;
                } else if (i6 == zzee.zzxi) {
                    i2 = PointerIconCompat.TYPE_COPY;
                } else {
                    i2 = i6 == zzee.zzxh ? 1005 : -1;
                }
                zzde.zza(i2, -1, System.currentTimeMillis() - currentTimeMillis2, str2, exc2);
                return num;
            }
        }
        return Integer.toString(5);
    }
}
