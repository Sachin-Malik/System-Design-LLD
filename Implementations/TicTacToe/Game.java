package Implementations.TicTacToe;

import java.util.Deque;

public class Game {
    Board board;
    Deque<Player> players;

    Game(Board board, Deque<Player> players) {
        this.board = board;
        this.players = players;
    }

    public void Start(LeaderBoard leaderBoard) {
        int n = board.size;
        int moveCount = 0;
        while (moveCount < n * n && !board.haveWinner) {
            board.PrintBoard();
            Player currentPlayer = players.removeFirst();
            System.out.println(currentPlayer.name + " Please make your move");
            String playerMove = currentPlayer.makeMove();
            while (!board.IsValid(playerMove)) {
                System.out.println("Invalid Move," + currentPlayer.name + " Please make a valid move ");
                playerMove = currentPlayer.makeMove();
                currentPlayer.moves.remove(currentPlayer.moves.size() - 1);
            }
            board.Update(currentPlayer, playerMove);
            if (!board.CanGameCarryOn()) {
                // currentPlayer is winner;
                System.out.println("Winner is " + currentPlayer.name + "(" + currentPlayer.pin + ").");
            }
            players.addLast(currentPlayer);
            moveCount++;
        }
        if (board.haveWinner) {
            System.out.println("Updating Stats");
            Player winner = players.removeLast();
            leaderBoard.Update(winner, MatchResult.WIN);
            while (!players.isEmpty()) {
                Player p1 = players.removeFirst();
                leaderBoard.Update(p1, MatchResult.LOOSE);
            }
        } else {

            System.out.println("Game Draw");
            System.out.println("Updating Stats");
            while (!players.isEmpty()) {
                Player p1 = players.removeFirst();
                leaderBoard.Update(p1, MatchResult.DRAW);
            }
        }

        // see game result and update leaderBoard
    }

}
