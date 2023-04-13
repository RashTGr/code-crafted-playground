package Lsn_5;

public class HomeWork {
    public static void main(String[] args) {

        int original[] = {3, 6, 9, 12, 15};
        int len = original.length;
        int reverse[] = new int[len];

        System.out.print("reverse[] = {");

        // iterate in reverse order
        for (int i = len - 1; i >= 0; i--) {
            reverse[i] = original[i]; // assign each element of original arr to reverse arr
            System.out.print(reverse[i]);

            // To print in array format & avoid comma after the last element
            String format = (i != 0) ? ", " : "";
            System.out.print(format);
        }
        System.out.print("}");
    }
}
