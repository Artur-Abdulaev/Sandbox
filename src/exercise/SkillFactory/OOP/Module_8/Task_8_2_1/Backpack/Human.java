package exercise.SkillFactory.OOP.Module_8.Task_8_2_1.Backpack;

public class Human extends Entity implements Fighter{

    public Human(String name) {
        super(name + " the Man");
    }

    @Override
    public void attack(Entity m){
        m.damage(1);
    }

}