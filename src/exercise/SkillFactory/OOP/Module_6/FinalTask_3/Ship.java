package exercise.SkillFactory.OOP.Module_6.FinalTask_3;

public class Ship {

    String name;
    int yearOfConstruction;

    Ship (String name, int yearOfConstruction) {
        this.name = name;
        this.yearOfConstruction = yearOfConstruction;
    }

    @Override
    public String toString() {
        String format = String.format("Судно \"%s\" построено в %d году.",
                name, yearOfConstruction);
        return format;
    }
}
