package ru.ssau.tk.lamarricane.sandbox.task_3;

import java.nio.charset.Charset;

public class String_24 {
    public static void changeCharsetStr(String str, Charset CharSet1, Charset charSet2) {
        String str2 = new String(str.getBytes(CharSet1), charSet2);
        System.out.println(str2);
    }
}
