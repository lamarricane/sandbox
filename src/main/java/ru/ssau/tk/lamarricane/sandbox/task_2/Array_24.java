package ru.ssau.tk.lamarricane.sandbox.task_2;

public class Array_24 {
    static void getNotMassive(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ~array[i];
        }
    }
}
