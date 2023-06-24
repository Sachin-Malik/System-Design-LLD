package Implementations.TicTacToe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {

    public String name;
    public String pin;
    public List<String> moves;

    Player(String name, String pin) {
        this.name = name;
        this.pin = pin;
        moves = new ArrayList<String>();
    }

    public String makeMove() {
        Scanner playerInput = new Scanner(System.in);
        String pos = playerInput.next();
        moves.add(pos);
        return pos;
    }
}
