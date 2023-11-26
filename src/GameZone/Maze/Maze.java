package GameZone.Maze;

import java.util.Scanner;

class Maze {

    private char[][] maze;
    private int playerRow;
    private int playerColumn;
    private int score;

    public Maze(){
        // Game layout by initializing walls and path
        maze = new char[][]{
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', ' ', ' ', ' ', ' ', 'E', ' ', ' ' , ' ', ' ', ' ', '#'},
                {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
                {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
                {'#', ' ', 'P', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
                {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
        };

        playerRow = 4;
        playerColumn = 2;
        score = 0;
    }

    public void displayMaze(){
        for (int row = 0; row < maze.length; row++) {
            for (int column = 0; column < maze[row].length; column++) {
                System.out.print(maze[row][column]);
            }
            System.out.println();
        }
    }

    public void playerMovement(){
        Scanner scan = new Scanner(System.in);
        boolean won = false;

        while (!won){
            System.out.print("Enter move (U, D, L, R): ");
            String move = scan.nextLine().toUpperCase();

            int newRow = playerRow;
            int newColumn = playerColumn;

            switch (move){
                case "L":
                    newColumn--;
                    break;
                case "R":
                    newColumn++;
                    break;
                case "U":
                    newRow--;
                    break;
                case "D":
                    newRow++;
                    break;
                default:
                    System.out.println("Try again!");
                    continue;
            }

            if (maze[newRow][newColumn] == '#'){
                System.out.println("Wrong direction.");
            }else if (maze[newRow][newColumn] == 'E') {
                maze[playerRow][playerColumn] = ' ';
                playerRow = newRow;
                playerColumn = newColumn;
                maze[playerRow][playerColumn] = 'P';
                score++;
                displayMaze();

                System.out.println("Congrats!");
                System.out.println("Score: " +score);
                won = true;
                scan.close();

            }else {
                maze[playerRow][playerColumn] = ' ';
                playerRow = newRow;
                playerColumn = newColumn;
                maze[playerRow][playerColumn] = 'P';

                score++;
                displayMaze();
            }
        }
    }
}
