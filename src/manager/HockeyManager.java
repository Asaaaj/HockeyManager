package manager;

import league.HockeyLeague;
import model.*;

import java.util.Comparator;

public class HockeyManager {
    private HockeyLeague league;

    //konstruktor
    public HockeyManager(HockeyLeague league) {
        this.league = league;
    }

    public void AddNewForward(String name, int age, int goals) {
        league.getPlayers().add(new Forward(name, age, goals));
    }

    public void AddNewDefender(String name, int age, int hits) {
        league.getPlayers().add(new Defender(name, age, hits));
    }

    public void AddNewGoalie(String name, int age, int wins) {
        league.getPlayers().add(new Goalie(name, age, wins));
    }
    public void PrintNameAndAgeOfTheYoungestPlayer()
    {
        //pokial nemame ziadnych hracov v liste
        if(league.getPlayers().isEmpty()) {
            System.out.println("There are no players in the list.");
        }
        else {
            //najdenie najmensieho veku pomocou Comparatoru
            Player youngest = league.getPlayers().stream().min(Comparator.comparing(Player::getAge)).orElse(null);

            //vypis
            System.out.println("The youngest player is " + youngest.getName() + " aged " + youngest.getAge());
        }
    }
}
