package ru.ssau.tk.lamarricane.sandbox.task_4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Exception_4Test {

    @Test
    public void testGetString() {
        Exception_4.getString("4", "2"); // output: 2
        Assert.assertThrows(ArithmeticException.class,
                () -> Exception_4.getString("4", "0"));
        Assert.assertThrows(NumberFormatException.class,
                () -> Exception_4.getString("u", "1"));
        Assert.assertThrows(NumberFormatException.class,
                () -> Exception_4.getString("u", "a"));
    }
}
