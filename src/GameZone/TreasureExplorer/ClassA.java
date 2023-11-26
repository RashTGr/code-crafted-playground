package GameZone.TreasureExplorer;

import java.util.Random;

class ClassA {

    private int treasure; // will represent hidden treasure

    // public method
    public String explore(){
        Random random = new Random();
        treasure = random.nextInt(10);
        return (treasure > 5) ? "classA being explored and treasure FOUND" : "classA being explored and treasure was NOT found";
    }

    public int getTreasure() {
        return treasure;
    }
}
