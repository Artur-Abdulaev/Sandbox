package exercise.SkillFactory.OOP.Module_6.FinalTask_2;

public class Rifleman extends Soldier {
    public Rifleman(String name) {
        super(name);
        this.price = 205;
        this.phrase = "Мушкет и жену не дам никому";
    }

    @Override
    public void attack() {
        System.out.println(this.name + " атакует в рукопашную!");
    }
}
