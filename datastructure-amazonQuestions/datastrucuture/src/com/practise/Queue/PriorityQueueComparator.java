package com.practise.Queue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

class Student
{
	int id;
	String name;
	
	Student(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public String toString()
	{
		return " "+this.id+" "+this.name;
	}
}

class Student_Name_Comparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}
public class PriorityQueueComparator {

	public static void main(String[] args) {
		List<Student> list = new LinkedList<>();
		list.add(new Student(1,"vinay"));
		list.add(new Student(2,"abc"));
		list.add(new Student(3,"kumar"));
		System.out.println(list);
		PriorityQueue<Student> pq = new PriorityQueue<>(new Student_Name_Comparator());
		pq.addAll(list);
		System.out.println(pq);
	}
}
