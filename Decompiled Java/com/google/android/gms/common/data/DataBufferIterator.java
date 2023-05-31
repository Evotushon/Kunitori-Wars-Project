package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public class DataBufferIterator<T> implements Iterator<T> {
    protected final DataBuffer<T> zalp;
    protected int zalq = -1;

    public DataBufferIterator(DataBuffer<T> dataBuffer) {
        this.zalp = (DataBuffer) Preconditions.checkNotNull(dataBuffer);
    }

    public boolean hasNext() {
        return this.zalq < this.zalp.getCount() - 1;
    }

    public T next() {
        if (hasNext()) {
            DataBuffer<T> dataBuffer = this.zalp;
            int i = this.zalq + 1;
            this.zalq = i;
            return dataBuffer.get(i);
        }
        int i2 = this.zalq;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Cannot advance the iterator beyond ");
        sb.append(i2);
        throw new NoSuchElementException(sb.toString());
    }

    public void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
