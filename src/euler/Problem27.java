package euler;

public class Problem27 {

    public static void main(String[] args) {

        int[] longest = new int[3];
        longest[0] = 0;
        longest[1] = 0;
        longest[2] = 0;

        boolean next = false;
        for (int a = -999; Math.abs(a) < 1000; a++) {
            for (int b = 0; Math.abs(b) <= 1000; b++) {
                if (Utils.isPrime(b)) {
                    int n = 0;
                    while (Utils.isPrime((int)(Math.pow(n, 2) + (a * n) + b))) {
                        n++;
                    }
                    if (n > longest[0]) {
                        longest[0] = n;
                        longest[1] = a;
                        longest[2] = b;
                    }
                }
            }
        }

        System.out.println(longest[0] + ", " + longest[1] + ", " + longest[2]);
        System.out.println(longest[1] * longest[2]);
    }
}
