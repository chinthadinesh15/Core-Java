package arrays;

import java.util.*;
import java.util.regex.*;

public class StringChallenge {

    public static String StringChallenge(String str) {
        // Split the input into the pattern and the string
        String[] inputs = str.split(" ");
        if (inputs.length != 2) return "false";

        String pattern = inputs[0];
        String toMatch = inputs[1];

        // Convert the pattern into a regex
        StringBuilder regex = new StringBuilder();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);

            if (c == '+') {
                regex.append("[a-zA-Z]"); // Match any single alphabetic character
            } else if (c == '$') {
                regex.append("[1-9]"); // Match any single digit from 1 to 9
            } else if (c == '*') {
                // Check if followed by {N}
                if (i + 1 < pattern.length() && pattern.charAt(i + 1) == '{') {
                    int closingBracket = pattern.indexOf('}', i + 2);
                    if (closingBracket == -1) return "false"; // Invalid pattern

                    String number = pattern.substring(i + 2, closingBracket);
                    try {
                        int n = Integer.parseInt(number); // Parse the number inside {N}
                        regex.append("(.)\\1{" + (n - 1) + "}"); // Match the same character N times
                        i = closingBracket; // Move past the closing }
                    } catch (NumberFormatException e) {
                        return "false"; // Invalid number in {N}
                    }
                } else {
                    regex.append("(.)\\1{2}"); // Default to 3 characters if no {N}
                }
            } else {
                return "false"; // Invalid character in the pattern
            }
        }

        // Use regex to match the second string
        Pattern compiledPattern = Pattern.compile("^" + regex + "$");
        boolean matches = compiledPattern.matcher(toMatch).matches();
        return matches ? "true" : "false";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(StringChallenge(s.nextLine()));
        s.close();
    }
}
