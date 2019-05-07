package com.practise.arrayRotations;

class Ab
{
	public void m1()
	{
		System.out.println("hello parent");
	}
}

class Cd extends Ab
{
	public void m1()
	{
		System.out.println("hello child");
	}
	
	public void m2()
	{
		System.out.println("child m2 function");
	}
}
public class TestOveriding {
	
	public static void main(String[] args) {
		Ab a = new Cd();
		a.m1();
	}
}
