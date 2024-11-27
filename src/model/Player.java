package model;

//abstraktna trieda, nepotrebujeme vytvarat instanciu Player
public abstract class Player {
    private final String name;
    private int age;

    //konstruktor
    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter mena
    public String getName() {
        return name;
    }

    //getter veku
    public int getAge() {
        return age;
    }

}
