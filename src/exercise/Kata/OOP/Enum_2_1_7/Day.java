package exercise.Kata.OOP.Enum_2_1_7;


public enum Day {

    MONDAY("Понедельник"), TUESDAY("Вторник"), WEDNESDAY("Среда"), THURSDAY("Четверг"), FRIDAY("Пятница"), SATURDAY("Суббота"), SUNDAY("Воскресенье");

    private String name;

    Day(String translation) {
        this.name = translation;
    }

    public boolean isWeekend() {
        return Day.this.name.equals("Воскресенье") || Day.this.name.equals("Суббота") ;
    }

    public String getRusName() {
        return name;
    }

}

