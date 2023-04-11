package Lsn_4;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        int userInput, min, max, range, randomNo;
        
        min = 1;
        max = 100;
        range = max - min;
        randomNo = (int) (Math.random() * range) + min;
        System.out.println(randomNo);

        Scanner scan = new Scanner(System.in);
        System.out.print("Guess the number: ");
        userInput = scan.nextInt();

        while (userInput != randomNo){
            String diff = ((userInput - randomNo) <= 4 && (userInput - randomNo) >= -4) ? "You are very close!" : null;
            System.out.println(diff);
            System.out.print("Enter new number: ");
            userInput = scan.nextInt();
            if ((userInput - randomNo) > 4){
                System.out.println("Too high!");
                System.out.print("Enter new number: ");
                userInput = scan.nextInt();
            } else if ((userInput - randomNo) < -4) {
                System.out.println("Too low!");
                System.out.print("Enter new number: ");
                userInput = scan.nextInt();
            } else if (userInput == randomNo) {
                break;
            }
        }
        System.out.println("Congrats!");
    }
}
