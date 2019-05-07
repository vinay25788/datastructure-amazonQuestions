package com.practise.basic.typeeraser;

import java.util.HashSet;
import java.util.Set;

class Student implements Comparable<Student>
{
	int id;
	String name;
	
	Student(int id,String name)
	{
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}*/

/*	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}*/
	
	
}
public class TestEquals {
	public static void main(String[] args) {
		Student s = new Student(1, "vinay");
		Student s2 = new Student(1,"vinay");
		Student s3 = new Student(1, "vinay");
		Student s4 = new Student(1,"vinay");
		/*Object obj;
		Map<Student,Integer> st = new HashMap<>();
		
		st.put(s, 101);
		st.put(s2, 201);
		
		
		Student s3 = new Student(1,"vinay");
		System.out.println(st.get(s3));*/
		
		Set<Student> set = new HashSet<>();
		set.add(s);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		System.out.println(set);
	}
}
