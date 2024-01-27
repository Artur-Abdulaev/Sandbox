package exercise.SkillFactory.OOP.Module_6.FinalTask_3;

public class Freighter extends Ship {

    int loadCapacity;


    Freighter(String name, int yearOfConstruction, int loadCapacity) {
        super(name, yearOfConstruction);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        String ending = null;

        if (loadCapacity == 1) {
            ending = "у";
        } else if (loadCapacity > 1 && loadCapacity < 5) {
            ending = "ы";
        } else if (loadCapacity > 4) {
            ending = "";
        }

        String output = super.toString().replace('.', ' ');

        output = output + String.format("и способно перевезти %d тонн%s 1 груза",
                loadCapacity, ending);

        return output;
    }
}
