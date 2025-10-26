package shows;

import persons.Actor;
import persons.Director;

import java.util.ArrayList;

public class MusicalShow extends Show {
    protected String musicAuthor;
    protected String librettoText;

    MusicalShow(String title, int duration, Director director,
                String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println("Либретто " + this.title + ": " + this.librettoText);
    }
}
