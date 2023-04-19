package Lsn_6;

import java.util.Scanner;

public class HangmanBasic {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Pre-defined words to be guessed by the user
        String words[] = {"monkey", "gorilla", "tiger", "giraffe", "panda"};

        // Pick a guessing word at random from the 'words' array based on index
        String randomWord = words[(int) (Math.random() * words.length)];
        System.out.println(randomWord);


        // Set the 'hiddenWord' to an underscore char of the same length as the 'randomWord'
        char hiddenWord[] = new char[randomWord.length()];

        System.out.print("Guess the word: ");
        for (int i = 0; i < randomWord.length(); i++) {
            System.out.print("_ ");

            //.. and initialize array with each char of the 'randomWord'
            hiddenWord[i] = randomWord.charAt(i);
        }

        int attemptCount = 0;
        boolean correctGuess[] = new boolean[hiddenWord.length];
        // User is asked to start guessing the letters of the hiddenWord
        do {
            System.out.print("\nType in a letter of your choice: ");
            String userInput = scan.next();
            char castedInput = userInput.charAt(0);

            for (int i = 0; i < hiddenWord.length; i++) {
                if (hiddenWord[i] == castedInput && correctGuess[i] == false) {
                    correctGuess[i] = true;
                    System.out.print(hiddenWord[i]);
                    attemptCount = 0;
                } else if (correctGuess[i] == true) {
                    System.out.print(hiddenWord[i]);
                } else if () {
                    
                } else {
                    System.out.print("_");
                }
            }
        } while (attemptCount < 5);




        // Printing the 'hiddenWord' to console in array format
        System.out.print("HiddenWord array = [");
        for (int i = 0; i < hiddenWord.length; i++) {
            String arrFormat = (i != randomWord.length() - 1) ? ", " : "] \n";
            System.out.print(hiddenWord[i] + arrFormat);
        }





    }
}
