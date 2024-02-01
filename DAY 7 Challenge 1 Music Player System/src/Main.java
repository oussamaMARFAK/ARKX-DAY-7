public class Main {
    public static void main(String[] args) {

        AudioPlayer tracks[]=new AudioPlayer[4];
        tracks[0]=new MP3Player("high","pc") ;
        tracks[1]=new MP3Player("high","phone") ;
        tracks[2]=new CDPlayer("low","cd/dvd lector") ;
        tracks[3]=new CDPlayer("low","pc lector") ;

        for (AudioPlayer T: tracks){
           T.theSource();
            T.pause();
           T.play();
           T.stop();
            System.out.println("------------------");
        }

    }
}