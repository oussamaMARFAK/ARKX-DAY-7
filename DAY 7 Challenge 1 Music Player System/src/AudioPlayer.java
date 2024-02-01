abstract class AudioPlayer implements Playable{

    private String volumeControl;


    public AudioPlayer() {
    }

    public AudioPlayer(String volumeControl) {
        this.volumeControl = volumeControl;
    }
public abstract void theSource();
    public void play(){

    }

    public void pause(){

    }
    public void stop(){

    }



}
