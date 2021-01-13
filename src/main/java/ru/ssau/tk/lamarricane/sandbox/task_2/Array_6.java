package ru.ssau.tk.lamarricane.sandbox.task_2;

public class Array_6 {
    public static int[] array(int size) {
        int[] massiv = new int[size];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = i * i;
        }
        return massiv;
    }
}
