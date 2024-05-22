package org.absanimals;

public abstract class Animal{
    private String name;
    private String preFood;
    private static final String[] foods = {"Grass", "Meat", "Milk"};
    public Animal(String name, String preFood){
        this.name = name;
        this.preFood = preFood;
    }

    public String getName() {
        return name;
    }

    public String getPreFood() {
        return preFood;
    }

    public void sleep() {
        System.out.println("Zzzz");
    }

    public void makeFly() {
    }

    public void makeSwim() {
    }


    // METODO ASTRATTO
    public abstract void makeSound();

    public abstract boolean eat(String food) throws IllegalArgumentException;


}
