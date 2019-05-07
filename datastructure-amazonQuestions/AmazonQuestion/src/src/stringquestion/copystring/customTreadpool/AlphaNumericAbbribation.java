package src.stringquestion.copystring.customTreadpool;

public class AlphaNumericAbbribation {
	// C++ program to print all Alpha-Numeric Abbreviations 
	// of a String 

	// Recursive function to print the valid combinations 
	// s is string, st is resultant string 
	public static void printCompRec(String s, int index, 
					int max_index, String st) 
	{ 
		// if the end of the string is reached 
		if (index == max_index) { 
			System.out.println(st);
			return; 
		} 

		// push the current character to result 
		char[] ch = st.toCharArray();
		ch[st.length()] = s.charAt(index);
		st = String.valueOf(ch);

		// recur for the next [Using Char] 
		printCompRec(s, index + 1, max_index, st); 

		// remove the character from result 
		st.setCharAt(index, '');
		// set count of digits to 1 
		int count = 1; 

		// addition the adjacent digits 
		if (!st.empty()) { 

			if (isdigit(st.back())) { 

				// get the digit and increase the count 
				count += (int)(st.back() - '0'); 

				// remove the adjacent digit 
				st.pop_back(); 
			} 
		} 

		// change count to a character 
		char to_print = (char)(count + '0'); 

		// add the character to result 

		st.push_back(to_print);

		// recur for this again [Using Count] 
		printCompRec(s, index + 1, max_index, st); 
	} 

	// Wrapper function 
	static void printComb(String s) 
	{ 
		// if the string is empty 
		if (s.length()<0) 
			return; 

		// Stores result strings one one by one 
		StringBuffer st = new StringBuffer(); 

		printCompRec(s, 0, s.length(), st); 
	} 

	// driver function 
	public static void main(String[] args) {
		String str = "GFG"; 
		printComb(str); 
	}

}
