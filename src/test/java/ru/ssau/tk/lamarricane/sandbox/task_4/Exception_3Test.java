package ru.ssau.tk.lamarricane.sandbox.task_4;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Exception_3Test {

    @Test
    public void testGetCharString() {
        String[] arrayStr = new String[]{"I", "want", "to", "sleep"};
        assertEquals(Exception_3.getCharString(arrayStr, 0, 0),
                'I');
        Assert.assertThrows(StringIndexOutOfBoundsException.class,
                () -> Exception_3.getCharString(arrayStr, 20, 0));
        Assert.assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> Exception_3.getCharString(arrayStr, 0, 20));
    }
}
