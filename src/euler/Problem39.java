package euler;

import java.util.HashMap;
import java.util.Map;

public class Problem39 {

    public static void main(String[] args){

        Map<Integer, Integer> answers = new HashMap<>();
        for (int a = 1; a < 1000; a++) {
            for (int b = a; b < 1000; b++) {
                for (int c = b; c < 1000; c++) {
                    if (a*a + b*b == c*c && a+b+c <= 1000) {
                        answers.merge(a+b+c, 1, Integer::sum);
                    }
                }
            }
        }

        int key = 0;
        int largest = 0;
        for (int answer : answers.keySet()) {
            if (answers.get(answer) > largest) {
                key = answer;
                largest = answers.get(answer);
            }
        }
        System.out.println(answers);
        System.out.println(largest);
        System.out.println(key);
    }
}
