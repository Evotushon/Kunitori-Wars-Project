package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzebr {
    static String zzam(zzdxn zzdxn) {
        zzebu zzebu = new zzebu(zzdxn);
        StringBuilder sb = new StringBuilder(zzebu.size());
        for (int i = 0; i < zzebu.size(); i++) {
            byte zzfe = zzebu.zzfe(i);
            if (zzfe == 34) {
                sb.append("\\\"");
            } else if (zzfe == 39) {
                sb.append("\\'");
            } else if (zzfe != 92) {
                switch (zzfe) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (zzfe >= 32 && zzfe <= 126) {
                            sb.append((char) zzfe);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((zzfe >>> 6) & 3) + 48));
                            sb.append((char) (((zzfe >>> 3) & 7) + 48));
                            sb.append((char) ((zzfe & 7) + 48));
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
