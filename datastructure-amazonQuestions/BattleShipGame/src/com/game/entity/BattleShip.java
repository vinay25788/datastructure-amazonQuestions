package com.game.entity;

import com.game.constants.BattleShipType;

public class BattleShip {
	
		private Player p;
		private BattleShipType type;
		private Location loc;
		private Integer[] dimension;
		
		public BattleShip() {
		}
		
		BattleShip(Player p,BattleShipType type,Location loc,Integer[] dim) {
			
			this.p = p;
			this.type = type;
			this.loc =loc;
			this.dimension = dim;
		}

		public Player getP() {
			return p;
		}

		public void setP(Player p) {
			this.p = p;
		}

		public BattleShipType getType() {
			return type;
		}

		public void setType(BattleShipType type) {
			this.type = type;
		}

		public Location getLoc() {
			return loc;
		}

		public void setLoc(Location loc) {
			this.loc = loc;
		}

		public Integer[] getDimension() {
			return dimension;
		}

		public void setDimension(Integer[] dimension) {
			this.dimension = dimension;
		}
		
		
}
