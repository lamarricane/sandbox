package ru.ssau.tk.lamarricane.sandbox.task_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array_24Test {

    @Test
    public void testGetNot() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        Array_24.getNotMassive(array);
        assertEquals(array[0], -2);
        Array_24.getNotMassive(array);
        assertEquals(array[0], 1);
    }
}