package model;

public class Defender extends Player {
    private int hits;

    //konstruktor
    public Defender(String name, int age, int hits) {
        super(name, age);
        this.hits = hits;
    }

    //getter pre pocet narazeni
    public int getHits() {
        return hits;
    }

    //priratanie dalsich narazeni
    public void addHits(int newHits) {
        hits += newHits;
        System.out.println("Player " + getName() + " now has " + hits + " hits.");
    }
}
