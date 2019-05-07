/* Problem Name is &&& Best Average Grade &&& PLEASE DO NOT REMOVE THIS LINE. */

import java.io.*;
import java.util.*;

/*
**  Instructions:
**
**  Given a list of student test scores, find the best average grade.
**  Each student may have more than one test score in the list.
**
**  Complete the bestAverageGrade function in the editor below.
**  It has one parameter, scores, which is an array of student test scores.
**  Each element in the array is a two-element array of the form [student name, test score]
**  e.g. [ "Bobby", "87" ].
**  Test scores may be positive or negative integers.
**
**  If you end up with an average grade that is not an integer, you should
**  use a floor function to return the largest integer less than or equal to the average.
**  Return 0 for an empty input.
**
**  Example:
**
**  Input:
**  [ [ "Bobby", "87" ],
**    [ "Charles", "100" ],
**    [ "Eric", "64" ],
**    [ "Charles", "22" ] ].
**
**  Expected output: 87
**  Explanation: The average scores are 87, 61, and 64 for Bobby, Charles, and Eric,
**  respectively. 87 is the highest.
*/

public class GradeAverage
{
  /*
  **  Find the best average grade.
  */
  public static Integer bestAverageGrade(String[][] scores)
  {
    // Check for empty list
    if(scores.length == 0)
    {
      return 0;
    }

    // Build hashmap of students to list of scores
    HashMap<String, ArrayList<Integer>> studentsToScores = new HashMap<String, ArrayList<Integer>>();
    for(String[] scoreRow : scores)
    {
      // Check for well formed input
      if(scoreRow.length != 2)
        return 0;

      String student = scoreRow[0];
      Integer score  = Integer.parseInt(scoreRow[1]);

      // Find student in list
      ArrayList<Integer> currentScores = studentsToScores.get(student);
      if(currentScores == null)
      {
        currentScores = new ArrayList<Integer>();
        currentScores.add(score);
        studentsToScores.put(student, currentScores);
      }
      else
      {
        // append score to list
        currentScores.add(score);
      }
    }

    // get averages and max
    double max = -Double.MAX_VALUE;
    for(ArrayList<Integer> studentScores : studentsToScores.values())
    {
      Integer sum = 0;
      for(Integer i : studentScores)
      {
        sum += i;
      }

      double average = sum / (double)studentScores.size();
      max = Math.max(max, average);
    }

    return (int)Math.floor(max);
  }

  /*
  **  Returns true if the tests pass. Otherwise, returns false;
  */
  public static boolean doTestsPass()
  {
    // map of test cases to expected results
    Map<String[][], Integer> testCases = new HashMap<>();

    // example
    testCases.put(new String[][] { { "Bobby", "87" },
                     { "Charles", "100" },
                     { "Eric", "64" },
                     { "Charles", "22" } },
            87);
    // empty
    testCases.put(new String[][] {},
            0);
    // multiple scores each
    testCases.put(new String[][] { { "Sarah", "91" },
                     { "Goldie", "92" },
                     { "Elaine", "93" },
                     { "Elaine", "95" },
                     { "Goldie", "94" },
                     { "Sarah", "93" } },
            94);
    // negatives and zeros
    testCases.put(new String[][] { { "Janie", "-66" },
                     { "Janie", "0" },
                     { "Gina", "-88" },
                     { "Bobby", "0" },
                     { "Gina", "44" },
                     { "Bobby", "0" },
                     { "Bobby", "-6" } },
            -2);
    // same value and average
    testCases.put(new String[][] { { "Alpha", "99" },
                     { "Bravo", "99" },
                     { "Charlie", "99" },
                     { "Delta", "99" },
                     { "Echo", "99" },
                     { "Foxtrot", "99" },
                     { "Foxtrot", "99" } },
            99);
    // non-integer average
    testCases.put(new String[][] { { "Gerald", "91" },
                     { "Gerald", "92" } },
            91);
    // negative non-integer average
    testCases.put(new String[][] { { "Barry", "-66" },
                     { "Barry", "-65" },
                     { "Alfred", "-122"} },
            -66);

    boolean passed = true;
    for(Map.Entry<String[][], Integer> entry : testCases.entrySet())
    {
      Integer actual = bestAverageGrade(entry.getKey());
      if(actual != entry.getValue())
      {
        passed = false;
        System.out.println("Failed for " + Arrays.deepToString(entry.getKey()) + "\n  expected " + entry.getValue() + ", actual " + actual);
      }
    }

    return passed;
  }

  /*
  **  Execution entry point.
  */
  public static void main(String[] args)
  {
    // Run the tests
    if(doTestsPass())
    {
      System.out.println("All tests pass");
    }
    else
    {
      System.out.println("Tests fail.");
    }
  }
}