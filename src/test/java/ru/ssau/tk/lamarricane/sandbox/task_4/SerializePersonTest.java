package ru.ssau.tk.lamarricane.sandbox.task_4;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ssau.tk.lamarricane.sandbox.task_1.Person;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializePersonTest {

    @Test
    public void testSerializePerson() {
        Object object = new Object();
        Person person = new Person();
        String fileName = "";

        Assert.assertThrows(FileNotFoundException.class, () -> SerializePerson.serp(new ObjectOutputStream(new FileOutputStream(fileName)), object));
        Assert.assertThrows(ClassCastException.class, () -> SerializePerson.serp(new ByteArrayOutputStream(), person));
    }
}
