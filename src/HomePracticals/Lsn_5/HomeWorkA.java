package HomePracticals.Lsn_5;

/**
 * The user is prompted to enter integers into an array, and the program
 * will subsequently calculate and print the sum and average of the array elements.
 */

import java.util.Scanner;

public class HomeWorkA {
    public static void main(String[] args) {

        // Local variables
        int sumArray = 0;
        float averageArray = 0;

        // Declaring array and allocating memory
        int userInput[] = new int[10];
        int len = userInput.length;

        // Prompt the user to input integers into the array
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter " + len + " int numbers: ");

        // Get inputs for array; calculate Sum and Average of all the elements
        for (int i = 0; i < len; i++){
            userInput[i] = scan.nextInt();
            sumArray += userInput[i];
            averageArray = sumArray/len;
        }

        // Print to console in array format
        System.out.print("userInput[] = {");
        for (int j = 0; j < len; j++){
            String comma = (j != len - 1) ? ", " : "";
            System.out.print(userInput[j] + comma);
        }
        System.out.println("}");
        System.out.println("The SUM of array elements: " + sumArray);
        System.out.println("The AVERAGE of array elements: " + averageArray);

    }
}
