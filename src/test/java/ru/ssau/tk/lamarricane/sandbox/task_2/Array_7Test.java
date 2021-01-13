package ru.ssau.tk.lamarricane.sandbox.task_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array_7Test {
    private static final double DELTA = 0.00001;

    @Test
    public void test1() throws Exception {
        double[] Eqution1 = Array_7.array(1, 1, -2);
        assertEquals(Eqution1[0], 1, DELTA);
        assertEquals(Eqution1[1], -2, DELTA);
    }

    @Test
    public void test2() throws Exception {
        double[] Eqution2 = Array_7.array(0, 2, -4);
        assertEquals(Eqution2[0], 2, DELTA);
    }

    @Test
    public void testNuN() {
        try {
            double[] DoesNotExist = Array_7.array(0, 0, 8);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Решения нет");
        }

        try {
            double[] emptyEqution = Array_7.array(0, 0, 0);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Комплексное число");
        }

        try {
            double[] ComplexNumbers = Array_7.array(1, 3, 7);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Не является вещественным числом");
        }
    }
}