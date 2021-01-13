package ru.ssau.tk.lamarricane.sandbox.task_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array_26Test {

    @Test
    public void testArray() {
        assertEquals(Array_26.massive(new int[]{10, 4, 8, 2, 9}), new int[]{14, 10, 9});
        assertEquals(Array_26.massive(new int[]{10, 4, 8, 2, 9, 1, 2, 5}), new int[]{14, 10, 10, 7});
    }
}