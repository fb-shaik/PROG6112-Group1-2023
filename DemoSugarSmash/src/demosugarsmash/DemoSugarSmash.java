package demosugarsmash;
//Main Class for the App
//create instances of both Super & Sub Class; set&get score levels; error handling
public class DemoSugarSmash {

    public static void main(String[] args) {
               // Creating a regular SugarSmashPlayer
        SugarSmashPlayer player1 = new SugarSmashPlayer(1, "Player1");
        player1.setScore(150, 1);
        player1.setScore(200, 2);
        System.out.println(player1.getScreenName() + "'s Scores:");
        System.out.println("Level 1: " + player1.getScore(1));
        System.out.println("Level 2: " + player1.getScore(2));

        // Creating a PremiumSugarSmashPlayer
        PremiumSugarSmashPlayer premiumPlayer1 = new PremiumSugarSmashPlayer(2, "PremiumPlayer1");
        premiumPlayer1.setPremiumScore(150, 1);
        premiumPlayer1.setPremiumScore(200, 2);
        System.out.println(premiumPlayer1.getScreenName() + "'s Premium Scores:");
        System.out.println("Premium Level 1: " + premiumPlayer1.getPremiumScore(1));
        System.out.println("Premium Level 2: " + premiumPlayer1.getPremiumScore(2));
    }
}