package ru.ssau.tk.lamarricane.sandbox.task_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array_1Test {

    @Test
    public void testArray() {
        Array_1 array = new Array_1();
        int[] testArray = new int[19];
        int[] testArray1 = new int[44];
        assertEquals(array.array(19), testArray);
        assertEquals(array.array(44), testArray1);
        assertNotEquals(array.array(3), testArray1);
    }
}