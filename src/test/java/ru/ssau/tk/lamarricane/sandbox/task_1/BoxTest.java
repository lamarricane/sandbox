package ru.ssau.tk.lamarricane.sandbox.task_1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BoxTest {
    int i = 1;
    private static final double DELTA = 0.00001;
    Integer I = Box.boxing(i);
    Boolean conditionTrue = Box.boxing();
    Boolean conditionFalse = Box.autoBoxing();
    Boolean conditionNull = null;

    @Test
    public void testIf() {
        if (conditionTrue) {
            System.out.println("OK");
        }
        if (Boolean.TRUE.equals(conditionFalse)) {
            System.out.println("OK BUT NO");
        }
        if (Boolean.TRUE.equals(conditionNull)) {
            System.out.println("NOT OK");
        }
    }

    @Test
    public void testBox() {
        if (conditionTrue) {
            assertEquals(Box.autoBoxing(i), i, DELTA);
            assertEquals(Box.autoUnboxing(i), i, DELTA);
            assertEquals((Box.autoBoxing(++I)), ++i, DELTA);
            assertEquals(Box.autoUnboxing(++I), ++i, DELTA);
        }
    }
}