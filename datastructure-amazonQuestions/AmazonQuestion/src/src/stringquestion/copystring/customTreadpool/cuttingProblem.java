package src.stringquestion.copystring.customTreadpool;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class cuttingProblem {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		SortedMap<Integer, Integer> length2count = new TreeMap<Integer, Integer>();
		int N = 3;
		int a[]= {13,2,10};
		for (int i = 0; i < N; i++) {
			if (!length2count.containsKey(a[i])) {
				length2count.put(a[i], 0);
			}
			length2count.put(a[i], length2count.get(a[i]) + 1);
		}
		int leftNum = N;
		for (int count : length2count.values()) {
			System.out.println(leftNum);
			leftNum -= count;
		}

		in.close();
	}
}