package com;

import java.util.Random;

/**
 * +++++ Создать калькулятор:
 * +++++ Метод класса возвращает значение для операции. Создать методы под действия *, /, -, +, %.
 * +++++ Создать два public метода, возвращающих случайные числа.
 * +++++ Каждый метод класса вызывает один из методов(возвращают случайные числа),чтобы получить значения для операций.
 * +++++ Протестировать методы,выполняющие мат.действия. Для каждой операции в тесте возвращать разные значения используя Mockito.
 * Создать private методы, возвращающих случ. числа и сделать аналогичные операции, использовав PowerMock.
 * Создать public static методы, возвращающих случ. числа и сделать аналогичные операции.PowerMock
 */

public class CalculatorOperations {
    public int sum() {
        return getRandomValueOne() + getRandomValueTwo();
    }

    public int subtract() {
        return getRandomValueOne() - getRandomValueTwo();
    }

    public int multiply() {
        return getRandomValueOne() * getRandomValueTwo();
    }

    public int divide() {
        return getRandomValueOne() / getRandomValueTwo();
    }

    public int divideByModule() {
        return getRandomValueOne() % getRandomValueTwo();
    }

    public int getRandomValueOne() {
        return new Random().nextInt(12);
    }

    public int getRandomValueTwo() {
        return new Random().nextInt(6);
    }
}
