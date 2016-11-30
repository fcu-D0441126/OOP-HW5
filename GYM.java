package fcu.iecs.oop.pokemon;

import java.util.Random;

public class GYM {
	public static void fight(Pokemon p1, Pokemon p2){
		Random ran=new Random();
		int winner=ran.nextInt(2);
		if(winner==0){
			System.out.println("Winner is ["+p1.getName()+"].");
			p1.setCP(p1.getCP()+500);
		}
		else{
			System.out.println("Winner is ["+p2.getName()+"].");
			p2.setCP(p2.getCP()+500);
		}
	}

}