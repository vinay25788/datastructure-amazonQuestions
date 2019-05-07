package com.practise.systemdesign;

class A1
{
	public void test()
	{
		System.out.println(" A1 ");
	}
	public static void test1()
	{
		System.out.println(" A1 static ");
	}
}
class B1 extends A1
{
	public void test()
	{
		System.out.println(" b1");
	}
	
	public static void test1()
	{
		System.out.println(" b1 static ");
	}
}
public class OverridingExample {
	public static void main(String[] args) {
		A1 a = new B1();
		a.test();
		a.test1();
	}

}
