package ru.ssau.tk.lamarricane.sandbox.task_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array_8Test {
    private static final double DELTA = 0.00001;

    @Test
    public void testArray() {
        double[] array = Array_8.massive(11);
        assertEquals(array[0], 1, DELTA);
        assertEquals(array[5], 8, DELTA);
        assertEquals(array[6], 10, DELTA);
    }
}