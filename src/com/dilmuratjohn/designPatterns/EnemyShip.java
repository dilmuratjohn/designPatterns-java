package com.dilmuratjohn.designPatterns;

abstract class EnemyShip {

    private String name;
    private double speed;
    private double amtDamage;
    ESWeapon weapon;
    ESEngine engine;


    abstract void makeShip();

    public String toString() {
        return name + " has a top speed of " + engine + " and an attack power of " + weapon;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    private double getSpeed() {
        return speed;
    }

    void setSpeed(double speed) {
        this.speed = speed;
    }

    private double getDamage() {
        return amtDamage;
    }

    void setDamage(double damage) {
        this.amtDamage = damage;
    }

    void followHeroShip() {
        System.out.println(getName() + " is following the hero with the speed " + getSpeed() + "mph.");
    }

    void displayEnemyShip() {
        System.out.println(getName() + " is on the screen.");
    }

    void enemyShipShoots() {
        System.out.println(getName() + " attacks and does " + getDamage() + " damage.");
    }

}
