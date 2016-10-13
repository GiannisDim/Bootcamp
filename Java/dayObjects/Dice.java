public class Dice{
  public static void main(String args[]){
          roll();
  }

  public static void roll(){
    int count = 0;
    int stop = 0;
    int dice1;
    int dice2;
    do{
      dice1 = (int)(Math.random()*6+1);
      dice2 = (int)(Math.random()*6+1);
      count = count + 1;
      if(dice1 == 1 && dice2 == 1){
        stop = 1;
      }
    }while(stop == 0);
    System.out.print(count);
  }
}
