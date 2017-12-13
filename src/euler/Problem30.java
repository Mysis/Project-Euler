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
            ArrayList<Integer> digits = Utils.intToDigits(i);
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
}
