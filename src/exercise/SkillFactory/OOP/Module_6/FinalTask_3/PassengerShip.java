package exercise.SkillFactory.OOP.Module_6.FinalTask_3;

public class PassengerShip extends Ship {

    int passengersCapacity;

    PassengerShip(String name, int yearOfConstruction, int passengersCapacity) {
        super(name, yearOfConstruction);
        this.passengersCapacity = passengersCapacity;
    }

    @Override
    public String toString() {
        String ending = null;

        if (passengersCapacity == 1) {
            ending = ".";
        } else if (passengersCapacity > 1 && passengersCapacity < 5) {
            ending = "а.";
        } else if (passengersCapacity > 4) {
            ending = "ов.";
        }

        String output = super.toString().replace('.', ' ');

        output = output + String.format("и способно принять на борт %d пассажир%s",
                passengersCapacity, ending);

        return output;
    }
}
