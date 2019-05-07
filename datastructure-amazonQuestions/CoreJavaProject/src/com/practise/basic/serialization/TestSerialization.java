package com.practise.basic.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.omg.CORBA.portable.ServantObject;

class Super
{
	int id;
	
	Super()
	{
		
	}
	Super(int id)
	{
		this.id = id; 
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Super [id=" + id + "]";
	}
	
}

class Sub extends Super implements Serializable
{
	String name;
	Sub(int a,String name)
	{
		super(a);
		this.name = name;
	}
	
	
	 public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

		private static class DataProxy implements Serializable
		{
			String name;
			int id;
			
			public DataProxy(Sub sub) {
				
				this.id = sub.id;
				this.name = sub.name;
			}
			
			private Object readResolve()
			{
				return new Sub(this.id,this.name);
			}
		}
		
		private Object writeReplace()
		{
			return new DataProxy(this);
		}

	/*private void readObject(ObjectInputStream in) throws ClassNotFoundException, IOException
	{
		in.defaultReadObject();
		
		setId(in.readInt());
		setName( (String)in.readObject()); 
	}
	
	private void writeObject(ObjectOutputStream out) throws IOException {
		 	
		 out.defaultWriteObject();
		 out.writeInt(this.id);
		 out.writeObject(this.name);
	}*/
	
	@Override
	public String toString() {
		return "Sub [name=" + name + "]";
	}
	
	
}
public class TestSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Sub sub = new Sub(1,"vinay");
		File file = new File("data.ser");
		FileOutputStream fo = new FileOutputStream(file);
		ObjectOutput out = new ObjectOutputStream(fo); 
		out.writeObject(sub);
		
		FileInputStream fin = new FileInputStream(file);
		ObjectInput in = new ObjectInputStream(fin);
		Sub obj = (Sub)in.readObject();
		System.out.println(obj.id+" "+obj.name);
	}

	@Override
	public String toString() {
		return "TestSerialization [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
