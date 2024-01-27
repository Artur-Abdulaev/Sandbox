package exercise.SkillFactory.OOP.Module_8.Task_8_2_1.Backpack;

public class Player extends Human {
    class Backpack {
        private String staff = "";

        void put(String thing) {
            staff = staff + thing + ",";

        }

        public String toString() {
            if (staff.equals("")) {
                return "the backpack is empty";
            }
            return staff.substring(0, staff.length() - 1) + " in the backpack";
        }

    }

    int playerValue = 0;

    Backpack backpack;

    public Player(String name) {
        super(name + " the Player");
        backpack = new Backpack();
    }

    public void take(String thing) {
        backpack.put(thing);

        class Baggage {
            void printBaggage() {
                System.out.println("Baggage class");
            }
        }
    }
}
