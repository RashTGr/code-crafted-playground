package GameZone.Jumanji;

import java.util.Scanner;

public class ProceduralVersion {
    public static void main(String[] args) {


        String[] locations = {"Jungle", "Desert", "Jurgen's Lair", "Mandrill Bridge", "Castle"};
        int random = (int) (Math.random() * 3);

        Scanner scan = new Scanner(System.in);


        int lives = 3;
        String userCharacterChoice = "";


        // Loop ensures it will skip the previously selected location
        // Loop ensures that random selection is skipped and the remaining locations are used in sequence
        for (int i = random; i < locations.length; i++) {
            String currentLocation = locations[i];

            // Cross-check the locations with user's character choice
            if (currentLocation.equals("Jungle")) {
                System.out.print("Your location is \"Jungle\" now. Choose the right character who can take you to \naircraft to run away from Hippopotamus and Anaconda.(B/S/M/R/F/C) : ");
                userCharacterChoice = scan.next().toUpperCase();
                if (!userCharacterChoice.equals("R")) {
                    System.out.println("Oops! You've selected an incorrect character for this location, and your life count is reduced by one.");
                    System.out.println("Remaining lives: " + --lives);
                } else {
                    System.out.println("Remaining lives: " + lives);
                    System.out.println("\"Ruby Roundhouse\" is the correct choice. Move on to the next level.\n");
                }
            } else if (currentLocation.equals("Desert")) {
                System.out.print("Your location is \"Desert\" now. Choose the right character who can fearlessly \ndrive 'Dune Buggies' to escape from the pursuit of Camel-birds. (B/S/M/R/F/C) : ");
                userCharacterChoice = scan.next().toUpperCase();
                if (!userCharacterChoice.equals("B")) {
                    System.out.println("Oops! You've selected an incorrect character for this location, and your \nlife count is reduced by one.");
                    System.out.println("Remaining lives: " + --lives);
                } else {
                    System.out.println("Remaining lives: " + lives);
                    System.out.println("\"Dr. Bravestone\" is the correct choice. Move on to the next level.\n");
                }
            } else if (currentLocation.equals("Jurgen's Lair")) {
                System.out.print("You are in \"Jurgen's Lair\" location now. Choose the right character who can \nunderstand Camels and ask them to help to escape from 'Jurgen the Brutal' " +
                        "and his troops to avoid capture. (B/S/M/R/F/C) : ");
                userCharacterChoice = scan.next().toUpperCase();
                if (!userCharacterChoice.equals("M")) {
                    System.out.println("Oops! You've selected an incorrect character for this location, and \nyour life count is reduced by one.");
                    System.out.println("Remaining lives: " + --lives);
                } else {
                    System.out.println("Remaining lives: " + lives);
                    System.out.println("\"Franklin Mouse\" is the correct choice. Move on to the next level.\n");
                }
            } else if (currentLocation.equals("Mandrill Bridge")) {
                System.out.print("You have passed the previous levels and now in the \"Mandrill Bridge\" location. " +
                        "\nChoose one of the right characters who can correctly calculate 'Swinging Vine Bridges' to run away or " +
                        "\ncan to 'Defeat' Mandrills. (B/S/M/R/F/C) : ");
                userCharacterChoice = scan.next().toUpperCase();
                if (!userCharacterChoice.equals("S") && !userCharacterChoice.equals("C")) {
                    System.out.println("Oops! You've selected an incorrect character for this location, and \nyour life count is reduced by one.");
                    System.out.println("Remaining lives: " + --lives);
                } else {
                    if (userCharacterChoice.equals("S")) {
                        System.out.println("\"Prof. Shelly\" is the correct choice. Move on to the next level.\n");
                    } else {
                        System.out.println("Remaining lives: " + lives);
                        System.out.println("\"Cyclone\" is the correct choice. Move on to the next and last level.\n");
                    }
                }
            } else if (currentLocation.equals("Castle")) {
                System.out.print("You've reached to the \"Castle\" location, last level. Choose \nthe right \"pair of characters\" to recover the \"Falcon Jewel\" from Jurgen's " +
                        "\ncustody to complete the mission and escape the game. (B/S/M/R/F/C) : ");
                userCharacterChoice = scan.next().toUpperCase();

                while (!userCharacterChoice.equals("B") && lives != 0) {
                    System.out.println("Remaining lives: " + --lives);
                    System.out.print("Oops! You've selected an incorrect character for this location, and \nyour life count is reduced by one. Try again to choose the correct character : ");
                    userCharacterChoice = scan.next().toUpperCase();
                    if (lives == 0) {
                        System.out.println("Game over! You ran out of lives.");
                        break;
                    }
                }
                if (userCharacterChoice.equals("B")) {
                    System.out.println("Remaining lives: " + lives);
                    System.out.print("\"Dr. Bravestone\" is the right choice! You're are in the last level now and \nhave to choose the second character to help you in this mission (S/M/R/F/C) : ");
                    userCharacterChoice = scan.next().toUpperCase();
                    while (!userCharacterChoice.equals("C") && lives != 0) {
                        System.out.println("Remaining lives: " + --lives);
                        System.out.print("Oops! The second character is incorrect to help you in this location, and \nyour life count is reducing. " +
                                "Please select \"Cyclone\" : ");
                        userCharacterChoice = scan.next().toUpperCase();
                        if (lives == 0) {
                            System.out.println("Game over! You ran out of lives.");
                            break;
                        }
                    }
                    if (userCharacterChoice.equals("C")) {
                        System.out.println("The right choice. \"Cyclone\" helps you to recover the Falcon Jewel from the \nJurgen's custody. With this level you've completed" +
                                " the mission and escaped the game.\n");
                        System.out.println("Your total lives up to this level is " + lives + ".");
                        break;
                    }
                } else {
                    if (lives == 0) {
                        break;
                    }
                }


                // Prompts user to make choice based on the locations.
                String character = "";
                switch (userCharacterChoice) {
                    case "B":
                        character = "Dr. Bravestone";
                        break;
                    case "S":
                        character = "Prof. Shelly";
                        break;
                    case "M":
                        character = "Franklin Mouse";
                        break;
                    case "R":
                        character = "Ruby Roundhouse";
                        break;
                    case "F":
                        character = "Ming Fleetfoot";
                        break;
                    case "C":
                        character = "Cyclone";
                        break;
                    default:
                        System.out.println("Invalid input.");
                }
            }
        }
    }
}