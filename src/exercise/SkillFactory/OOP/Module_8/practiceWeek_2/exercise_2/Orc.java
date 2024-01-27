package exercise.SkillFactory.OOP.Module_8.practiceWeek_2.exercise_2;

public class Orc implements Playable {

    @Override
    public String move() {
        return "run";
    }

    @Override
    public String attack() {
        return "ax blow";
    }

    @Override
    public String defence() {
        return "block";
    }
}