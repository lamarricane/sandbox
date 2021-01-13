package ru.ssau.tk.lamarricane.sandbox.task_3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String_12Test {

    @Test
    public void testSet() {
        assertEquals(new String_12().set("apollo", "pol", "olo"), "aololo");
    }
}
