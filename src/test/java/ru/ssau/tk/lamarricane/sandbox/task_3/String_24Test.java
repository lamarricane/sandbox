package ru.ssau.tk.lamarricane.sandbox.task_3;

import org.testng.annotations.Test;

import java.nio.charset.StandardCharsets;

public class String_24Test {

    @Test
    public void testChangeCharsetStr() {
        String str = "Hello World";
        String_24.changeCharsetStr(str, StandardCharsets.UTF_8, StandardCharsets.UTF_16LE);
        String_24.changeCharsetStr(str, StandardCharsets.UTF_16LE, StandardCharsets.UTF_8);
    }
}
