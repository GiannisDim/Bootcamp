package Exercise2;

public class Rectangle {
	
	private int lengtha;
	private int lengthb;
	
	//default constructor
	public Rectangle(){
		
	}
	
	// overload constructor
	public Rectangle(int lengtha, int lengthb){
		this.lengtha = lengtha;
		this.lengthb = lengthb;
	}
	
	//setters and getters
	public int getLengtha(){return this.lengtha;}
	public void setLengtha(int lengtha){this.lengtha = lengtha;}
	
	public int getLengthb(){return this.lengthb;}
	public void setLengthb(int lengthb){this.lengthb = lengthb;}
	
	public String toString(){
		return "Length a: "+this.getLengtha()+"\nLength b: "+this.getLengthb();
		
	}
	
	public void areEqual(Rectangle shape2){
		if(this.getLengtha()+this.getLengthb() == shape2.getLengtha()+shape2.getLengthb()){
			System.out.println("Rectangles are equal.");
		}else{
			System.out.println("Rectangles are not equal.");
		}
	}
	
	public boolean isSquare(){
		if(this.getLengtha() == this.getLengthb()){
			return true;
		}else{
			return false;
		}
	}
	
	public void draw(){
		for(int i=0; i<=this.getLengthb();i++){
			for(int j=0; j<=this.getLengtha(); j++){
				if(i>0 && i< this.getLengthb()){
					if(j>0 && j<this.getLengtha()){
						System.out.print(" ");
					}else{
						System.out.print("*");
					}
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public Rectangle copy(){
		return new Rectangle(this.getLengtha(),this.getLengthb());
	}
	
}
