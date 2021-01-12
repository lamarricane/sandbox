package ru.ssau.tk.lamarricane.sandbox.task_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array_4Test {

    @Test
    public void testArray() {
        int[] array = Array_4.array(3);
        assertEquals(array[0], 6);
        assertEquals(array[1], 4);
        assertEquals(array[2], 2);
    }
}