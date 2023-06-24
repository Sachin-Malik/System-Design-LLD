import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;

class Ludo {
    public static void main(String[] args) {
        Game game = new Game(5, 5, 2, 2);
        game.start();
    }
}

class Game {

    Board board;
    Dice dice;
    Queue<Player> players = new ArrayDeque<Player>();
    String[] playerNames = new String[10];
    Boolean haveWinner = false;

    Game(int numberOfSnakes, int numberOfLadders, int numberOfPlayers, int numberOfDice) {
        board = new Board(numberOfSnakes, numberOfLadders);
        dice = new Dice(numberOfDice);
        setPlayerName(playerNames);
        for (int i = 0; i < numberOfPlayers; i++) {
            Player player = new Player(getPlayerName(), 1);
            System.out.println(player.playerName);
            players.add(player);
        }
    }

    public void start() {
        Player currentPlayer = players.remove();
        while (!haveWinner) {
            int increment = dice.rollDice();
            System.out.println(currentPlayer.playerName + "'s Turn and got " + increment);
            int newPosition = currentPlayer.startingPosition + increment;
            if (newPosition >= 100) {
                haveWinner = true;
                System.out.println(currentPlayer.playerName + " Wins the game");
                return;
            }
            if (board.board[newPosition] != 0) {
                newPosition = board.board[newPosition];
                if (newPosition >= currentPlayer.startingPosition) {
                    System.out.println("From " + currentPlayer.startingPosition + " " + currentPlayer.playerName
                            + " is taken ladder to " + newPosition);
                } else {
                    System.out.println("From " + currentPlayer.startingPosition + " " + currentPlayer.playerName
                            + " bitten by snake to " + newPosition);
                }
            }
            currentPlayer.startingPosition = newPosition;
            players.add(currentPlayer);
            currentPlayer = players.remove();
        }
    }

    String getPlayerName() {
        return playerNames[(int) (Math.random() * 10)];
    }

    void setPlayerName(String[] playerNames) {
        playerNames[0] = "Scarllet";
        playerNames[1] = "Ana";
        playerNames[2] = "Robin";
        playerNames[3] = "MindJ";
        playerNames[4] = "soulGrabber";
        playerNames[5] = "Harm";
        playerNames[6] = "Cliff";
        playerNames[7] = "Robert";
        playerNames[8] = "Eminem";
        playerNames[9] = "Conan";

    }

}

class Player {
    public String playerName;
    public int startingPosition;

    Player(String playerName, int startingPosition) {
        this.playerName = playerName;
        this.startingPosition = startingPosition;
    }
}

class Dice {
    public int numberOfDice;

    Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public int rollDice() {
        int advance = 0;
        for (int i = 0; i < numberOfDice; i++)
            advance += (int) (Math.random() * 5) + 1;
        return advance;
    }
}

class Board {
    public int[] board;

    public HashMap<Integer, Boolean> hm = new HashMap<Integer, Boolean>(0, 75);

    public Board(
            int numberOfSnakes,
            int numberOfLadders) {
        board = new int[100];
        intializeBoard(numberOfLadders, numberOfSnakes);
    }

    private void intializeBoard(int numberOfLadders, int numberOfSnakes) {
        fillBoard(numberOfSnakes, "snake");
        fillBoard(numberOfLadders, "ladder");
    }

    private void fillBoard(int number, String type) {
        for (int i = 0; i < number; i++) {
            int startingPoint = (int) (Math.random() * 99);
            int endingPoint = (int) (Math.random() * (99 - startingPoint) + startingPoint);
            if (hm.containsKey(startingPoint) || hm.containsKey(endingPoint))
                continue;

            if (type.equals("snake")) {
                int temp = startingPoint;
                startingPoint = endingPoint;
                endingPoint = temp;
            }
            board[startingPoint] = endingPoint;
        }
    }

}
