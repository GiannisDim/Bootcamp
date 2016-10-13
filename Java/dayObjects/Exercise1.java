public class Exercise1{
  public static void main(String args[]){
        bootCamp(91,25);
  }

  public static void bootCamp(int num1, int num2){
    int x = 0;
    if(num1 < num2){
      x = (int)(Math.sqrt(Math.abs(num2 - num1)));
      System.out.print(x);
    }else{
      x = num1 + num2;
      System.out.print(x);
    }
  }
}
