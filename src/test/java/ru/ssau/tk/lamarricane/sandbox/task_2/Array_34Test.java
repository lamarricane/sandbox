package ru.ssau.tk.lamarricane.sandbox.task_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array_34Test {

    @Test
    public void testArrayMultiply() {
        assertEquals(Array_34.multiply(new Double[]{1., 2., Double.NaN,
                        Double.NEGATIVE_INFINITY,
                        Double.POSITIVE_INFINITY}).doubleValue(),
                10.);
    }
}
