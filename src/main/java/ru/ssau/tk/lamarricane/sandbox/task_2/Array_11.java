package ru.ssau.tk.lamarricane.sandbox.task_2;

public class Array_11 {
    public static double[] array(double count) {
        int size = (int) ((count / (Math.sqrt(count))) - 1);
        double[] massive = new double[size];
        int j = 0;
        for (int i = 1; i <= Math.sqrt(count); i++) {
            if (count % i == 0) {
                massive[j] = i;
                j++;
            }
        }
        return massive;
    }
}