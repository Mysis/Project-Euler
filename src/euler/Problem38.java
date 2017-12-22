package euler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem38 {

    public static void main (String[] args) {

        List<Integer> answers = new ArrayList<>();

        for (int i = 1; i < 100000; i++) {
            String pandigital = "";
            int multiply = 1;
            while (pandigital.length() < 9) {
                pandigital = pandigital.concat(String.valueOf(i * multiply));
                multiply++;
            }
            if (Utils.isPandigital(pandigital, 9)) answers.add(Integer.parseInt(pandigital));
        }

        int largest = 0;
        for (int answer : answers) {
            if (answer > largest) {
                largest = answer;
            }
        }
        System.out.println(answers);
        System.out.println(largest);
    }
}
