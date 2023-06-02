package GameZone.Battleship;

public class GameBoard {

    private int gridSize = 7;
    private int row = gridSize;
    private int col = gridSize;

    private char[][] battleField = new char[row][col];

    public int getGridSize() {
        return gridSize;
    }

    public char[][] getBattleField() {
        return battleField;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void initializeBoard(){
        for (int i = 0; i < row ; i++) {
//            System.out.print("[");
            for (int j = 0; j < col; j++) {
                battleField[i][j] = '~';
                String format = (j != col -1) ? " " : "]";
//                System.out.print(battleField[i][j] + format);
            }
//            System.out.println();
        }
    }

    public void updateBoard(int row, int col, char value){
        battleField[row][col] = value;
    }
}
