import java.util.ArrayList;

public class Snow {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;

    Snow(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }
}
