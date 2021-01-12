package ru.ssau.tk.lamarricane.sandbox.task_2;

public class Array_4 {
    public static int[] array(int size) {
        int fullSize = 2 * size;
        int[] massiv = new int[fullSize];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = fullSize;
            fullSize -= 2;
        }
        return massiv;
    }
}
