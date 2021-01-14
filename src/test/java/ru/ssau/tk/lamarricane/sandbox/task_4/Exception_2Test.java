package ru.ssau.tk.lamarricane.sandbox.task_4;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Exception_2Test {

    @Test
    public void testSet() {
        String[] str = {"I", "love", "Java"};
        assertEquals(Exception_2.getSymbol(str, 0), new String[]{"I", "l", "J"});
        Assert.assertThrows(StringIndexOutOfBoundsException.class,
                () -> Exception_2.getSymbol(str, 1));

        Assert.assertThrows(NullPointerException.class,
                () -> Exception_2.getSymbol(null, 0));
        String[] str1 = {null, "null"};
        Assert.assertThrows(NullPointerException.class,
                () -> Exception_2.getSymbol(str1, 0));
    }
}


