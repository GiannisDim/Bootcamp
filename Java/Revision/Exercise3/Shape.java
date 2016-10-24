package Exercise3;

public abstract class Shape {
	
	private int sides;
	
	public Shape(int sides){
		this.sides = sides ;
	}
	
	//setters and getters
	public int getSides() {return sides;}
	public void setSides(int sides) {this.sides = sides;}
	
	//abstract methods
	public abstract double area();
	public abstract double perimeter();
	public abstract void draw();

	//method toString
	public String toString(){
		return "Sides :"+this.getSides();
	}
	
	
}
