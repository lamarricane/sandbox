package ru.ssau.tk.lamarricane.sandbox.task_3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String_5Test {

    @Test
    public void testDifferentStrings() {
        String _1str = "HELLO WORLD";
        String _2str = "hello world";
        String _3str = "YES";
        assertTrue(String_5.differentStrings(_1str, _2str));
        assertFalse(String_5.differentStrings(_2str, _2str));
        assertFalse(String_5.differentStrings(_2str, _3str));
        assertFalse(String_5.differentStrings(null, _2str));
        assertFalse(String_5.differentStrings(_1str, null));
        assertFalse(String_5.differentStrings(null, null));
    }
}
