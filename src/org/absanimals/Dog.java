package org.absanimals;

public class Dog extends Animal{
    public Dog(String name, String food) {
        super(name, food);

    }

    @Override
    public void makeSound() {
        System.out.println("I'm a dog Wof Wof");
    }

    @Override
    public boolean eat(String food) throws IllegalArgumentException {
        return false;
    }
}
