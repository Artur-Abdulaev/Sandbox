package exercise.SkillFactory.OOP.Module_6.Task_6_4_1;

public class SuperClass {


    public int a;
    public int b;

    SuperClass(int a) {
        this.a = 15;
        this.b = 33;
    }

    public int add(int v) {
        this.a += v;
        return a;
    }

}

class SubClass extends SuperClass {

    SubClass(int a, int b) {
        super(a);
        this.b = b;
    }

    int count = 0;
    @Override
    public int add(int v) {
        int num = super.add(v);
        return num + a;
    }

    public static void main(String[] args) {
        SubClass subClass = new SubClass(10,12);
        System.out.println(subClass.a);
        System.out.println(subClass.add(10));
    }
}

