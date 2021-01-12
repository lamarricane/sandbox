package ru.ssau.tk.lamarricane.sandbox.task_1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NamedPointTest {
    NamedPoint firstPoint = new NamedPoint(3., 3., 3., "Taco");
    NamedPoint secondPoint = new NamedPoint(1, 2, 3);
    NamedPoint thirdPoint = new NamedPoint(5., 5., 5., "Nachos");

    @Test
    public void testGetName() {
        assertEquals(firstPoint.getName(), "Taco");
        assertNull(secondPoint.getName());
        assertEquals(thirdPoint.getName(), "Nachos");
    }

    @Test
    public void testSetName() {
        firstPoint.setName("Fajita");
        secondPoint.setName("Burrito");
        thirdPoint.setName("Quesadilla");
        assertEquals(secondPoint.getName(), "Burrito");
        assertEquals(thirdPoint.getName(), "Quesadilla");
        assertEquals(firstPoint.getName(), "Fajita");
    }
}
