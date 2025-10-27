package shows;

import persons.Director;
import persons.Person;


public class MusicalShow extends Show {
    protected Person musicAuthor;
    protected String librettoText;

    MusicalShow(String title, int duration, Director director,
                Person musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println("Либретто " + this.title + ": " + this.librettoText);
    }

    public Person getMusicAuthor() {
        return this.musicAuthor;
    }
}
