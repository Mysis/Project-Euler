package euler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem42 {

    public static void main(String[] args) {

        String wordsRaw = "";
        try (BufferedReader inFile = new BufferedReader(new FileReader("ProblemFiles/p042_words.txt"))) {
            wordsRaw = inFile.readLine();
        } catch (FileNotFoundException e) {
            System.out.println("Could not find p042_words.txt");
            System.exit(0);
        } catch (IOException e) {
            System.out.println("Unknown I/O error.");
            System.exit(0);
        }

        wordsRaw = wordsRaw.substring(1);
        List<String> words = new ArrayList<>(Arrays.asList(wordsRaw.split("[\",]+")));
        List<Integer> triangleNumbers = new ArrayList<>();
        triangleNumbers.add(0);
        List<String> answers = new ArrayList<>();

        for (String word : words) {
            int total = 0;
            for (char letter : word.toCharArray()) total += (int)letter - 64;
            while (total > triangleNumbers.get(triangleNumbers.size() - 1)) triangleNumbers.add(triangleNumbers.size() * (triangleNumbers.size() + 1) / 2);
            if (triangleNumbers.contains(total)) answers.add(word);
        }

        System.out.println(answers);
        System.out.println(answers.size());
    }
}
