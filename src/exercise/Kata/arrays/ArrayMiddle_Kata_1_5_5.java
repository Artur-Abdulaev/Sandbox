package exercise.Kata.arrays;

import java.util.Arrays;

public class ArrayMiddle_Kata_1_5_5 {
    public static void main(String[] args) {
        int[] testArray_1 = {1, 5, 2, 17, 20, 25, 35, 45};
        int[] testArray_2 = {14, 16, 3, 45, 50};
        int[] testArray_3 = {};

        System.out.println(Arrays.toString(getArrayMiddle(testArray_1)));
        System.out.println(Arrays.toString(getArrayMiddle(testArray_2)));
        System.out.println(Arrays.toString(getArrayMiddle(testArray_3)));
    }

    public static int[] getArrayMiddle(int[] numbers) {

        if (numbers.length == 0)
            return numbers;

        int index = numbers.length % 2 == 0 ? 2 : 1;

//        if (index == 2) {
//            return new int[]{numbers[numbers.length / 2 - 1], numbers[numbers.length / 2]};
//        } else {
//            return new int[]{numbers[numbers.length / 2]};
//        }


        if (index == 2) {
            return Arrays.copyOfRange(numbers, numbers.length / 2 - 1, numbers.length / 2 + 1);
        } else {
            return Arrays.copyOfRange(numbers, numbers.length / 2, numbers.length / 2 + 1);
        }
    }

}
