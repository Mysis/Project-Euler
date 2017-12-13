package euler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem36 {

    public static void main(String[] args) {

        List<Integer> answers = new ArrayList<>();
        for (int i = 1; i < 1000000; i++) {
            List<Integer> baseTenReverseDigits = Utils.intToDigits(i);
            Collections.reverse(baseTenReverseDigits);
            int baseTenReverse = Utils.digitsToInt(baseTenReverseDigits);
            if (i == baseTenReverse && Integer.toBinaryString(i).equals(new StringBuilder(Integer.toBinaryString(i)).reverse().toString())) answers.add(i);
        }
        int sum = 0;
        for (int answer : answers) {
            sum += answer;
        }
        System.out.println(answers);
        System.out.println(sum);
    }
}
