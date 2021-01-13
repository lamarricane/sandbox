package ru.ssau.tk.lamarricane.sandbox.task_2;

public class Array_7 {
    public static double[] array(double a, double b, double c) throws Exception {
        if (a == 0) {
            if (b == 0) {
                if (c != 0) {
                    throw new Exception("Решения нет");
                } else {
                    throw new Exception("Комплексное число");
                }
            } else {
                return new double[]{-c / b};// bx+c = 0
            }
        } else {
            double d = b * b - 4 * a * c;
            if (d > 0) {
                return new double[]{(-b + Math.sqrt(d)) / (2 * a), (-b - Math.sqrt(d)) / (2 * a)};
            } else if (d == 0) {
                return new double[]{-b / (2 * a)};
            } else {
                throw new NullPointerException("Не является вещественным числом");
            }
        }
    }
}