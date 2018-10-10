package com.dilmuratjohn.designPatterns;

class EnemyShipFactory {

    EnemyShip makeEnemyShip(String shipType) {

        EnemyShip ship = null;

        switch (shipType) {
            case "U":
                return new UFOEnemyShip();
            case "B":
                return new BigUFOEnemyShip();
            case "R":
                return new RocketEnemyShip();
            default:
                return null;
        }

    }

}
