
package musicplayer_app_interfaces_g1;
//This will be a child class of the MediaPlayer Parent class
public class Radio implements MediaPlayer{
    @Override
    public void play(){System.out.println("Radio: Play station.");}
    @Override
    public void stop(){System.out.println("Radio: Switching Off!.");}
    @Override
    public void pause(){System.out.println("Radio: Pause station.");}
    @Override
    public void volumeUp(){System.out.println("Radio: Increase Volume.");}
    @Override
    public void volumeDown(){System.out.println("Radio: Decrease Volume.");}
    @Override
    public void shuffle(){System.out.println("Radio: Shuffle Radio Stations.");}
    @Override
    public void playList(){System.out.println("Radio: Display Radio Stations Available.");}
}
