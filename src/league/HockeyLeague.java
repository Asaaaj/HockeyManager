package league;

import model.Player;

import java.util.ArrayList;
import java.util.List;

public class HockeyLeague {
    private List<Player> players;

    //konstruktor
    public HockeyLeague() {
    players = new ArrayList<>();
    }

    //getter hracov
    public List<Player> getPlayers() {
        return players;
    }
}
