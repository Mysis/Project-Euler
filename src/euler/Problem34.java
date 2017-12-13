package euler;

import java.util.ArrayList;
import java.util.List;

public class Problem34 {

    public static void main(String[] args) {

        List<Integer> answers = new ArrayList<>();

        int maxDigits = 1;
        while (maxDigits * factorial(9) > Math.pow(10, maxDigits)) maxDigits++;

        for (int i = 3; i < Math.pow(10, maxDigits); i++) {
            int sumFactorial = 0;
            for (int digit : intToDigits(i)) {
                sumFactorial += factorial(digit);
            }
            if (sumFactorial == i) answers.add(i);
        }

        int sum = 0;
        for (int answer : answers) {
            sum += answer;
        }
        System.out.println(sum);
    }

    public static int factorial(int val) {
        int result = 1;
        for (int i = 2; i <= val; i++) {
            result *= i;
        }
        return result;
    }

    public static ArrayList<Integer> intToDigits(int value) {
        ArrayList<Integer> digits = new ArrayList<>();
        while (value > 0) {
            digits.add(value % 10);
            value /= 10;
        }
        return digits;
    }
}
