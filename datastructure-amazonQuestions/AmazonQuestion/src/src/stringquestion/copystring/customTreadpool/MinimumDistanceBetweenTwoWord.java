package src.stringquestion.copystring.customTreadpool;

public class MinimumDistanceBetweenTwoWord {
	public static void main(String[] args) {
		 String s = "geeks for geeks contribute practice"; 
	        String w1 = "geeks"; 
	        String w2 = "practice"; 
		findDistance(s, w1, w2);
	}

	public static void findDistance(String st, String w1, String w2) {
		int min_dis = st.length() + 1;
		int prev = -1, i = 0;
		String[] words = st.split(" ");
		for (; i < st.length(); i++) {
			if (words[i].equals(w1) || words[i].equals(w2)) {
				prev = i;
				break;
			}
		}
		i++;
		while (i < words.length) {
			if (words[i].equals(w1) || words[i].equals(w2)) {
				if (!words[prev].equals(words[i]) && i - prev < min_dis) {
					min_dis = i - prev - 1;
					prev = i;
				} else
					prev = i;
			}
			i++;
		}
		System.out.println(min_dis);

	}

}
