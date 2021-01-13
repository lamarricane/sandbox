package ru.ssau.tk.lamarricane.sandbox.task_2;

public class Array_16 {
    static boolean array(Integer[] massive) {
        for (int i : massive)
            if (massive[i] == null) {
                return true;
            }
        return false;
    }
}
