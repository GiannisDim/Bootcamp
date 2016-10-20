
public class Health extends Insurance {

	private int expense;
	
	Health(int customer_code, int duration, int expense){
		super(customer_code, duration);
		this.expense = expense;
	}
	
	public int getExpense(){return this.expense;}
	public void setExpense(int expense){this.expense = expense;}
	
	public String toString(){
		return super.toString()+"| Cost: "+costCalculate()+"| Medical expense: "+this.expense+"| Insurance type: Health";
	}
	
	public int costCalculate(){
		
		if(Test.customers[getID()-1].equals("male")){
			return super.costCalculate()+(duration * 7)+50;
		}else{
			return super.costCalculate()+(duration * 70);
		}
	}
	
}

