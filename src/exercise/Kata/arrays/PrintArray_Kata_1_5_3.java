package exercise.Kata.arrays;

public class PrintArray_Kata_1_5_3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 6, 7, 7};
        int[] emptyArr = {};
        printArray(arr);
        printArray(emptyArr);

    }

    public static void printArray(int[] numbers) {

        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < numbers.length; i++) {
            result.append(numbers[i]);

            if (i < numbers.length - 1)
                result.append(",");
        }

        result.append("]");
        System.out.println(result);
    }
}
