package ru.ssau.tk.lamarricane.sandbox.task_1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    Person FirstPerson = new Person();
    Person SecondPerson = new Person();
    Person ThirdPerson = new Person();

    @Test
    public void testFirstName() {
        FirstPerson.setFirstName("Uzumaki");
        SecondPerson.setFirstName("Uchiha");
        ThirdPerson.setFirstName("Haruno");    //c передачей null вместо имени и фамилии ничего не работает :(
        assertEquals(FirstPerson.getFirstName(), "Uzumaki");
        assertEquals(SecondPerson.getFirstName(), "Uchiha");
        assertEquals(ThirdPerson.getFirstName(), "Haruno");
        assertNotEquals(SecondPerson.getFirstName(), "Hatake");
    }

    @Test
    public void testLastName() {
        FirstPerson.setLastName("Naruto");
        SecondPerson.setLastName("Sasuke");
        ThirdPerson.setLastName("Sakura");
        assertEquals(FirstPerson.getLastName(), "Naruto");
        assertEquals(SecondPerson.getLastName(), "Sasuke");
        assertEquals(ThirdPerson.getLastName(), "Sakura");
        assertNotEquals(SecondPerson.getLastName(), "Kakashi");
    }

    @Test
    public void TestPassportId() {
        FirstPerson.setPassportId(17);
        SecondPerson.setPassportId(18);
        ThirdPerson.setPassportId(18);
        assertEquals(FirstPerson.getPassportId(), 17);
        assertEquals(SecondPerson.getPassportId(), 18);
        assertEquals(ThirdPerson.getPassportId(), 18);
        assertNotEquals(SecondPerson.getPassportId(), 30);
    }
}