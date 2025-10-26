package persons;

import utils.Gender;

public class Person {
    String name;
    String surname;
    Gender gender;

    Person(String firstName, String lastName, Gender gender) {
        this.name = firstName;
        this.surname = lastName;
        this.gender = gender;
    }
}
