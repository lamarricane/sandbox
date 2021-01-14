package ru.ssau.tk.lamarricane.sandbox.task_1;

import com.sun.org.apache.xerces.internal.xs.StringList;

public class Person {
    private String firstName;
    private String lastName;
    private int passportId;
    Gender gender;

    Person() {
        firstName = "Имя";
        lastName = "Фамилия";
        passportId = 0;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    Person(String firstName, String lastName, int passportId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Person(int passportId) {
        this.passportId = passportId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPassportId() {
        return passportId;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    @Override
    public String toString() {
        return firstName + (firstName.isEmpty() || lastName.isEmpty() ? "" : " ") + lastName;
    }

    public static void main(String[] args) {
        Person firstPerson = new Person();
        Person secondPerson = new Person("Coralina", "Jons");
        Person thirdPerson = new Person("Coralina", "Jons", 463646);
        Person fourthPerson = new Person(132398);
        System.out.println(firstPerson.getPassportId());
        System.out.println(secondPerson.getFirstName());
        System.out.println(thirdPerson.getPassportId());
        System.out.println(fourthPerson.getLastName());
    }
}
