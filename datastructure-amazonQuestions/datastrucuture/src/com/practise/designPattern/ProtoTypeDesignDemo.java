package com.practise.designPattern;
import java.util.ArrayList;
import java.util.List;

class Employee implements Cloneable
{
	List<String> empList = new ArrayList<>();
	
	Employee(List<String> empList)
	{
		this.empList = empList;
	}
	
	public List<String> getEmpList()
	{
		return this.empList;
	}

	public Employee clone()
	{
		List<String > list = new ArrayList<>();
		for(String emp :empList)
		{
			list.add(emp);
		}
		
		return new Employee(list);
	}

	@Override
	public String toString() {
		return "Employee [empList=" + empList + "]";
	}
	
	
}
public class ProtoTypeDesignDemo {

	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		li.add("vinay");
		li.add("kumar");
		Employee emp = new Employee(li);
		System.out.println(emp.toString());
		Employee e2 = emp.clone();
		System.out.println(e2.toString());
	}
}
