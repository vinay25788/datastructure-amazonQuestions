package com.practise.tree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

class Student
{
	int id;
	String name;
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public Student(int id, String name) {
		super();
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
	
	
}

public class LambdaExpress {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		List<List<Integer>> list = new ArrayList<>();
		list.add(list1);
		list.add(list2);
		//List<Integer> list3 = list.stream().flatMap(i->i.stream()).distinct().collect(Collectors.toList());
		//System.out.println(list3.toString());
		
		//if(StringUtil)
		Consumer<Integer> c = (i->System.out.println(i));
		c.accept(15);
		Thread t = new Thread(()->System.out.println("running"));
		t.start();
		Student s1 = new Student(1,"vinay");
		Student s2 = new Student(2,"vinay1");
		Student s3 = new Student(3,"vinay2");
		Student s4 = new Student(4,"vina3");
		List<Student> listofStudent = new ArrayList<>();
		listofStudent.add(s1);
		listofStudent.add(s2);
		listofStudent.add(s3);
		listofStudent.add(s4);
		List<String> listofName = listofStudent.stream().filter(i->i!=null).map(i->i.getName()).collect(Collectors.toList());
		System.out.println(listofName);
		Map<Integer,List<String>> map = new HashMap<>();
		map.put(1, Arrays.asList("a1","a2"));
		map.put(2, Arrays.asList("b1","b2"));
		map.put(3, Arrays.asList("c1","c2"));
		List<String> result = map.entrySet().stream().filter(i->i!=null).flatMap(i->i.getValue().stream()).collect(Collectors.toList());
		System.out.println(result.toString());
		File file = new File("C:\\Users\\vinkumar19\\Desktop\\doubt.txt");
		try {
			FileReader fr = new FileReader(file);
			int i=10;
			int res = i/0;
		} catch (FileNotFoundException  | ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
