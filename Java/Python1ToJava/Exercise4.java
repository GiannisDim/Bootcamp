import java.util.Scanner;
public class Exercise4 {
  public static void main(String args[]){
    int [] array = new int[3];
      for(int i=0; i<3; i++){
        System.out.print("Give a number :");
        Scanner number = new Scanner(System.in);
        array[i] = number.nextInt();
      }
    double y = Math.pow(array[1],2) - (4 * array[0] * array[2]);
    if(y < 0){
      System.out.println("Sorry, no real-valued solutions exist");
    }else{
      double x = ((- array[1]) + Math.sqrt(y))/(2 * array[0]);
      x = (array[0] * Math.pow(x,2)) + (array[1]*x) + array[2];
      System.out.println(x);
      double z = ((- array[1]) - Math.sqrt(y))/(2 * array[0]);
      z = (array[0] * Math.pow(z,2)) + (array[1]*z) + array[2];
      System.out.println(z);

    }
  }
}
