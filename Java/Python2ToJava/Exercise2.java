import java.util.Scanner;
public class Exercise2{

  public static void main(String args[]){
    System.out.print("Enter binary number:");
    Scanner reader = new Scanner(System.in);
    String b = reader.next();
    char[] digit = new char[b.length()];
    int sum = 0 ;
    for(int i=0; i<b.length(); i++){
      digit[i] = b.charAt(i);
      if(digit[i] == '1'){
        sum = sum + 1;
      }
    }

    if(sum % 2 == 0){
      System.out.println("Parity check OK.");
    }else{
      System.out.println("Parity check not OK.");
    }

  }
}
