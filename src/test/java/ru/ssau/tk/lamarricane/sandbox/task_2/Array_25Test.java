package ru.ssau.tk.lamarricane.sandbox.task_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array_25Test {

    @Test
    public void testArray() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int[] arrayNot = Array_25.getNotMassive(array);
        assertEquals(arrayNot[0], -2);
        assertEquals(array[0], 1);

    }
}

