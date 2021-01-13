package ru.ssau.tk.lamarricane.sandbox.task_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array_29Test {

    @Test
    public void testArray() {
        int[] array = Array_29.massive(5, 3);
        assert array != null;
        assertEquals(array[0],3);
        assertEquals(array[1],4);
        assertEquals(array[2],5);
        assertEquals(array[3],1);
    }
}