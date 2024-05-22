package org.absanimals;

public interface Fly {
    default void fly(){
        System.out.println("I'm flying");
    };
}
