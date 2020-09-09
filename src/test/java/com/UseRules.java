package com;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.rules.ExpectedException;

public class UseRules {

    @Rule
    public SystemOutRule outRule = new SystemOutRule().enableLog();

    public static final Calculator CALCULATOR = new Calculator();

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void shouldPrintInConsole() {
        CALCULATOR.print();
        String log = outRule.getLog();
        Assert.assertTrue(log.contains("Hello world"));
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowException() {
        CALCULATOR.thrownException();
    }

    @Test
    public void shouldThrowExceptionWithRule() {
        exception.expect(NullPointerException.class);
        exception.expectMessage("I'm new NPE");
        CALCULATOR.thrownException();
    }
}
