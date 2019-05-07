package com.practise.designPattern.externalserialization.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Parent implements Serializable
{
	
	int id;
	String name;
	String dept;
	public Parent()
	{
		System.out.println(" parent constructor ");
	}
	
	public Parent(int id,String name,String dep)
	{
		this.id = id;
		this.name = name;
		this.dept= dep;
		System.out.println(" parent constructor argument ");
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	private void writeObject(ObjectOutputStream out) throws IOException
	{
		System.out.println(" Parent writeObject ");
		out.writeInt(this.id);
		out.writeObject(this.name);
	}
	
	private Object writeReplace()
	{
		System.out.println(" parent write replace");
		return this;
	}
	
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
	{
		System.out.println(" parent readObject ");
		this.id = in.readInt();
		this.name = (String) in.readObject();
		
	}
	
	private Object readResolve()
	{
		System.out.println(" parent read Resolve ");
		return this;
	}
}
class Child extends Parent implements Serializable
{
	
	int id;
	String name;
	String dept;
	public Child()
	{
		System.out.println(" child constructor ");
	}
	
	public Child(int id,String name,String dep)
	{
		this.id = id;
		this.name = name;
		this.dept= dep;
		System.out.println(" child constructor argument");
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	private void writeObject(ObjectOutputStream out) throws IOException
	{
		System.out.println(" Child writeObject ");
		out.writeInt(this.id);
		out.writeObject(this.name);
	}
	
	private Object writeReplace()
	{
		System.out.println(" Child write replace");
		return this;
	}
	
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
	{
		System.out.println(" Child readObject ");
		this.id = in.readInt();
		this.name = (String) in.readObject();
		
	}
	
	private Object readResolve()
	{
		System.out.println(" Child read Resolve ");
		return this;
	}
}
public class MagicMethodDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Child child = new Child();
		child.setName("Ashintha");
		child.setId(1);
		child.setDept("agriculter");
	        
	        
	        File file = new File("emp.ser");
	        FileOutputStream fout = new FileOutputStream(file);
	        ObjectOutputStream oos = new ObjectOutputStream(fout);
	        oos.writeObject(child);
	        oos.close();
	        System.out.println("Process complete");
	        FileInputStream fin = new FileInputStream("emp.ser");
	        ObjectInputStream ois = new ObjectInputStream(fin);
	        child = (Child) ois.readObject();
	        System.out.println(child.name);
	        ois.close();
	}
}
