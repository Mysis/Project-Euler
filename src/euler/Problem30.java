package euler;

import java.util.ArrayList;
import java.util.List;

public class Problem30 {

    public static void main(String[] args) {

        int maxDigits = 1;
        while (maxDigits * Math.pow(9, 5) > Math.pow(10, maxDigits)) {
            maxDigits++;
        }

        int totalSum = 0;

        for (int i = 2; i < Math.pow(10, maxDigits); i++) {
            ArrayList<Integer> digits = toDigits(i);
            int sum = 0;
            for (int digit : digits) {
                sum += Math.pow(digit, 5);
            }
            if (i == sum) {
                totalSum += i;
            }
        }

        System.out.println(totalSum);
    }

    public static ArrayList<Integer> toDigits(int num) {
        ArrayList<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add(num % 10);
            num /= 10;
        }
        return digits;
    }
}
