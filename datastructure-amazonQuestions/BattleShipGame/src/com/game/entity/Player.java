package com.game.entity;

import java.util.List;

public class Player {

	private List<Location> missiles;
	public Player()
	{
		
	}
	
	Player(List<Location> missiles)
	{
		this.missiles = missiles;
	}

	public List<Location> getMissiles() {
		return missiles;
	}

	public void setList(List<Location> missiles) {
		this.missiles = missiles;
	}

	
	
}
