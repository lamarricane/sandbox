package ru.ssau.tk.lamarricane.sandbox.task_3;

import java.util.Arrays;

public class String_19 {
    static String[] parseStringOnArray(String str) {
        String[] arrayStr = str.split(" ");
        return Arrays.stream(arrayStr)
                .filter(s -> !s.isEmpty())
                .map(s -> s.replace(
                        String.valueOf(s.charAt(0)),
                        String.valueOf(s.charAt(0)).toUpperCase()
                ))
                .toArray(String[]::new);
    }
}