package exercise.SkillFactory.OOP.Module_6.FinalTask_2;

public class Knight extends Soldier {

    public Knight(String name) {
        super(name);
        this.price = 245;
        this.phrase = "Наше дело правое, а врага — найдем";
    }

    public void feed() {
        System.out.println("Рыцарь покормил коня");
    }

}
