package Exercise3;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle(){
		super(0);
	}
	
	public Circle(double radius){
		super(0);
		this.radius = radius;
	}
	
	//setters and getters
	public double getRadius(){return this.radius;}
	public void setRadius(double radius){this.radius = radius;}
	
	public double area(){
		return (2*3.14*(Math.pow(this.getRadius(), 2)));
	}
	
	public double perimeter(){
		return (2*3.14*this.getRadius());
	}

	public void draw(){
		
	}
	
}
