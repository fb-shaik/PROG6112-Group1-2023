package demosugarsmash;

//Subclass of the SugarSmashPlayer for premium players who have access to 40 additional levels
class PremiumSugarSmashPlayer extends SugarSmashPlayer {
    // Additional scores array for premium levels
    private int[] premiumScores;

    // Constructor to initialize premiumScores array
    public PremiumSugarSmashPlayer(int playerID, String screenName) {
        super(playerID, screenName);
        this.premiumScores = new int[40];
    }

    // Getter and setter methods for premiumScores
    public int getPremiumScore(int level) {
        if (level < 1 || level > 40) {
            System.out.println("Error: Invalid premium level");
            return -1;
        }
        return premiumScores[level - 1];
    }

    public void setPremiumScore(int score, int level) {
        if (level < 1 || level > 40) {
            System.out.println("Error: Invalid premium level");
            return;
        }

        if (level != 1 && score < 100) {
            System.out.println("Error: Minimum 100 points required to unlock this premium level.");
            return;
        }

        if (level > 1 && premiumScores[level - 2] < 100) {
            System.out.println("Error: Previous premium level must have at least 100 points to unlock this level.");
            return;
        }

        premiumScores[level - 1] = score;
    }
}