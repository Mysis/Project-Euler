package euler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem32 {

    public static void main(String[] args) {


        Set<Integer> answers = new HashSet<>();
        for (int i = 1; i <= 10000; i++) {
            for (int j = 1; j <= 1000; j++) {
                List<Integer> digits = new ArrayList<>();
                digits.addAll(Utils.intToDigits(i));
                digits.addAll(Utils.intToDigits(j));
                digits.addAll(Utils.intToDigits(i * j));
                if (digits.size() == 9 && !digits.contains(0)) {
                    Set<Integer> checkDupes = new HashSet<>(digits);
                    if (checkDupes.size() == 9) {
                        System.out.println(i + " * " + j + " = " + i*j);
                        answers.add(i * j);
                    }
                }
            }
        }

        int sum = 0;
        for (int val : answers) {
            sum += val;
        }
        System.out.println(sum);
    }
}
