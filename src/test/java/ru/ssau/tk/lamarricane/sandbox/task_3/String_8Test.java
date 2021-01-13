package ru.ssau.tk.lamarricane.sandbox.task_3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String_8Test {
    @Test
    public void testIndexString() {
        assertEquals(String_8.getIndexString("Carbonara", "Ca"), -1);
        assertEquals(String_8.getIndexString("Pizza pasta", "pasta"), 6);
    }
}
