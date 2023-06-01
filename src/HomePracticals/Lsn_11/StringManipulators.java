package HomePracticals.Lsn_11;

import java.util.Scanner;

public class StringManipulators {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inputStr = scan.nextLine();
        System.out.print("Enter a subString: ");
        String inputSubstr = scan.nextLine();
        System.out.print("Enter a new subString: ");
        String inputNewSubstr = scan.nextLine();

        // Reversed
        System.out.print("Reversed string: " +reversed(inputStr));
        // No white spaces
        System.out.println("Trim string: " +removeWhitespace(inputStr));
        // Replace string
        System.out.println(replaceSubstring(inputStr, inputSubstr, inputNewSubstr));
    }


    /**
    *  Method that returns String input to the reversed version
     */
    public static String reversed(String str){
        StringBuilder sb = new StringBuilder(str); // creating SB object here
        sb.reverse(); // reverse() method of SB to reverse the SB object

        // Converting the reversed SB object to String again.
        String strReversing = sb.toString();
        return strReversing;
    }

    public static String removeWhitespace(String str){
       return str.trim();
    }

    public static String replaceSubstring(String str, String substr, String newSubstr){
        while (str.contains(substr)){
            str = str.replaceAll(substr, newSubstr);
        }
        return str;

    }
}
