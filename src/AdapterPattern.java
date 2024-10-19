
interface MediaPlayer {
    void play(String audioType, String fileName);
}

interface AdvancedMediaPlayer {
    void playVideo(String fileName);
}
class VideoPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVideo(String fileName) {
        System.out.println("Playing video file. Name: " + fileName);
    }
}
class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("video")) {
            advancedMediaPlayer = new VideoPlayer();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("video")) {
            advancedMediaPlayer.playVideo(fileName);
        }
    }
}
class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        }

        else if (audioType.equalsIgnoreCase("video")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}


public class AdapterPattern {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "song.mp3");
        audioPlayer.play("video", "movie.mp4");
        audioPlayer.play("avi", "mindme.avi");
    }
}






