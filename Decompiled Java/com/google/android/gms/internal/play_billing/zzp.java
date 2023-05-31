package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
final class zzp {
    static void zza(Object obj, Object obj2) {
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            String.valueOf(valueOf).length();
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(valueOf)));
        } else if (obj2 == null) {
            String obj3 = obj.toString();
            StringBuilder sb = new StringBuilder(obj3.length() + 26);
            sb.append("null value in entry: ");
            sb.append(obj3);
            sb.append("=null");
            throw new NullPointerException(sb.toString());
        }
    }
}
