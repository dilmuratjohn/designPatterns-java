package com.dilmuratjohn.designPatterns;

class Bird extends Animal {

    Bird() {
        super();

        setSound("Tweet");

        flyingType = new CanFly();
    }
}
