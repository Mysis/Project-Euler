package euler;

public class Problem40 {

    public static void main (String[] args) {

        Integer toConcat = 1;
        String decString = ".";
        while (decString.length() <= 1000001) {
            decString = decString.concat(toConcat.toString());
            toConcat++;
        }

        int answer = Character.getNumericValue(decString.charAt(1)) *
                Character.getNumericValue(decString.charAt(10)) *
                Character.getNumericValue(decString.charAt(100)) *
                Character.getNumericValue(decString.charAt(1000)) *
                Character.getNumericValue(decString.charAt(10000)) *
                Character.getNumericValue(decString.charAt(100000)) *
                Character.getNumericValue(decString.charAt(1000000));
        System.out.println(answer);
    }
}
