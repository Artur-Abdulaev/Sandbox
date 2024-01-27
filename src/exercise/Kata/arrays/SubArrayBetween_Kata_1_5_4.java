package exercise.Kata.arrays;

import java.util.Arrays;

public class SubArrayBetween_Kata_1_5_4 {
    public static void main(String[] args) {

        int[] arr = {1,3,5,6,9,11,24};
        getSubArrayBetween(arr, 4, 10);
    }

    public static void getSubArrayBetween (int[] numbers, int start, int end) {


        int count = 0;
        for (int number : numbers) {
            if (number >= start && number <= end) {
                count++;
            }
        }

        int[] result = new int[count];
        for (int i = 0, k = 0; i < numbers.length; i++) {
                if (numbers[i] >= start && numbers[i] <= end) {
                    result[k] = numbers[i];
                    k++;
                }
            }

        System.out.println(Arrays.toString(result));
        }



    }

