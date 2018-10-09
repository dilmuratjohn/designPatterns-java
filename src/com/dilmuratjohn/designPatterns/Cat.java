package com.dilmuratjohn.designPatterns;

class Cat extends Animal {


    Cat() {
        super();

        setSound("Meow");
    }

    final void attack() {
        System.out.println("Attack!");
    }
}
