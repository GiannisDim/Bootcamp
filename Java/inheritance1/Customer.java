
public class Customer {
		
	private String name;
	
	private int year ;
	
	private String sex;
	
	private int customer_code;
	
	private static int id = 0;
	
	Customer(String name, int year, String sex){
		this.name = name;
		this.year = year;
		this.sex = sex;
		id ++;
		customer_code = id;
	}
	
	//getters and setters
	public String getName(){return this.name;}
	public void setName(String name){this.name = name;}
	
	public int getYear(){return this.year;}
	public void setYear(int year){this.year = year;}
	
	public String getSex(){return this.sex;}
	public void setSex(String sex){this.sex = sex;}
	
	public int getID(){return customer_code;}
	
	public String toString(){
		return "Customer ID: "+getID()+"| Name: "+this.getName()+"| Year:"+this.getYear()+"| Sex: "+this.getSex();
	}
	
}
