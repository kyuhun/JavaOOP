package encapsulation;

public class Dice {

	
/* ===== Field ======*/
	private int dice1;
	

 /*=======Constructor========*/	
	public Dice() {
		// TODO Auto-generated constructor stub
	this.dice1 =(int) ((Math.random()*6))+1;
	}
/*=====   MeberMehod ====*/
public int getDice1() {
	return dice1;
}
}
