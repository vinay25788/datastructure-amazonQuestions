package com.practise.paytm;

//Java implementation of above approach 

public class MystryNumber 
{ 
	// Finds reverse of given num x. 
	static int reverseNum(int x) 
	{ 
		String s = Integer.toString(x); 
		String str=""; 
		for(int i=s.length()-1;i>=0;i--) 
		{ 
			
			str=str+s.charAt(i); 
		} 
		
		int rev=Integer.parseInt(str); 
		return rev; 
	} 
	
	static boolean isMysteryNumber(int n) 
	{ 
		for (int i=1; i <= n/2; i++) 
		{ 
			// if found print the pair, return 
			int j = reverseNum(i); 
			if (i + j == n) 
			{ 
				System.out.println( i + " " + j); 
				return true; 
			} 
		} 
	
		System.out.println("Not a Mystery Number"); 
		return false; 
	} 
	
	public static void main(String []args) 
	{ 
		int n = 121; 
		isMysteryNumber(n); 
	
	} 

} 

//This code is contributed by ihritik 
