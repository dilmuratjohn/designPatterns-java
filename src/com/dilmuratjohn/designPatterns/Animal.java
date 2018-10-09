package com.dilmuratjohn.designPatterns;

public class Animal {

    private String name;
    private String favFood;
    private String sound;
    private double height;
    private double weight;
    private double speed;

    Fly flyingType;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public void setFavFood(String food) {
        this.favFood = food;
    }

    public String getFavFood() {
        return favFood;
    }

    void setSound(String sound) {
        this.sound = sound;
    }

    String getSound() {
        return sound;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight must be bigger than 0.");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    String tryToFly() {
        return flyingType.fly();
    }

    void setFlyingAbility(Fly flyingType) {
        this.flyingType = flyingType;
    }
}