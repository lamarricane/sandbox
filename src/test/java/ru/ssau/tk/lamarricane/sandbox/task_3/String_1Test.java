package ru.ssau.tk.lamarricane.sandbox.task_3;

import org.testng.annotations.Test;

public class String_1Test {

    @Test
    public void testString() {
        String str = new String("Like it or not, but the ass is behind");
        new String_1().strings(str);
    }
}
