package ru.ssau.tk.lamarricane.sandbox.task_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array_14Test {

    @Test
    public void testArray() {
        int massive[] = new int[]{1, -2, 3, -4, 5, -6, 7, -8};
        Array_14.array(massive);
        assertEquals((massive[0]), -1);
        assertEquals((massive[1]), 2);
        assertEquals(massive[2], -3);
        assertEquals(massive[3], 4);
        assertEquals(massive[4], -5);
        assertEquals(massive[5], 6);
        assertEquals(massive[6], -7);
        assertEquals(massive[7], 8);
    }
}