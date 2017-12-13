package euler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem35 {

    public static void main(String[] args) {

        List<Integer> answers = new ArrayList<>();
        for (int i = 2; i < 1000000; i++) {
            List<Integer> digits = Utils.intToDigits(i);
            boolean isAnswer = true;
            for (int j = 0; j < digits.size(); j++) {
                if (!Utils.isPrime(Utils.digitsToInt(digits))) {
                    isAnswer = false;
                    break;
                }
                Collections.rotate(digits, 1);
            }
            if (isAnswer) answers.add(i);
        }
        System.out.println(answers);
        System.out.println(answers.size());
    }
}
