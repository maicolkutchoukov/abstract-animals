package org.absanimals;

public class Zoo {
    public static void main(String[] args) {
        Animal[] zoo = {
                new Dog("Rocky", "meat"),
                new Dolphin("Skittle", "meat"),
                new Eagle("Sprite", "meat"),
                new Bird("Jerry", "grass"),
                new Dolphin("Pinco", "meat")
        };
        for (int i = 0; i < zoo.length; i++) {

            System.out.println("My name is: " + zoo[i].getName());
            zoo[i].makeSound();
            System.out.println("My favorite food is: " + zoo[i].getPreFood());
            // verifico se sono animali volanti
            if (zoo[i] instanceof Fly) {
                ((Fly) zoo[i]).fly();
            }

            // verifico se sono animali nuotanti
            if (zoo[i] instanceof Swim) {
                ((Swim) zoo[i]).swim();
            }


            System.out.println("***************************");
        }

    }
}
