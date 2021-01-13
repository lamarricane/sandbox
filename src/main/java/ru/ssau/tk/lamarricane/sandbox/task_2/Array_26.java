package ru.ssau.tk.lamarricane.sandbox.task_2;

public class Array_26 {
    static int[] massive(int[] array) {
        int[] _1array = new int[array.length / 2 + (array.length % 2 == 0 ? 0 : 1)];
        for (int i = 0; i < _1array.length; i++) {
            _1array[i] = array[2 * i] + (2 * i + 1 < array.length ? array[2 * i + 1] : 0);
        }
        return _1array;
    }
}