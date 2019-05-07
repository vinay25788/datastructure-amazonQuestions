package src.stringquestion.copystring.customTreadpool;

//Java program for above implementation 

public class LargeEvenNumber { 

//Make the largest even number 
	static char[] makeEven(String string) { 
		char []str = string.toCharArray(); 
		int n = str.length; 
		int even = Integer.MAX_VALUE, index = 0; 

		// Start traversing the String 
		for (int i = 0; i < n - 1; i++) { 

			// Find the even number 
			if ((str[i] - '0') % 2 == 0) { 
				even = (str[i] - '0'); 
				index = i; 
			} 

			// Check if current even is equal to 
			// or less than the odd number 
			if (even <= (str[n-1] - '0')) { 
				break; 
			} 
		} 

		// Return original String if there is no 
		// even value 
		if (even == Integer.MAX_VALUE) { 
			return str; 
		} 

		// Swap even and odd value 
		swap(str,index, n - 1); 

		return str; 
	} 
static void swap(char[] str,int index1,int index2){ 
	char temp = str[index1]; 
	str[index1] = str[index2]; 
	str[index2] =temp; 
} 
//Driver code 
	public static void main(String[] args) { 
		String str = "1356425"; 
		System.out.print(makeEven(str)); 
	} 
} 
/*This code is contributed by PrinciRaj1992*/
