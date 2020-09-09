package com;

public class Car {

    private Engine engine;
    private Door door;

    public Car(Engine engine, Door door) {
        this.engine = engine;
        this.door = door;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }
}
