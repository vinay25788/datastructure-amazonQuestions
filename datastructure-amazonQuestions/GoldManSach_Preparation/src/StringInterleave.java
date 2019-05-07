
public class StringInterleave {
	public static void main(String[] args) {
		/*String s1 ="xxy";
		String s2="xxz";
		String s3="xxzxxxy";*/
		 String s1 = "AB";
	        String s2 = "CD";
	        String s3 = "ABCD";
		System.out.println(find(s1,s2,s3,0,0,0));
	}
	public static boolean find(String s1,String s2,String s3,int p1,int p2,int p3)
	{
		if(p1== s1.length() && p2==s2.length() && p3== s3.length())
			return true;
		
		if(p3== s3.length())
			return false;
		
		return (p1<s1.length() && s1.charAt(p1)== s3.charAt(p3) && find(s1, s2, s3, p1+1, p2, p3+1))||
				(p2<s2.length() && s2.charAt( p2) == s3.charAt(p3) && find(s1, s2, s3, p1, p2+1, p3+1));
		
//		/return false;
	}

}
