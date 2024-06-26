package org.absanimals;

public class Bird extends Animal implements Fly{
    public Bird(String name, String preFood) {
        super(name, preFood);
    }
    public static void makeFly(Fly animal){
        animal.fly();
    }

    @Override
    public void makeSound() {
        System.out.println("I'm a bird Cip Cip");
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
