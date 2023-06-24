package Implementations.TicTacToe;

public class Board {
    public String board[][];
    public Boolean haveWinner = false;
    public int size = 0;

    Board(int n) {
        board = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = ".";
            }
        }
        size = n;
    }

    public Boolean CanGameCarryOn() {
        // check here for winner;
        haveWinner = checkWinner();
        return !haveWinner;
    }

    private boolean checkWinner() {
        // Check rows
        boolean allSame;
        for (int i = 0; i < size; i++) {
            allSame = true;
            for (int j = 0; j < size - 1; j++) {
                if (!board[i][j].equals(board[i][j + 1]) || board[i][j].equals(".")) {
                    allSame = false;
                    break;
                }
            }
            if (allSame)
                return true;
        }

        // Check columns
        for (int i = 0; i < size; i++) {
            allSame = true;
            for (int j = 0; j < size - 1; j++) {
                if (!board[j][i].equals(board[j + 1][i]) || board[j][i].equals(".")) {
                    allSame = false;
                    break;
                }
            }
            if (allSame)
                return true;
        }

        // Check diagonal from top-left to bottom-right
        allSame = true;
        for (int i = 0; i < size - 1; i++) {
            if (!board[i][i].equals(board[i + 1][i + 1]) || board[i][i].equals(".")) {
                allSame = false;
                break;
            }
        }
        if (allSame)
            return true;

        // Check diagonal from top-right to bottom-left
        allSame = true;
        for (int i = size - 1; i > 0; i--) {
            if (!board[size - 1 - i][i].equals(board[size - i][i - 1]) || board[size - 1 - i][i].equals(".")) {
                allSame = false;
                break;
            }
        }
        if (allSame)
            return true;

        return false;
    }

    public void PrintBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Boolean IsValid(String playerMove) {
        int x = playerMove.charAt(0) - '0';
        int y = playerMove.charAt(1) - '0';
        if (x >= size || y >= size)
            return false;
        if (board[playerMove.charAt(0) - '0'][playerMove.charAt(1) - '0'].equals("."))
            return true;
        return false;
    }

    public void Update(Player player, String playerMove) {
        board[playerMove.charAt(0) - '0'][playerMove.charAt(1) - '0'] = player.pin;
    }
}
