package euler;

import java.util.*;

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

    public static long digitsToLong(List<Integer> digits) {
        List<Integer> toReverse = new ArrayList<>(digits);
        Collections.reverse(toReverse);
        int place = 0;
        long value = 0;
        for (int digit : toReverse) {
            value += digit * Math.pow(10, place);
            place++;
        }
        return value;
    }

    public static int factorial(int val) {
        int result = 1;
        for (int i = 2; i <= val; i++) {
            result *= i;
        }
        return result;
    }

    public static ArrayList<ArrayList<Integer>> generatePermutations(List<Integer> numbers) {
        ArrayList<ArrayList<Integer>> permutations = new ArrayList<>();
        if (numbers.size() > 1) {
            for (int number : numbers) {
                ArrayList<Integer> unusedNumbers = new ArrayList<>(numbers);
                unusedNumbers.remove(Integer.valueOf(number));
                for (ArrayList<Integer> permutation : generatePermutations(unusedNumbers)) {
                    ArrayList<Integer> newPermutation = new ArrayList<>();
                    newPermutation.add(number);
                    newPermutation.addAll(permutation);
                    permutations.add(newPermutation);
                }
            }
        } else {
            permutations.add(new ArrayList<>(numbers));
        }
        return permutations;
    }

    public static ArrayList<Integer> intToDigits(int value) {
        ArrayList<Integer> digits = new ArrayList<>();
        while (value > 0) {
            digits.add(value % 10);
            value /= 10;
        }
        Collections.reverse(digits);
        return digits;
    }

    public static boolean isPandigital(String strPandigital) {
        List<Integer> digits = intToDigits(Integer.parseInt(strPandigital));
        Set<Integer> digitsNoRepeat = new HashSet<>(digits);
        if (digits.size() != digitsNoRepeat.size()) return false;
        for (int i = 9; i > digits.size(); i--) {
            if (digits.contains(i)) return false;
        }
        if (digits.contains(0)) return false;
        return true;
    }

    public static boolean isPandigital(String strPandigital, int length) {
        if (length < 1 || length > 9) throw new IllegalArgumentException("Length must be an integer between 1 and 9.");
        if (strPandigital.length() != length) return false;
        return isPandigital(strPandigital);
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
