package arrays;



import java.util.Scanner;

import java.util.*; 
import java.io.*;
import java.text.SimpleDateFormat;

class Main {

  public static String ArrayChallenge(String[] strArr) {
        List<int[]> events = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mma", Locale.ENGLISH);

        for (String event : strArr) {
            String[] parts = event.split("-");
            try {
                int start = (int) (dateFormat.parse(parts[0]).getTime() / 60000);
                int end = (int) (dateFormat.parse(parts[1]).getTime() / 60000);
                events.add(new int[]{start, end});
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        events.sort(Comparator.comparingInt(a -> a[0]));

       
        int earliestStart = events.get(0)[0];
        int latestEnd = events.get(0)[1];
        int maxFreeTime = 0;
        
     
        int[] varOcg = new int[2];

        for (int i = 1; i < events.size(); i++) {
            if (events.get(i)[0] <= latestEnd) {
                latestEnd = Math.max(latestEnd, events.get(i)[1]);
            } else {
                maxFreeTime = Math.max(maxFreeTime, events.get(i)[0] - latestEnd);
                latestEnd = events.get(i)[1];
            }
        }

    
        int hours = maxFreeTime / 60;
        int minutes = maxFreeTime % 60;
        String freeTime = String.format("%02d:%02d", hours, minutes);

       
        String challengeToken = "nvgefq5y3c";
        StringBuilder finalOutput = new StringBuilder();

        int len = Math.max(freeTime.length(), challengeToken.length());
        for (int i = 0; i < len; i++) {
            if (i < freeTime.length()) finalOutput.append(freeTime.charAt(i));
            if (i < challengeToken.length()) finalOutput.append(challengeToken.charAt(i));
        }

        return finalOutput.toString();
    }


  public static void main (String[] args) {  
       
    Scanner s = new Scanner(System.in);
    System.out.print(ArrayChallenge(s.nextLine())); 
  }

}
