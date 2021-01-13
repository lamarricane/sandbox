package ru.ssau.tk.lamarricane.sandbox.task_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array_10Test {
    private static final double DELTA = 0.00001;

    @Test
    public void testGetGeometricProgression() {
        double[] array = Array_10.getGeometricProgression(2, 2, 11);
        assertEquals(array[5], 64, DELTA);
    }
}