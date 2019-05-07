package com.practise.tree;

import java.util.HashMap;
import java.util.Map;

class Employee
{
	String first;
	String second;
	
	
	public Employee(String first, String second) {
		super();
		this.first = first;
		this.second = second;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getSecond() {
		return second;
	}
	public void setSecond(String second) {
		this.second = second;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((second == null) ? 0 : second.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (second == null) {
			if (other.second != null)
				return false;
		} else if (!second.equals(other.second))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [first=" + first + ", second=" + second + "]";
	}
	
	
}
public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("vinay","kumar");
		Map<Employee,Integer> map = new HashMap<>();	
		map.put(e1, 1);
		e1.setFirst("kumar");
		Integer e2 = map.get(e1);
		System.out.println(e2);
	}

}
