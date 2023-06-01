package HomePracticals.Lsn_11;

import java.util.Scanner;

public class StringAnalyzer {
    // This is the main method where we call iPalindrome method as in outer file
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter string value: "); // Rotavator
        String inputStr = scan.nextLine().toLowerCase();

        System.out.print("Enter substring: ");
        String substr = scan.next().toLowerCase();

        System.out.println("\n is Palindrome: " + isPalindrome(inputStr));
        System.out.println("\n Count of vowels: " + countVowel(inputStr));
        System.out.println("\n Has substring: " + hasSubstring(inputStr, substr));
    }

    // Palindrome method like a standalone external file
    public static boolean isPalindrome(String str) {
        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + str.charAt(i);
        }
        return reversedStr.equals(str);
    }

    // "Vowels" count method in the given string
    public static int countVowel(String str) {

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            for (int j = 0; j < vowels.length; j++) {
                while (vowels[j] == c) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    // Substring method
    public static boolean hasSubstring(String str, String substr) {
        return str.contains(substr);
    }
}


