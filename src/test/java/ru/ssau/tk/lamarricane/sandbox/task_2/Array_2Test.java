package ru.ssau.tk.lamarricane.sandbox.task_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array_2Test {

    @Test
    public void testArray() {
        int[] firstArray = Array_2.array(7);
        assertEquals(firstArray.length, 7);
        assertEquals(firstArray[0], 2);
        assertEquals(firstArray[1], 1);
        assertEquals(firstArray[2], 1);
        assertEquals(firstArray[3], 1);
        assertEquals(firstArray[4], 1);
        assertEquals(firstArray[5], 1);
        assertEquals(firstArray[6], 2);
    }
}