package org.absanimals;

public class Bird extends Animal{
    public Bird(String name, String preFood) {
        super(name, preFood);
    }

    @Override
    public void makeSound() {
        System.out.println("I'm a bird Cip Cip");
    }

    @Override
    public boolean eat(String food) throws IllegalArgumentException {
        return false;
    }
}
