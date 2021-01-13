package ru.ssau.tk.lamarricane.sandbox.task_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array_23Test {

    @Test
    public void testArray() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        Array_23.massive(array);
        assertEquals(array[0], 8);
        assertEquals(array[7], 1);
    }
}