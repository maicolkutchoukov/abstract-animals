package org.absanimals;

public class Dolphin extends Animal implements Swim{


    public Dolphin(String name, String preFood) {
        super(name, preFood);
    }
    public static void makeSwim(Swim animal){
        animal.swim();
    }
    @Override
    public void makeSound() {
        System.out.println("I'm a dolphin Gni Gni");
    }

    @Override
    public boolean eat(String food) throws IllegalArgumentException {
        return false;
    }

    @Override
    public void swim() {
        System.out.println("I'm swimming");
    }
}
