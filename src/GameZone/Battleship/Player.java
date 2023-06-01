package GameZone.Battleship;

import java.util.Scanner;

public class Player {
    private Board board;
    Scanner scan;

    public Player(Board board) {
        this.board = board;
        this.scan = new Scanner(System.in);
    }

    public Board getBoard() {
        return board;
    }

    public void enterCoordinates(){
        System.out.print("Enter row and column coordinates: ");
        String input = scan.nextLine().trim().toUpperCase();

        if (input.length() != 2){
            System.out.println("Ivalid entry. Please try with valid coordinates: ");
            enterCoordinates();
            return;
        }

        char rowChar = input.charAt(0);
        int col;

        try{
            col = Integer.parseInt(input.substring(1));
        }catch (NumberFormatException e){
            System.out.println("Invalid entry. Please try with valid coordinates: ");
            enterCoordinates();
            return;
        }
        if (!isValidRow(rowChar) || !isValidColumn(col)) {
            System.out.println("Invalid input. You have to enter valid coordinates.");
            enterCoordinates();
            return;
        }

        int row = rowChar - 'A';
        col--;

        if (!validateCoordinates(row, col)) {
            System.out.println("Use a different coordinate, because you've already fired at this coordinate.");
            enterCoordinates();
            return;
        }
        board.updateCellStatus(row, col, 'X'); // X here represents a hit
    }

    private boolean isValidRow(char rowChar){
        int row = rowChar - 'A';
        return row >= 0 && row < board.getSize();
    }

    private boolean isValidColumn(int col) {
        return col >= 0 && col < board.getSize();
    }


    public boolean validateCoordinates(int row, int col){
        return board.getGrid()[row][col] == '~'; // empty or not
    }

    public void makeMove(){
        enterCoordinates();
    }

    // to print valid range based on the board size
    public void printCoordinateRange(){
        int size = board.getSize();
        char startRow = 'A';
        char endRow = (char) (startRow + size -1);
        int startCol = 1;
        int endCol = size;
        System.out.printf("Valid coordinate range: %c%d to %c%d%n", startRow, startCol, endRow, endCol);
    }
}

