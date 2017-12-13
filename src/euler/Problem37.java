package euler;

import java.util.ArrayList;
import java.util.List;

public class Problem37 {

    public static void main(String[] args) {

        List<Integer> answers = new ArrayList<>();
        for (int i = 10; answers.size() < 11; i++) {
            List<Integer> digits = Utils.intToDigits(i);
            boolean isTruncatable = true;
            while (digits.size() > 0) {
                if (!Utils.isPrime(Utils.digitsToInt(digits))) {
                    isTruncatable = false;
                    break;
                }
                digits.remove(digits.size() - 1);
            }
            if (isTruncatable) {
                digits = Utils.intToDigits(i);
                while (digits.size() > 0) {
                    if (!Utils.isPrime(Utils.digitsToInt(digits))) {
                        isTruncatable = false;
                        break;
                    }
                    digits.remove(0);
                }
                if (isTruncatable) {
                    answers.add(i);
                }
            }
        }

        int sum = 0;
        for (int answer : answers) {
            sum += answer;
        }
        System.out.println(answers);
        System.out.println(sum);
    }
}
