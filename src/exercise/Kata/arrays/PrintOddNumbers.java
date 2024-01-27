package exercise.Kata.arrays;

public class PrintOddNumbers {
    public static void main(String[] args) {
        int[] arr = {3, 5, 20, 8, 7, 3, 100};

        printOddNumbers(arr);
    }

    public static void printOddNumbers(int[] numbers) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int j : numbers) {
            if (j % 2 != 0) {
                stringBuilder.append(j).append(",");
            }
        }
        if (!stringBuilder.isEmpty()) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            System.out.println(stringBuilder);
        } else {
            System.out.println(stringBuilder);
        }
    }
}
