package Exercise9;
import java.math.BigInteger;

public class PrimeFactors {

	public static void main(String[] args) {
		
		BigInteger num = new BigInteger("600851475143");
		System.out.println(primeFactors(num));
		
		
	}
	
	public static BigInteger primeFactors(BigInteger number){
		BigInteger n = number;
		BigInteger max = BigInteger.ZERO;
		int res;
		for(BigInteger i = new BigInteger("2"); i.compareTo(n) <=0; i= i.add(BigInteger.ONE) ){
			res = n.mod(i).compareTo(BigInteger.ZERO);
			if(res == 0){
				n = n.divide(i);
				max = i;
			}
		}
		return max;
	}

}
