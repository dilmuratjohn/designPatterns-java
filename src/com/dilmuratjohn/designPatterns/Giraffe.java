package com.dilmuratjohn.designPatterns;

public class Giraffe extends Creature{

    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setWeight(String weight) {

    }

    @Override
    public int setWeight() {
        return 0;
    }
}
