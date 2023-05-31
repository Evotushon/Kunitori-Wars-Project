package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.NoSuchElementException;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {
    private T zaml;

    public SingleRefDataBufferIterator(DataBuffer<T> dataBuffer) {
        super(dataBuffer);
    }

    public T next() {
        if (hasNext()) {
            this.zalq++;
            if (this.zalq == 0) {
                this.zaml = this.zalp.get(0);
                T t = this.zaml;
                if (!(t instanceof DataBufferRef)) {
                    String valueOf = String.valueOf(t.getClass());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
                    sb.append("DataBuffer reference of type ");
                    sb.append(valueOf);
                    sb.append(" is not movable");
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                ((DataBufferRef) this.zaml).zag(this.zalq);
            }
            return this.zaml;
        }
        int i = this.zalq;
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Cannot advance the iterator beyond ");
        sb2.append(i);
        throw new NoSuchElementException(sb2.toString());
    }
}
