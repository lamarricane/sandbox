package ru.ssau.tk.lamarricane.sandbox.task_2;

public class Array_4 {
    public static int[] array(int size) {
        int fullSize = 2 * size;
        int[] massive = new int[fullSize];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = fullSize;
            fullSize -= 2;
        }
        return massive;
    }
}
