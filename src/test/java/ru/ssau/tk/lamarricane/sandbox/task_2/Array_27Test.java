package ru.ssau.tk.lamarricane.sandbox.task_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array_27Test {

    @Test
    public void testArray() {
        assertEquals(Array_27.massive(new int[]{1, 2, 3, 4}), new boolean[]{false, true, false, true});
    }
}
