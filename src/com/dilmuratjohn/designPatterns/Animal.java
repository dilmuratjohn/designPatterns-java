package com.dilmuratjohn.designPatterns;

public class Animal {

    private String name;
    private int weight;
    private String sound;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(int weight) {

        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight must be bigger than 0.");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}
