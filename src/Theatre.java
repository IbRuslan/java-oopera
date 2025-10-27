import persons.Actor;
import persons.Director;
import persons.Person;
import shows.Ballet;
import shows.Opera;
import shows.Show;
import utils.Gender;

public class Theatre {

    public static void main(String[] args) {
        Actor actorAnna = new Actor("Анна", "Леоньтева", Gender.FEMALE, 170);
        Actor actorRuslan = new Actor("Руслан", "Ибрагимов", Gender.MALE, 190);
        Actor actorSergey = new Actor("Сергей", "Ефремов", Gender.MALE, 180);

        Director directorIvan = new Director("Иван", "Зубарев", Gender.MALE, 2);
        Director directorAlina = new Director("Алина", "Икрамова", Gender.FEMALE, 1);

        Person choreographerSergey = new Person("Сергей", "Иванов", Gender.MALE);
        Person musicAuthorPetr = new Person("Пётр", "Чайковский", Gender.MALE);

        Show snow = new Show("Гроза", 100, directorIvan);
        snow.addActor(actorRuslan);
        snow.addActor(actorSergey);

        Opera opera = new Opera("Евгений Онегин", 150, directorIvan,
                musicAuthorPetr, "История любви и судьбы", 25);
        opera.addActor(actorAnna);
        opera.addActor(actorRuslan);

        Ballet ballet = new Ballet("Лебединое озеро", 120, directorAlina,
                musicAuthorPetr, "Трагедия любви в волшебном мире", choreographerSergey);
        ballet.addActor(actorSergey);
        ballet.addActor(actorAnna);

        snow.printActorsInfo();
        opera.printActorsInfo();
        ballet.printActorsInfo();

        snow.replaceActor("Ефремов",  actorAnna);
        snow.printActorsInfo();

        ballet.replaceActor("Ибрагимов", actorRuslan);
        ballet.printActorsInfo();

        opera.printLibrettoText();
        ballet.printLibrettoText();
    }
}
