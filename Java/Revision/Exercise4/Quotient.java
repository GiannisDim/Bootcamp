package Exercise4;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Quotient {
	
	
	
	public static void main(String[] args) {
		int a = 0 ;
		while(a == 0){
			System.out.println("Give two numbers");
			Scanner reader = new Scanner(System.in);
			int result = 0;
			try{
				int numerator = reader.nextInt();
				int denominator = reader.nextInt();
				result = calcQuotient(numerator,denominator);
			}catch (ArithmeticException ex1){
				System.out.println("Cant add 0 in denominator");
			}catch (InputMismatchException ex2){
				System.out.println("Strings not available. Only numbers");
			}
			if(result != 0){
				System.out.println(result);
				a = 1;
				reader.close();
			}
		}
			
		
		
		

	}
	
	public static int calcQuotient(int numerator, int denominator) throws ArithmeticException{
		
		return (numerator/denominator);
		
	}

}
