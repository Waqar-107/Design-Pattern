public class AudioPlayer implements MediaPlayer {
    MediaPlayer mediaPlayer;

    @Override
    public void play(String fileName) {
        //inbuilt support to play mp3 files
        if(fileName.endsWith(".mp3")){
            System.out.println("playing mp3 filel: "+fileName);
        }

        //mediadapter is providing suport to play other formats
        else if(fileName.endsWith(".vlc") || fileName.endsWith(".mp4")){
            mediaPlayer=new MediaAdapter(fileName);
            mediaPlayer.play(fileName);
        }

        else{
            System.out.println("invalid file format for "+fileName);
        }
    }
}
