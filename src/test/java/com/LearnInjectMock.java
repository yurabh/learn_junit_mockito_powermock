package com;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LearnInjectMock {

    @Mock
    private Door door;

    @Spy
    private Engine engine;

    @InjectMocks
    private Car car;

    @Test
    public void shouldTestInjectMock() {
        Mockito.when(door.getNumberDoor()).thenReturn(9);

        Mockito.when(engine.getNumberCylinder()).thenReturn(6);

        Assert.assertEquals(9, car.getDoor().getNumberDoor());

        Assert.assertEquals(6, car.getEngine().getNumberCylinder());
    }
}
