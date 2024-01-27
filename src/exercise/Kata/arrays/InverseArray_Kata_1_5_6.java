package exercise.Kata.arrays;

import java.util.Arrays;

public class InverseArray_Kata_1_5_6 {
    public static void main(String[] args) {

        int[] arr = {1, 4, 6, 7, 9};

        System.out.println(Arrays.toString(inverseArray(arr)));
    }

    public static int[] inverseArray(int[] numbers) {
        if (numbers == null || numbers.length < 1) {
            return new int[0];
        }

        int[] inverseArray = new int[numbers.length];

        for (int i = 0, k = inverseArray.length - 1; i < numbers.length; i++, k--) {
            inverseArray[k] = numbers[i];
        }

        return inverseArray;
    }


}
