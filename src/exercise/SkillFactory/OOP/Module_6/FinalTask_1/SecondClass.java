package exercise.SkillFactory.OOP.Module_6.FinalTask_1;

public class SecondClass extends FirstClass {
    SecondClass(int a, int b, int c) {
        super(a);
        this.b = b;
        this.c = c;
    }
    @Override
    public int plus(int d) {
        return plus(d) + a;
    }
    public static void main(String args[]) {
        SecondClass second = new SecondClass(6, 4, 3);
        System.out.println(second.plus(10));
    }
}
