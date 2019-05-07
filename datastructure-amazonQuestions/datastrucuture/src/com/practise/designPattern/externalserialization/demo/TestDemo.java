package com.practise.designPattern.externalserialization.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable
{
	int a;
	String name;
	A()
	{
		System.out.println(" A constructor ");
	}
}

class B extends A implements Serializable
{
	int b;
	String work;
	
	B()
	{
		System.out.println(" b Constructor ");
	}
	
	B(int b,String work)
	{
		this.b = b;
		this.work =work;
	}
}
public class TestDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		B child = new B();
		child.b = 10;
	        child.work ="vinay";
	        File file = new File("emp.ser");
	        FileOutputStream fout = new FileOutputStream(file);
	        ObjectOutputStream oos = new ObjectOutputStream(fout);
	        oos.writeObject(child);
	        oos.close();
	        System.out.println("Process complete");
	        FileInputStream fin = new FileInputStream("emp.ser");
	        ObjectInputStream ois = new ObjectInputStream(fin);
	        child = (B) ois.readObject();
	        System.out.println(child.work);
	        ois.close();
	}
	}

