public class Opera extends MusicalShow {
    int choirSize;

    Opera(int choirSize, String title, int duration, Director director, String musicAuthor, String librettoText){
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
