package ru.ssau.tk.lamarricane.sandbox.task_3;

public class String_4 {
    static boolean strings(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
