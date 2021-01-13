package ru.ssau.tk.lamarricane.sandbox.task_2;

public class Array_23 {
    static void massive(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int j : array) {
            min = Math.min(j, min);
            max = Math.max(j, max);
        }

        int indexMin = 0;
        int indexMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                indexMin = i;
            }
            if (array[i] == max) {
                indexMax = i;
            }
        }
        array[indexMin] = max;
        array[indexMax] = min;
    }
}
