package exercise.SkillFactory.OOP.Module_6.FinalTask_3;

public class Main {

    public static void main(String[] args) {
        Ship ship = new PassengerShip("Ever Given", 2018, 2);
        Ship ship1 = new Freighter("Ever Given", 2018, 20);

        System.out.println(ship);
        System.out.println(ship1);
    }
}
