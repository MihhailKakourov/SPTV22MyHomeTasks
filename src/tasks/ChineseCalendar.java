package tasks;

public class ChineseCalendar {
    public void showCalendar() {
        String[] colors = {
                "зелён(ой/ого)",
                "красн(ой/ого)",
                "желт(ой/того)",
                "бел(ой/лого)",
                "чёрн(ой/ного)"
        };
        String[] animals = {
                "крысы",
                "коровы",
                "тигра",
                "зайца",
                "дракона",
                "змеи",
                "лошади",
                "овцы",
                "обезьяны",
                "курицы",
                "собаки",
                "свиньи"
        };

        for (int year = 1984; year < 1984 + 60; year++) {
            int cycleYear = year - 1984;
            int colorIndex = cycleYear / 12;
            int animalIndex = cycleYear % 12;

            String yearName = "год " + colors[colorIndex] + " " + animals[animalIndex];
            System.out.println(year + " год - " + yearName);
        }
    }
}