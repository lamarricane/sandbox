package ru.ssau.tk.lamarricane.sandbox.task_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array_30Test {

    @Test
    public void testArray() {
        assertEquals(Array_30.massive(3), new int[][]{{1, 2, 3}, {4, 5}, {6}});
    }
}
