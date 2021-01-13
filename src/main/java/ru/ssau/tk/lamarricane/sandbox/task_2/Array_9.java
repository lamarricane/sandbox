package ru.ssau.tk.lamarricane.sandbox.task_2;

public class Array_9 {
    public static int[] massive(int firstNumber, int delta, int size) {
        int[] array = new int[size];
        array[0] = firstNumber;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + delta;
        }
        return array;
    }
}
