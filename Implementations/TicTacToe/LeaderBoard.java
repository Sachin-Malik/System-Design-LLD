package Implementations.TicTacToe;

import java.util.List;
import java.util.ArrayList;

public class LeaderBoard {
    public List<PlayerStats> playerStats;

    LeaderBoard() {
        playerStats = new ArrayList<PlayerStats>();
    }

    public void Update(Player p1, MatchResult result) {
        System.out.println(p1.name + " " + result);
        Boolean notFound = true;
        for (PlayerStats stats : playerStats) {
            if (stats.name.equals(p1.name)) {
                notFound = false;
            }
        }
        if (notFound) {
            PlayerStats stat = new PlayerStats(p1.name);
            playerStats.add(stat);
        }
        for (PlayerStats stats : playerStats) {
            if (stats.name.equals(p1.name)) {
                notFound = false;
                stats.played++;
                if (result.equals(MatchResult.DRAW)) {
                    stats.draw++;
                } else if (result.equals(MatchResult.WIN)) {
                    stats.won++;
                } else {
                    stats.lost++;
                }
            }
        }

    }

    public void GetLeaderBoard() {
        for (PlayerStats stats : playerStats) {
            System.out.println("Player " + stats.name + " Won " + stats.won + " Lost " + stats.lost + " Draw "
                    + stats.draw + " out of Total " + stats.played);
        }
    }

    public PlayerStats GetPlayerStats(String name) {
        for (PlayerStats stats : playerStats) {
            if (stats.name == name) {
                return stats;
            }
        }
        PlayerStats ps = new PlayerStats("NOT_FOUND");
        return ps;
    }
}
