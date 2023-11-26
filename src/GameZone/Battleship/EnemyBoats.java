package GameZone.Battleship;

import java.util.Random;

class EnemyBoats {

    GameBoard board = new GameBoard();
    Random random = new Random();

    char[][] enemyFleet = new char[board.getRow()][board.getCol()];


    public char[][] getEnemyFleet() {
        return enemyFleet;
    }


    public void enemyBoatPlacement() {
        board.initializeBoard();
        enemyFleet = board.getBattleField();

        int boatNums = 3;
        // How many consecutive coordinates either vertically or horizontally,
        // the boat will occupy on the grid
        int[] boatSizes = {2, 3, 1, 5, 1};

        for (int boatIndex = 0; boatIndex < boatNums; boatIndex++) {
            int boatSize = boatSizes[boatIndex]; // initialize each boat with different sizes based on array

            boolean isValidPlacement = false;
            // Finding a valid placement to place boats
            while (!isValidPlacement) {
                int horizontalStart = random.nextInt(board.getGridSize()); // random start point for horizontal coordinate
                int verticalStart = random.nextInt(board.getGridSize()); // random start point for vertical coordinate
                boolean isVertical = random.nextBoolean(); // randomize vertical or horizontal placement

                // check if placement is out of grid boundaries or overlapping
                isValidPlacement = true;
                if (isVertical) {
                    if (horizontalStart + boatSize > board.getGridSize()) {
                        isValidPlacement = false;
                    } else {
                        for (int i = horizontalStart; i < horizontalStart + boatSize; i++) {
                            if (enemyFleet[i][verticalStart] != '~') {
                                isValidPlacement = false;
                                break;
                            }
                        }
                    }
                } else {
                    if (verticalStart + boatSize > board.getGridSize()) {
                        isValidPlacement = false;
                    } else {
                        for (int j = verticalStart; j < verticalStart + boatSize; j++) {
                            if (enemyFleet[horizontalStart][j] != '~') {
                                isValidPlacement = false;
                                break;
                            }
                        }
                    }
                }
                // If placement is true/valid then place the boat
                if (isValidPlacement) {
                    if (isVertical) {
                        for (int i = horizontalStart; i < horizontalStart + boatSize; i++) {
                            board.updateBoard(i, verticalStart, 'V');
                        }
                    } else {
                        for (int j = verticalStart; j < verticalStart + boatSize; j++) {
                            board.updateBoard(horizontalStart, j, 'V');
                        }
                    }
                }
            }
        }
    }
}

