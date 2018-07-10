public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("vlc format not supported by mp4 player");
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("playing mp4 file: "+fileName);
    }
}
