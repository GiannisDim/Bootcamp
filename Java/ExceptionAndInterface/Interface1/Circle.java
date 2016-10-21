package Interfaces;

public class Circle implements Shape {
	
	protected double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	public double getRadius(){return this.radius;}
	public void setRadius(double radius){this.radius = radius;}
	
	@Override
	public double getParameter(){
		return (2*3.14*this.getRadius());
	}

	@Override
	public double getArea() {
		return (2*3.14*Math.pow(this.getRadius(), 2));
	}
}
