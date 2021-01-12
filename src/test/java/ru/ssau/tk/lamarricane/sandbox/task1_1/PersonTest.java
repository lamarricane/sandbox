package ru.ssau.tk.lamarricane.sandbox.task1_1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    @Test
    public void testGetSet() {

        Person FirstPerson = new Person();
        Person SecondPerson = new Person();
        Person ThirdPerson = new Person();

        FirstPerson.setFirstName("Uzumaki");
        FirstPerson.setLastName("Naruto");
        FirstPerson.setPassportId(17);

        SecondPerson.setFirstName("Uchiha");
        SecondPerson.setLastName("Sasuke");
        SecondPerson.setPassportId(18);

        ThirdPerson.setFirstName("Haruno");
        ThirdPerson.setLastName("Sakura");
        ThirdPerson.setPassportId(19);

        assertEquals(FirstPerson.getFirstName(), "Uzumaki");
        assertEquals(FirstPerson.getLastName(), "Naruto");
        assertEquals(FirstPerson.getPassportId(), 17);

        assertEquals(SecondPerson.getFirstName(), "Uchiha");
        assertEquals(SecondPerson.getLastName(), "Sasuke");
        assertEquals(SecondPerson.getPassportId(), 18);

        assertEquals(ThirdPerson.getFirstName(), "Haruno");
        assertEquals(ThirdPerson.getLastName(), "Sakura");
        assertEquals(ThirdPerson.getPassportId(), 19);
    }
}