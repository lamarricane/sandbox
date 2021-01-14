package ru.ssau.tk.lamarricane.sandbox.task_4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Exception_5_1Test {

    @Test
    void test() {
        Exception_5_1 temp = new Exception_5_1();
        Assert.assertThrows(CloneNotSupportedException.class, temp::clone);
    }
}
