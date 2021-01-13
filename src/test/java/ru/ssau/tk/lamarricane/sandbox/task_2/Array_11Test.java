package ru.ssau.tk.lamarricane.sandbox.task_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array_11Test {

    @Test
    public void testArray() {
        double[] array = Array_11.array(20);
        assertEquals(array[0], 1.);
        assertEquals(array[1], 2.);
        assertEquals(array[2], 4.);
    }
}

