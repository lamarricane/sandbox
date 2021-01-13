package ru.ssau.tk.lamarricane.sandbox.task_2;

public class Array_19 {
    static int massive(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }
}
