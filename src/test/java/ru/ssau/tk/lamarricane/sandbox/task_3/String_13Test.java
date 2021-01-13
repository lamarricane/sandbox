package ru.ssau.tk.lamarricane.sandbox.task_3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String_13Test {

    @Test
    public void test() {
        String str = "life is dynamite";
        int maxSizeStr = str.length();
        assertEquals(String_13.getStringOfIndex(str, -2, maxSizeStr), str);
        assertEquals(String_13.getStringOfIndex(str, 2, maxSizeStr), str.substring(2));
        assertEquals(String_13.getStringOfIndex(str, -2, 14), str.substring(0, 14));
        assertEquals(String_13.getStringOfIndex(str, 2, 14), str.substring(2, 14));
    }
}
