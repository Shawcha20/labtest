package com.example.soft_lab_testa2;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class vehicleTest extends TestCase {
    @Test
    public void sedanTest()
    {
        vehicle sedan= new sedan();
        assertEquals(3,sedan.wheels());
        assertEquals(2.0,sedan.fuels());
        assertEquals(5.0,sedan.milages());
        assertEquals("this is sedan",sedan.drive());
    }
    public void motorTest()
    {
        vehicle motor= new motorcycle();
        assertEquals(2,motor.wheels());
        assertEquals(.5,motor.fuels());
        assertEquals(1.5,motor.milages());
        assertEquals("this is motorcycle",motor.drive());
    }
    public void suvTest()
    {
        vehicle suv= new SUV();
        assertEquals(4,suv.wheels());
        assertEquals(2.5,suv.fuels());
        assertEquals(4,suv.milages());
        assertEquals("this is suv", suv.drive());
    }
}