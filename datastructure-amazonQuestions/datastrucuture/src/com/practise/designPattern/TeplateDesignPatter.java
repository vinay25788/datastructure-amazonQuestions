package com.practise.designPattern;

abstract class HouseTemplate
{
	public final void build()
	{
		buildFoundation();
		buildPillars();
		
		buildWalls();
		buildWindows();
	}

	private void buildFoundation() {
		// TODO Auto-generated method stub
	System.out.println(" build concrete cement , sand ,iron ");	
	}

	public abstract void buildPillars() ;
		// TODO Auto-generated method stub

	public abstract void buildWalls() ;
		// TODO Auto-generated method stub
		

	private void buildWindows() {
		// TODO Auto-generated method stub
		System.out.println(" building windows");
	}
}

class WoodHouse extends HouseTemplate
{

	@Override
	public void buildPillars() {
		// TODO Auto-generated method stub
		System.out.println(" wooden coating on pillars");
	}

	@Override
	public void buildWalls() {
		System.out.println(" wooden walls");
	}
	
}

class GlassHouse extends HouseTemplate
{

	@Override
	public void buildPillars() {
		
		System.out.println(" glass pillar coating ");
		
	}

	@Override
	public void buildWalls() {
		// TODO Auto-generated method stub
		System.out.println(" glass walls ");
	}
	
}
public class TeplateDesignPatter {

	public static void main(String[] args) {
		HouseTemplate tem = new GlassHouse();
		tem.build();
		System.out.println("********");
		HouseTemplate temp2 = new WoodHouse();
		temp2.build();
		
	}
}






















