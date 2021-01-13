package ru.ssau.tk.lamarricane.sandbox.task_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array_28Test {

    @Test
    public void testArray() {
        assertEquals(Array_28.intToLong(Array_28.longToInt(1095L)), 1095L);
        assertEquals(Array_28.intToLong(Array_28.longToInt(9L)), 9L);
    }
}
