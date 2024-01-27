public class HelloWorld {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        print(numbers);
    }

    public static void print(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}