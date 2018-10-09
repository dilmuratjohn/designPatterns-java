package com.dilmuratjohn.designPatterns;

public class Bird extends Animal {

    public Bird(){
        super();

        setSound("Tweet");

        flyingType = new CanFly();
    }
}
