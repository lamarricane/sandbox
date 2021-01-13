package ru.ssau.tk.lamarricane.sandbox.task_3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String_20Test {

    @Test
    public void testGetUnifiedStr() {
        String[] str = {"He", "has", "already", "turned", "into", "a", "man", "shoot!"};
        assertEquals(String_20.getUnifiedStr(str), "He, has, already, turned, into, a, man, shoot!");
    }
}