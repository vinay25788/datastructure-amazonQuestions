package com.practise.designPattern.externalserialization.demo;

class TestA implements Cloneable
{
	int a;
	String name;
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
class TestB 
{
	private final int num;
	private final String name;
	private final TestA testA;
	
	public TestB(int num,String name,TestA testA) 
	{
		this.num = num;
		this.name = name;
		TestA tes = new TestA();
		tes.a = testA.a;
		tes.name = testA.name;
		this.testA = tes;
	}

	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public TestA getTestA()  {
		/*TestA te = new TestA();
		te.a = this.testA.a;
		te.name = this.testA.name;*/
		return this.testA;
	}
	
	
}
public class SingleTonDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		TestA testA = new TestA();
		testA.a =5;
		testA.name = "vinay";
		TestB tstB = new TestB(10, "kumar", testA);
		testA.a =15;
		System.out.println(tstB.getTestA().a);
		tstB.getTestA().a =15;
		System.out.println(tstB.getTestA().a);
	}
}













