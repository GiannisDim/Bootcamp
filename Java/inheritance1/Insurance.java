
public class Insurance {

	protected int  customer_code;
	
	protected int insurance_code;
	
	protected static int id=0;
	
	protected int duration;
	
	
	Insurance(int customer_code, int duration){
		
		this.customer_code = customer_code;
		this.duration = duration;
		id ++;
		insurance_code = id;
	}
	
	public int getID(){return this.customer_code;}
	public void setID(int id){this.customer_code = id;}
	
	public int getInsuranceID(){return insurance_code;}
	
	public int getDuration(){return this.duration;}
	public void setDuration(int duration){this.duration = duration;}
	
	public String toString(){
		return "CustomerID: "+this.getID()+"| Insurance ID: "+this.getInsuranceID()+"| Duration: "+this.getDuration();
	}
	
	//calculate insurance method
	public int costCalculate(){
		return 100;
	}
	
	//printing all stored insurance
	public static void storedInsurance(){
		for(int i=0; i<Test.insurance.length;i++){
			System.out.println(Test.insurance[i].toString());
		}
	}

	// print a particular insurance
	public static void particularIns(int insid){
		for(int i=0; i< Test.insurance.length; i++){
			if(Test.insurance[i].getInsuranceID() == insid){
				System.out.println(Test.insurance[i].toString());
			}
		}	
	}
	
	public static void particularCid(int id){
		for(int i=0; i<Test.insurance.length;i++){
			if(Test.insurance[i].getID() == id){
				System.out.println(Test.insurance[i].toString());
			}
		}
	}

}
