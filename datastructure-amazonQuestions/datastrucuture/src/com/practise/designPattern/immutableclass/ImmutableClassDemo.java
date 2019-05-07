package com.practise.designPattern.immutableclass;

import java.util.HashMap;
import java.util.Map;

class Age
{
	int day;
	int month;
	int year;
	
	public Age()
	{
		
	}
	public Age(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}

final class Student
{
	private final int id;
    private final String name;
    private final Age age;
    
   /* public Student(int id,String name, Age age)
    {
    	this.id = id;
    	this.name = name;
    	this.age = age;
    }*/

    public Student(int id,String name, Age age)
    {
    	this.id = id;
    	this.name = name;
    	Age ag = new Age();
    	ag.day = age.day;
    	ag.month = age.month;
    	ag.year = age.year;
    	this.age = ag;
    }
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Age getAge() {
		
		Age ag = new Age();
		ag.day = this.age.day;
		ag.year= this.age.year;
		ag.month = this.age.month;
		
		return ag;
	}
	
	
}
public class ImmutableClassDemo {
	
	public static void main(String[] args) {
		Age age = new Age();
		age.day =25;
		age.month = 7;
		age.year = 1988;
		
		Student st = new Student(1, "vinay", age);
		age.day = 26;
		st.getAge().setYear(1999);
		System.out.println(st.getAge().year);
		
		
	}

}





















