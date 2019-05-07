package src.stringquestion.copystring.customTreadpool;

import java.util.Arrays;

public class FindMaxInArray {
	public static void main(String[] args) {
		int[] a= {2,3,4,5,6,19,20};
		int max = Arrays.stream(a).max().getAsInt();
		System.out.println(max);
	
	}

}
