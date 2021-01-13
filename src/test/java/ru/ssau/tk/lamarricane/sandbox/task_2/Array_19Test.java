package ru.ssau.tk.lamarricane.sandbox.task_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array_19Test {

    @Test
    public void testArray() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 20};
        assertEquals(Array_19.massive(array), 25);
    }
}