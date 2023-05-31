package jp.co.koeitecmo.ktgl;

import java.io.FileDescriptor;
import java.lang.reflect.Field;

public class SoundBank {
    private byte[] data;

    public static boolean deleteInstance(SoundBank soundBank) {
        return true;
    }

    public static void dummy() {
    }

    public static SoundBank createInstance(byte[] bArr) {
        return new SoundBank(bArr);
    }

    public static int getFDFromFileDescriptor(FileDescriptor fileDescriptor) {
        try {
            Field declaredField = fileDescriptor.getClass().getDeclaredField("descriptor");
            declaredField.setAccessible(true);
            return declaredField.getInt(fileDescriptor);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return -1;
        }
    }

    private SoundBank(byte[] bArr) {
        this.data = bArr;
    }

    public byte[] getData() {
        return this.data;
    }
}
