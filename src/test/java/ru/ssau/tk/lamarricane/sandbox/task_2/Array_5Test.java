package ru.ssau.tk.lamarricane.sandbox.task_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array_5Test {

    @Test
    public void testArray() {
        int[] arr = Array_5.array(5);
        assertEquals(arr[0], 0);
        assertEquals(arr[1], 1);
        assertEquals(arr[2], 1);
        assertEquals(arr[3], 2);
        assertEquals(arr[4], 3);
    }
}
