package persons;

import utils.Gender;

public class Person {
    protected String name;
    protected String surname;
    protected Gender gender;

    Person(String firstName, String lastName, Gender gender) {
        this.name = firstName;
        this.surname = lastName;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
}
