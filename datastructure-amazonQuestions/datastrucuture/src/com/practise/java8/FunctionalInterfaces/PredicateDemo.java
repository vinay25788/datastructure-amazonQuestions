package com.practise.java8.FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateDemo {
	
	public static void main(String[] args) {
		Predicate<String> pr = (s)->s.length()>5;
		
		System.out.println(pr.test("vinayk"));
		Predicate<String> pr2 =(s)->s.contains("vin");
		//System.out.println(pr.negate().and(pr2.test("vinay")).test("vinayk"));
		Predicate<Integer> p1 = (i)->i>5;
		Predicate<Integer> p2 = (i)->i%2==0;
		int[] a = {2,3,4,5,6};
		m1(p1, a);
		m1(p2,a);
		m1(p1.and(p2), a);
		Predicate<Integer> isFive=Predicate.isEqual(5);
		System.out.println("static "+isFive.test(6));
	}
		public static void m1(Predicate<Integer> pr, int[] a)
		{
			for(int i:a)
			{
				if(pr.test(i))
					System.out.println(i);
			}
		}
}
