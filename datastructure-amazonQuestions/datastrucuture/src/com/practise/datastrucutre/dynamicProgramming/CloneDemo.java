package com.practise.datastrucutre.dynamicProgramming;

class Clone1
{
	String name;
	
	Clone1()
	{
		
	}
	Clone1(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		return ""+this.name;
	}
}

class Clone2 extends Clone1 implements Cloneable
{
	String dest;
	Clone2(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	Clone2()
	{
		
	}
	public Object clone() throws CloneNotSupportedException
	{
		Clone2 c2  = new Clone2();
		c2.dest = "sharma";
		return c2;
	}
	
}
public class CloneDemo {

	public static void main(String[] args) {
		Clone1 c1 = new Clone1("vinay");
		
		System.out.println(c1.toString());
		Clone2 c2 = new Clone2("kumar");
		Clone2 c3;
		try {
			c3 = (Clone2) c2.clone();
			System.out.println(c3.dest);
			System.out.println(c3.name);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
