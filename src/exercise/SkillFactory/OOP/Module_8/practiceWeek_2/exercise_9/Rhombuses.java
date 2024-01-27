package exercise.SkillFactory.OOP.Module_8.practiceWeek_2.exercise_9;

public class Rhombuses extends Quadrangle implements Figure {

    double alpha;
    double beta;

    Rhombuses(int a, double alpha, double beta, String color) {
        super(a, a, color);
        this.alpha = alpha;
        this.beta = beta;
    }


    @Override
    public double area() {
        return a * getHeight();
    }

    @Override
    public double perimeter() {
        return a * 4;
    }

    @Override
    double getLargeDiagonal() {
        return a * Math.sqrt(2 + 2 * Math.cos(Math.toRadians(alpha)));
    }


    @Override
    double getHeight() {
        return a * Math.sin(Math.toRadians(alpha));
    }

    @Override
    String getColor() {
        return color;
    }
}
