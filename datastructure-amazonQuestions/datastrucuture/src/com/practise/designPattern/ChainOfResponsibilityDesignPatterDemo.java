package com.practise.designPattern;

class Currency
{
	int amount;
	
	Currency(int amount)
	{
		this.amount = amount;
	}
	
	public int getAmount()
	{
		return this.amount;
	}
}

interface DispenseChain
{
	public void setNextDispense(DispenseChain chain);
	public void dispense(Currency cur);
}

class Dollar50Dispenser implements DispenseChain
{

	DispenseChain chain ;
	@Override
	public void setNextDispense(DispenseChain chain) {

		this.chain = chain;
	}

	@Override
	public void dispense(Currency cur) {

		if(cur.amount>=50)
		{
			int amount = cur.amount/50;
			int remainder = cur.amount%50;
			System.out.println(" dispensing "+amount+" from 50 dollar dispenser");
			if(remainder !=0)
			{
				chain.dispense(new  Currency(remainder));
			}
			
			
		}
		else
			chain.dispense(cur);
	}
	
}

class Dollar20Dispenser implements DispenseChain
{

	DispenseChain chain ;
	@Override
	public void setNextDispense(DispenseChain chain) {

		this.chain = chain;
	}

	@Override
	public void dispense(Currency cur) {

		if(cur.amount>=20)
		{
			int amount = cur.amount/20;
			int remainder = cur.amount%20;
			System.out.println(" dispensing "+amount+" from 20 dollar dispenser");
			if(remainder !=0)
			{
				chain.dispense(new  Currency(remainder));
			}
			
			
		}
		else
			chain.dispense(cur);
	}
	
}
class Dollar10Dispenser implements DispenseChain
{

	DispenseChain chain ;
	@Override
	public void setNextDispense(DispenseChain chain) {

		this.chain = chain;
	}

	@Override
	public void dispense(Currency cur) {

		if(cur.amount>=10)
		{
			int amount = cur.amount/10;
			int remainder = cur.amount%10;
			System.out.println(" dispensing "+amount+" from 10 dollar dispenser");
			if(remainder !=0)
			{
				chain.dispense(new  Currency(remainder));
			}
			
			
		}
		else
			chain.dispense(cur);
	}
	
}
public class ChainOfResponsibilityDesignPatterDemo {

	
	DispenseChain d1;
	ChainOfResponsibilityDesignPatterDemo()
	{
		 d1 = new Dollar50Dispenser();
		Dollar20Dispenser d2 = new Dollar20Dispenser();
		Dollar10Dispenser d3 = new Dollar10Dispenser();
		d1.setNextDispense(d2);
		d2.setNextDispense(d3);
	}
	public static void main(String[] args) {
		ChainOfResponsibilityDesignPatterDemo obj = new ChainOfResponsibilityDesignPatterDemo();
	 int amount = 280;
	
	 
	 if(amount %10 !=0)
		 System.out.println(" not valid amount ");
	 else
		 obj.d1.dispense(new Currency(amount));
	}
}



















