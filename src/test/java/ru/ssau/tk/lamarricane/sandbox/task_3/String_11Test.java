package ru.ssau.tk.lamarricane.sandbox.task_3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String_11Test {

    @Test
    public void testTheNumberOfStringArray() {
        String[] array = new String[]{"They", "climb", "out", "of", "the", "walls"};
        assertEquals(String_11.theNumberOfStringArray(array, "o", "f"), 1);
        assertEquals(String_11.theNumberOfStringArray(array, "c", "b"), 1);
    }
}