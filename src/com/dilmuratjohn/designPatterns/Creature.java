package com.dilmuratjohn.designPatterns;

abstract public class Creature {

    protected String name;
    protected double height;
    protected int weight;
    protected String favFood;
    protected double speed;
    protected String sound;

    public abstract void setName(String name);

    public abstract String getName();

    public abstract void setHeight(double height);

    public abstract double getHeight();

    public abstract void setWeight(double weight);

    public abstract double getWeight();

    public abstract void setFavFood(String favFood);

    public abstract String getFavFood();

    public abstract void setSpeed(double speed);

    public abstract double getSpeed();

    public abstract void setSound(String sound);

    public abstract String getSound();

}