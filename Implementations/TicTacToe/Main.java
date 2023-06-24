package Implementations.TicTacToe;

import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String args[]) {
        int boardSize = getBoardSize();
        int playerCount = getPlayerCount();
        Deque<Player> players = getPlayers(playerCount);
        Board board = new Board(boardSize);
        Game game = new Game(board, players);
        LeaderBoard leaderBoard = new LeaderBoard();
        game.Start(leaderBoard);
        leaderBoard.GetLeaderBoard();

    }

    public static int getBoardSize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The Size of Board ");
        int boardSize = sc.nextInt();
        return boardSize;
    }

    public static int getPlayerCount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Players  ");
        int playerCount = sc.nextInt();
        return playerCount;
    }

    public static Deque<Player> getPlayers(int playerCount) {
        Scanner sc = new Scanner(System.in);
        Deque<Player> players = new ArrayDeque<Player>();
        for (int i = 0; i < playerCount; i++) {
            System.out.println("Please Enter Player" + (i + 1) + "'s Name");
            String name = sc.next();
            System.out.println("Please Enter Player" + (i + 1) + "'s Pin");
            String pin = sc.next();
            Player newplayer = new Player(name, pin);
            players.add(newplayer);
        }
        return players;
    }
}
