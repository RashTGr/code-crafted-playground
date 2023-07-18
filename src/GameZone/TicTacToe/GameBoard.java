package GameZone.TicTacToe;

class GameBoard implements Grid{

    int row = 3;
    int col = 3;
    char[][] grid = new char[row][col];

    public char[][] getGrid() {
        return grid;
    }


    @Override
    public void setGrid() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                grid[i][j] = ' ';
            }
        }
    }

    @Override
    public void displayGrid(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            System.out.print('|');
            for (int j = 0; j < grid.length; j++) {
                String format = (j != col - 1) ? "|" : "|";
                System.out.print(grid[i][j] + format);
            }
            System.out.println();
        }
    }
}
