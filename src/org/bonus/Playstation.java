package org.bonus;

public class Playstation implements Device{
    @Override
    public void play() {
        System.out.println("I'm a playstation on play");
    }

    @Override
    public void stop() {
        System.out.println("I'm a playstation on stop");
    }
}
