package ru.ssau.tk.lamarricane.sandbox.task_1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IdenticalOperationTest {
    private static final double DELTA = 0.00001;
    private static final double NEGATIVE_INFINITY = 0.00001;
    private static final double POSITIVE_INFINITY = 0.00001;
    private static final double NaN = 0.00001;
    Operation Identical = new IdenticalOperation();

    @Test
    public void testApply() {
        assertEquals(Identical.apply(100), 100, DELTA);
        assertEquals(Identical.apply(NEGATIVE_INFINITY), NEGATIVE_INFINITY, DELTA);
        assertEquals(Identical.apply(POSITIVE_INFINITY), POSITIVE_INFINITY, DELTA);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(Identical.apply(Double.NaN), Double.NaN, DELTA);
        assertEquals(Identical.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DELTA);
        assertEquals(Identical.apply(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY, DELTA);
    }
}