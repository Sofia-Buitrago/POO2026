public class MediaPlayer {

    private static final int MIN_VOLUME = 0;
    private static final int MAX_VOLUME = 100;
    private static final int VOLUME_STEP = 5;

    private int volume;
    private boolean playing;

    public MediaPlayer() {
        this.volume = 50;
        this.playing = false;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isPlaying() {
        return playing;
    }

    public boolean increaseVolume() {
        if (volume >= MAX_VOLUME) {
            return false;
        }
        volume = Math.min(volume + VOLUME_STEP, MAX_VOLUME);
        return true;
    }

    public boolean decreaseVolume() {
        if (volume <= MIN_VOLUME) {
            return false;
        }
        volume = Math.max(volume - VOLUME_STEP, MIN_VOLUME);
        return true;
    }

    public boolean play() {
        if (playing) {
            return false;
        }
        playing = true;
        return true;
    }

    public boolean stop() {
        if (!playing) {
            return false;
        }
        playing = false;
        return true;
    }
}