package ru.ssau.tk.lamarricane.sandbox.task_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array_9Test {
    private static final double DELTA = 0.00001;

    @Test
    public void testArray() {
        int[] array = Array_9.massive(1, 3, 11);
        assertEquals(array[10], 31, DELTA);
    }
}

