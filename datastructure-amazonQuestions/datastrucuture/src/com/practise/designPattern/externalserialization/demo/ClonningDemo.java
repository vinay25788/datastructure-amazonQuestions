package com.practise.designPattern.externalserialization.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Address implements Cloneable
{
	int street;
	String name;
	String city;
	
	Address()
	{
		
	}
	
	public Address(int street, String name, String city) {
		super();
		this.street = street;
		this.name = name;
		this.city = city;
	}
	public int getStreet() {
		return street;
	}
	public void setStreet(int street) {
		this.street = street;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", name=" + name + ", city=" + city + "]";
	}
	
	public Address clone() throws CloneNotSupportedException
	{
		return (Address) super.clone();
	}
	
}

class Employe implements Cloneable
{
	int id;
	String name;
	Address add;
	
	Employe()
	{
		
	}
	
	Employe(int id,String name,Address add)
	{
		this.id = id;
		this.name = name;
		this.add = add;
		
	}
	
	public Employe clone() throws CloneNotSupportedException
	{
		Employe em = (Employe) super.clone();
		em.add = this.add.clone();
				
		return em;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", add=" + add + "]";
	}
	
}
public class ClonningDemo {

	public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Address ad = new Address();
		ad.city="una";
		ad.name="jhala";
		ad.street =1;
		
		Employe em = new Employe();
		em.id=12;
		em.name="vinay";
		em.add =ad;
		
		System.out.println(em.toString());
		Employe em2 = (Employe) em.clone();
		em.add.city="shimla";
		em.name="kumar";
		em.id =30;
		System.out.println(em2);
		/*Employe e2 =Employe.class.newInstance();
		System.out.println(e2.toString());
		Constructor<Employe> constructor = Employe.class.getConstructor();
		Employe emp3 = constructor.newInstance();
		System.out.println(emp3.toString());*/
	}
}














