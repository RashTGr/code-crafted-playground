package HomePracticals.Lsn_3;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        // Prompts the user to enter their exam score
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = scan.nextInt();

        // Using if-else statement with 'OR' logical operator
        if (score < 0 || score > 100) {
            System.out.println("The score should range from '0' to '100'. Try again!");

            // Nested 'If', 'ternary' and 'switch' statements along with 'relational' operators
        }else {
            String letterGrade = (score >= 0 && score <= 59) ? "F"
                    : (score >= 60 && score <= 69) ? "D"
                    : (score >= 70 && score <= 79) ? "C"
                    : (score >= 80 && score <= 89) ? "B"
                    : (score >= 90 && score <= 100) ? "A" : "The value should be 'int' type only";

            // Switch statement is used for output the result to console
            switch (letterGrade){
                case "F":
                    System.out.println("Letter grade of the score is 'F'.");
                    break;
                case "D":
                    System.out.println("Letter grade of the score is 'D'.");
                    break;
                case "C":
                    System.out.println("Letter grade of the score is 'C'.");
                    break;
                case "B":
                    System.out.println("Letter grade of the score is 'B'.");
                    break;
                case "A":
                    System.out.println("Congrats! Letter grade of the score is 'A'.");
                    break;
                default:
                    System.out.println("Out of range!");
            }
        }
    }
}
