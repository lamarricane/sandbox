package ru.ssau.tk.lamarricane.sandbox.task_1;

public class IntGeneratorImpl implements IntGenerator {
    public int count = 0;

    @Override
    public int nextInt() {
        return count++;
    }
}
