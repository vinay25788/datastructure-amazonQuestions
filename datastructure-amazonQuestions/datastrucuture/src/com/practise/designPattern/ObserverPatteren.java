package com.practise.designPattern;

import java.util.ArrayList;
import java.util.List;

interface Subject
{
	public void register(Observere ob);
	public void unregister(Observere ob);
	public void notifyAllOb();
	public Object getUpdate(Observere ob);
}

class MyTopic implements Subject
{
	String name;
	List<Observere> list;
	
	public boolean isChanged = false;
	public Object Mutex = new Object();
	String msg;
	
	MyTopic(String name)
	{
		this.name = name;
		list = new ArrayList<>();
	}
	
	@Override
	public void register(Observere ob) {
		// TODO Auto-generated method stub
		if(ob == null)
			throw new NullPointerException();
		synchronized(Mutex)
		{
			this.list.add(ob);
		}
	}

	@Override
	public void unregister(Observere ob) {
		// TODO Auto-generated method stub
		
		synchronized(Mutex)
		{
			list.remove(ob);
		}
		
	}

	@Override
	public void notifyAllOb() {

		List<Observere> obList = null;
		synchronized(Mutex)	
		{
			if(!isChanged)
			{
				return;
			}
			else
			{
				obList = this.list;
				this.isChanged = false;
			}
		}
		for(Observere ob: obList)
		{
			ob.update();
		}
	}

	@Override
	public Object getUpdate(Observere ob) {
		// TODO Auto-generated method stub
	return	this.msg;
	}
	
	public void postMessage(String msg)
	{
		System.out.println(" msg posted on topic "+msg);
		this.msg = msg;
		this.isChanged = true;
		notifyAllOb();
	}
}

interface ObserverTest
{
	public void update();
	public void setSubject(Subject sub);
}
class Observere implements ObserverTest
{

	String name;
	 Subject sub;
	 
	 public Observere(String name)
	 {
		 this.name =name;
	 }
	public void update() {

		String msg = (String)sub.getUpdate(this);
		if(msg == null)
			System.out.println(" no new msg ");
		else
			System.out.println(" message consumed by "+this.name +" "+msg);
	}

	@Override
	public void setSubject(Subject sub) {
		// TODO Auto-generated method stub
		this.sub = sub;
	}
	
}
public class ObserverPatteren {

	public static void main(String[] args) {
		
		MyTopic myTopic = new MyTopic("Software_Engineer");
		Observere ob1 = new Observere("test1");

		Observere ob2 = new Observere("test2");
		Observere ob3 = new Observere("test3");
		myTopic.register(ob1);
		myTopic.register(ob3);
		myTopic.register(ob2);
		
		ob1.setSubject(myTopic);
		ob2.setSubject(myTopic);
		ob3.setSubject(myTopic);
		
		ob1.update();
		
		myTopic.postMessage("hello");
		}
}
