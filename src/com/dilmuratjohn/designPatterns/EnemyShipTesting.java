package com.dilmuratjohn.designPatterns;

import java.util.Scanner;

public class EnemyShipTesting {

    public static void main(String[] args) {

        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);
        System.out.println("What type of shop? (U / B / R)");

        if (userInput.hasNextLine()) {
            String typeOfShip = userInput.nextLine();
            theEnemy = shipFactory.makeEnemyShip(typeOfShip);
        }

        if (theEnemy != null) {
            doStuffEnemy(theEnemy);
        } else {
            System.out.println("Enter a U, R or B next time.");
        }

    }

    private static void doStuffEnemy(EnemyShip ship) {

        ship.displayEnemyShip();
        ship.followHeroShip();
        ship.enemyShipShoots();

    }

}