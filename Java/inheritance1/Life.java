
public class Life extends Insurance {
	
	private int amount ;
	
	Life(int customer_code, int duration, int amount){
		super(customer_code, duration);
		this.amount = amount;
	}
	
	public int getAmount(){return this.amount;}
	public void setAmount(int amount){this.amount = amount;}
	
	public String toString(){
		return super.toString()+"| Cost: "+costCalculate()+"| Amount spend: "+this.amount+"| Insurance type: Life";
	}
	
	public int costCalculate(){
		return (super.costCalculate()+(duration*5)) ;
	}
	
}
