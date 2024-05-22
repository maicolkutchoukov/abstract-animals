package org.absanimals;

public interface Swim {
    default void swim(){
        System.out.println("I'm swimming");
    };
}
