package com.game.entity;

public class Location {

	private char x;
	int y;
	public Location()
	{
		
	}
	
	public Location(char x,int y)
	{
		this.x = x;
		this.y =y;
	}
	
	public char getX()
	{
		return this.x;
	}
	public int getY()
	{
		return this.y;
	}
	public void setX(char x)
	{
		this.x=x;
	}
	public void setY(int y)
	{
		this.y = y;
	}
}
