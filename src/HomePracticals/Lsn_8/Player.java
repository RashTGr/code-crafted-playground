package HomePracticals.Lsn_8;

/**
 * Player class of Rock, Paper, Scissors Game
 */
public class Player {

    private String Name;
    private int score;
    private String choice;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public Player(String humanName, int score, String choice) {
        this.Name = humanName;
        this.score = score;
        this.choice = choice;


    }
}
