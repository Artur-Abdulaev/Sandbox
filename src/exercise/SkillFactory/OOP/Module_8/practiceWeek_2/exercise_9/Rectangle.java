package exercise.SkillFactory.OOP.Module_8.practiceWeek_2.exercise_9;

public class Rectangle extends Quadrangle implements Figure {
    Rectangle(int a, int b, String color) {
        super(a, b, color);
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return 2 * (a + b);
    }

    @Override
    double getLargeDiagonal() {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    @Override
    double getHeight() {
        return Math.min(a, b);
    }

    @Override
    String getColor() {
        return color;
    }
}
