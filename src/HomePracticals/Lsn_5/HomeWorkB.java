package HomePracticals.Lsn_5;

/**
 * This program prints out the values in the array in reverse order.
 */

public class HomeWorkB {
    public static void main(String[] args) {

        int originalArray[] = {3, 6, 9, 12, 15};
        int len = originalArray.length;
        int reversedArray[] = new int[len];

        System.out.print("reversedArray[] = {");

        // Iterate in reverse order
        for (int i = len - 1; i >= 0; i--) {
            reversedArray[i] = originalArray[i]; // assign each element of the original arr to the reversed arr
            System.out.print(reversedArray[i]);

            // Print in array format & avoid comma after the last element
            String format = (i != 0) ? ", " : "";
            System.out.print(format);
        }
        System.out.print("}");

    }
}
