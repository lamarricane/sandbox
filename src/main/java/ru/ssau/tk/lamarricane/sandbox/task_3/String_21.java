package ru.ssau.tk.lamarricane.sandbox.task_3;

public class String_21 {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder strBuild = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                strBuild.replace(i, i + 1, i + "");
            }
        }
        strBuild.reverse();
        System.out.println(strBuild.toString());
    }
}
