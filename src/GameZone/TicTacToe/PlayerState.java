package GameZone.TicTacToe;

class PlayerState {

    public char playerTurn(char player1) {
        char player2 = ' ';
        switch (player1) {
            case 'x':
                player2 = 'o';
                break;
            case 'o':
                player2 = 'x';
                break;
        }
        return player2;
    }
}
