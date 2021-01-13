package ru.ssau.tk.lamarricane.sandbox.task_3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String_7Test {
    @Test
    public void testGetIndexStr() {
        assertEquals(String_7.getIndexString("Wendy and Tisha","and"),6);
        assertEquals(String_7.getIndexString("Nora","ra"),2);
        assertEquals(String_7.getIndexString("Charlotte","te"),7);
        assertEquals(String_7.getIndexString("Fila","f"),-1);
    }
}