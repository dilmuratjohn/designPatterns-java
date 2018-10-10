package com.dilmuratjohn.designPatterns;

interface ESWeapon {
    String toString();
}

interface ESEngine {
    String toString();
}

class ESUFOGun implements ESWeapon {

    @Override
    public String toString() {
        return "20.0 damage";
    }
}

class ESUFOEngine implements ESEngine {

    @Override
    public String toString() {
        return "1000.0 mph";
    }
}

class ESUFOBossGun implements ESWeapon {

    @Override
    public String toString() {
        return "40.0 damage";
    }
}

class ESUFOBossEngine implements ESEngine {

    @Override
    public String toString() {
        return "2000.0 mph";
    }
}
