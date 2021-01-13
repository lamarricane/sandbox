package ru.ssau.tk.lamarricane.sandbox.task_2;

public class Array_3 {
    public static int[] array(int size) {
        int[] massive = new int[size];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = 2 * i + 1;
        }
        return massive;
    }
}
