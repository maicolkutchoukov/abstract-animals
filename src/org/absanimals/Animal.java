package org.absanimals;

public abstract class Animal{
    private String name;
    private String preFood;
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


    // METODO ASTRATTO
    public abstract void makeSound();

    public abstract boolean eat(String food);


}
