package euler;

public class Problem41 {

    public static void main(String[] args) {

        int answer = 0;
        int nextLargest = 7654321; //9 and 8 digit pandigitals are always divisible by 3
        while (answer == 0) {
            if (Utils.isPandigital(String.valueOf(nextLargest))) {
                if (Utils.isPrime(nextLargest)) {
                    answer = nextLargest;
                }
            }
            nextLargest--;
        }
        System.out.println(answer);
    }
}
