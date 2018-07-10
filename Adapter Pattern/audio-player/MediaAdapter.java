public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if(audioType.endsWith(".vlc")){
            advancedMediaPlayer=new VlcPlayer();
        }

        else if(audioType.endsWith(".mp4")){
            advancedMediaPlayer=new Mp4Player();
        }
    }

    @Override
    public void play(String fileName) {
        if(fileName.endsWith(".vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }

        else if(fileName.endsWith(".mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
