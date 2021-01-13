package ru.ssau.tk.lamarricane.sandbox.task_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array_15Test {

    @Test
    public void testArray() {
        int[] massive = {1, 2, 3, 4, 5};
        assertTrue(Array_15.array(massive, 1));
        assertFalse(Array_15.array(massive, 6));
        assertTrue(Array_15.array(massive, 4));
        assertFalse(Array_15.array(massive, 10));
    }
}
