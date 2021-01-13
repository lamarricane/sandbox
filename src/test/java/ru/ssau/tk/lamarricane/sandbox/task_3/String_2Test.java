package ru.ssau.tk.lamarricane.sandbox.task_3;

import org.testng.annotations.Test;

public class String_2Test {

    @Test
    public void testString() {
        String temp = "Hello World";
        new String_2().getString(temp);
        String _2temp = "Хеллоу ворлд";
        new String_2().getString(_2temp);
    }
}
