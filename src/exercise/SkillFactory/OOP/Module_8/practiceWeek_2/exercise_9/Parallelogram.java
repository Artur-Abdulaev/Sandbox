package exercise.SkillFactory.OOP.Module_8.practiceWeek_2.exercise_9;

public class Parallelogram extends Quadrangle implements Figure {
    double alpha;
    double beta;

    Parallelogram (int a, double alpha, int b, double beta, String color) {
        super(a, b, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    public double area() {
        return a * b * Math.sin(Math.toRadians(Math.min(alpha, beta)));
    }

    @Override
    public double perimeter() {
        return 2 * (a + b);
    }

    @Override
    double getLargeDiagonal() {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) + 2 * a * b * Math.cos(Math.toRadians(Math.min(alpha, beta))));
    }

    @Override
    double getHeight() {
        return Math.min(a, b) * Math.sin(Math.toRadians(Math.min(alpha, beta)));
    }

    @Override
    String getColor() {
        return color;
    }
}
