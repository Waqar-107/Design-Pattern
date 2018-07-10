public class Client {
    public static void main(String[] args){
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("shots.mp3");
        audioPlayer.play("who we are.mp4");
        audioPlayer.play("the north remembers.vlc");
        audioPlayer.play("love me like you do.avi");
    }
}
