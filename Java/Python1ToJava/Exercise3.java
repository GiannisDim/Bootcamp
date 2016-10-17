import java.util.Scanner;
public class Exercise3{
  public static void main(String args[]){
    int [] array = new int[3];
      for(int i=1; i<4; i++){
        System.out.print("Add the value for side " +i+" :");
        Scanner number = new Scanner(System.in);
        array[i-1] = number.nextInt();
      }
    double r = 0;
    r = (array[0]+array[1]+array[2])*(array[1]+array[2]-array[0])*(array[0]-array[1]+array[2])*(array[0]+array[1]-array[2]);
    double a = (0.25) * Math.sqrt(r);
    System.out.println(a);
  }
}
