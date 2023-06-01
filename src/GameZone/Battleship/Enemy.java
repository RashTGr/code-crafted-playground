package GameZone.Battleship;

import java.util.Random;

public class Enemy {
    private Random random;
    private Board board;

    public Enemy(Board board) {
        this.random = new Random();
        this.board = board;
    }

    public void generateRandomCoordinates(){
        int row, col;
        boolean isValidCoordinates = false;

        do {
            row = random.nextInt(board.getSize());
            col = random.nextInt(board.getSize());

            isValidCoordinates = board.getGrid()[row][col] == '~'; // if empty cell or not
        }while (!isValidCoordinates);
        board.updateCellStatus(row, col, 'X');
    }

    // Generates random row/col coordinates within the range of Board
    public void makeMove(){
        generateRandomCoordinates();
    }
}
