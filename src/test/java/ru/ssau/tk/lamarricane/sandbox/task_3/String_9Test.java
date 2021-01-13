package ru.ssau.tk.lamarricane.sandbox.task_3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String_9Test {

    @Test
    public void testGetIndexString() {
        assertEquals(String_9.getIndexString("Hello World", "lo"), 3);
        assertEquals(String_9.getIndexString("Kit Kat", "Kat"), -1);
    }
}