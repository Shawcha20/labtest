package com.example.soft_lab_testa2;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class colorTest extends TestCase {
@Test
    public void redTest()
{
    color red= new red();
    assertEquals("the color is Red",red.showColor());
}
    public void blueTest()
    {
        color blue= new blue();
        assertEquals("the color is Blue",blue.showColor());
    }
    public void greenTest()
    {
        color green= new green();
        assertEquals("the color is Green",green.showColor());
    }
}