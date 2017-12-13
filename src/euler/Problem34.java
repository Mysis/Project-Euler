package euler;

import java.util.ArrayList;
import java.util.List;

public class Problem34 {

    public static void main(String[] args) {

        List<Integer> answers = new ArrayList<>();

        int maxDigits = 1;
        while (maxDigits * Utils.factorial(9) > Math.pow(10, maxDigits)) maxDigits++;

        for (int i = 3; i < Math.pow(10, maxDigits); i++) {
            int sumFactorial = 0;
            for (int digit : Utils.intToDigits(i)) {
                sumFactorial += Utils.factorial(digit);
            }
            if (sumFactorial == i) answers.add(i);
        }

        int sum = 0;
        for (int answer : answers) {
            sum += answer;
        }
        System.out.println(sum);
    }
}
