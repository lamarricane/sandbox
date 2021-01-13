package ru.ssau.tk.lamarricane.sandbox.task_2;

import java.util.Arrays;

public class Array_32 {
    static void sort(Double[] array) {
        for (Double j : array) {
            if (j.isNaN()) {
                return;
            } else {
                Arrays.sort(array);
            }
        }
    }
}
