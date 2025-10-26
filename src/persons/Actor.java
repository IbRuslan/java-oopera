package persons;

import utils.Gender;

public class Actor extends Person {
    int height;
    public Actor(String firstName, String lastName, Gender gender, int height) {
        super(firstName, lastName, gender);
        this.height = height;
    }
}
