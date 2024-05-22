package org.absanimals;

public class Dolphin extends Animal{


    public Dolphin(String name, String preFood) {
        super(name, preFood);
    }

    @Override
    public void makeSound() {
        System.out.println("I'm a dolphin Gni Gni");
    }

    @Override
    public boolean eat(String food) throws IllegalArgumentException {
        return false;
    }
}
