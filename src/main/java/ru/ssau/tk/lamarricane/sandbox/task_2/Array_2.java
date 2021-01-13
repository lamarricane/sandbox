package ru.ssau.tk.lamarricane.sandbox.task_2;

public class Array_2 {
    public static int[] array(int size) {
        int[] massive = new int[size];
        massive[0] = 2;
        massive[size - 1] = 2;
        for (int i = 1; i < massive.length - 1; i++) {
            massive[i] = 1;
        }
        return massive;
    }
}
