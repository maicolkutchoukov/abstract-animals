package org.absanimals;

public class Eagle extends Animal implements Fly{

    public Eagle(String name, String preFood) {
        super(name, preFood);
    }

    @Override
    public void makeSound() {
        System.out.println("I'm a Eagle Uiiiiii");
    }

    @Override
    public boolean eat(String food) throws IllegalArgumentException {
        return false;
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
