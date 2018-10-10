package com.dilmuratjohn.designPatterns;

class UFOBossEnemyShip extends EnemyShip {

    EnemyShipFactory shipFactory;

    UFOBossEnemyShip(EnemyShipFactory shipFactory) {
        this.shipFactory = shipFactory;
    }

    @Override
    void makeShip() {
        System.out.println("Making enemy ship " + getName());
        weapon = shipFactory.addESGun();
        engine = shipFactory.addESEngine();
    }

}
