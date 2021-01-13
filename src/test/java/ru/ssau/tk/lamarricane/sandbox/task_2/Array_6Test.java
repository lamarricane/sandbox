package ru.ssau.tk.lamarricane.sandbox.task_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array_6Test {

    @Test
    public void testArray() {
        int[] arr = Array_6.array(10);
        assertEquals(arr.length, 10);
        assertEquals(arr[3], 9);
        assertEquals(arr[9], 81);
    }
}