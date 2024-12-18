package arrays;

import java.util.Scanner;


import java.util.*;

public class Practice {

    public static String SearchingChallenge(String str) {
        String[] words = str.split(" ");
        String resultWord = "-1";
        int maxRepeats = 0;

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "");
            Map<Character, Integer> charCount = new HashMap<>();

            for (char c : word.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }

            int maxForWord = charCount.values().stream().max(Integer::compareTo).orElse(0);

            if (maxForWord > maxRepeats) {
                maxRepeats = maxForWord;
                resultWord = word;
            } else if (maxForWord == maxRepeats && !resultWord.equals("-1")) {
                // If tie, keep the first occurring word
                resultWord = resultWord;
            }
        }

        if (maxRepeats <= 1) return "-1";

        String challengeToken = "vdpt9y25ncea";
        StringBuilder transformed = new StringBuilder();

        for (char c : resultWord.toCharArray()) {
            if (challengeToken.indexOf(c) != -1) {
                transformed.append("-").append(c).append("-");
            } else {
                transformed.append(c);
            }
        }

        return transformed.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(SearchingChallenge(s.nextLine()));
        s.close();
    }
}