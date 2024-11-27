package model;

public class Forward extends Player {
    private int goals;

    //konstruktor
    public Forward(String name, int age, int goals) {
        super(name, age);
        this.goals = goals;
    }

    //getter pre pocet golov
    public int getGoals() {
        return goals;
    }

    //priratanie poctu golov
    public void addGoals(int newGoals) {
        goals += newGoals;
        System.out.println("Player " + getName() + " now has " + goals + " goals.");
    }
}
