package ru.ssau.tk.lamarricane.sandbox.task_3;

import java.util.Objects;

public class String_5 {
    static boolean differentStrings(String _1str, String _2str) {
        return !Objects.equals(null, _1str) && !Objects.equals(null, _2str)
                && !_1str.equals(_2str)
                && _1str.equalsIgnoreCase(_2str);
    }
}
