package ru.ssau.tk.lamarricane.sandbox.task_1;

public abstract class Operation {
    abstract double apply(double number);

    double applyTripple(double number) {
        return apply(apply(apply(number)));
    }
}
