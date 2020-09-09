package com;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class ParametrizedTests {

    @Test
    @Parameters({"1|8", "-2|-9", "-5,4", "9,-8"})
    public void shouldReturnValues(int v1, int v2) {
        Calculator calculator = new Calculator();
        Assert.assertEquals(v1 + v2, calculator.sum(v1, v2));
    }
}
