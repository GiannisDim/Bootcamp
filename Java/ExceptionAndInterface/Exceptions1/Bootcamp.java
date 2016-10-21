package Exceptions1;

public class Bootcamp {
	
	public static void welcome(double d) throws DigitException, AnotherDigitException{
		if(d > 25){
			throw new DigitException();
		}else{
			throw new AnotherDigitException();
		}
	}
	
	public static int bye(){
		try{
			welcome(299.7);
		} catch (DigitException a){
			return 605;
		} catch (AnotherDigitException b){
			return 230;
		}
		
		try{
			welcome(230);
		} catch (DigitException a){
			return 605;
		} catch (AnotherDigitException b){
			return 230;
		}
		
		return 0;
	}
	
}
