public class CDPlayer extends AudioPlayer{
    private String CD;

    public CDPlayer(String volumeControl, String CD) {
        super(volumeControl);
        this.CD = CD;
    }
    @Override
    public void theSource(){
        System.out.println("the source is CD: "+CD);
    }
    public void play(){
        System.out.println("the music is not playing");
    }

    public void pause(){
        System.out.println("just pause");
    }
    public void stop(){
        System.out.println("yes stop");

    }

}
