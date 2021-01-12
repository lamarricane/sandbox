package ru.ssau.tk.lamarricane.sandbox.task_1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TangentOperationTest {
    private static final double DELTA = 0.00001;
    private static final double NEGATIVE_INFINITY = 0.00001;
    private static final double POSITIVE_INFINITY = 0.00001;
    private static final double NaN = 0.00001;
    Operation Tangent = new TangentOperation();

    @Test
    public void testApply() {
        assertEquals(Tangent.apply(Math.PI / 4), 1, DELTA);
        assertEquals(Tangent.apply(Math.PI), 0, DELTA);
        assertEquals(Tangent.apply(NaN), NaN, DELTA);
    }

    @Test
    public void testApplyTriple() {
        assertNotEquals(Tangent.apply(Math.PI / 2), POSITIVE_INFINITY, DELTA);
        assertNotEquals(Tangent.apply(Math.PI / 3), 3, DELTA);
        assertEquals(Tangent.apply(NaN), NaN, DELTA);
    }

}