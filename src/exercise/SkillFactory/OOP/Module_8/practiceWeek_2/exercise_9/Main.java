package exercise.SkillFactory.OOP.Module_8.practiceWeek_2.exercise_9;

public class Main {
    public static void main(String[] args) {
        boolean check;
        Rhombuses rhombuses = new Rhombuses(1, 60, 120, "Pink");
        Rhombuses rhombuses1 = new Rhombuses(1, 90, 90, "Pink");
        Rhombuses rhombuses2 = new Rhombuses(2, 60, 120, "Pink");

        System.out.println(rhombuses1.getHeight());
        System.out.println(rhombuses1.area());
        System.out.println(rhombuses1.perimeter());
        System.out.println(rhombuses1.getLargeDiagonal());
    }
}
