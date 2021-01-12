package ru.ssau.tk.lamarricane.sandbox.task_1;

import org.testng.annotations.Test;
import ru.ssau.tk.lamarricane.sandbox.task_1.Point;
import ru.ssau.tk.lamarricane.sandbox.task_1.Points;

import static org.testng.Assert.*;

public class PointsTest {
    public static double DELTA = 0.00005;

    @Test
    public void TestSum() {
        assertTrue(Points.equalsApproximately(Points.sum(new Point(1.0, 1.0, 1.0),
                new Point(2.0, 2.0, 2.0)),
                new Point(3.0, 3.0, 3.0)));
    }

    @Test
    public void TestSubtract() {
        assertTrue(Points.equalsApproximately(Points.subtract(new Point(3, 3, 3),
                new Point(2, 2, 2)),
                new Point(1, 1, 1)));
    }

    @Test
    public void TestMultiply() {
        assertTrue(Points.equalsApproximately(Points.multiply(new Point(0, 0, 0),
                new Point(5, 5, 5)),
                new Point(0, 0, 0)));
    }

    @Test
    public void TestDivide() {
        assertTrue(Points.equalsApproximately(Points.divide(new Point(8, 8, 8),
                new Point(4, 4, 2)),
                new Point(2, 2, 4)));
    }

    @Test
    public void TestEnlarge() {
        assertTrue(Points.equalsApproximately(Points.enlarge(new Point(1, 1, 1),
                3), new Point(3, 3, 3)));
    }

    @Test
    public void TestLength() {
        assertEquals(Points.length(new Point(1.0, 1.0, 1.0)), Math.sqrt(3), DELTA);
    }

    @Test
    public void TestOpposite() {
        assertTrue(Points.equalsApproximately(Points.opposite(new Point(1.0, 1.5, -0.5)), new Point(-1.0, -1.5, 0.5)));
    }

    @Test
    public void TestInverse() {
        assertFalse(Points.equalsApproximately(Points.inverse(new Point(1.0, 1.5, 0.5)), new Point(6.0, 0.66666, 2.0)));
    }

    @Test
    public void TestScalarProduct() {
        assertEquals(Points.scalarProduct(new Point(1.0, 0.5, 2.0), new Point(3.0, -0.5, 4.0)), 10.75, DELTA);
    }

    @Test
    public void testVectorProduct() {
        assertTrue(Points.equalsApproximately(Points.vectorProduct(new Point(3.0, 2.0, 1.0), new Point(-1.0, 4.0, 5.0)), new Point(6.0, -16.0, 14.0)));
    }
}