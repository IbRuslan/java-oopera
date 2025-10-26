package shows;

import persons.Actor;
import persons.Director;

import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;

    Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }
}
