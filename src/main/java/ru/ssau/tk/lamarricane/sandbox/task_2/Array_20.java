package ru.ssau.tk.lamarricane.sandbox.task_2;

public class Array_20 {
    static boolean massive(int[] array) {
        int _1count = 0;
        int _2count = 0;
        for (int j : array) {
            if (j % array[0] == 0)
                _1count++;
        }
        for (int i : array) {
            if (i % array[array.length - 1] == 0)
                _2count++;
        }
        return _1count > _2count;
    }
}
