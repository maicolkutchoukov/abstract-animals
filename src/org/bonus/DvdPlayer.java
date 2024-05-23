package org.bonus;

public class DvdPlayer implements Device{

    @Override
    public void play() {
        System.out.println("I'm dvd player on play");
    }

    @Override
    public void stop() {
        System.out.println("I'm dvd player on stop");
    }
}
