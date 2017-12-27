package euler;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem43 {

    public static void main(String[] args) {

        long sum = 0;
        for (ArrayList<Integer> pandigital : Utils.generatePermutations(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9))) {
                if (Utils.digitsToInt(Arrays.asList(pandigital.get(1), pandigital.get(2), pandigital.get(3))) % 2 == 0 &&
                        Utils.digitsToInt(Arrays.asList(pandigital.get(2), pandigital.get(3), pandigital.get(4))) % 3 == 0 &&
                        Utils.digitsToInt(Arrays.asList(pandigital.get(3), pandigital.get(4), pandigital.get(5))) % 5 == 0 &&
                        Utils.digitsToInt(Arrays.asList(pandigital.get(4), pandigital.get(5), pandigital.get(6))) % 7 == 0 &&
                        Utils.digitsToInt(Arrays.asList(pandigital.get(5), pandigital.get(6), pandigital.get(7))) % 11 == 0 &&
                        Utils.digitsToInt(Arrays.asList(pandigital.get(6), pandigital.get(7), pandigital.get(8))) % 13 == 0 &&
                        Utils.digitsToInt(Arrays.asList(pandigital.get(7), pandigital.get(8), pandigital.get(9))) % 17 == 0) {
                    sum += Utils.digitsToLong(pandigital);
            }
        }
        System.out.println(sum);
    }
}
