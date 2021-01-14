package ru.ssau.tk.lamarricane.sandbox.task_4;

import ru.ssau.tk.lamarricane.sandbox.task_1.Person;

public class Exception_1 {
    public static String objPerson(Person obj) {
        if (obj.getFirstName() == null || obj.getLastName() == null) {
            throw new NullPointerException();
        }
        return obj.toString();
    }
}
