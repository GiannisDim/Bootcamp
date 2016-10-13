public class Exercise4{

  public static void main(String args[]){
    int[] array = {1,2,3,4,5,6,7,8,9,10};
    Double [] doubles = new Double[10];
    for(int i = 0; i < 10; i++){
      Double z = new Double(array[i]);
      doubles[i] = z;
    }
    double save = 0.0 ;
    for(int j=0; j < 10; j++){
      for(int i = 9; i > 0; i--){
        if(i == 9){
          save = doubles[i];
          double x = shift(doubles[i], doubles[i-1]);
          doubles[i] = x;
        }else{
          double x = shift(doubles[i], doubles[i-1]);
          doubles[i] = x;
        }
      }
      doubles[0] = save;
      for(int i = 0; i <10; i++){
        System.out.print(doubles[i]+" ");
      }
      System.out.println();
    }
  }

    public static double shift(double a, double b){
      a = b;
      return a;
    }


}
