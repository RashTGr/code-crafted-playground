package HomePracticals.Lsn_20;

/**
 * This program exemplifies the utilization of diverse String types in the
 * context of Encryption.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StringEncryption {

    private String secretWord;
    private String salt = "@eniGmA#";


    public String getWord(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your secret word: ");
        secretWord = scan.nextLine();

        scan.close();
        return secretWord;
    }

    public int generateRandom(){
        Random random = new Random();
        // generates one random number between 3 and 17, sum() method called to help with addition
        int intRandom = random.ints(1,3, 17).sum();
        return intRandom;
    }


    public void encryptBufferMethod(){
        int intRandom = generateRandom();

        StringBuffer strBuffer = new StringBuffer();
        strBuffer.append(salt).append(getWord());

        // Convert concatenated words to char array and sort
        char[] wordsToChar = strBuffer.toString().toCharArray();
        Arrays.sort(wordsToChar);

        StringBuffer encrypted = new StringBuffer();
        for (int i = 0; i < wordsToChar.length; i++) {
            int ascii = wordsToChar[i] + intRandom; // ascii value plus random number
            char c = (char) ascii; // casting to char for real value in the ASCII table
            encrypted.append(c);
//            System.out.println(" ascii: " +ascii+ "| char: " +c+ "| encrypt: " +encrypted);
        }
        encrypted.append("!");
        System.out.println(encrypted);
    }


    public void encryptBuilderMethod(){
        int intRandom = generateRandom();

        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(salt).append(getWord());

        // Convert concatenated words to char array and sort
        char[] wordsToChar = strBuilder.toString().toCharArray();
        Arrays.sort(wordsToChar);

        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < wordsToChar.length; i++) {
            int ascii = wordsToChar[i] + intRandom; // ascii value plus random number
            char c = (char) ascii; // casting to char for real value in the ASCII table
            encrypted.append(c);
        }
        encrypted.append("!");
        System.out.println(encrypted);
    }


    public void encryptStringMethod(){
        int intRandom = generateRandom();

        String str = salt + getWord();

        // Convert concatenated words to char array and sort
        char[] wordsToChar = str.toCharArray();
        Arrays.sort(wordsToChar);

        String encrypted = "";
        for (int i = 0; i < wordsToChar.length; i++) {
            int ascii = wordsToChar[i] + intRandom; // ascii value plus random number
            char c = (char) ascii; // casting to char for real value in the ASCII table
            encrypted += c;
        }
        encrypted += "!";
        System.out.println(encrypted);
    }
}
