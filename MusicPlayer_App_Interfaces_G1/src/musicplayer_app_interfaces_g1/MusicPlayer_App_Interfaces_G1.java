
package musicplayer_app_interfaces_g1;

public class MusicPlayer_App_Interfaces_G1 {
//Demonstrate the interface MediaPlayer via its child class instances
    public static void main(String[] args) {
        //create objects for each of the media player interfaces
        MediaPlayer mp3Player = new Mp3Player();
        MediaPlayer radio = new Radio();
        MediaPlayer usb = new USB();
        MediaPlayer dvdPlayer = new DVDPlayer();
        
        //Demonstrate the use of interfaces
        System.out.println("Welcome to the Music Player App!");
        System.out.println("\n--- MP3 Player ---");
        mp3Player.play();
        mp3Player.pause();
        mp3Player.stop();
        mp3Player.playList();
        mp3Player.volumeDown();
        mp3Player.volumeUp();
        mp3Player.shuffle();
      
        System.out.println("\n--- USB Player ---");
        usb.play();
        usb.pause();
        usb.stop();
        usb.playList();
        usb.volumeDown();
        usb.volumeUp();
        usb.shuffle();
        
        System.out.println("\n--- DVD Player ---");
        dvdPlayer.play();
        dvdPlayer.pause();
        dvdPlayer.stop();
        dvdPlayer.playList();
        dvdPlayer.volumeDown();
        dvdPlayer.volumeUp();
        dvdPlayer.shuffle();
        
        System.out.println("\n--- Radio Player ---");
        radio.play();
        radio.pause();
        radio.stop();
        radio.playList();
        radio.volumeDown();
        radio.volumeUp();
        radio.shuffle();
        
        System.out.println("\n MediaPlayer is Switching Off!");
        
    }
    
}
