import java.util.Scanner;
public class Exercise2{
  public static void main(String args[]){
    int i = 50;
    int sum = 0;
    while(i >= 1){
      System.out.print("Enter number of "+i+" eurobanknotes :");
      Scanner number = new Scanner(System.in);
      int euro = number.nextInt();
      int z = i * euro;
      if(i > 20){
        i = i - 30;
      }else{
        i = i / 2;
      }
      sum = sum + z;
    }
    System.out.println("You have "+sum+" euros");
  }
}
