public class Exercise1{
  public static void main(String args[]){
    for(int i=1; i<10; i++){
      for(int j=1; j<10; j++){
        if( 10 - j <= i){
          System.out.print(i);
        }else{
          System.out.print('0');
        }
      }
      System.out.println();
    }
  }
}
