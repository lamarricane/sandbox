package ru.ssau.tk.lamarricane.sandbox.task_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array_32Test {

    @Test
    public void testSort() {
        Double[] array = new Double[]{Double.NaN, 1., 2.};
        Array_32.sort(array);
        assertEquals(array[1].doubleValue(), 1.);
        assertEquals(array[0].doubleValue(), Double.NaN);
    }
}

