package com.practise.designPattern.externalserialization.demo;

import java.io.Externalizable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Test
{}
class Person 
{
	String name;
	String work;
	
	
	public Person(String name, String work) {
		super();
		this.name = name;
		this.work = work;
		System.out.println(" Person constructor with arg");
	}
	public Person() {
		System.out.println(" Person constructor no arg");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	
	
}
 class Employee  implements Serializable {
    
	private static final long serialVersionUID = 4L;
    private String name;
    private int age;
    private String address;
    Person  person;
    Test test;
   public Employee()
    {
    	System.out.println(" employee constructor no arg");
    	test = new Test();
    }
    public Employee(String name, String work) {
		System.out.println(" employee constructor with arg");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String whoIsThis() {
        StringBuffer employee = new StringBuffer();
        employee.append(getName()).append(" is ").append(getAge()).append(" years old and lives at ")
                .append(getAddress());
        return employee.toString();
    }
    
	/*@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("inside writeobject method ");
    	out.writeInt(this.age);
    	out.writeObject(this.name);
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		System.out.println(" inside readobject method ");
    	this.age = in.readInt();
    	this.name = (String) in.readObject();
		
	}*/
}
 

public class SerializableDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		 Employee employee = new Employee();
	        employee.setName("Ashintha");
	        employee.setAge((byte) 30);
	        employee.setAddress("Galle");
	        File file = new File("emp.ser");
	        FileOutputStream fout = new FileOutputStream(file);
	        ObjectOutputStream oos = new ObjectOutputStream(fout);
	        oos.writeObject(employee);
	        oos.close();
	        System.out.println("Process complete");
	        FileInputStream fin = new FileInputStream("emp.ser");
	        ObjectInputStream ois = new ObjectInputStream(fin);
	        employee = (Employee) ois.readObject();
	        ois.close();
	        System.out.println(employee.whoIsThis());
	}
}
