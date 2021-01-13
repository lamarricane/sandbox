package ru.ssau.tk.lamarricane.sandbox.task_2;

public class Array_10 {
    static double[] getGeometricProgression(double firstElement, double step, int dim) {
        double[] array = new double[dim];
        array[0] = firstElement;
        for (int i = 1; i < dim; i++) {
            array[i] = array[i - 1] * step;
        }
        return array;
    }
}