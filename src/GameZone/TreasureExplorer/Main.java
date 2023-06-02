package GameZone.TreasureExplorer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ClassA classA = new ClassA();
        ClassB classB = new ClassB();
        ClassC classC = new ClassC();

//        System.out.println(classA.explore() + " : " + classA.getTreasure());
//        System.out.println(classB.explore() + " : " + classB.getTreasure());
//        System.out.println(classC.explore() + " : " + classC.getTreasure() + "\n");

        Scanner scan = new Scanner(System.in);
        System.out.print("Pick one of the three treasures marked 1, 2 or 3: ");
        int userChoice = scan.nextInt();

        if (userChoice == 1){
            classA.explore();
            if (classA.getTreasure() > 5){
                System.out.println("Congrats! The treasure you chose is the right one.");
            }else {
                System.out.println("Oops. That was wrong choice. Treasure was not found.");
            }
        } else if (userChoice == 2) {
            classB.explore();
            if (classB.getTreasure() > 5){
                System.out.println("Congrats! The treasure you chose is the right one.");
            }else {
                System.out.println("Oops. That was the wrong choice. Treasure was not found.");
            }
        } else if (userChoice == 3) {
            classC.explore();
            if (classC.getTreasure() > 5){
                System.out.println("Congrats! The treasure you chose is the right one.");
            }else {
                System.out.println("Oops. That was wrong choice. Treasure was not found.");
            }
        }else {
            System.out.println("Your input is out of range.");
        }
    }
}
