package com.dilmuratjohn.designPatterns;

public interface Fly {

    String fly();
}

class CanFly implements Fly{

    @Override
    public String fly() {
        return "Flying high.";
    }
}

class CanNotFlay implements Fly{

    @Override
    public String fly() {
        return "I can't fly.";
    }
}
