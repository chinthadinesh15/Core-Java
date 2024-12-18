package arrays;

import java.util.*;

class Main1Arra { 

  public static String ArrayChallenge(String input) {
    // Token to process the final output
    String challengeToken = "vdpt9y25ncea";
    
    // Parse the input string to extract the events
    input = input.replaceAll("[\\[\\]\"]", ""); // Remove brackets and quotes
    String[] strArr = input.split(",");

    // Step 1: Parse and convert all times to minutes from midnight
    List<int[]> events = new ArrayList<>();
    for (String event : strArr) {
      String[] times = event.split("-");
      events.add(new int[] {
        timeToMinutes(times[0].trim()),
        timeToMinutes(times[1].trim())
      });
    }

    // Step 2: Sort events by start time
    events.sort((a, b) -> Integer.compare(a[0], b[0]));

    // Step 3: Calculate the longest free time
    int longestFreeTime = 0;
    for (int i = 1; i < events.size(); i++) {
      int gap = events.get(i)[0] - events.get(i - 1)[1];
      if (gap > longestFreeTime) {
        longestFreeTime = gap;
      }
    }

    // Step 4: Format the result as hh:mm
    String result = formatMinutes(longestFreeTime);

    // Step 5: Modify the output string based on ChallengeToken
    result = applyChallengeToken(result, challengeToken);

    return result;
  }

  // Helper: Convert hh:mmAM/PM to minutes from midnight
  private static int timeToMinutes(String time) {
    boolean isPM = time.endsWith("PM");
    time = time.substring(0, time.length() - 2); // Remove AM/PM
    String[] parts = time.split(":");
    int hours = Integer.parseInt(parts[0]) % 12; // Handle 12-hour format
    int minutes = Integer.parseInt(parts[1]);
    if (isPM) {
      hours += 12; // Convert PM to 24-hour format
    }
    return hours * 60 + minutes;
  }

  // Helper: Format minutes into hh:mm
  private static String formatMinutes(int totalMinutes) {
    int hours = totalMinutes / 60;
    int minutes = totalMinutes % 60;
    return String.format("%02d:%02d", hours, minutes);
  }

  // Helper: Replace characters in the result string based on ChallengeToken
  private static String applyChallengeToken(String result, String token) {
    StringBuilder modified = new StringBuilder();
    for (char c : result.toCharArray()) {
      if (token.indexOf(c) != -1) {
        modified.append("--[").append(c).append("]--");
      } else {
        modified.append(c);
      }
    }
    return modified.toString();
  }

  public static void main(String[] args) {  
    // Example test case
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter input as an array of events (e.g., [\"12:15PM-02:00PM\",\"09:00AM-10:00AM\"]): ");
    String input = sc.nextLine();
    
    // Call the static method with the input string
    System.out.println(ArrayChallenge(input));
  }
}
