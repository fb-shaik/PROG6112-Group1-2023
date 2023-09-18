
package musicplayer_app_interfaces_g1;
//This will be a child class of the MediaPlayer Parent class
public class Mp3Player implements MediaPlayer{
    @Override
    public void play(){System.out.println("MP3: Play music.");}
    @Override
    public void stop(){System.out.println("MP3: Stop music.");}
    @Override
    public void pause(){System.out.println("MP3: Pause music.");}
    @Override
    public void volumeUp(){System.out.println("MP3: Increase Volume.");}
    @Override
    public void volumeDown(){System.out.println("MP3: Decrease Volume.");}
    @Override
    public void shuffle(){System.out.println("MP3: Shuffle tracks.");}
    @Override
    public void playList(){System.out.println("MP3: Display Playlist.");}
}
