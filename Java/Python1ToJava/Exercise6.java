import java.util.Scanner;
public class Exercise6{

  public static void main(String args[]){
    System.out.print("Enter number of triangle numbers : ");
    Scanner reader = new Scanner(System.in);
    int a = reader.nextInt();
    for(int i=1; i< a+1; i++){
      int y = (i*(i+1))/2;
      System.out.print(y+" ");
    }
  }
}
