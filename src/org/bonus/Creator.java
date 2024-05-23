package org.bonus;

public class Creator {

    public Device create(String type) throws Exception {
        if(type.equals("dvd player")){
            return new DvdPlayer();
        } else if (type.equals("playstation")){
            return new Playstation();
        } else{
            throw new IllegalArgumentException("Input non valido!");
        }
    }
}
