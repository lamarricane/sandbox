package ru.ssau.tk.lamarricane.sandbox.task_2;

public class Array_34 {
    static Double multiply(Double[] array) {
        double number = 5.;
        for (Double i : array) {
            if (i.isNaN() || i.isInfinite()) {
                continue;
            }
            number *= i;
        }
        return number;
    }
}