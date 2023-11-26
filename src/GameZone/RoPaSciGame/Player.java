package GameZone.RoPaSciGame;

import java.util.Scanner;

class Player {
    private int score;
    private String choice;

    public Player(int score) {
        this.score = score;
    }

    public void humanChoice(Scanner scan){
        System.out.print("Your move (R/P/S): ");
        String userInput = scan.next().toUpperCase();

        switch (userInput){
            case "R":
                choice = "ROCK";
                break;
            case "P":
                choice = "PAPER";
                break;
            case "S":
                choice = "SCiSSOR";
                break;
            default:
                System.out.println("Invalid input. Please follow the instruction.");
                // Re-prompts user for valid input (kind of recursive call)
                humanChoice(scan);
        }
    }

    public void computerChoice(){
        String[] choicesArr = {"ROCK", "PAPER", "SCiSSOR"};
        int arrIndexRandom = (int) (Math.random() * choicesArr.length);
        choice = choicesArr[arrIndexRandom];
    }

    public String getChoice(){
        return choice;
    }

    public int getScore(){
        return score;
    }

    public void updateScore(){
        score++;
    }
}

