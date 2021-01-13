package ru.ssau.tk.lamarricane.sandbox.task_3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String_10Test {

    @Test
    public void testString() {
        String[] array = new String[]{"Lambert", "stop", "whining"};
        assertEquals(String_10.strings(array, "w", "g"), 1);
        assertEquals(String_10.strings(array, "a", "e"), 0);
    }
}
