package Implementations.TicTacToe;

public class PlayerStats {
    public String name = "";
    public int played = 0;
    public int won = 0;
    public int lost = 0;
    public int draw = 0;

    PlayerStats(String name) {
        this.name = name;
    }
}
