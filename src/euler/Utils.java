package euler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utils {

    public static int gcm(int a, int b) {
        return b == 0 ? a : gcm(b, a % b);
    }

    public static int digitsToInt(List<Integer> digits) {
        List<Integer> toReverse = new ArrayList<>(digits);
        Collections.reverse(toReverse);
        int place = 0, value = 0;
        for (int digit : toReverse) {
            value += digit * Math.pow(10, place);
            place++;
        }
        return value;
    }

    public static ArrayList<Integer> intToDigits(int value) {
        ArrayList<Integer> digits = new ArrayList<>();
        while (value > 0) {
            digits.add(value % 10);
            value /= 10;
        }
        return digits;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        int max = (int)Math.sqrt(num);
        for (int i = 2; i <= max; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] toFraction(int a, int b) {
        int gcm = gcm(a, b);
        return new int[]{a / gcm, b / gcm};
    }
}
