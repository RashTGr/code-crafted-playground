package GameZone.RoPaSciGame;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Player humanPlayer = new Player(0);
        Player computerPlayer = new Player(0);
        Game game = new Game();

        boolean status = true;

        while (status){
            humanPlayer.humanChoice(scan);
            computerPlayer.computerChoice();
            game.playRound(humanPlayer, computerPlayer);

            System.out.println("Continue: Yes/No");
            String userGameStatus = scan.next();

            if (userGameStatus.equalsIgnoreCase("No")) {
                status = false;
            }
        }
        scan.close();
    }
}
