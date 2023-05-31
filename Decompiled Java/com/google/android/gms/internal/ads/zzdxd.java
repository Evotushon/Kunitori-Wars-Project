package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdxd;
import com.google.android.gms.internal.ads.zzdxg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public abstract class zzdxd<MessageType extends zzdxd<MessageType, BuilderType>, BuilderType extends zzdxg<MessageType, BuilderType>> implements zzeah {
    protected int zzhnp = 0;

    public final zzdxn zzbai() {
        try {
            zzdxv zzfg = zzdxn.zzfg(zzbda());
            zzb(zzfg.zzbba());
            return zzfg.zzbaz();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public final byte[] toByteArray() {
        try {
            byte[] bArr = new byte[zzbda()];
            zzdyi zzv = zzdyi.zzv(bArr);
            zzb(zzv);
            zzv.zzbcc();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: package-private */
    public int zzbaj() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public void zzfa(int i) {
        throw new UnsupportedOperationException();
    }

    protected static <T> void zza(Iterable<T> iterable, List<? super T> list) {
        zzdzc.checkNotNull(iterable);
        if (iterable instanceof zzdzs) {
            List<?> zzbdu = ((zzdzs) iterable).zzbdu();
            zzdzs zzdzs = (zzdzs) list;
            int size = list.size();
            for (Object next : zzbdu) {
                if (next == null) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(zzdzs.size() - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size2 = zzdzs.size() - 1; size2 >= size; size2--) {
                        zzdzs.remove(size2);
                    }
                    throw new NullPointerException(sb2);
                } else if (next instanceof zzdxn) {
                    zzdzs.zzaj((zzdxn) next);
                } else {
                    zzdzs.add((String) next);
                }
            }
        } else if (iterable instanceof zzeat) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (T next2 : iterable) {
                if (next2 == null) {
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(list.size() - size3);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(next2);
            }
        }
    }
}
