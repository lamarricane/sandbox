package ru.ssau.tk.lamarricane.sandbox.task_4;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SerializePerson {
    public static void serp(OutputStream out, Object object) throws IOException {
        ((ObjectOutputStream) out).writeObject(object);
    }
}
