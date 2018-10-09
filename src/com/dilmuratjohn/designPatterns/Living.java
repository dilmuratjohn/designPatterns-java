package com.dilmuratjohn.designPatterns;

public interface Living {

    public void setName(String name);
    public void setSound(String sound);
    public void setFavFood(String food);
    public void setWeight(double weight);
    public void setSpeed(double speed);

    public String getName();
    public String getSound();
    public String getFavFood();
    public double getWeight();
    public double getSpeed();
}
