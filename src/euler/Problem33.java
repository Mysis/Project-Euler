package euler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem33 {

    public static void main(String[] args) {

        List<int[]> answers = new ArrayList<>();
        for (int i = 10; i < 100; i++) {
            for (int j = 10; j < 100; j++) {
                if (i % 10 != 0 && j % 10 != 0 && i < j) {
                    List<Integer> iDigits = Utils.intToDigits(i);
                    List<Integer> jDigits = Utils.intToDigits(j);
                    boolean doesShareDigit = false;
                    int sharedDigit = 0;
                    for (int iDigit : iDigits) {
                        for (int jDigit : jDigits) {
                            if (iDigit == jDigit) {
                                doesShareDigit = true;
                                sharedDigit = iDigit;
                            }
                        }
                    }
                    if (doesShareDigit) {
                        int[] incorrectSimplification = new int[]{iDigits.get(0) == sharedDigit ? iDigits.get(1) : iDigits.get(0), jDigits.get(0) == sharedDigit ? jDigits.get(1) : jDigits.get(0)};
                        incorrectSimplification = Utils.toFraction(incorrectSimplification[0], incorrectSimplification[1]);
                        int[] correctSimplification = Utils.toFraction(i, j);
                        if (incorrectSimplification[0] == correctSimplification[0] && incorrectSimplification[1] == correctSimplification[1]) answers.add(new int[]{i, j});
                    }
                }
            }
        }

        int numerator = 1;
        int denominator = 1;
        for (int[] frac : answers) {
            numerator *= frac[0];
            denominator *= frac[1];
            System.out.println(frac[0] + "/" + frac[1]);
        }
        int[] simplified = Utils.toFraction(numerator, denominator);
        System.out.println(simplified[0] + "/" + simplified[1]);
        System.out.println(simplified[1]);
    }
}
