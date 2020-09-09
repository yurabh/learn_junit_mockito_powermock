package com;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LearnMockito {

    @Mock
    private Calculator mock;

    @Spy
    private Calculator spy;

    @Test
    public void shouldMockMethod() {
//        Calculator mock = Mockito.mock(Calculator.class);

        Mockito.when(mock.getRandomValue()).thenReturn(5);

        Mockito.when(mock.sumRandom(ArgumentMatchers.anyInt())).thenCallRealMethod();

        Assert.assertEquals(14, mock.sumRandom(9));

        Mockito.verify(mock, Mockito.times(1)).getRandomValue();

        Mockito.verify(mock, Mockito.times(1)).sumRandom(ArgumentMatchers.anyInt());

//        Mockito.verifyNoMoreInteractions(mock);
    }

    @Test
    public void shouldSpyMethod() {
        Mockito.when(spy.getRandomValue()).thenReturn(5);

        Assert.assertEquals(14, spy.sumRandom(9));
    }
}
