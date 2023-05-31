package jp.co.koeitecmo.ktgl;

import android.media.AudioTrack;

public class SoundEffectManager {
    private int stream_type = 3;
    private SoundVoice[] voices;

    public static boolean deleteInstance(SoundEffectManager soundEffectManager) {
        return true;
    }

    public static void dummy() {
    }

    public static SoundEffectManager createInstance(int i, int i2) {
        return new SoundEffectManager(i, i2);
    }

    private class SoundVoice {
        private RawVoice raw_voice = null;

        private class RawVoice implements Runnable {
            private byte[] data = null;
            private boolean isStatic = true;
            private long length = 0;
            private long loopbegin = -1;
            private long offset = 0;
            private boolean stopFlag = false;
            private int streamType = 0;
            private AudioTrack track = null;
            private int trackSize = 0;

            private class BuffInfo {
                byte[] data;
                int length;
                int offset;
                AudioTrack track;

                private BuffInfo() {
                    this.track = null;
                    this.data = null;
                    this.offset = 0;
                    this.length = 0;
                }
            }

            public void run() {
                BuffInfo buffInfo = new BuffInfo();
                if (getFirstBuffInfo(buffInfo)) {
                    buffInfo.track.write(buffInfo.data, buffInfo.offset, buffInfo.length);
                    while (getNextBuffInfo(buffInfo)) {
                        buffInfo.track.write(buffInfo.data, buffInfo.offset, buffInfo.length);
                    }
                }
                buffInfo.data = null;
            }

            private synchronized boolean getFirstBuffInfo(BuffInfo buffInfo) {
                if (this.track == null) {
                    return false;
                }
                if (this.length <= 0) {
                    return false;
                }
                buffInfo.track = this.track;
                buffInfo.data = this.data;
                buffInfo.offset = (int) this.offset;
                buffInfo.length = (int) this.length;
                return true;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
                return false;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private synchronized boolean getNextBuffInfo(jp.co.koeitecmo.ktgl.SoundEffectManager.SoundVoice.RawVoice.BuffInfo r7) {
                /*
                    r6 = this;
                    monitor-enter(r6)
                    android.media.AudioTrack r0 = r6.track     // Catch:{ all -> 0x003f }
                    r1 = 0
                    if (r0 != 0) goto L_0x0008
                    monitor-exit(r6)
                    return r1
                L_0x0008:
                    long r2 = r6.loopbegin     // Catch:{ all -> 0x003f }
                    r4 = -1
                    int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r0 == 0) goto L_0x003d
                    long r2 = r6.length     // Catch:{ all -> 0x003f }
                    r4 = 0
                    int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r0 > 0) goto L_0x0019
                    goto L_0x003d
                L_0x0019:
                    android.media.AudioTrack r0 = r6.track     // Catch:{ all -> 0x003f }
                    r7.track = r0     // Catch:{ all -> 0x003f }
                    byte[] r0 = r6.data     // Catch:{ all -> 0x003f }
                    r7.data = r0     // Catch:{ all -> 0x003f }
                    long r0 = r6.offset     // Catch:{ all -> 0x003f }
                    long r2 = r6.loopbegin     // Catch:{ all -> 0x003f }
                    r4 = 2
                    long r2 = r2 * r4
                    long r0 = r0 + r2
                    int r1 = (int) r0     // Catch:{ all -> 0x003f }
                    r7.offset = r1     // Catch:{ all -> 0x003f }
                    long r0 = r6.length     // Catch:{ all -> 0x003f }
                    long r2 = r6.loopbegin     // Catch:{ all -> 0x003f }
                    java.lang.Long.signum(r2)
                    long r2 = r2 * r4
                    long r0 = r0 - r2
                    int r1 = (int) r0
                    r7.length = r1     // Catch:{ all -> 0x003f }
                    r7 = 1
                    monitor-exit(r6)
                    return r7
                L_0x003d:
                    monitor-exit(r6)
                    return r1
                L_0x003f:
                    r7 = move-exception
                    monitor-exit(r6)
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: jp.co.koeitecmo.ktgl.SoundEffectManager.SoundVoice.RawVoice.getNextBuffInfo(jp.co.koeitecmo.ktgl.SoundEffectManager$SoundVoice$RawVoice$BuffInfo):boolean");
            }

            public RawVoice() {
            }

            /* JADX WARNING: Code restructure failed: missing block: B:61:0x0132, code lost:
                return r19;
             */
            /* JADX WARNING: Removed duplicated region for block: B:42:0x00be  */
            /* JADX WARNING: Removed duplicated region for block: B:43:0x00c9  */
            /* JADX WARNING: Removed duplicated region for block: B:46:0x00d5  */
            /* JADX WARNING: Removed duplicated region for block: B:49:0x00ef  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public synchronized boolean load(int r22, byte[] r23, long r24, long r26, long r28) {
                /*
                    r21 = this;
                    r1 = r21
                    r0 = r22
                    r9 = r23
                    r10 = r24
                    r12 = r26
                    r14 = r28
                    monitor-enter(r21)
                    boolean r2 = r1.isStatic     // Catch:{ all -> 0x0133 }
                    r8 = 0
                    r7 = 1
                    r6 = 2
                    r5 = 0
                    if (r2 != 0) goto L_0x005c
                    int r2 = android.media.AudioTrack.getNativeOutputSampleRate(r22)     // Catch:{ all -> 0x0133 }
                    r3 = 4
                    int r16 = android.media.AudioTrack.getMinBufferSize(r2, r3, r6)     // Catch:{ all -> 0x0133 }
                    android.media.AudioTrack r4 = new android.media.AudioTrack     // Catch:{ all -> 0x0133 }
                    int r17 = android.media.AudioTrack.getNativeOutputSampleRate(r22)     // Catch:{ all -> 0x0133 }
                    r18 = 4
                    r19 = 2
                    r20 = 1
                    r2 = r4
                    r3 = r22
                    r0 = r4
                    r4 = r17
                    r5 = r18
                    r6 = r19
                    r7 = r16
                    r14 = r8
                    r8 = r20
                    r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0133 }
                    r1.track = r0     // Catch:{ all -> 0x0133 }
                    android.media.AudioTrack r0 = r1.track     // Catch:{ all -> 0x0133 }
                    if (r0 != 0) goto L_0x0045
                    monitor-exit(r21)
                    r15 = 0
                    return r15
                L_0x0045:
                    r15 = 0
                    android.media.AudioTrack r0 = r1.track     // Catch:{ all -> 0x0133 }
                    int r0 = r0.getState()     // Catch:{ all -> 0x0133 }
                    r8 = 1
                    if (r0 == r8) goto L_0x0058
                    android.media.AudioTrack r0 = r1.track     // Catch:{ all -> 0x0133 }
                    r0.release()     // Catch:{ all -> 0x0133 }
                    r1.track = r14     // Catch:{ all -> 0x0133 }
                    monitor-exit(r21)
                    return r15
                L_0x0058:
                    r3 = 2
                    r19 = 1
                    goto L_0x00ba
                L_0x005c:
                    r14 = r8
                    r8 = 1
                    r15 = 0
                    int r2 = (int) r12
                    int r7 = r2 + 2048
                    android.media.AudioTrack r2 = r1.track     // Catch:{ all -> 0x0133 }
                    if (r2 == 0) goto L_0x007f
                    int r2 = r1.streamType     // Catch:{ all -> 0x0133 }
                    if (r2 != r0) goto L_0x007f
                    int r2 = r1.trackSize     // Catch:{ all -> 0x0133 }
                    if (r2 >= r7) goto L_0x006f
                    goto L_0x007f
                L_0x006f:
                    android.media.AudioTrack r0 = r1.track     // Catch:{ all -> 0x0133 }
                    r0.stop()     // Catch:{ all -> 0x0133 }
                    android.media.AudioTrack r0 = r1.track     // Catch:{ all -> 0x0133 }
                    r0.flush()     // Catch:{ all -> 0x0133 }
                    android.media.AudioTrack r0 = r1.track     // Catch:{ all -> 0x0133 }
                    r0.reloadStaticData()     // Catch:{ all -> 0x0133 }
                    goto L_0x0058
                L_0x007f:
                    android.media.AudioTrack r6 = new android.media.AudioTrack     // Catch:{ all -> 0x0133 }
                    int r4 = android.media.AudioTrack.getNativeOutputSampleRate(r22)     // Catch:{ all -> 0x0133 }
                    r5 = 4
                    r16 = 2
                    r17 = 0
                    r2 = r6
                    r3 = r22
                    r14 = r6
                    r6 = r16
                    r16 = r7
                    r19 = 1
                    r8 = r17
                    r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0133 }
                    r1.track = r14     // Catch:{ all -> 0x0133 }
                    android.media.AudioTrack r2 = r1.track     // Catch:{ all -> 0x0133 }
                    if (r2 != 0) goto L_0x00a1
                    monitor-exit(r21)
                    return r15
                L_0x00a1:
                    android.media.AudioTrack r2 = r1.track     // Catch:{ all -> 0x0133 }
                    int r2 = r2.getState()     // Catch:{ all -> 0x0133 }
                    r3 = 2
                    if (r2 == r3) goto L_0x00b4
                    android.media.AudioTrack r0 = r1.track     // Catch:{ all -> 0x0133 }
                    r0.release()     // Catch:{ all -> 0x0133 }
                    r0 = 0
                    r1.track = r0     // Catch:{ all -> 0x0133 }
                    monitor-exit(r21)
                    return r15
                L_0x00b4:
                    r2 = r16
                    r1.trackSize = r2     // Catch:{ all -> 0x0133 }
                    r1.streamType = r0     // Catch:{ all -> 0x0133 }
                L_0x00ba:
                    boolean r0 = r1.isStatic     // Catch:{ all -> 0x0133 }
                    if (r0 != 0) goto L_0x00c9
                    r1.data = r9     // Catch:{ all -> 0x0133 }
                    r1.offset = r10     // Catch:{ all -> 0x0133 }
                    r1.length = r12     // Catch:{ all -> 0x0133 }
                    r4 = r28
                    r1.loopbegin = r4     // Catch:{ all -> 0x0133 }
                    goto L_0x00cb
                L_0x00c9:
                    r4 = r28
                L_0x00cb:
                    r1.stopFlag = r15     // Catch:{ all -> 0x0133 }
                    boolean r0 = r1.isStatic     // Catch:{ all -> 0x0133 }
                    r6 = 2
                    r14 = 0
                    if (r0 != 0) goto L_0x00ef
                    long r2 = r1.loopbegin     // Catch:{ all -> 0x0133 }
                    int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
                    if (r0 >= 0) goto L_0x0131
                    android.media.AudioTrack r0 = r1.track     // Catch:{ all -> 0x0133 }
                    jp.co.koeitecmo.ktgl.SoundEffectManager$SoundVoice$RawVoice$1 r2 = new jp.co.koeitecmo.ktgl.SoundEffectManager$SoundVoice$RawVoice$1     // Catch:{ all -> 0x0133 }
                    r2.<init>()     // Catch:{ all -> 0x0133 }
                    r0.setPlaybackPositionUpdateListener(r2)     // Catch:{ all -> 0x0133 }
                    android.media.AudioTrack r0 = r1.track     // Catch:{ all -> 0x0133 }
                    long r2 = r1.length     // Catch:{ all -> 0x0133 }
                    long r2 = r2 / r6
                    int r3 = (int) r2     // Catch:{ all -> 0x0133 }
                    r0.setNotificationMarkerPosition(r3)     // Catch:{ all -> 0x0133 }
                    goto L_0x0131
                L_0x00ef:
                    int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
                    if (r0 >= 0) goto L_0x0120
                    android.media.AudioTrack r0 = r1.track     // Catch:{ all -> 0x0133 }
                    jp.co.koeitecmo.ktgl.SoundEffectManager$SoundVoice$RawVoice$2 r2 = new jp.co.koeitecmo.ktgl.SoundEffectManager$SoundVoice$RawVoice$2     // Catch:{ all -> 0x0133 }
                    r2.<init>()     // Catch:{ all -> 0x0133 }
                    r0.setPlaybackPositionUpdateListener(r2)     // Catch:{ all -> 0x0133 }
                    android.media.AudioTrack r0 = r1.track     // Catch:{ all -> 0x0133 }
                    int r2 = (int) r10     // Catch:{ all -> 0x0133 }
                    int r4 = (int) r12     // Catch:{ all -> 0x0133 }
                    int r5 = r4 + 2048
                    int r0 = r0.write(r9, r2, r5)     // Catch:{ all -> 0x0133 }
                    r2 = -3
                    if (r0 == r2) goto L_0x0114
                    r2 = -2
                    if (r0 == r2) goto L_0x010e
                    goto L_0x0119
                L_0x010e:
                    java.lang.String r0 = "failed to write data : BAD_VALUE"
                    jp.co.koeitecmo.ktgl.android.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0133 }
                    goto L_0x0119
                L_0x0114:
                    java.lang.String r0 = "failed to write data : INVALID_OPERATION"
                    jp.co.koeitecmo.ktgl.android.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0133 }
                L_0x0119:
                    android.media.AudioTrack r0 = r1.track     // Catch:{ all -> 0x0133 }
                    int r4 = r4 / r3
                    r0.setNotificationMarkerPosition(r4)     // Catch:{ all -> 0x0133 }
                    goto L_0x0131
                L_0x0120:
                    android.media.AudioTrack r0 = r1.track     // Catch:{ all -> 0x0133 }
                    int r2 = (int) r4     // Catch:{ all -> 0x0133 }
                    long r3 = r12 / r6
                    int r4 = (int) r3     // Catch:{ all -> 0x0133 }
                    r3 = -1
                    r0.setLoopPoints(r2, r4, r3)     // Catch:{ all -> 0x0133 }
                    android.media.AudioTrack r0 = r1.track     // Catch:{ all -> 0x0133 }
                    int r2 = (int) r10     // Catch:{ all -> 0x0133 }
                    int r3 = (int) r12     // Catch:{ all -> 0x0133 }
                    r0.write(r9, r2, r3)     // Catch:{ all -> 0x0133 }
                L_0x0131:
                    monitor-exit(r21)
                    return r19
                L_0x0133:
                    r0 = move-exception
                    monitor-exit(r21)
                    goto L_0x0137
                L_0x0136:
                    throw r0
                L_0x0137:
                    goto L_0x0136
                */
                throw new UnsupportedOperationException("Method not decompiled: jp.co.koeitecmo.ktgl.SoundEffectManager.SoundVoice.RawVoice.load(int, byte[], long, long, long):boolean");
            }

            public synchronized void play(int i, float f, float f2) {
                if (this.track != null) {
                    this.track.setStereoVolume(f, f2);
                    this.track.setPlaybackRate(i);
                    this.track.play();
                    if (!this.isStatic) {
                        new Thread(this).start();
                    }
                }
            }

            public synchronized void stop() {
                if (this.track != null) {
                    this.track.setPlaybackPositionUpdateListener((AudioTrack.OnPlaybackPositionUpdateListener) null);
                    this.track.stop();
                    this.stopFlag = true;
                }
            }

            public synchronized boolean isFinished() {
                if (this.track == null) {
                    return true;
                }
                if (this.stopFlag) {
                    return true;
                }
                return false;
            }

            public synchronized void setVolume(float f, float f2) {
                if (!isFinished()) {
                    this.track.setStereoVolume(f, f2);
                }
            }

            public synchronized void setPlaybackRate(int i) {
                if (!isFinished()) {
                    this.track.setPlaybackRate(i);
                }
            }
        }

        public SoundVoice() {
        }

        public synchronized boolean prepare(int i, byte[] bArr, long j, long j2, long j3) {
            boolean z;
            synchronized (this) {
                if (this.raw_voice != null) {
                    this.raw_voice.stop();
                } else {
                    this.raw_voice = new RawVoice();
                }
                this.raw_voice.load(i, bArr, j, j2, j3);
                z = !this.raw_voice.isFinished();
            }
            return z;
        }

        public synchronized void play(int i, float f, float f2) {
            if (this.raw_voice != null) {
                this.raw_voice.play(i, f, f2);
            }
        }

        public synchronized void stop() {
            if (this.raw_voice != null) {
                this.raw_voice.stop();
            }
        }

        public synchronized boolean isFinished() {
            if (this.raw_voice == null) {
                return true;
            }
            return this.raw_voice.isFinished();
        }

        public synchronized void setVolume(float f, float f2) {
            if (this.raw_voice != null) {
                this.raw_voice.setVolume(f, f2);
            }
        }

        public synchronized void setPlaybackRate(int i) {
            if (this.raw_voice != null) {
                this.raw_voice.setPlaybackRate(i);
            }
        }
    }

    private SoundEffectManager(int i, int i2) {
        switch (i2) {
            case 1:
                this.stream_type = 4;
                break;
            case 2:
                this.stream_type = 8;
                break;
            case 3:
                this.stream_type = 3;
                break;
            case 4:
                this.stream_type = 5;
                break;
            case 5:
                this.stream_type = 2;
                break;
            case 6:
                this.stream_type = 1;
                break;
            case 7:
                this.stream_type = 0;
                break;
        }
        this.voices = new SoundVoice[i];
        for (int i3 = 0; i3 < i; i3++) {
            this.voices[i3] = new SoundVoice();
        }
    }

    public boolean prepare(int i, SoundBank soundBank, long j, long j2, long j3) {
        return this.voices[i].prepare(this.stream_type, soundBank.getData(), j, j2, j3);
    }

    public void play(int i, int i2, float f, float f2) {
        this.voices[i].play(i2, f, f2);
    }

    public void stop(int i) {
        this.voices[i].stop();
    }

    public void setVolume(int i, float f, float f2) {
        this.voices[i].setVolume(f, f2);
    }

    public void setPlaybackRate(int i, int i2) {
        this.voices[i].setPlaybackRate(i2);
    }

    public boolean isFinished(int i) {
        return this.voices[i].isFinished();
    }

    public long getTrackEnd() {
        long j = 0;
        int i = 0;
        while (true) {
            SoundVoice[] soundVoiceArr = this.voices;
            if (i >= soundVoiceArr.length) {
                return j;
            }
            if (soundVoiceArr[i].isFinished()) {
                j |= (long) (1 << i);
            }
            i++;
        }
    }
}
