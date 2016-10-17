public class Exercise5{
  public static void main(String args[]){
    for(double i=1; i<6; i++){
      double x = 0;
      for(double j=1; j< i+1; j++){
        x += (1/j);
      }
      System.out.println(x);
    }
  }
}
