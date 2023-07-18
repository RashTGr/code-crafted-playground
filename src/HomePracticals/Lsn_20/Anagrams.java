package HomePracticals.Lsn_20;

import java.util.Scanner;

public class Anagrams {
    private String firstWord;
    private String secondWord;

    public String getFirstWord() {
        return firstWord;
    }

    public String getSecondWord() {
        return secondWord;
    }

    public void setFirstWord(String firstWord) {
        this.firstWord = firstWord;
    }

    public void setSecondWord(String secondWord) {
        this.secondWord = secondWord;
    }


    // If the same length then iterate over each char and validate letters through indexes
    public boolean checkAnagram() {
        if (checkLength()) {
            char[] firstInputArr = firstWord.toCharArray();
            for (int i = 0; i < firstInputArr.length; i++) {
                int charIndex = secondWord.indexOf(firstInputArr[i]);
                if (charIndex == -1) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    // Get inputs from user
    public void getInputs() {
        Scanner scan = new Scanner(System.in);

        System.out.print("The first word: ");
        setFirstWord(scan.next().toLowerCase());
        System.out.print("The second word: ");
        setSecondWord(scan.next().toLowerCase());
    }

    // Check if the lengths of words are equals
    public boolean checkLength() {
        return firstWord.length() == secondWord.length();
    }
}
