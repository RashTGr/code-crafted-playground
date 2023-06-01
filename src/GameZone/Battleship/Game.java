package GameZone.Battleship;


/**
 * This class is responsible for controlling the game flow
 */

public class Game {
    private Enemy enemy;
    private Player player;


    public Game() {
        Board board = new Board(10);
        this.player = new Player(board);
        this.enemy = new Enemy(board);
    }

    public void initializeGame() {
        player.getBoard().initializeBoard();
        player.getBoard().placeEnemyBoats();
        // To display range of coordinates
        player.printCoordinateRange();
    }

    public void playGame() {
        initializeGame();
        while (!isGameOver()) {
            System.out.println("Player's turn");
            // move methods from related classes
            player.makeMove();
            if (isGameOver()) {
                break;
            }

            System.out.println();
            System.out.println("Enemy's turn");
            enemy.makeMove();

        }
        displayResult();
    }

    public boolean isGameOver() {
        char[][] grid = player.getBoard().getGrid();
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] == 'B') {
                    return false; // the game is not over until there is a boat
                }
            }
        }
        return true; // when no more boats, game is over
    }

    public void displayResult() {
        System.out.println("Final Player's Board: ");
        player.getBoard().displayBoard();
        System.out.println("Congrats!");
    }
}