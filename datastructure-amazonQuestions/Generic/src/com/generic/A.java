package com.generic;

import java.util.ArrayList;
import java.util.List;

class A {

}
 class B extends A{}
 class C extends B{}
 class D extends C{}
 class E extends D{}
 
  class TestGeneric{
	 public static void main(String ...s) {
		 
	 }
	 
	 private static void addDemo1() {
		 List<A> list = new ArrayList<>();
		 list.add(new A());
		 list.add(new E());
	 }
	 private static void addDemo2() {
		 List<C> list = new ArrayList<>();
		// list.add(new A());
		 list.add(new E());
	 }
	 private static void addDemo() {
		 List<? extends C> list = new ArrayList<>();
		 //No Additioin possible for ? extends Type
		 /*list.add(new A());
		 list.add(new E());*/
		 List<A> listA = null;
		// listA = new ArrayList<E>();
	 }
	 
	 private static void assignDemo() {
		 List<? extends C> list = new ArrayList<>();
		 List<A> lista = new ArrayList<>();
		 List<E> listE = new ArrayList<>();
		 list = listE;
		// list = lista;
		 //No Additioin possible for ? extends Type
		 /*list.add(new A());
		 list.add(new E());*/
	 }
	 private static void assignDemoSuper() {
		 List<? super C> list = new ArrayList<>();
		 List<A> lista = new ArrayList<>();
		 List<E> listE = new ArrayList<>();
		 //list = listE;
		// list = lista;
		// list.add(new B());
		 //No Additioin possible for ? extends Type
		 /*list.add(new A());
		 list.add(new E());*/
	 }
 }
