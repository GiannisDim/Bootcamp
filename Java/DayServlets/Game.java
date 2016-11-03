package org.afdemp.bootcamp.gdim;

public class Game {

	private int count = 0;
	private int[] dice = {0,0} ;
	
	public String play(){
		dice[count]= (int)((Math.random()*6)+1);
		if((++count % 2) != 0){
			return ""+dice[count-1]+"";
		}else{
			if(dice[0] < dice[1]){
				count = 0;
				return "Lost with dice number: "+dice[0]+" from dice number: "+dice[1];
			}else if(dice[0] > dice[1]){
				count = 0;
				return "Won with dice number: "+dice[0]+" against dice number: "+dice[1];
			}else{
				count = 0;
				return "Its a draw";
			}
		}
	}

}
