package GameZone.WordChain;

import java.util.Scanner;

interface Game extends Additions{
    Scanner scan = new Scanner(System.in);


    void initialize();
    void play();
    boolean isGameOver();

    // This method will be inherited/used by default unless overridden
    default String userInput() {
        return scan.next().toLowerCase();
    }
}
