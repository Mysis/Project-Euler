package euler;

public class Problem28 {

    public static void main(String[] args) {

        int sum = 1;
        int current = 1;
        for (int i = 1; i <= 999; i += 2) {
            for (int j = 0; j < 4; j++) {
                current += i + 1;
                sum += current;
            }
        }
        System.out.println(sum);
    }
}
