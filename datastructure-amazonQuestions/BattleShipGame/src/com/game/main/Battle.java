package com.game.main;

import java.util.List;

import com.game.constants.BattleShipType;
import com.game.entity.BattleGround;
import com.game.entity.Location;
import com.game.entity.Player;

public class Battle {
	private BattleGround bgp1;
	private BattleGround bgp2;
	
	public Battle(BattleGround bgp1,BattleGround bgp2) {
		this.bgp1 = bgp1;
		this.bgp2 = bgp2;
	}
	
	public void battle()
	{
		List<Location> missileOfp1 = bgp1.getPlayer().getMissiles();
		List<Location> missileOfp2 = bgp2.getPlayer().getMissiles();
		boolean p1Turn= true;
		boolean p2Turn= false;
		int i=0;
		int j=0;
		int hit=0;
		while(true)
		{
		    if(p1Turn)
		    {
		    	Location loc = missileOfp1.get(i);
		    	int[][] ground = bgp1.getBattleGridGround();
		    	int x = loc.getX();
		    	int y = loc.getY();
		    	if(ground[x][y] == 1)
		    	{
		    		
		    	}
		    }
		}
	}


}
