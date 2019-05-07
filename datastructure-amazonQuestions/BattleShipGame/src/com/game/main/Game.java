package com.game.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.game.constants.BattleShipType;
import com.game.entity.BattleGround;
import com.game.entity.BattleShip;
import com.game.entity.Location;
import com.game.entity.Player;

public class Game {

	public static void main(String[] args) {
		BattleGround gp1 = new BattleGround();
		BattleGround gp2 = new BattleGround();
		Location locofBoundaries = new Location();
		Scanner sc  =  new Scanner(System.in);
		System.out.println("Enter Area of Boundaries");
		
		int y = sc.nextInt();
		String xs = sc.nextLine();
		char x = xs.charAt(0);
		locofBoundaries.setX(x);
		locofBoundaries.setY(y);
		while(!gp1.validateBattleArea(locofBoundaries))
		{
			System.out.println("you have entered wrong boundaries Please try again");
			System.out.println("Enter Area of Boundaries");
			
			 y = sc.nextInt();
			 xs = sc.nextLine();
			 x = xs.charAt(0);
			locofBoundaries.setX(x);
			locofBoundaries.setY(y);
		}
		BattleShip battleShipforPlayer1 = new BattleShip();
		BattleShipType type=null;
		System.out.println("enter the battle ship type");
		String typ = sc.next();
		do {
		if(typ.equalsIgnoreCase("p"))
			type = BattleShipType.P;
		else if(typ.equalsIgnoreCase("q"))
			type = BattleShipType.Q;
		}while(type== BattleShipType.P || type == BattleShipType.Q);
			
		System.out.println(" enter the dimension of battleship");
		Integer [] dim = new Integer[2];
		dim[0] = sc.nextInt();
		dim[1] = sc.nextInt();
		
		System.out.println("enter the location of battleship 1 for player 1");
		
		Location p1Location = new Location();
		 y = sc.nextInt();
		 xs = sc.nextLine();
		 x = xs.charAt(0);
		p1Location.setX(x);
		 p1Location.setY(y);
		 /*do
		 {
			 
		 }while(true);*/
		 Player p1 = new Player();
		 battleShipforPlayer1.setP(p1);
		 battleShipforPlayer1.setType(type);
		 battleShipforPlayer1.setDimension(dim);
		 gp1.setPlayer(p1);
		 gp1.addShipToBattleGround(type, battleShipforPlayer1,p1);
		System.out.println("enter the location of battleship 1 for player 2");
		BattleShip battleShipforPlayer2 = new BattleShip();
		Player p2 = new Player();
		Location p2Location = new Location();
		 y = sc.nextInt();
		 xs = sc.nextLine();
		 x = xs.charAt(0);
		 p2Location.setX(x);
		 p2Location.setY(y);
		 battleShipforPlayer2.setP(p2);
		 battleShipforPlayer2.setType(type);
		 battleShipforPlayer2.setDimension(dim);
		 
		 gp2.setBoundaries(locofBoundaries);
		 gp2.setPlayer(p2);
		 gp2.addShipToBattleGround(type, battleShipforPlayer2,p1);
		 System.out.println(" The missile target for player 1 ");
		 List<Location> list = new ArrayList<>();
		 list.add(new Location('A',1));
		 list.add(new Location('B',2));
		 list.add(new Location('B',2));
		 list.add(new Location('B',3));
		 System.out.println(list);
		 p1.setList(list);
		 
		 System.out.println(" The missile target for player 2");
		 List<Location> listforP2 = new ArrayList<>();
		 listforP2.add(new Location('A',1));
		 listforP2.add(new Location('B',2));
		 listforP2.add(new Location('B',3));
		 listforP2.add(new Location('A',1));
		 listforP2.add(new Location('D',1));
		 listforP2.add(new Location('E',1));
		 listforP2.add(new Location('D',4));
		 listforP2.add(new Location('D',4));
		 listforP2.add(new Location('D',5));
		 listforP2.add(new Location('D',5));
		 p2.setList(listforP2);
		 
		
	}
}
