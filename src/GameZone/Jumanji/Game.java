package GameZone.Jumanji;

import java.util.Scanner;

public class Game {
    private String[] locations = {"Jungle", "Desert", "Jurgen's Lair", "Mandrill Bridge", "Castle"};
    private int currentLocationIndex;
    private int lives = 3;
    private Scanner scanner = new Scanner(System.in);

    // Select first location randomly among first 3 locations and then proceed with the remaining locations
    public void start() {
        int random = (int) (Math.random() * 3);
        currentLocationIndex = random;

        while (lives > 0 && currentLocationIndex < locations.length) {
            String currentLocation = locations[currentLocationIndex];
            displayLocationPrompt(currentLocation);
            String userCharacterChoice = scanner.next().toUpperCase();
            boolean isCorrectChoice = validateCharacterChoice(currentLocation, userCharacterChoice);
            if (isCorrectChoice) {
                Character correctCharacter = Character.getCharacter(userCharacterChoice);
                System.out.println("Remaining lives: " + lives);
                System.out.println("\"" + correctCharacter.getName() + "\" is the correct choice. Move on to the next level.");
                currentLocationIndex++;
            } else {
                decreaseLifeCount();
            }
        }
        endGame();
    }

    private void displayLocationPrompt(String location) {
        switch (location) {
            case "Jungle":
                System.out.print("\nYour location is \"Jungle\" now. Choose the right character who can take you to \naircraft to run away from Hippopotamus and Anaconda.(B/S/M/R/F/C) : ");
                break;
            case "Desert":
                System.out.print("\nYour location is \"Desert\" now. Choose the right character who can fearlessly \ndrive 'Dune Buggies' to escape from the pursuit of Camel-birds. (B/S/M/R/F/C) : ");
                break;
            case "Jurgen's Lair":
                System.out.print("\nYou are in \"Jurgen's Lair\" location now. Choose the right character who can \nunderstand Camels and ask them to help to escape from 'Jurgen the Brutal' " +
                        "and his troops to avoid capture. (B/S/M/R/F/C) : ");
                break;
            case "Mandrill Bridge":
                System.out.print("\nYou have passed the previous levels and now in the \"Mandrill Bridge\" location. " +
                        "\nChoose one of the right characters who can correctly calculate 'Swinging Vine Bridges' to run away or " +
                        "\ncan to 'Defeat' Mandrills. (B/S/M/R/F/C) : ");
                break;
            case "Castle":
                System.out.print("\nYou've reached the \"Castle\" location, the last level. Choose \nthe right \"pair of characters\" to recover the \"Falcon Jewel\" from Jurgen's " +
                        "\ncustody to complete the mission and escape the game. (B/S/M/R/F/C) : ");
                break;
            default:
                System.out.println("Invalid location.");
        }
    }


    // Validates character and location pair based on the user input
    private boolean validateCharacterChoice(String location, String userCharacterChoice) {
        Character character = Character.getCharacter(userCharacterChoice);
        if (character != null) {
            if (location.equals("Castle")) {
                if (userCharacterChoice.equals("B")) {
                    System.out.print("Choose the second character(M or C) : ");
                    String secondChoice = scanner.next().toUpperCase();
                    Character secondCharacter = Character.getCharacter(secondChoice);
                    if (secondCharacter != null && secondChoice.equals("C")) {
                        return true;
                    } else {
                        return false;
                    }
                }
            } else if (character.isCorrectChoice(location)) {
                return true;
            }
        }
        return false;
    }

    // Decrease live at each wrong character choice
    private void decreaseLifeCount() {
        System.out.println("Oops! You've selected an incorrect character for this location, and your life count is reduced by one.\n");
        lives--;
        System.out.println("Remaining lives: " + lives);
    }

    // Quit the game when a user ran out of lives.
    private void endGame() {
        if (lives == 0) {
            System.out.println("Game over! You ran out of lives.");
        } else {
            System.out.println("Congratulations! With this level you've completed the mission and escaped the virtual Jumanji world.");
            System.out.println("Your total lives up to this level is " + lives + ".");
        }
    }
}

