package com.generic;

class Address
{
	int id;
	String street;
	
	public Address(int id, String street) {
		super();
		this.id = id;
		this.street = street;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + "]";
	}
	
}
final public class Student {
	private final int id;
	private final String name;
	private  Address add;
	
	Student(int id,String name,Address add)
	{
		this.id = id;
		this.name = name;
		
		Address ad = new Address(add.id,add.street);
		this.add =ad;
		
		
	}

	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public Address getAdd() {
		Address ad = new Address(this.add.id,this.add.street);
		return ad;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", add=" + add + "]";
	}
	public static void main(String[] args) {
		Address add = new Address(1,"una");
		Student st = new Student(11,"vinay",add);
		System.out.println(st.toString());
		add.id=2;
		System.out.println(st.toString());
		st.getAdd().setId(2);
		System.out.println(st.toString());
	}
	

}
