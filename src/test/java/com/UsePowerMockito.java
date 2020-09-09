package com;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.api.support.membermodification.MemberMatcher;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.ArgumentMatchers.anyInt;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Calculator.class)
public class UsePowerMockito {

    @Test
    public void shouldMockStaticMethod() {
        PowerMockito.mockStatic(Calculator.class);

        PowerMockito.when(Calculator.sumStatic(anyInt(), anyInt())).thenReturn(8);

        Assert.assertEquals(8, Calculator.sumStatic(7, 9));
    }


    @Test
    public void shouldMockPrivateMethod() throws Exception {
        Calculator calculator = new Calculator();

        Calculator spied = PowerMockito.spy(calculator);

        PowerMockito.when(spied, MemberMatcher.method(Calculator.class, "getRandomPrivate"))
                .withNoArguments()
                .thenReturn(6);

        Assert.assertEquals(14, spied.sumPrivate(8));
    }


    @Test
    public void shouldMockPrivateMethodWithParam() throws Exception {
        Calculator calculator = new Calculator();

        Calculator spied = PowerMockito.spy(calculator);

        PowerMockito.when(spied, MemberMatcher.method(Calculator.class, "getRandomPrivateParam", int.class))
                .withArguments(5)
                .thenReturn(6);

        Assert.assertEquals(11, spied.sumPrivate(5));
    }


    @Test
    public void shouldMockPrivateMethodAnotherSolution() throws Exception {
        Calculator calculator = new Calculator();

        Calculator spied = PowerMockito.spy(calculator);

        PowerMockito.doReturn(6).when(spied, "getRandomPrivate");

        Assert.assertEquals(14, spied.sumPrivate(8));
    }
}
