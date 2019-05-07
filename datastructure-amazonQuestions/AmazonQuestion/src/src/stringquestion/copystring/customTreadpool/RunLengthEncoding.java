package src.stringquestion.copystring.customTreadpool;

public class RunLengthEncoding {
	public static void main(String[] args) {
		String st="vvkkkcc";
		runLengthEncoding(st);
	}
	public static void runLengthEncoding(String st)
	{
		int n=st.length();
		for(int i=0;i<n;i++)
		{
			int count= 1;
			while(i<n-1 && st.charAt(i) == st.charAt(i+1))
			{
				count++;
				i++;
			}
			System.out.print(st.charAt(i)+""+count);
		}
	}

}
