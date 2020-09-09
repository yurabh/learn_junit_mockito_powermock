package com;

import org.junit.*;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeClass
    public static void beforeAllTests() {
        calculator = new Calculator();
        System.out.println("Before all tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("After all tests");
    }

    @Before
    public void beforeEachTest() {
        System.out.println("Before each test");
    }

    @After
    public void afterEachTest() {
        System.out.println("After each test");
    }

    @Test
    public void shouldReturnSumValues() {
        int sum = calculator.sum(5, 7);
        Assert.assertEquals("Should return 12", 12, sum);
    }

    @Test
    public void shouldReturnSumValues1() {
        int sum = calculator.sum(5, 7);
        Assert.assertEquals("Should return 12", 12, sum);
    }
}
