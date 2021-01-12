package ru.ssau.tk.lamarricane.sandbox.task_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array_3Test {

    @Test
    public void testArray() {
        int[] firstArray = Array_3.array(7);
        assertEquals(firstArray[0], 1);
        assertEquals(firstArray[1], 3);
        assertEquals(firstArray[2], 5);
        assertEquals(firstArray[3], 7);
        assertEquals(firstArray[4], 9);
        assertEquals(firstArray[5], 11);
        assertEquals(firstArray[6], 13);
    }
}