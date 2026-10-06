import java.util.ArrayList;

class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor>listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.listOfActors = new ArrayList<>();
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor + " уже участвует в этом спектакле.");
        } else {
            listOfActors.add(actor);
            System.out.println("Актёр " + actor + " добавлен в спектакль '" + title + "'");
        }
    }

    public void replaceActor(String surname, Actor newActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                Actor oldActor = listOfActors.get(i);
                listOfActors.set(i, newActor);
                System.out.println("Актёр " + oldActor + " заменён на " + newActor);
                return;
            }
        }
        System.out.print("Актёр с фамилией " + surname + " не найден.");
    }

    public void printActors() {
        System.out.print("Список актёров спектакля '" + title + "' :");
        for (Actor actor : listOfActors) {
            System.out.print(" - " + actor);
        }
    }

    public Director getDirector() {
        return director;
    }

    public String getTitle() {
        return title;
    }
}