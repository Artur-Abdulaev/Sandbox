package exercise.SkillFactory.OOP.Module_8.practiceWeek_2.exercise_4;

public class Car {
    String carModel;

    public Car (String carModel) {
        this.carModel = carModel;
    }

    class Engine {

        boolean isWorking;
        int horsePower;

        Engine (int horsePower) {
            this.horsePower = horsePower;
        }

        String startStopEngine() {
            if (isWorking) {
                isWorking = false;
                return  "engine was stopped";
            }

            isWorking = true;
            return  "engine was started";
        }
    }
}
