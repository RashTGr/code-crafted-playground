package GameZone.WordChain;

import java.util.Random;
import java.util.Scanner;

class WordChainGame implements Game {

    Scanner scan = new Scanner(System.in);
    private String startingWord;
    private String latestWord;
    private String usedWords;

    @Override
    public void initialize() {
        String[] category = {"Animal", "City", "Name", "AnyWord"};
        Random random = new Random();

        int arrayIndex = random.nextInt(category.length);
        String randomCategory = category[arrayIndex];
        System.out.print("Game category is '" + randomCategory + "'. \nPlease provide starting word: ");
        startingWord = scan.next().toLowerCase().trim();

        latestWord = startingWord;
        usedWords = startingWord + ",";

    }

    @Override
    public void play() {

        int score = 0;

        while (!isGameOver()){
            System.out.print("\nFind a new word that the first letter to start with the last letter of \"" +latestWord +"\": ");
            String word = userInput();

            if (word.equalsIgnoreCase("exit") || word.equalsIgnoreCase("quit")) {
                break;
            }

            if (!isValidWord(word)){
                System.out.println("Warning! The word contains non-alphabetic characters. Try another word.");
                continue;
            }

            if (ifUsedWord(word)){
                System.out.println("This word is already used. Try another one!");
                continue;
            }

            if (word.charAt(0) == latestWord.charAt(latestWord.length() - 1)){
                score++;
                System.out.println("Move on. Your score is " + score);
            }else {
                System.out.println("Wrong. The first letter should start with the last letter of the latest word. Try again.");
                continue;
            }

            latestWord = word;
            usedWords =  usedWords.concat(word).concat(",");
        }
    }


    @Override
    public boolean isGameOver() {
        return latestWord.equalsIgnoreCase("exit") || latestWord.equalsIgnoreCase("quit");
    }

    // Checks if there are any non-alphabetic characters or the string is empty
    @Override
    public boolean isValidWord(String word){
        return word.matches("[a-zA-Z]+$");
    }

    // Get notified if the word is already used in the current session
    @Override
    public boolean ifUsedWord(String word) {
        return usedWords.contains("," + word + ",");
    }


}
