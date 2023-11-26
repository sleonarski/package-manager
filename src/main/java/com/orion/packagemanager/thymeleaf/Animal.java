package com.orion.packagemanager.thymeleaf;

public class Animal {

    private String name;
    private String race;
    private int numOfLegs;

    public Animal(String name, String race, int numOfLegs) {
        this.name = name;
        this.race = race;
        this.numOfLegs = numOfLegs;
    }

    public Animal(){
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", numOfLegs=" + numOfLegs +
                '}';
    }
}
