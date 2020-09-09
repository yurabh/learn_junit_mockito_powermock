package com;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorOperationsTest {

    @Mock
    private CalculatorOperations mockCalculatorOperations;

    @Spy
    private CalculatorOperations spyCalculatorOperations;

    @Test
    public void shouldSumMethodCalculatorOperationsTest() {
        Mockito.when(mockCalculatorOperations.getRandomValueOne()).thenReturn(2);

        Mockito.when(mockCalculatorOperations.getRandomValueTwo()).thenReturn(2);

        Mockito.when(mockCalculatorOperations.sum()).thenCallRealMethod();

        Assert.assertEquals(4, mockCalculatorOperations.sum());

        Mockito.verify(mockCalculatorOperations, Mockito.times(1)).getRandomValueOne();

        Mockito.verify(mockCalculatorOperations, Mockito.times(1)).getRandomValueTwo();

        Mockito.verify(mockCalculatorOperations, Mockito.times(1)).sum();

//        Mockito.verifyNoMoreInteractions(mockCalculatorOperations);
    }

    @Test
    public void shouldSubtractCalculatorOperationsMethodTest() {

        Mockito.when(mockCalculatorOperations.getRandomValueOne()).thenReturn(10);

        Mockito.when(mockCalculatorOperations.getRandomValueTwo()).thenReturn(5);

        Mockito.when(mockCalculatorOperations.subtract()).thenCallRealMethod();

        Assert.assertEquals(5, mockCalculatorOperations.subtract());

        Mockito.verify(mockCalculatorOperations, Mockito.times(1)).getRandomValueOne();

        Mockito.verify(mockCalculatorOperations, Mockito.times(1)).getRandomValueTwo();

        Mockito.verify(mockCalculatorOperations, Mockito.times(1)).subtract();
    }

    @Test
    public void shouldMultiplyCalculatorOperationsMethodTest() {
        Mockito.when(spyCalculatorOperations.getRandomValueOne()).thenReturn(10);

        Mockito.when(spyCalculatorOperations.getRandomValueTwo()).thenReturn(2);

        Assert.assertEquals(20, spyCalculatorOperations.multiply());

        Mockito.verify(spyCalculatorOperations, Mockito.times(1)).getRandomValueOne();

        Mockito.verify(spyCalculatorOperations, Mockito.times(1)).getRandomValueTwo();

        Mockito.verify(spyCalculatorOperations, Mockito.times(1)).multiply();
    }

    @Test
    public void shouldDivideCalculatorOperationsMethodTest() {

        Mockito.when(spyCalculatorOperations.getRandomValueOne()).thenReturn(100);

        Mockito.when(spyCalculatorOperations.getRandomValueTwo()).thenReturn(20);

        Assert.assertEquals(5, spyCalculatorOperations.divide());

        Mockito.verify(spyCalculatorOperations, Mockito.times(1)).getRandomValueOne();

        Mockito.verify(spyCalculatorOperations, Mockito.times(1)).getRandomValueTwo();

        Mockito.verify(spyCalculatorOperations, Mockito.times(1)).divide();
    }

    @Test
    public void shouldDivideByModuleCalculatorOperationsTest() {
        Mockito.when(spyCalculatorOperations.getRandomValueOne()).thenReturn(10);

        Mockito.when(spyCalculatorOperations.getRandomValueTwo()).thenReturn(3);

        Assert.assertEquals(1, spyCalculatorOperations.divideByModule());

        Mockito.verify(spyCalculatorOperations, Mockito.times(1)).getRandomValueOne();

        Mockito.verify(spyCalculatorOperations, Mockito.times(1)).getRandomValueTwo();

        Mockito.verify(spyCalculatorOperations, Mockito.times(1)).divideByModule();
    }
}
