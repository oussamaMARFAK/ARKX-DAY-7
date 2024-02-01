public class MP3Player extends AudioPlayer {
private String mp3file;

    public MP3Player(String volumeControl, String mp3file) {
        super(volumeControl);
        this.mp3file = mp3file;
    }
    @Override
    public void theSource(){
        System.out.println("the source is mp3file: "+mp3file);
}
@Override
    public void play(){
        System.out.println("the music is playing");
    }
    public void pause(){
        System.out.println("track is not pausing");

    }
    public void stop(){
        System.out.println("don't stop ");

    }

}
