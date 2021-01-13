package ru.ssau.tk.lamarricane.sandbox.task_2;

public class Array_27 {
    static boolean[] massive(int[] array) {
        boolean[] _1array = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            _1array[i] = array[i] % 2 == 0;
        }
        return _1array;
    }
}