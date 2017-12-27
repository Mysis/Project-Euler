package euler;

import java.util.ArrayList;
import java.util.List;

public class Problem44 {

    public static void main(String[] args) {

        List<Integer> pentagonals = new ArrayList<>();
        boolean done = false;
        int index = 0;
        while (!done) {
            pentagonals.add((3 * pentagonals.size() * pentagonals.size() - pentagonals.size()) / 2);
            for (int i = 1; i < index; i++) {
                int sum = pentagonals.get(index) + pentagonals.get(i);
                int difference = pentagonals.get(index) - pentagonals.get(i);
                while (pentagonals.get(pentagonals.size() - 1) <sum) {
                    pentagonals.add((3 * pentagonals.size() * pentagonals.size() - pentagonals.size()) / 2);
                }
                if (pentagonals.contains(sum) && pentagonals.contains(difference)) {
                    System.out.println(difference);
                    done = true;
                }
            }
            index++;
        }
    }
}
