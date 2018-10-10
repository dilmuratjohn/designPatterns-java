package com.dilmuratjohn.designPatterns;

class UFOEnemyShipFactory implements EnemyShipFactory {

    @Override
    public ESWeapon addESGun() {
        return new ESUFOGun();
    }

    @Override
    public ESEngine addESEngine() {
        return new ESUFOEngine();
    }

}
