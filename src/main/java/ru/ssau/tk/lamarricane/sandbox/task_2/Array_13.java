package ru.ssau.tk.lamarricane.sandbox.task_2;

public class Array_13 {
    public static int[] array(int size) {
        if (size == 0) {
            return null;
        }
        int[] massive = new int[size];
        for (int i = 0; i < Math.ceil((double) size / 2); i++) {
            massive[i] = i + 1;
            massive[size - i - 1] = i + 1;
        }
        return massive;
    }
}
