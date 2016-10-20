import java.util.Scanner;
public class Test {
		
	
	public static Customer[] customers = new Customer[10];
	public static Insurance[] insurance = new Insurance[10];
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cust1 = new Customer("Giannis",1989,"male");
		Customer cust2 = new Customer("Dimitris",1980,"male");
		Customer cust3 = new Customer("Olga",1970,"female");
		Customer cust4 = new Customer("Thanos",1979,"male");
		Customer cust5 = new Customer("Kwstas",1993,"male");
		Customer cust6 = new Customer("Dimitra",1989,"female");
		Customer cust7 = new Customer("Antonis",1986,"male");
		Customer cust8 = new Customer("Maria",1981,"female");
		Customer cust9 = new Customer("Stefanos",1971,"male");
		Customer cust10 = new Customer("Evi",1987,"female");
		
		customers[0] = cust1;
		customers[1] = cust2;
		customers[2] = cust3;
		customers[3] = cust4;
		customers[4] = cust5;
		customers[5] = cust6;
		customers[6] = cust7;
		customers[7] = cust8;
		customers[8] = cust9;
		customers[9] = cust10;
		
		Insurance ins1 = new Health(4,4,5);
		Insurance ins2 = new Life(2,2,9);
		Insurance ins3 = new Life(3,7,8);
		Insurance ins4 = new Health(1,3,3);
		Insurance ins5 = new Life(7,8,4);
		Insurance ins6 = new Health(6,10,5);
		Insurance ins7 = new Health(5,3,6);
		Insurance ins8 = new Life(8,1,5);
		Insurance ins9 = new Life(9,9,7);
		Insurance ins10 = new Life(10,4,2);
		
		insurance[0] = ins1;
		insurance[1] = ins2;
		insurance[2] = ins3;
		insurance[3] = ins4;
		insurance[4] = ins5;
		insurance[5] = ins6;
		insurance[6] = ins7;
		insurance[7] = ins8;
		insurance[8] = ins9;
		insurance[9] = ins10;
		
		int z = 1;
		do{
		System.out.println("***********Menu***********");
		System.out.println("1. Print all Insurance");
		System.out.println("2. Search insurances by customer code");
		System.out.println("3. Search insurances by insurace code ");
		
		Scanner reader = new Scanner(System.in);
		int input = reader.nextInt();
		if(input == 1){
			for(int i=0; i<insurance.length; i++){
				System.out.println(insurance[i].toString());
			}
		}else if(input == 2){
			System.out.println("Give a customer code");
			Scanner reader2 = new Scanner(System.in);
			int a = reader2.nextInt();
			Insurance.particularCid(a);
		}else if(input == 3){
			System.out.println("Give an insurance code");
			Scanner reader3 = new Scanner(System.in);
			int x = reader3.nextInt();
			Insurance.particularIns(x);
		}else if(input == 0){
			System.out.println("GoodBye!!");
			z = 0;
		}
		}while(z != 0);
		
	}

}
