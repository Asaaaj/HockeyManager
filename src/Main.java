import manager.HockeyManager;
import league.HockeyLeague;

public class Main {
    public static void main(String[] args) {
        HockeyLeague league = new HockeyLeague();
        HockeyManager hockeyManager = new HockeyManager(league);

        //pridanie hracov
        hockeyManager.AddNewForward("Peter", 25, 30);
        hockeyManager.AddNewForward("Samuel", 28, 15);
        hockeyManager.AddNewForward("Roman", 32, 20);
        hockeyManager.AddNewDefender("Marek", 28, 50);
        hockeyManager.AddNewGoalie("Juraj", 22, 15);

        // Výpis najmladšieho hráča
        hockeyManager.PrintNameAndAgeOfTheYoungestPlayer();
    }
}