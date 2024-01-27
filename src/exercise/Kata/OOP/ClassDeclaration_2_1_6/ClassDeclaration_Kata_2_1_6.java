package exercise.Kata.OOP.ClassDeclaration_2_1_6;

public class ClassDeclaration_Kata_2_1_6 {
    public static void main(String[] args) {
        new Dog().catchCat(new Cat());

    }


    public static class Cat {
        public void sayHello(){
            System.out.println("Meow");
        }


    }

    public static class Dog{
        public void sayHello() {
            System.out.println("Woof");
        }

        public void catchCat(Cat cat) {
            System.out.println("Cat is caught");
            this.sayHello();
            cat.sayHello();
        }


}


}
