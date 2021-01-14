package ru.ssau.tk.lamarricane.sandbox.task_3;

public class String_22 {
    static String getStringOfNumber(int number) {
        StringBuilder strOfNumber = new StringBuilder();
        for (int i = 0; i < number; i++) {
            strOfNumber.append(i);
        }
        return strOfNumber.toString();
    }
}
