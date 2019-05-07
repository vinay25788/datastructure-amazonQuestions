package com.practise.arrayRotations;

public class TestPolyMorphism {
	
	public void m1(int a,int b)
	{
		System.out.println("first ");
	}
	public void m1(int  m,float b)
	{
		System.out.println("second");
	}

	public void m1(float s,float b)
	{
		System.out.println(" third ");
	}
	
	public void m1(double s,double b)
	{
		System.out.println(" fourth ");
	}
	public void m1(double  m,int b)
	{
		System.out.println("fifth");
	}
	public static void main(String[] args) {
		TestPolyMorphism obj = new TestPolyMorphism();
		obj.m1(2,2);
	}
}
