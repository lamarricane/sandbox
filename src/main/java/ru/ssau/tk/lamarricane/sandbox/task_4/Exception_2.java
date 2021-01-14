package ru.ssau.tk.lamarricane.sandbox.task_4;

public class Exception_2 {
    public static String[] getSymbol(String[] str, int n) {
        String[] newStr = new String[str.length];
        for (String s : str) {
            if (n > s.length()) {
                throw new StringIndexOutOfBoundsException();
            }
        }
        for (String s : str) {
            if (s == null) {
                throw new NullPointerException();
            }
        }
        for (int i = 0; i < str.length; i++) {
            newStr[i] = str[i].substring(n, n + 1);
        }
        return newStr;
    }
}
