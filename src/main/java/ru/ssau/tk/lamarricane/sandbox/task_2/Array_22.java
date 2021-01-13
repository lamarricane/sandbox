package ru.ssau.tk.lamarricane.sandbox.task_2;

public class Array_22 {
    static int massive(int[] array, int number) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                j = i;
            }
        }
        return j;
    }
}