package GameZone.TreasureExplorer;

import java.util.Random;

public class ClassB {

    private int treasure;


    public String explore(){
        Random random = new Random();
        treasure = random.nextInt(10);
        return (treasure > 5) ? "classB being explored and treasure FOUND" : "classB being explored and treasure was NOT found";
    }

    public int getTreasure() {
        return treasure;
    }
}
