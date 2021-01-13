package ru.ssau.tk.lamarricane.sandbox.task_2;

public class Array_8 {
    static double[] massiv(int size) {
        double[] array = new double[size];
        int j = 1;
        for (int i = 0; i < array.length; i++) {
            if (j % 3 == 0) {
                j++;
            }
            array[i] = j;
            j++;
        }
        return array;
    }
}
