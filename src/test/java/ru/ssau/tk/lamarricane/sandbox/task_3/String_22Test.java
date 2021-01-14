package ru.ssau.tk.lamarricane.sandbox.task_3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String_22Test {

    @Test
    public void testGetStringOfNumber() {
        assertEquals(String_22.getStringOfNumber(3), "012");
        System.out.println(String_22.getStringOfNumber(10000));
    }
}