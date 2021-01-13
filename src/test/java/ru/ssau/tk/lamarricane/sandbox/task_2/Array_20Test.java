package ru.ssau.tk.lamarricane.sandbox.task_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array_20Test {

    @Test
    public void testArray() {
        int[] array = new int[]{3, 6, 9, 12, 15, 21, 6};
        assertTrue(Array_20.massive(array));
        int[] _1array = new int[]{20, 3, 6, 9, 12, 15, 21, 3};
        assertFalse(Array_20.massive(_1array));
    }
}