package com.google.android.gms.common.data;

import com.google.android.gms.common.data.DataBufferObserver;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class DataBufferObserverSet implements DataBufferObserver, DataBufferObserver.Observable {
    private HashSet<DataBufferObserver> zalr = new HashSet<>();

    public final boolean hasObservers() {
        return !this.zalr.isEmpty();
    }

    public final void clear() {
        this.zalr.clear();
    }

    public final void addObserver(DataBufferObserver dataBufferObserver) {
        this.zalr.add(dataBufferObserver);
    }

    public final void removeObserver(DataBufferObserver dataBufferObserver) {
        this.zalr.remove(dataBufferObserver);
    }

    public final void onDataChanged() {
        Iterator<DataBufferObserver> it = this.zalr.iterator();
        while (it.hasNext()) {
            it.next().onDataChanged();
        }
    }

    public final void onDataRangeChanged(int i, int i2) {
        Iterator<DataBufferObserver> it = this.zalr.iterator();
        while (it.hasNext()) {
            it.next().onDataRangeChanged(i, i2);
        }
    }

    public final void onDataRangeInserted(int i, int i2) {
        Iterator<DataBufferObserver> it = this.zalr.iterator();
        while (it.hasNext()) {
            it.next().onDataRangeInserted(i, i2);
        }
    }

    public final void onDataRangeRemoved(int i, int i2) {
        Iterator<DataBufferObserver> it = this.zalr.iterator();
        while (it.hasNext()) {
            it.next().onDataRangeRemoved(i, i2);
        }
    }

    public final void onDataRangeMoved(int i, int i2, int i3) {
        Iterator<DataBufferObserver> it = this.zalr.iterator();
        while (it.hasNext()) {
            it.next().onDataRangeMoved(i, i2, i3);
        }
    }
}
