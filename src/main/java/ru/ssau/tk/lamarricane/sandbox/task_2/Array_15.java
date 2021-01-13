package ru.ssau.tk.lamarricane.sandbox.task_2;

public class Array_15 {
    static boolean array(int[] massive, int count) {
        for (int i : massive) {
            if (i == count) {
                return true;
            }
        }
        return false;
    }
}