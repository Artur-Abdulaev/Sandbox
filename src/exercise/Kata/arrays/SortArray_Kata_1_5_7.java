package exercise.Kata.arrays;

import java.util.Arrays;

public class SortArray_Kata_1_5_7 {
    public static void main(String[] args) {
        int[] testArray_1 = {1, 3, 7, 5};
        int[] testArray_2 = {8, 4, 2, 4};

        System.out.println(Arrays.toString(mergeAndSort(testArray_1, testArray_2)));

    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {

        if (firstArray.length < 1 && secondArray.length < 1)
            return new int[0];

        int[] sortedArray = new int[firstArray.length + secondArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            sortedArray[i] = firstArray[i];
        }

        for (int i = firstArray.length, k = 0; i < sortedArray.length; i++, k++) {
            sortedArray[i] = secondArray[k];
        }

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < sortedArray.length; i++) {
                if (sortedArray[i] > sortedArray[i - 1]) {
                    int num = sortedArray[i - 1];
                    sortedArray[i - 1] = sortedArray[i];
                    sortedArray[i] = num;
                    isSorted = false;
                }
            }
        }

        return sortedArray;


    }

}
