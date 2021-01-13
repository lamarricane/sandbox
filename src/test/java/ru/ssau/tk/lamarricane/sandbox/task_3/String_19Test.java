package ru.ssau.tk.lamarricane.sandbox.task_3;

import org.testng.annotations.Test;

public class String_19Test {

    @Test
    public void testSet() {
        String str = "Эй, МакФлай! Я говорил тебе не появляться здесь!";
        String[] arrayStr = String_19.parseStringOnArray(str);
        for (String string : arrayStr) {
            System.out.println(string);
        }
    }
}
