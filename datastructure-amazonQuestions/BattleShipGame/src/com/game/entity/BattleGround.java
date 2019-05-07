package com.game.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.game.constants.BattleShipType;

public class BattleGround {
	private Location boundaries;
	private Map<Player, Map<BattleShipType, List<BattleShip>>> mapShip = new HashMap<>();
	private Player player;

	private int[][] battleGridGround = new int[26][9];

	public BattleGround() {
	}

	public BattleGround(Location boundaries,Player p) {
		this.boundaries = boundaries;
		// mapShip.put(type, ship);
		this.player =p;
	}

	public Location getBoundaries() {
		return boundaries;
	}

	public void setBoundaries(Location boundaries) {
		this.boundaries = boundaries;
	}

	public boolean validateBattleArea(Location loc) {
		int row = loc.getX() - 'A';
		int col = loc.getY();
		if (row >= 0 && row <= 26 && col >= 1 && col <= 9) {
			return true;
		} else
			return false;
	}

	public void addShipToBattleGround(BattleShipType type,BattleShip ship,Player p)
	{
		
		Location loc = ship.getLoc();
		Integer dim[] = ship.getDimension();
		if(validateBattleArea(loc))
		{
			int x = loc.getX()-'A';
			int y = loc.y;
			battleGridGround[x][y]=1;
			
			int x1=x+dim[0];
			int y1=y+dim[1];
			
			 if(x1>=0 && x1<=26 && y>=1 && y<=9)
			 {
				 for(int i=x;i<x1;i++)
					{
						for(int j=y;j<y1;j++)
						{
							battleGridGround[x][y] = 1;
						}
					}
			 }
			
		}
		
		Map<BattleShipType,List<BattleShip>> map = mapShip.get(p);
		if(map == null)
		{
			HashMap<BattleShipType,List<BattleShip>> map2 = new HashMap<>();
			List<BattleShip> list = new ArrayList<>();
			list.add(ship);
			map2.put(type, list);
		}
		else
		{
			List<BattleShip> list = map.get(type);
			list.add(ship);
		}
 }
	
	public Map<Player, Map<BattleShipType, List<BattleShip>>> getMapShip() {
		return mapShip;
	}

	public void setMapShip(Map<Player, Map<BattleShipType, List<BattleShip>>> mapShip) {
		this.mapShip = mapShip;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public int[][] getBattleGridGround() {
		return battleGridGround;
	}

	public void setBattleGridGround(int[][] battleGridGround) {
		this.battleGridGround = battleGridGround;
	}

	public List<Location> getMissile(BattleShipType type,Player p1)
	{
		
		
		return null;
	}
}
