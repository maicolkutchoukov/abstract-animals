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

            if (zoo[i] instanceof Fly) {
//              ((Fly) zoo[i]).fly();
                Actions.doFly(((Fly) zoo[i]));
            }
            if (zoo[i] instanceof Swim) {
//                ((Swim) zoo[i]).swim();
                Actions.doSwim(((Swim) zoo[i]));
            }


            System.out.println("***************************");
        }

    }
}
