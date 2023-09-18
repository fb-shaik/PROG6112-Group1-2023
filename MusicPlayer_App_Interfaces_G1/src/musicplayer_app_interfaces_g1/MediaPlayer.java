
package musicplayer_app_interfaces_g1;

//MediaPlayer can be seen as the Parent Class
//It will have child classes that implement's abstract methods which are common behaviors / methods
//Step1: Define the interface (MediaPlayer)
interface MediaPlayer {
    
    //Step2: Add in all abstract methods (common behaviors)
    //Abstract method has no method body/method implementation & there are no {}
    void play();
    void stop();
    void pause();
    void volumeUp();
    void volumeDown();
    void shuffle();
    void playList();
}
