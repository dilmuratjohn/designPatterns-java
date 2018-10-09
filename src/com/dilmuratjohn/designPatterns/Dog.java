package com.dilmuratjohn.designPatterns;

class Dog extends Animal {

    void digHole() {

        System.out.println("Dug a hole.");

    }

    Dog() {

        super();

        setSound("Bark");

        flyingType = new CanNotFlay();

    }

}
