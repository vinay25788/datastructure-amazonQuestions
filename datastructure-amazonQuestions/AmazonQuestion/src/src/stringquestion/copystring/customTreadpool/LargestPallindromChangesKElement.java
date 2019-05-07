package src.stringquestion.copystring.customTreadpool;

//Java program to get largest palindrome changing 
//atmost K digits 

import java.text.ParseException; 

public class LargestPallindromChangesKElement { 

//Returns maximum possible palindrome using k changes 
	static String maximumPalinUsingKChanges(String str, int k) { 
		char palin[] = str.toCharArray(); 
		String ans = ""; 
		// Iinitialize l and r by leftmost and 
		// rightmost ends 
		int l = 0; 
		int r = str.length() - 1; 

		// first try to make String palindrome 
		while (l < r) { 
			// Replace left and right character by 
			// maximum of both 
			if (str.charAt(l) != str.charAt(r)) { 
				palin[l] = palin[r] = (char) Math.max(str.charAt(l), 
										str.charAt(r)); 
				k--; 
			} 
			l++; 
			r--; 
		} 

		// If k is negative then we can't make 
		// String palindrome 
		if (k < 0) { 
			return "Not possible"; 
		} 

		l = 0; 
		r = str.length() - 1; 

		while (l <= r) { 
			// At mid character, if K>0 then change 
			// it to 9 
			if (l == r) { 
				if (k > 0) { 
					palin[l] = '9'; 
				} 
			} 

			// If character at lth (same as rth) is 
			// less than 9 
			if (palin[l] < '9') { 
				/* If none of them is changed in the 
			previous loop then subtract 2 from K 
			and convert both to 9 */
				if (k >= 2 && palin[l] == str.charAt(l) 
						&& palin[r] == str.charAt(r)) { 
					k -= 2; 
					palin[l] = palin[r] = '9'; 
				} /* If one of them is changed in the previous 
				loop then subtract 1 from K (1 more is 
				subtracted already) and make them 9 */
			else if (k >= 1 && (palin[l] != str.charAt(l) 
						|| palin[r] != str.charAt(r))) { 
					k--; 
					palin[l] = palin[r] = '9'; 
				} 
			} 
			l++; 
			r--; 
		} 
		for(int i = 0;i<palin.length;i++) 
			ans+=palin[i]; 
		return ans; 
	} 

//Driver code to test above methods 
	public static void main(String[] args) throws ParseException { 
		String str = "43435"; 
		int k = 3; 
		System.out.println(maximumPalinUsingKChanges(str, k)); 

	} 
} 
//This code is contributed by 29ajaykumar 
