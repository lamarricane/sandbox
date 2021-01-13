package ru.ssau.tk.lamarricane.sandbox.task_2;

public class Array_17 {
    static int massive(int[] array) {
        int count = 0;
        for (int i : array) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
