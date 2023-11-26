package GameZone.RoPaSciGame;

import java.util.Scanner;

class ProceduralVersion {
    private static final String[] CHOICES = {"ROCK", "PAPER", "SCiSSOR"};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int humanScore = 0;
        int compScore = 0;


        boolean status = true;
        String userGameStatus;
        while (status) {
            int random = (int) (Math.random() * CHOICES.length);
            String computerMove = CHOICES[random];

            System.out.print("Your move (R/P/S): ");
            char userInput = scan.next().toUpperCase().charAt(0);

            String humandPlayerMove;
            switch (userInput) {
                case 'R':
                    humandPlayerMove = "ROCK";
                    break;
                case 'P':
                    humandPlayerMove = "PAPER";
                    break;
                case 'S':
                    humandPlayerMove = "SCiSSOR";
                    break;
                default:
                    humandPlayerMove = "Invalid input.";
            }

            System.out.println("Human player: " + humandPlayerMove);
            System.out.println("Computer player: " + computerMove);


            int roundScoreHuman = 0;
            int roundScoreComp = 0;

            if (humandPlayerMove.equals("ROCK") && computerMove.equals("SCiSSOR")) {
                roundScoreHuman++;
                humanScore += roundScoreHuman;
                System.out.println("Human won this round. Overall score is " + humanScore);
            } else if (humandPlayerMove.equals("ROCK") && computerMove.equals("PAPER")) {
                roundScoreComp++;
                compScore += roundScoreComp;
                System.out.println("Computer won this round. Overall score is " + compScore);
            } else if (humandPlayerMove.equals("SCiSSOR") && computerMove.equals("PAPER")) {
                roundScoreHuman++;
                humanScore += roundScoreHuman;
                System.out.println("Human won this round. Overall score is " + humanScore);
            } else if (humandPlayerMove.equals("SCiSSOR") && computerMove.equals("ROCK")) {
                roundScoreComp++;
                compScore += roundScoreComp;
                System.out.println("Computer won this round. Overall score is " + compScore);
            } else if (humandPlayerMove.equals("PAPER") && computerMove.equals("ROCK")) {
                roundScoreHuman++;
                humanScore += roundScoreHuman;
                System.out.println("Human won this round. Overall score is " + humanScore);
            } else if (humandPlayerMove.equals("PAPER") && computerMove.equals("SCiSSOR")) {
                roundScoreComp++;
                compScore += roundScoreComp;
                System.out.println("Computer won this round. Overall score is " + compScore);
            } else if (humandPlayerMove.equals(computerMove)) {
                System.out.println("This round is Tie.");
            } else {
                System.out.println("No valid pair found.");
            }

            System.out.println("Continue or Exit: ");
            userGameStatus = scan.next();

            if (userGameStatus.equalsIgnoreCase("Exit")){
                status = false;
            }
        }
        scan.close();
    }
}
