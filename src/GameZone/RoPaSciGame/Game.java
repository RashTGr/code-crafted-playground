package GameZone.RoPaSciGame;

public class Game {
    public void playRound(Player humanPlayer, Player computerPlayer){
        String humanChoice = humanPlayer.getChoice();
        String computerChoice = computerPlayer.getChoice();

        System.out.println("Human player: " +humanChoice);
        System.out.println("Computer player: " +computerChoice);

        if (humanChoice.equals(computerChoice)){
            System.out.println("round = Tie.");
        } else if ((humanChoice.equals("ROCK") && computerChoice.equals("SCiSSOR"))
                || (humanChoice.equals("SCiSSOR") && computerChoice.equals("PAPER"))
                || (humanChoice.equals("PAPER") && computerChoice.equals("ROCK"))) {
            humanPlayer.updateScore();
            System.out.println("round = Win. Your score is " +humanPlayer.getScore());
        } else {
            computerPlayer.updateScore();
            System.out.println("round = Lose. Computer score is " +computerPlayer.getScore());
        }
    }
}
