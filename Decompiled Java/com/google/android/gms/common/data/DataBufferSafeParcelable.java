package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.messaging.Constants;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public class DataBufferSafeParcelable<T extends SafeParcelable> extends AbstractDataBuffer<T> {
    private static final String[] zals = {Constants.ScionAnalytics.MessageType.DATA_MESSAGE};
    private final Parcelable.Creator<T> zalt;

    @KeepForSdk
    public DataBufferSafeParcelable(DataHolder dataHolder, Parcelable.Creator<T> creator) {
        super(dataHolder);
        this.zalt = creator;
    }

    @KeepForSdk
    public static DataHolder.Builder buildDataHolder() {
        return DataHolder.builder(zals);
    }

    @KeepForSdk
    public static <T extends SafeParcelable> void addValue(DataHolder.Builder builder, T t) {
        Parcel obtain = Parcel.obtain();
        t.writeToParcel(obtain, 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, obtain.marshall());
        builder.withRow(contentValues);
        obtain.recycle();
    }

    @KeepForSdk
    public T get(int i) {
        byte[] byteArray = this.mDataHolder.getByteArray(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, i, this.mDataHolder.getWindowIndex(i));
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(byteArray, 0, byteArray.length);
        obtain.setDataPosition(0);
        T t = (SafeParcelable) this.zalt.createFromParcel(obtain);
        obtain.recycle();
        return t;
    }
}
