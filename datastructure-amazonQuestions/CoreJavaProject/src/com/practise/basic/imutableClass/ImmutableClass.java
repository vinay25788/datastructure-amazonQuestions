package com.practise.basic.imutableClass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

class Address
{
	int street;
	String city;
	
	public Address()
	{
		
	}
	public Address(int street,String city) {

		this.street = street;
		this.city = city;
	}

	public int getStreet() {
		return street;
	}

	public void setStreet(int street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	
	
}

final class Student
{
	private final int id;
	private final String name;
	Address add;
	public Student(int id, String name, Address add) {
		super();
		this.id = id;
		this.name = name;
		//this.add = add;
		Address ad = new Address();
		ad.street = add.street;
		ad.city  = add.city;
		this.add =ad;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Address getAdd() {
		Address ad = new Address(this.add.street,this.add.city);
		return ad;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", add=" + add + "]";
	}
	
	
}
public class ImmutableClass {

	public static void main(String[] args) {
		Address ad = new Address(1, "una");
		Student st = new Student(10, "vinay", ad);
		Student st2 = new Student(8, "sharma", ad);
		
		System.out.println(st.toString());
		ad.city="shimla";
		System.out.println(st.toString());
		st.getAdd().setCity("shimla");
		System.out.println(st.toString());
		
		Set<Student> set = new TreeSet<>();
		/*set.add(st);
		set.add(st2);
		System.out.println(set);*/
		List<Student> list = new ArrayList<>();
		list.add(st); 	
		list.add(st2);
		list.sort(Comparator.comparing(e->e.getName()));
		System.out.println(list);
		LinkedHashMap map;
		SortedSet<Student> sorted = new TreeSet<Student>();
		sorted.add(st);
		sorted.add(st2);
		System.out.println(sorted);
	}

}
