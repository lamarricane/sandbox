package ru.ssau.tk.lamarricane.sandbox.task_2;

public class Array_18 {
    static Integer massive(int[] array) {
        if (array.length == 0) {
            return null;
        }
        int temp = 0;
        for (int i : array) {
            if (array[i + 1] > array[i]) {
                temp = array[i + 1];
            }
        }
        return temp;
    }
}
