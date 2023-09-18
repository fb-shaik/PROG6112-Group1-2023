
package musicplayer_app_interfaces_g1;
//This will be a child class of the MediaPlayer Parent class
public class USB implements MediaPlayer {
    @Override
    public void play(){System.out.println("USB: Play music.");}
    @Override
    public void stop(){System.out.println("USB: Stop music.");}
    @Override
    public void pause(){System.out.println("USB: Pause music.");}
    @Override
    public void volumeUp(){System.out.println("USB: Increase Volume.");}
    @Override
    public void volumeDown(){System.out.println("USB: Decrease Volume.");}
    @Override
    public void shuffle(){System.out.println("USB: Shuffle tracks.");}
    @Override
    public void playList(){System.out.println("USB: Display Playlist.");}
}
