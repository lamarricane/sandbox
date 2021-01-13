package ru.ssau.tk.lamarricane.sandbox.task_2;

public class Array_30 {
    static int[][] massive() {
        int[][] array = new int[3][];
        int k = 1;
        for (int i = 0; i < 3; i++) {
            array[i] = new int[3 - i];
            for (int j = 0; j < 3 - i; j++) {
                array[i][j] = k;
                k++;
            }
        }
        return array;
    }
}
