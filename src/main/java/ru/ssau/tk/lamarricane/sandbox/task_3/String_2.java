package ru.ssau.tk.lamarricane.sandbox.task_3;

public class String_2 {
    public void getString(String str) {
        byte[] bytes = str.getBytes();
        for (byte byt : bytes) {
            System.out.println(byt);
        }
    }
}
