package euler;

import java.util.HashSet;

public class Problem29 {

    public static void main(String[] args) {

        HashSet<Double> unique = new HashSet<>();
        for (int a = 2; a <= 100; a++) {
            for (int b = 2; b <= 100; b++) {
                unique.add(Math.pow(a, b));
            }
        }
        System.out.println(unique.size());
    }
}
