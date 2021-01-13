package ru.ssau.tk.lamarricane.sandbox.task_2;

public class Array_30 {
    static int[][] massive(int size) {
        int[][] array = new int[size][];
        int k = 1;
        for (int i = 0; i < size; i++) {
            array[i] = new int[size - i];
            for (int j = 0; j < size - i; j++) {
                array[i][j] = k;
                k++;
            }
        }
        return array;
    }
}
