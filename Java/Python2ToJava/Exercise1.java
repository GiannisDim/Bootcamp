import java.util.Scanner;
public class Exercise1{

	public static void main (String args []){
		System.out.println("Enter Tax Identification");
		Scanner number = new Scanner(System.in);
		int num = number.nextInt();
		int [] digits= new int[10];
		for(int i = 0; i < 9; i++){
			int piliko = num/10;
			int ypoloipo = num % 10;
			num = piliko;
			digits[i] = ypoloipo;
		}

		int sum = 0;
		double x =0;
		for(int i = 0; i < 8; i++){
			x = Math.pow(2,i+1);
			int y = (int) x;
			digits[i+1] = digits[i+1]*y;
			sum = sum + digits[i+1];
		}

		int rem = 0;
		rem = (sum % 11) % 10;

		if(rem == digits[0]){
			System.out.println("Tax Identification Number valid.");
		}else{
			System.out.println("Tax Identification Number not valid.");
		}

	}
}