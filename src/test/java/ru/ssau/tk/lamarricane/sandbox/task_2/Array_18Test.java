package ru.ssau.tk.lamarricane.sandbox.task_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array_18Test {

    @Test
    public void testArray() {
        int[] array = new int[]{121, 43, 81, 22, 6};
        assertNull(Array_18.massive(new int[]{}), null);

    }
}
