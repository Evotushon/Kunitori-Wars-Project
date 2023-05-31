package jp.co.koeitecmo.ktgl;

import android.media.SoundPool;
import java.io.FileDescriptor;
import java.util.Arrays;

public class SoundEffectManager2 {
    private SoundBank[] banks;
    private int stream_type = 3;
    private SoundVoice[] voices;

    public static boolean deleteInstance(SoundEffectManager2 soundEffectManager2) {
        return true;
    }

    public static void dummy() {
    }

    public static SoundEffectManager2 createInstance(int i, int i2, int i3) {
        return new SoundEffectManager2(i, i2, i3);
    }

    private class SoundVoice {
        /* access modifiers changed from: private */
        public int bankId = -1;
        /* access modifiers changed from: private */
        public long endTime = -1;
        /* access modifiers changed from: private */
        public long leftTime = -1;
        /* access modifiers changed from: private */
        public int soundId = -1;
        /* access modifiers changed from: private */
        public long startTime = -1;
        /* access modifiers changed from: private */
        public int streamId = 0;

        public SoundVoice() {
        }
    }

    private class SoundBank {
        private int[] loadStats = null;
        private SoundPool pool = null;
        private int[] soundIds = null;

        public SoundBank(int i, int i2, int i3, int i4) {
            this.pool = new SoundPool(i2, i3, i4);
            this.soundIds = new int[i];
            Arrays.fill(this.soundIds, -1);
            this.loadStats = new int[i];
            for (int i5 = 0; i5 < i; i5++) {
                this.loadStats[i5] = 0;
            }
            Arrays.fill(this.loadStats, 0);
        }

        public boolean append(int i) {
            int[] iArr = this.soundIds;
            int length = iArr.length;
            int i2 = i + length;
            if (i2 > 256) {
                return false;
            }
            int[] iArr2 = new int[i2];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            Arrays.fill(iArr2, length, i2, -1);
            this.soundIds = iArr2;
            int[] iArr3 = new int[i2];
            System.arraycopy(this.loadStats, 0, iArr3, 0, length);
            Arrays.fill(iArr3, length, i2, 0);
            this.loadStats = iArr3;
            return true;
        }

        public final void release() {
            this.pool.release();
        }

        public boolean load(int i, FileDescriptor fileDescriptor, long j, long j2, int i2) {
            int play;
            int i3 = i;
            if (i3 >= 0) {
                int[] iArr = this.soundIds;
                if (i3 < iArr.length) {
                    int[] iArr2 = this.loadStats;
                    if (iArr2[i3] != 0) {
                        return false;
                    }
                    iArr2[i3] = 1;
                    iArr[i3] = this.pool.load(fileDescriptor, j, j2, i2);
                    do {
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException unused) {
                        }
                        play = this.pool.play(this.soundIds[i3], 0.0f, 0.0f, 1, 0, 1.0f);
                    } while (play == 0);
                    this.pool.stop(play);
                    this.loadStats[i3] = 2;
                    return true;
                }
            }
            return false;
        }

        public boolean unload(int i, int i2) {
            boolean z = true;
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = i + i3;
                if (this.loadStats[i4] != 0) {
                    if (!this.pool.unload(this.soundIds[i4])) {
                        z = false;
                    }
                    this.loadStats[i4] = 0;
                    this.soundIds[i4] = -1;
                }
            }
            return z;
        }

        public boolean isLoading(int i) {
            if (i < 0 || i >= this.soundIds.length || this.loadStats[i] != 1) {
                return false;
            }
            return true;
        }

        public boolean isLoading() {
            int i = 0;
            while (true) {
                int[] iArr = this.loadStats;
                if (i >= iArr.length) {
                    return false;
                }
                if (iArr[i] == 1) {
                    return true;
                }
                i++;
            }
        }

        public int play(int i, float f, float f2, int i2, int i3, float f3) {
            int i4 = i;
            if (i4 >= 0) {
                int[] iArr = this.soundIds;
                if (i4 < iArr.length && this.loadStats[i4] == 2) {
                    return this.pool.play(iArr[i4], f, f2, i2, i3, f3);
                }
                return 0;
            }
            return 0;
        }

        public void stop(int i) {
            this.pool.setVolume(i, 0.0f, 0.0f);
            this.pool.stop(i);
        }

        public void setVolume(int i, float f, float f2) {
            this.pool.setVolume(i, f, f2);
        }

        public void setRate(int i, float f) {
            this.pool.setRate(i, f);
        }
    }

    private SoundEffectManager2(int i, int i2, int i3) {
        switch (i3) {
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
        this.voices = new SoundVoice[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            this.voices[i4] = new SoundVoice();
        }
        this.banks = new SoundBank[i];
    }

    public boolean createBank(int i, int i2, int i3) {
        SoundBank[] soundBankArr = this.banks;
        if (soundBankArr[i] == null) {
            soundBankArr[i] = new SoundBank(i2, i3, this.stream_type, 0);
            return true;
        }
        soundBankArr[i].release();
        return true;
    }

    public boolean appendBank(int i, int i2) {
        SoundBank[] soundBankArr = this.banks;
        if (soundBankArr[i] == null) {
            return false;
        }
        return soundBankArr[i].append(i2);
    }

    public boolean loadDataToBank(int i, int i2, FileDescriptor fileDescriptor, int i3, int i4) {
        SoundBank[] soundBankArr = this.banks;
        if (soundBankArr[i] == null) {
            return false;
        }
        return soundBankArr[i].load(i2, fileDescriptor, (long) i3, (long) i4, 1);
    }

    public boolean unloadDataFromBank(int i, int i2, int i3) {
        if (this.banks[i] == null) {
            return false;
        }
        int i4 = 0;
        while (true) {
            SoundVoice[] soundVoiceArr = this.voices;
            if (i4 >= soundVoiceArr.length) {
                return this.banks[i].unload(i2, i3);
            }
            if (soundVoiceArr[i4].streamId != 0 && this.voices[i4].bankId == i && this.voices[i4].soundId >= i2 && this.voices[i4].soundId < i2 + i3) {
                this.banks[i].stop(this.voices[i4].streamId);
                int unused = this.voices[i4].streamId = 0;
                int unused2 = this.voices[i4].bankId = -1;
                int unused3 = this.voices[i4].soundId = -1;
            }
            i4++;
        }
    }

    public void releaseBank(int i) {
        if (this.banks[i] != null) {
            int i2 = 0;
            while (true) {
                SoundVoice[] soundVoiceArr = this.voices;
                if (i2 < soundVoiceArr.length) {
                    if (soundVoiceArr[i2].streamId != 0 && this.voices[i2].bankId == i) {
                        this.banks[i].stop(this.voices[i2].streamId);
                        int unused = this.voices[i2].streamId = 0;
                        int unused2 = this.voices[i2].bankId = -1;
                        int unused3 = this.voices[i2].soundId = -1;
                    }
                    i2++;
                } else {
                    this.banks[i].release();
                    this.banks[i] = null;
                    return;
                }
            }
        }
    }

    public boolean isBankLoading(int i) {
        SoundBank[] soundBankArr = this.banks;
        if (soundBankArr[i] == null) {
            return false;
        }
        return soundBankArr[i].isLoading();
    }

    public boolean isBankLoading(int i, int i2) {
        SoundBank[] soundBankArr = this.banks;
        if (soundBankArr[i] == null) {
            return false;
        }
        return soundBankArr[i].isLoading(i2);
    }

    public void play(int i, int i2, int i3, float f, float f2, float f3, int i4) {
        int i5 = i2;
        int i6 = i4;
        if (this.voices[i].streamId != 0) {
            this.banks[this.voices[i].bankId].stop(this.voices[i].streamId);
            int unused = this.voices[i].streamId = 0;
            int unused2 = this.voices[i].bankId = -1;
            int unused3 = this.voices[i].soundId = -1;
        }
        int unused4 = this.voices[i].streamId = this.banks[i5].play(i3, f, f2, 0, i6 < 0 ? -1 : 0, f3);
        if (this.voices[i].streamId != 0) {
            if (i6 < 0) {
                SoundVoice[] soundVoiceArr = this.voices;
                long unused5 = soundVoiceArr[i].startTime = soundVoiceArr[i].endTime = soundVoiceArr[i].leftTime = -1;
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                long unused6 = this.voices[i].startTime = currentTimeMillis;
                long unused7 = this.voices[i].leftTime = (long) i6;
                long unused8 = this.voices[i].endTime = currentTimeMillis + ((long) (((float) i6) / f3));
            }
            int unused9 = this.voices[i].bankId = i5;
            int unused10 = this.voices[i].soundId = i3;
        }
    }

    public void stop(int i) {
        if (this.voices[i].streamId != 0) {
            this.banks[this.voices[i].bankId].stop(this.voices[i].streamId);
            int unused = this.voices[i].streamId = 0;
            int unused2 = this.voices[i].bankId = -1;
            int unused3 = this.voices[i].soundId = -1;
        }
    }

    public void setVolume(int i, float f, float f2) {
        if (this.voices[i].streamId != 0) {
            this.banks[this.voices[i].bankId].setVolume(this.voices[i].streamId, f, f2);
        }
    }

    public void setPlaybackRate(int i, float f) {
        if (this.voices[i].streamId != 0) {
            this.banks[this.voices[i].bankId].setRate(this.voices[i].streamId, f);
            long access$400 = this.voices[i].endTime;
            if (access$400 >= 0) {
                long currentTimeMillis = System.currentTimeMillis();
                if (access$400 > currentTimeMillis) {
                    SoundVoice[] soundVoiceArr = this.voices;
                    long unused = soundVoiceArr[i].leftTime = (soundVoiceArr[i].leftTime * (access$400 - currentTimeMillis)) / (access$400 - this.voices[i].startTime);
                    long unused2 = this.voices[i].startTime = currentTimeMillis;
                    SoundVoice[] soundVoiceArr2 = this.voices;
                    long unused3 = soundVoiceArr2[i].endTime = currentTimeMillis + ((long) (((float) soundVoiceArr2[i].leftTime) / f));
                }
            }
        }
    }

    public long getVoiceEnd() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = 0;
        int i = 0;
        while (true) {
            SoundVoice[] soundVoiceArr = this.voices;
            if (i >= soundVoiceArr.length) {
                return j;
            }
            if (soundVoiceArr[i].streamId == 0) {
                j |= (long) (1 << i);
            } else {
                long access$400 = this.voices[i].endTime;
                if (access$400 >= 0 && access$400 < currentTimeMillis) {
                    j |= (long) (1 << i);
                    int unused = this.voices[i].streamId = 0;
                    int unused2 = this.voices[i].bankId = -1;
                    int unused3 = this.voices[i].soundId = -1;
                }
            }
            i++;
        }
    }
}
