import java.util.Scanner;
public class Exercise7{

  public static void main(String args[]){
    System.out.print("Enter number of pronic numbers: ");
    Scanner reader = new  Scanner(System.in);
    int a = reader.nextInt();
    for(int i=1; i<a+1; i++){
      int y = i*(i+1);
      System.out.print(y+" ");
    }
  }

}
