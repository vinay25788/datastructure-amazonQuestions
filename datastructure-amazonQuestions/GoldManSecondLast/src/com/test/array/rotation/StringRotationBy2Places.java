package com.test.array.rotation;

public class StringRotationBy2Places {
	public static void main(String[] args) {
		String a="vinay";
		String b="ayvin";
		System.out.println(find(a,b,2));
	}
	public static boolean find(String a,String b,int d)
	{
		String clock="";
		clock = ""+a.substring(d)+a.substring(0,d);
		System.out.println(" clock wis "+clock);
		if(clock.equalsIgnoreCase(b))
		{
			return true;
		}
		String anti="";
		anti=""+a.substring(a.length()-d, a.length())+a.substring(0, a.length()-d);
		System.out.println(anti);
		if(anti.equalsIgnoreCase(b))
			return true;
		return false;
		
	}

}
