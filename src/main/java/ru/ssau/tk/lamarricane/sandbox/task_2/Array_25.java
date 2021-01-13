package ru.ssau.tk.lamarricane.sandbox.task_2;

public class Array_25 {
    static int[] getNotMassive(int[] _1array) {
        int[] _2array = new int[_1array.length];
        System.arraycopy(_1array, 0, _2array, 0, _2array.length);
        for (int i = 0; i < _2array.length; i++) {
            _2array[i] = ~_2array[i];
        }
        return _2array;
    }
}