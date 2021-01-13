package ru.ssau.tk.lamarricane.sandbox.task_3;

public class String_10 {
    static int strings(String[] array, String prefix, String postfix) {
        int count = 0;
        for (String str : array) {
            if (str.startsWith(prefix) && str.endsWith(postfix)) {
                count++;
            }
        }
        return count;
    }
}