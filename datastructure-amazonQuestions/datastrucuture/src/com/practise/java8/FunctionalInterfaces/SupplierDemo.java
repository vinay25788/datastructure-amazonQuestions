package com.practise.java8.FunctionalInterfaces;

import java.util.function.Supplier;

// Supplier does not take any input it only return object
public class SupplierDemo {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		Supplier<Integer>	sup = ()->
		{
			int in = (int) (Math.random()*4);
			return a[in];
		};
		System.out.println(sup.get());
		System.out.println(sup.get());
		System.out.println(sup.get());
		System.out.println(sup.get());
		
	}
}
