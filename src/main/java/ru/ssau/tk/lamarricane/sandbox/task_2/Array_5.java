package ru.ssau.tk.lamarricane.sandbox.task_2;

public class Array_5 {
    public static int[] array(int size) {
        int[] massiv = new int[size];
        massiv[0] = 0;
        massiv[1] = 1;
        for (int i = 2; i < massiv.length; i++) {
            massiv[i] = massiv[i - 1] + massiv[i - 2];
        }
        return massiv;
    }
}
