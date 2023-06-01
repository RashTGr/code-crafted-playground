package HomePracticals.Lsn_8;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter int number to check: ");
        long input = scan.nextLong();
        boolean isPalindrome = isPalindrome(input);
        // This is to check the range of input number
        if ((long) Math.pow(-2, 31) > input || input > (long) Math.pow(2, 31)) {
            System.out.print("Out of range");
            return;
        }
        System.out.println(isPalindrome(input));
    }

    public static boolean isPalindrome(long numToCheck) {
        if (numToCheck <0){
            // To ensure no negative number is palindrome
            return false;
        }
        long copiedOriginal = numToCheck; // holds copy of original number
        long rem, reversedNum = 0;

        do {
            rem = (numToCheck % 10);
            reversedNum = reversedNum * 10 + rem;
            numToCheck /= 10;
        } while (numToCheck > 0);
        return copiedOriginal == reversedNum;
    }
}
