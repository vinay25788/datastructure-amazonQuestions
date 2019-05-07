package src.stringquestion.copystring.customTreadpool;

public class CheckIfStringAreRotationToEachOther {
	public static void main(String[] args) {
		String s = "vinay"; 
        String v = "yavin"; 
		System.out.println(check(s,v));
		String sub =s.substring(0, 2);
		System.out.println(sub);
	}
	
	public static boolean check(String s,String v)
	{
		if(s.length() != v.length())
			return false;
		System.out.println(s+s +" "+(s+s).indexOf(v));
		return (s+s).indexOf(v)!=0;
	}
}
