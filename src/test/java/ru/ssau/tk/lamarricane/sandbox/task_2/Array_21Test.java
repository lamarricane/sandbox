package ru.ssau.tk.lamarricane.sandbox.task_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array_21Test {

    @Test
    public void testArray() {
        int[] array = new int[]{1, 2, 3, 3, 2, 1, 3};
        assertEquals(Array_21.massive(array), 3);
        int[] temp = new int[]{1, 1, 1, 1, 0, 0, 0, -1};
        assertEquals(Array_21.massive(temp), 1);
    }
}