package exercise.SkillFactory.OOP.Module_8.practiceWeek_2.exercise_9;

public abstract class Quadrangle {

    int a, b;

    String color;

    Quadrangle (int a, int b, String color) {
        this.a = a;
        this.b = b;
        this.color = color;
    }

     abstract double getLargeDiagonal();

     abstract double getHeight();

     abstract String getColor();

}
