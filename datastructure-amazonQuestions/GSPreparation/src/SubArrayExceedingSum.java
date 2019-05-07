
/* Problem Name is &&& SubArray Exceeding Sum &&& PLEASE DO NOT REMOVE THIS LINE. */

import java.io.*;
import java.util.*;

/*
 Instructions to candidate.
  1) Your task is ultimately to implement a function that takes in an array and a integer.
   You want to return the *LENGTH* of the shortest subarray whose sum is at least the integer,
   and -1 if no such sum exists.
  2) Run this code in the REPL to observe its behaviour. The
   execution entry point is main().
  3) Consider adding some additional tests in doTestsPass().
  4) Implement subArrayExceedsSum() correctly.
  5) If time permits, some possible follow-ups.
*/

public class SubArrayExceedingSum {
	public static int subArrayExceedsSum(int arr[], int target) {
		int i = 0, j = 0, length = Integer.MAX_VALUE, size = arr.length;

		if (target <= 0)
			return 0;

		if (size < 1)
			return -1;

		int currsum = arr[0];
		while (true) {
			if (currsum >= target)
				if (i == j)
					return (1);
				else {
					if (j - i + 1 < length)
						length = j - i + 1;
					currsum -= arr[i];
					i++;
				}
			else {
				j++;
				if (j == size)
					break;
				else
					currsum += arr[j];
			}
			;
		}
		;

		if (length == Integer.MAX_VALUE)
			return -1;

		return length;
	}

	/**
	 * int doTestsPass() Returns 1 if all tests pass. Otherwise returns 0.
	 */
	public static void doTestsPass() {
		boolean result = true;
		int[] arr = { 1, 2, 3, 4 };
		result = result && subArrayExceedsSum(arr, 6) == 2;
		result = result && subArrayExceedsSum(arr, 12) == -1;
		result = result && subArrayExceedsSum(arr, 10) == 4;
		result = result && subArrayExceedsSum(arr, 4) == 1;

		int[] arr2 = {};
		result = result && subArrayExceedsSum(arr2, 0) == 0;
		result = result && subArrayExceedsSum(arr2, 2) == -1;

		if (result) {
			System.out.println("All tests pass\n");
		} else {
			System.out.println("There are test failures\n");
		}
	};

	/**
	 * Execution entry point.
	 */
	public static void main(String[] args) {
		doTestsPass();
	}
};
