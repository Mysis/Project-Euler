package euler;

import java.math.BigInteger;

public class Problem45 {

    public static void main(String[] args) {

        BigInteger triangle = BigInteger.ZERO;
        BigInteger triangleIndex = BigInteger.valueOf(285);
        BigInteger pentagonal = BigInteger.ONE;
        BigInteger pentagonalIndex = BigInteger.valueOf(165);
        BigInteger hexagonal = BigInteger.TWO;
        BigInteger hexagonalIndex = BigInteger.valueOf(143);

        while (!triangle.equals(pentagonal) || !triangle.equals(hexagonal)) {
            triangleIndex = triangleIndex.add(BigInteger.ONE);
            triangle = triangleIndex.multiply(triangleIndex).add(triangleIndex).divide(BigInteger.TWO);
            while (triangle.compareTo(pentagonal) == 1) {
                pentagonalIndex = pentagonalIndex.add(BigInteger.ONE);
                pentagonal = pentagonalIndex.multiply(BigInteger.valueOf(3)).multiply(pentagonalIndex).subtract(pentagonalIndex).divide(BigInteger.TWO);
            }
            while (triangle.compareTo(hexagonal) == 1) {
                hexagonalIndex = hexagonalIndex.add(BigInteger.ONE);
                hexagonal = hexagonalIndex.multiply(BigInteger.TWO).multiply(hexagonalIndex).subtract(hexagonalIndex);
            }
        }
        System.out.println(triangle);
    }
}
