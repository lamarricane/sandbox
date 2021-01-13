package ru.ssau.tk.lamarricane.sandbox.task_3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String_4Test {

    @Test
    public void testString() {
        assertTrue(String_4.strings("andna"));
        assertFalse(String_4.strings("notIsPalindrome"));
        assertTrue(String_4.strings("i"));
    }
}