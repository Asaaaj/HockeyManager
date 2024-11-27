package model;

public class Goalie extends Player {
    private int wins;

    // konstruktor
    public Goalie(String name, int age, int wins) {
        super(name, age);
        this.wins = wins;
    }

    //getter pre pocet vyhier
    public int getWins() {
        return wins;
    }

    //priratanie dalsich vyhier
    public void addWins(int newWins) {
        wins += newWins;
        System.out.println("Player " + getName() + " now has " + wins + " wins.");
    }
}
