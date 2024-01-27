package exercise.Kata.loops;

import java.math.BigInteger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Factorial {
    public static void main(String[] args) {

        System.out.println(factorialInRecursion(0));
        System.out.println(factorial(0));


    }

    public static BigInteger factorial(int value) {

        BigInteger number = BigInteger.ONE;

        for (int i = 1; i <= value; i++) {
            number = number.multiply(BigInteger.valueOf(i));
        }

        return number;
    }

    public static BigInteger factorialInRecursion(int value) {

        if (value <= 1) {
            return BigInteger.valueOf(1);
        } else {
            return BigInteger.valueOf(value).multiply(factorialInRecursion(--value));
        }

    }
}
