package musicplayer_app_interfaces_g1;

//This will be a child class of the MediaPlayer Parent class
public class DVDPlayer implements MediaPlayer {
    @Override
    public void play(){System.out.println("DVD: Play scene.");}
    @Override
    public void stop(){System.out.println("DVD: Stop scene.");}
    @Override
    public void pause(){System.out.println("DVD: Pause scene.");}
    @Override
    public void volumeUp(){System.out.println("DVD: Increase Volume.");}
    @Override
    public void volumeDown(){System.out.println("DVD: Decrease Volume.");}
    @Override
    public void shuffle(){System.out.println("DVD: Shuffle scenes.");}
    @Override
    public void playList(){System.out.println("DVD: Display Scene-list.");}
}
