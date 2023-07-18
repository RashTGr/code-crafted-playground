package HomePracticals.Lsn_24.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public static String inputString(String text) {
        Scanner scan = new Scanner(System.in);
        System.out.print(text + ": ");
        String input = null;

        try {
            input = scan.nextLine();
        }catch (InputMismatchException e) {
            System.out.println("Invalid format. Please enter one of the given text options.");
        }
        return input;
    }

    public static int inputNumber(String text) {
        Scanner scan = new Scanner(System.in);
        System.out.print(text + ": ");
        int input = 0;

        try {
            input = scan.nextInt();
            scan.nextLine(); // to consume newline character after reading the numeric input
        } catch (InputMismatchException e) {
            System.out.println("Invalid format. Please enter a number only.");
        }
        return input;
    }
}
