package com.dilmuratjohn.designPatterns;

public abstract class EnemyShip {

    private String name;
    private double amtDamage;

    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double getDamage() {
        return amtDamage;
    }

    void setDamage(double damage) {
        this.amtDamage = damage;
    }

    void followHeroShip() {
        System.out.println(getName() + " is following the hero.");
    }

    void displayEnemyShip() {
        System.out.println(getName() + " is on the screen.");
    }

    void enemyShipShoots() {
        System.out.println(getName() + " attacks and does " + getDamage() + " damage.");
    }

}
