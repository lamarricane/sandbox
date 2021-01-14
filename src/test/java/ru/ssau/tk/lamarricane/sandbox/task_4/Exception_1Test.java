package ru.ssau.tk.lamarricane.sandbox.task_4;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ssau.tk.lamarricane.sandbox.task_1.Person;

import static org.testng.Assert.*;

public class Exception_1Test {

    @Test
    public void testGetObjectPerson() {
        Person p1 = new Person("Coralina", "Jons");
        assertEquals(Exception_1.objPerson(p1), "Coralina Jons");
        Person p2 = new Person(null, null);
        Assert.assertThrows(NullPointerException.class, () -> Exception_1.objPerson(p2));
    }
}