package shows;

import persons.Director;

public class Ballet extends MusicalShow {
    String choreographer;

    Ballet(String choreographer, String title, int duration, Director director, String musicAuthor, String librettoText){
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
