package com.src.practise.doubleLinkedList;

import java.util.ArrayList;
import java.util.List;

class Employee
{
	int id;
	String name;
	int age;
	Employee(int id,String name,int age)
	{
		this.id =id;
		this.name =name;
		this.age =age;
	}
}
public class Java8Question {

	public static void main(String[] args) {
		Employee e1 = new Employee(1,"vinay",30);
		Employee e2 = new Employee(2,"kumar",35);
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		int sum=0;
		/*int avg = list.stream().forEach(
				i->sum+i.id);*/
//		list.stream().ma
		
	}
}
