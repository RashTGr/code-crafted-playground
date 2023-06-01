package HomePracticals.Lsn_2;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st value: ");
        float a = sc.nextFloat();

        System.out.print("Enter 2nd value: ");
        float b = sc.nextFloat();

        System.out.print("Enter 3rd value: ");
        float c = sc.nextFloat();

        System.out.print("Enter 4th value: ");
        float d = sc.nextFloat();

        // Addition
        System.out.print("Addition: ");
        System.out.println(a + b);

        // Division
        System.out.print("Division: ");
        System.out.println(c/d);

        // Multiply all
        System.out.print("Multiplication: ");
        System.out.println(a * b * c * d);

    }
}
