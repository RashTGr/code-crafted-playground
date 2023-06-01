package GameZone.Battleship;

import java.util.Random;

public class Board {
    private char[][] grid; // using 2D arr for grid
    private int size;

    // constructor
    public Board(int size) {
        this.size = size;
        this.grid = new char[size][size];
    }

    // Board initialisation with empty cells
    public void initializeBoard() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                grid[row][col] = '~';
            }

        }
    }

    // getter methods
    public int getSize(){
        return size;
    }

    public char[][] getGrid() {
        return grid;
    }

    // Display the board
    public void displayBoard(){
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.println(grid[row][col] + "~");

            }
            System.out.println();
        }
    }

    // Place enemy ships randomly
    public void placeEnemyBoats(){
        placeBoat(4);
        placeBoat(3);

    }

    private void placeBoat(int size){
        Random random = new Random();
        int row, col;
        boolean isValidPlacement = false;

        // generate starting position randomly
        do {
            row = random.nextInt(size);
            col = random.nextInt(size);

            // 0 = horizontal, 1 = vertical orientation
            int orientation = random.nextInt(2);

            // To check if the boat can be placed without overlapping
            if (orientation == 0 && col + size <= this.size){
                boolean hasOverlap = false;
                for (int c = col; c < col +size; c++){
                    if (grid[row][c] != '~'){
                        hasOverlap = true;
                        break;
                    }
                }
                if (!hasOverlap){
                    isValidPlacement = true;
                    for (int c = col; c < col+size; c++) {
                        // B is representing a boat cell
                        grid[row][c] = 'B';
                    }
                }
            } else if (orientation == 1 && row + size <= this.size) {
                boolean hasOverlap = false;
                for (int r = row; r < row+ size; r++) {
                    if (grid[r][col] != '~'){
                        hasOverlap = true;
                        break;
                    }
                }
                if (!hasOverlap){
                    isValidPlacement=true;
                    for (int r = row; r<row + size ; r++) {
                        grid[r][col] = 'B';
                    }
                }
            }
        }while (!isValidPlacement);
    }

    // Status update for a cell on the board
    public void updateCellStatus(int row, int col, char status){
        grid[row][col] = status;
    }
}
