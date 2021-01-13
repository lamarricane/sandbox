package ru.ssau.tk.lamarricane.sandbox.task_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array_22Test {

    @Test
    public void testArray() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        assertEquals(Array_22.massive(array, 1), 0);
        assertEquals(Array_22.massive(array, 3), 2);
        assertEquals(Array_22.massive(array, 7), 6);
    }
}
