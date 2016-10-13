public class Exercise3{

  public static void main(String args[]){
    int[] array = {1,2,3,4,5,6,7,8,9,10};
    int save = 0;
    for(int j=0; j < 10; j++){
      for(int i = 9; i > 0; i--){
        if(i == 9){
          save = array[i];
          int x = shift(array[i], array[i-1]);
          array[i] = x;
        }else{
          int x = shift(array[i], array[i-1]);
          array[i] = x;
        }
      }
      array[0] = save;
      for(int i = 0; i <10; i++){
        System.out.print(array[i]+" ");
      }
      System.out.println();
    }



  }
    public static int shift(int a, int b){
      a = b;
      return a;
    }


}
