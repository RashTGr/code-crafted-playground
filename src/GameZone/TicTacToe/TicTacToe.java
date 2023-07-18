package GameZone.TicTacToe;

import java.util.Scanner;

class TicTacToe {

    Scanner scan = new Scanner(System.in);
    GameBoard board = new GameBoard();
    PlayerState playerState = new PlayerState();

    char[][] grid = board.getGrid();


    public void playGame() {
        board.setGrid();

        char player = 'x';
        while (!isGameFinished(player)) {
            board.displayGrid(board.getGrid());

            try {
                System.out.print("Coordinates[row][] for \"" + player + "\" player: ");
                int rowCol = scan.nextInt();

                if (grid[rowCol / 10][rowCol % 10] == ' ') {
                    grid[rowCol / 10][rowCol % 10] = player;
                    if (isGameFinished(player)) {
                        board.displayGrid(grid);
                        System.out.println("\nGood job! Player \"" + player + "\" won!");
                    } else {
                        player = playerState.playerTurn(player);
                    }
                } else {
                    System.out.println("\nThis is not an empty cell. \n");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("\nInvalid input. Coordinates should not exceed 0-1-2.\n");
            }
        }
    }

    public boolean isGameFinished(char player) {
        return (grid[0][0] == player && grid[0][1] == player && grid[0][2] == player) ? true
                : (grid[1][0] == player && grid[1][1] == player && grid[1][2] == player) ? true
                : (grid[2][0] == player && grid[2][1] == player && grid[2][2] == player) ? true
                : (grid[0][0] == player && grid[1][1] == player && grid[2][2] == player) ? true
                : (grid[0][0] == player && grid[1][0] == player && grid[2][0] == player) ? true
                : (grid[0][1] == player && grid[1][1] == player && grid[2][1] == player) ? true
                : (grid[0][2] == player && grid[1][2] == player && grid[2][2] == player) ? true
                : (grid[2][0] == player && grid[1][1] == player && grid[0][2] == player) ? true : false;
    }
}
