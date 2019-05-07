package src.stringquestion.copystring.customTreadpool;

public class PermutationOfString {
	public static void main(String[] args) {
		String st="ABC";
		permute(st,0,st.length()-1);
	}
	public static void permute(String st,int l,int r)
	{
		if(l== r)
		{
			System.out.println(st);
			//return;
		}
		else
		{
			for(int i=l;i<=r;i++)
			{
				String sst =swap(st,l,i);
				permute(sst,l+1,r);
			sst=	swap(sst,l,r);
			}
		}
			
	}
	
	public static String swap(String st,int l,int r)
	{
		char[] ch = st.toCharArray();
		char temp = ch[l];
		ch[l] = ch[r];
		ch[r ] = temp;
			st = String.valueOf(ch);
		return st;
	}

}
