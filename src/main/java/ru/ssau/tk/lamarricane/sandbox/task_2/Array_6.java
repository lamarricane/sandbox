package ru.ssau.tk.lamarricane.sandbox.task_2;

public class Array_6 {
    public static int[] array(int size) {
        int[] massive = new int[size];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = i * i;
        }
        return massive;
    }
}
