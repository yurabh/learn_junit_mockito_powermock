package com;

import java.util.Random;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public static int sumStatic(int a, int b) {
        return a + b;
    }

    public int sumPrivate(int a) {
        return a + getRandomPrivateParam(5);
    }

    private int getRandomPrivate() {
        return new Random().nextInt(20);
    }

    private int getRandomPrivateParam(int value) {
        return new Random().nextInt(value);
    }

    public void print() {
        System.out.println("Hello world");
    }

    public void thrownException() {
        throw new NullPointerException("I'm new NPE");
    }

    public int sumRandom(int a) {
        print();
        return a + getRandomValue();
    }

    public int getRandomValue() {
        return new Random().nextInt(20);
    }
}
