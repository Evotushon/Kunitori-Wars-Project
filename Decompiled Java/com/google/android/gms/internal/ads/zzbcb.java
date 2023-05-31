package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbcb extends SSLSocketFactory {
    private SSLSocketFactory zzecu = ((SSLSocketFactory) SSLSocketFactory.getDefault());
    private final /* synthetic */ zzbcc zzecv;

    zzbcb(zzbcc zzbcc) {
        this.zzecv = zzbcc;
    }

    public final String[] getDefaultCipherSuites() {
        return this.zzecu.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.zzecu.getSupportedCipherSuites();
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return zza(this.zzecu.createSocket(socket, str, i, z));
    }

    public final Socket createSocket(String str, int i) throws IOException {
        return zza(this.zzecu.createSocket(str, i));
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return zza(this.zzecu.createSocket(str, i, inetAddress, i2));
    }

    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return zza(this.zzecu.createSocket(inetAddress, i));
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return zza(this.zzecu.createSocket(inetAddress, i, inetAddress2, i2));
    }

    private final Socket zza(Socket socket) throws SocketException {
        if (this.zzecv.zzecx > 0) {
            socket.setReceiveBufferSize(this.zzecv.zzecx);
        }
        this.zzecv.zzb(socket);
        return socket;
    }
}
