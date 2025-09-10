package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName  = lastName;
        this.age       = age;
    }


    public Person(String firstName, String lastName) {
        this(firstName, lastName, 0);
    }

    public String getFirstName() { return firstName; }
    public String getLastName()  { return lastName;  }


    public Integer getAge()      { return age; } // autoboxing

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}


