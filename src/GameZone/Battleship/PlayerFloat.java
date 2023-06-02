package GameZone.Battleship;

import java.util.Scanner;

public class PlayerFloat {
    EnemyBoats enemy = new EnemyBoats();
    GameBoard board = new GameBoard();
    Scanner scan = new Scanner(System.in);

    public void startGame(){
        enemy.enemyBoatPlacement(); // Game starts with placing enemy boats first
        int hitCount = 0;

        while (true) {
            displayEnemyBoats();

            System.out.print("Enter H coordinate: ");
            int coordinateH = scan.nextInt();
            System.out.print("Enter V coordinate: ");
            int coordinateV = scan.nextInt();

            boolean validShot = shootEnemyBoat(coordinateH, coordinateV);
            if (validShot){
                hitCount++;
                System.out.println("Good Job!");
                System.out.println("Hit count so far: " + hitCount);
                if (enemyFleetDestroyed()){
                    System.out.println("Congrats! You destroyed enemy's fleet.");
                    System.out.println("Total hits: " + hitCount);
                    break;
                }
                }else {
                    System.out.println("Missed!");
            }
        }
    }

    // Check point for shooting success or fail
    public boolean shootEnemyBoat(int coordinateH, int coordinateV){
        char[][] enemyFleet = enemy.getEnemyFleet();

        if (enemyFleet[coordinateH][coordinateV] == 'V') {
            enemyFleet[coordinateH][coordinateV] = 'O';
            return true;
        }else if (enemyFleet[coordinateH][coordinateV] == '~') {
            enemyFleet[coordinateH][coordinateV] = 'z';
            return false;
        } else if (enemyFleet[coordinateH][coordinateV] == 'O') {
            System.out.println("This boat have already been sunk.");
            return false;
        } else if (enemyFleet[coordinateH][coordinateV] == 'z') {
            System.out.println("You've already missed this coordinate. Try another one.");
            return false;
        }else {
            return false;
        }
    }

    // Checks if all the boats have been sunk
    public boolean enemyFleetDestroyed(){
        char[][] enemyFleet = enemy.getEnemyFleet();

        for (int i = 0; i < board.getRow(); i++) {
            for (int j = 0; j < board.getCol(); j++) {
                if (enemyFleet[i][j] == 'V'){
                    return false; // This means at least one boat is afloat
                }
            }
        }
        return true; // If there is no more boat
    }


    public void displayEnemyBoats(){
        char[][] enemyFleet = enemy.getEnemyFleet();
        System.out.println();

        for (int i = 0; i < board.getRow(); i++) {
            System.out.print("[");
            for (int j = 0; j < board.getCol(); j++) {
                String format = (j != board.getCol() - 1) ? " " : "]";
                if (enemyFleet[i][j] == 'V' || enemyFleet[i][j] == 'O' || enemyFleet[i][j] == 'z'){
                    System.out.print(enemyFleet[i][j] + format);
                }else {
                    System.out.print("~" + format);
                }
            }
            System.out.println();
        }
    }
}



