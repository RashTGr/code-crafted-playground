package HomePracticals.Lsn_9;

public class Main {
    public static void main(String[] args) {

        char row = 5;
        char col = 5;
        char[][] arr = new char[row][col];
        char value = '#';


        for (char i = 0; i < row; i++) {
            System.out.print("[");
            for (char j = 0; j < col; j++) {
                arr[i][j] = value;
//                value++;
                String format = (j != col - 1) ? ", " : "]";
                System.out.print(arr[i][j] + format);
            }
            System.out.println();

        }
    }
}

