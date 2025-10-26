package shows;

import persons.Actor;
import persons.Director;

import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void printDirectorInfo() {
        System.out.println("Режиссёр: " + director.toString());
    }

    public void printActorsInfo() {
        System.out.println("Список актеров " + this.title + ": ");
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public void addActor(Actor newActor) {
        if (listOfActors.contains(newActor)) {
            System.out.println("Этот актер уже в списке.");
        } else {
            listOfActors.add(newActor);
        }
    }

    public void replaceActor(String oldActorSurname, Actor newActor) {
        for (Actor actor : listOfActors) {
            if(actor.getSurname().equals(oldActorSurname)) {
                listOfActors.remove(actor);
                listOfActors.add(newActor);
                return;
            }
        }
        System.out.println("Актер по фамилии " + oldActorSurname + " не был найден.");
    }
}
