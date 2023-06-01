package GameZone.Jumanji;

public class Character {
    private String name;
    private String correctLocation;

    private Character(String name, String correctLocation) {
        this.name = name;
        this.correctLocation = correctLocation;
    }

    public String getName() {
        return name;
    }

    public boolean isCorrectChoice(String location) {
        return correctLocation.equalsIgnoreCase(location);
    }

    public static Character getCharacter(String characterChoice) {
        switch (characterChoice) {
            case "B":
                return new Character("Dr. Bravestone", "Desert");
            case "S":
                return new Character("Prof. Shelly", "Mandrill Bridge");
            case "M":
                return new Character("Franklin Mouse", "Jurgen's Lair");
            case "R":
                return new Character("Ruby Roundhouse", "Jungle");
            case "F":
                return new Character("Ming Fleetfoot", null);
            case "C":
                return new Character("Cyclone", "Castle");
            default:
                return null;
        }
    }
}

