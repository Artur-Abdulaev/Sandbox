package exercise.SkillFactory.OOP.Module_8.practiceWeek_2.exercise_9;

public class Square extends Quadrangle implements Figure{
    Square(int a, String color) {
        super(a, a, color);
    }

    @Override
    public double area() {
        return Math.pow(a, 2);
    }

    @Override
    public double perimeter() {
        return a * 4;
    }

    @Override
    double getLargeDiagonal() {
        return a * Math.sqrt(2);
    }

    @Override
    double getHeight() {
        return a;
    }

    @Override
    String getColor() {
        return color;
    }
}
