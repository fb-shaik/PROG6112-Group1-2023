package demosugarsmash;

//Base Class for regular players; contains methods for setting & getting the first 10 levels
class SugarSmashPlayer {
    // Fields to store player information and scores
    private int playerID;
    private String screenName;
    private int[] scores;

    // Constructor to initialize playerID, screenName, and scores array
    public SugarSmashPlayer(int playerID, String screenName) {
        this.playerID = playerID;
        this.screenName = screenName;
        this.scores = new int[10];
    }

    // Getter and setter methods for playerID
    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    // Getter and setter methods for screenName
    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    // Method to get a score for a specific game level
    public int getScore(int level) {
        if (level < 1 || level > 10) {
            System.out.println("Error: Invalid level");
            return -1;
        }
        return scores[level - 1];
    }

    // Method to set a score for a specific game level
    public void setScore(int score, int level) {
        if (level < 1 || level > 10) {
            System.out.println("Error: Invalid level");
            return;
        }

        if (level != 1 && score < 100) {
            System.out.println("Error: Minimum 100 points required to unlock this level.");
            return;
        }

        if (level > 1 && scores[level - 2] < 100) {
            System.out.println("Error: Previous level must have at least 100 points to unlock this level.");
            return;
        }

        scores[level - 1] = score;
    }
}