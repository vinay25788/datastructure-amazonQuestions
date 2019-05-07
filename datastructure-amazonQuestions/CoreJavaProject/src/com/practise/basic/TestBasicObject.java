package com.practise.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Student
{
	int id;
	String name;
	
	Student(int id,String name)
	{
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString()
	{
		return ""+this.id+" "+this.name;
	}
	public boolean equals(Object obj)
	{
		boolean result = true;
		if(obj == null || this.getClass() != obj.getClass())
			return false;
		
		Student s = (Student) obj;
		int id = s.id;
		if(!(this.id  == id) )
		{
			result = false;
		}
		String name = s.name;
		if(!this.name.equals(name))
			result = false;
		return result;
	}
	
	public int hashCode()
	{
		int result = id;
		
		result = result*31 + name.hashCode();
		return result;
	}
}
public class TestBasicObject {
	public static void main(String[] args) {
		
		Student s1 = new Student(1,"vinay");
		Student s2 = new Student(2,"vinay");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(new Object()));
		
		Set<Student> set = new HashSet<>();
		set.add(s1);
		set.add(s2);
		System.out.println(set);
		
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		
		Student[] st = {
				
					new Student(1,"vinay"),
					new Student(2,"vinay")
					
				
		};
		
		Arrays.sort(st);
		System.out.println(Arrays.toString(st).toString());
		//Collections.sort(list);
				
		
	}

}
