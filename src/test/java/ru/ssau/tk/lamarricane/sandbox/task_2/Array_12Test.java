package ru.ssau.tk.lamarricane.sandbox.task_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array_12Test {
    private static final double DELTA = 0.0001;

    @Test
    public void massiv() {
        double[] firstArray = Array_12.massiv(6);
        assertEquals(firstArray[0], 1, DELTA);
        assertEquals(firstArray[1], 2, DELTA);
        assertEquals(firstArray[2], 3, DELTA);
        assertEquals(firstArray[3], 6, DELTA);
        assertEquals(firstArray.length, 4, DELTA);
    }
}