package euler;

import java.util.Arrays;

public class Problem31 {

    public static void main(String[] args) {
        System.out.println(getPossibilities(200, new int[]{200, 100, 50, 20, 10, 5, 2, 1}));
    }

    public static int getPossibilities(int targetValue, int[] denominations) {
        int possibilities = 0;
        for (int i = 0; i < denominations.length; i++) {
            int denomination = denominations[i];
            if (denomination < targetValue) {
                possibilities += getPossibilities(targetValue - denomination, Arrays.copyOfRange(denominations, i, denominations.length));
            } else if (denomination == targetValue) {
                possibilities++;
            }
        }
        return possibilities;
    }
}
