package com.practise.designPattern.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Person
{
	String name;
	String work;
	
	
	public Person(String name, String work) {
		super();
		this.name = name;
		this.work = work;
	}
	public Person() {
		// TODO Auto-generated constructor stub
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
 class Employee extends Person implements Serializable {
    
	private static final long serialVersionUID = 2L;
    private String name;
    private int age;
    private String address;
    
    Employee()
    {
    	super();
    }
    public Employee(String name, String work) {
		super(name, work);
		// TODO Auto-generated constructor stub
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
    
    private void writeObject(ObjectOutputStream out) throws IOException
    {
    	System.out.println("inside writeobject method ");
    	out.writeInt(this.age);
    	out.writeObject(this.name);
    }
    
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
    {
    	System.out.println(" inside readobject method ");
    	this.age = in.readInt();
    	this.name = (String) in.readObject();
    }
}
 
