package GameZone.TestPack;

import java.util.Scanner;

class WordChainGame implements Game {
    private String startingWord;
    private String lastWord;
    private boolean gameOver;

    @Override
    public void initialize() {
        startingWord = "apple"; // You can change the starting word if desired
        lastWord = startingWord;
        gameOver = false;
    }

    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Starting word: " + startingWord);

        while (!gameOver) {
            System.out.println("Enter a word: ");
            String word = scanner.nextLine();

            if (!isValidWord(word)) {
                System.out.println("Invalid word! Please enter a valid word starting with the letter " + lastWord.charAt(lastWord.length() - 1));
                continue;
            }

            if (word.equals("quit")) {
                gameOver = true;
                break;
            }

            lastWord = word;
        }

        scanner.close();
    }

    @Override
    public boolean isGameOver() {
        return gameOver;
    }

    private boolean isValidWord(String word) {
        return word.length() > 0 && word.charAt(0) == lastWord.charAt(lastWord.length() - 1);
    }
}
