package jp.co.koeitecmo.ktgl;

import android.media.MediaPlayer;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import jp.co.koeitecmo.ktgl.android.util.Log;

public class SoundStreamPlayer implements MediaPlayer.OnCompletionListener {
    private int StreamType = 3;
    private boolean isFinished = true;
    private MediaPlayer mp = new MediaPlayer();

    public static void dummy() {
    }

    public static SoundStreamPlayer createInstance(int i) {
        return new SoundStreamPlayer(i);
    }

    public static boolean deleteInstance(SoundStreamPlayer soundStreamPlayer) {
        soundStreamPlayer.mp.release();
        return true;
    }

    private SoundStreamPlayer(int i) {
        switch (i) {
            case 1:
                this.StreamType = 4;
                return;
            case 2:
                this.StreamType = 8;
                return;
            case 3:
                this.StreamType = 3;
                return;
            case 4:
                this.StreamType = 5;
                return;
            case 5:
                this.StreamType = 2;
                return;
            case 6:
                this.StreamType = 1;
                return;
            case 7:
                this.StreamType = 0;
                return;
            default:
                return;
        }
    }

    public boolean play(FileDescriptor fileDescriptor, long j, long j2, boolean z, float f, float f2) {
        try {
            this.mp.reset();
            this.mp.setDataSource(fileDescriptor, j, j2);
            this.mp.prepare();
            this.mp.setAudioStreamType(this.StreamType);
            boolean z2 = z;
            this.mp.setLooping(z);
            this.mp.setVolume(f, f2);
            this.mp.setOnCompletionListener(this);
            this.mp.start();
            this.isFinished = false;
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (Exception unused) {
            Log.d("SoundStreamPlayer play : " + fileDescriptor.toString());
            return false;
        }
    }

    public void stop() {
        if (!this.isFinished) {
            this.mp.stop();
            this.isFinished = true;
        }
    }

    public void pause() {
        if (this.mp.isPlaying()) {
            this.mp.pause();
        }
    }

    public void resume() {
        if (!this.mp.isPlaying()) {
            this.mp.start();
        }
    }

    public void setVolume(float f, float f2) {
        if (!this.isFinished) {
            this.mp.setVolume(f, f2);
        }
    }

    public void setLoop(boolean z) {
        if (!this.isFinished) {
            this.mp.setLooping(z);
        }
    }

    public float getDuration() {
        int duration = this.mp.getDuration();
        if (duration >= 0) {
            return ((float) duration) / 1000.0f;
        }
        return -1.0f;
    }

    public float getProgress() {
        int duration = this.mp.getDuration();
        if (!this.isFinished) {
            return ((float) this.mp.getCurrentPosition()) / ((float) duration);
        }
        return duration > 0 ? 1.0f : 0.0f;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        this.isFinished = true;
    }

    public int getStatus() {
        if (this.isFinished) {
            return 0;
        }
        if (!this.mp.isPlaying()) {
            return 3;
        }
        return 1;
    }
}
