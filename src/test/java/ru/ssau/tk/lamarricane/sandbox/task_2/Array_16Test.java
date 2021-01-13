package ru.ssau.tk.lamarricane.sandbox.task_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array_16Test {

    @Test
    public void testArray() {
        Integer[] massive = new Integer[4];
        massive[0] = 1;
        massive[1] = null;
        massive[2] = 3;
        assertTrue(Array_16.array(massive));
    }
}
