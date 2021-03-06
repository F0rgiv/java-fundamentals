/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.*;

public class Library {
  public static int[] roll(int n) {
    //create the resulting array
    int[] result = new int[n];

    //get random numbers
    Random rand = new Random();

    //populate the array
    for (int i = 0; i < n; i++) {
      result[i] = rand.nextInt(6) + 1;
    }

    //return the array
    return result;
  }

  public static boolean ContainsDuplicates(int[] arr) {
    //iterate through the list
    for (int i = 0; i < arr.length; i++) {
      //check if it's in the array already
      for (int j = i + 1; j < arr.length; j++) {
        //if it's in there return false
        if (arr[i] == arr[j]) {
          return true;
        }
      }
    }
    return false;
  }

  private static float sum(float[] arr) {
    float result = 0;
    for (float num : arr) {
      result += num;
    }
    return result;
  }

  public static float average(float[] arr) {
    return sum(arr) / arr.length;
  }

  public static float arrayAverage(float[][] arr) {
    //create and populate new array of sums
    float[] toAverage = new float[arr.length];
    for (int i = 0; i < arr.length; i++) {
      toAverage[i] = average(arr[i]);
    }
    System.out.println(Arrays.toString(toAverage));

    return average(toAverage);
  }

  public static String weatherData(int[][] weeks) {
    //handle empty arr.
    if (weeks.length == 0) return "No data passed";

    //track min and max temp
    int min = weeks[0][0];
    int max = weeks[0][0];
    Set<Integer> temps = new HashSet<Integer>();

    //iterate through the days
    for (int[] week : weeks) {
      for (int day : week) {
        if (min > day) min = day;
        if (max < day) max = day;
        temps.add(day);
      }
    }

    String result = "";
    //print min and max
    result = result + "High: " + String.valueOf(max) + "\n";
    result = result + "Low: " + String.valueOf(min) + "\n";

    //print dates that were not seen
    for (int i = 1; i < max - min; i++) {
      if (!temps.contains(i+min)) {
        result = result + "Never saw temperature: " + String.valueOf(i+min) + "\n";
      }
    }
    System.out.println(result);
    return result;
  }

  public static String tally(List<String> votes) {
    //ensure there are votes.
    if (votes.isEmpty()) return "No votes cast";

    //get the list of what was voted for
    Set<String> thingsToVoteFor = new HashSet<>();
    thingsToVoteFor.addAll(votes);

    //create and prep hash map for counting.
    HashMap<String, Integer> countedVotes = new HashMap<>();
    for (String name : votes) {
      countedVotes.put(name, 0);
    }

    //count the students
    for (String name : votes) {
      int count = countedVotes.get(name);
      count++;
      countedVotes.put(name, count);
    }

    //iterate through the hashMap elements and get the max voted for element
    Map.Entry<String, Integer> currentWinner = null;
    for (Map.Entry<String, Integer> contestant : countedVotes.entrySet()) {
      if (currentWinner == null || contestant.getValue()
        .compareTo(currentWinner.getValue()) > 0) {
        currentWinner = contestant;
      }
    }


    //return the current winners name
    return currentWinner.getKey();
  }
}
