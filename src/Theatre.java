public class Theatre {

    public static void main(String[] args) {

        Actor p1 = new Actor("Иван", "Петров", Gender.MALE, 180);
        Actor p2 = new Actor("Мария", "Сидорова", Gender.FEMALE, 165);
        Actor p3 = new Actor("Олег", "Иванов", Gender.MALE, 178);

        Director d1 = new Director("Андрей", "Андреев", Gender.MALE, 12);
        Director d2 = new Director("Елена", "Потапова", Gender.FEMALE, 8);

        Show drama = new Show("Чайка", 120, d1);
        Opera opera = new Opera("Аида", 180, d2, "Верди", "Текст либретто Верди Аида", 40);
        Ballet ballet = new Ballet("Лебидиное озеро", 150, d1, "Чайковский", "Текст либретто Чайковский Лебидиное озеро", "Татьяна");

        drama.addActor(p1);
        drama.addActor(p2);

        opera.addActor(p1);
        opera.addActor(p3);

        ballet.addActor(p1);
        ballet.addActor(p2);
        ballet.addActor(p3);

        System.out.println();
        drama.printActors();
        System.out.println();
        opera.printActors();
        System.out.println();
        ballet.printActors();

        System.out.println("\n--- Замена актёра ---");
        Actor p4 = new Actor("Сергей", "Новиков", Gender.MALE, 185);
        drama.replaceActor("Сидорова", p4);
        drama.printActors();

        System.out.println("\n --- Попытка заменить несуществующего ---");
        opera.replaceActor("Неизвестный", p1);

        System.out.println("\n --- Текст либретто оперы ---");
        opera.printLibretto();
        System.out.println("\n --- Текст либретто балета ---");
        ballet.printLibretto();
    }
}
