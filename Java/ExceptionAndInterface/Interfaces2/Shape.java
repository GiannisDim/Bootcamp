package Interfaces2;

public class Shape implements Agreeable {
	
	int width;
	int height;
	
	Shape(){
		
	}
	
	Shape(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public int getWidth(){return this.width;}
	public void setWidth(int width){this.width = width;}
	
	public int getHeighth(){return this.height;}
	public void setHeight(int height){this.height = height;}
	
	
	public int calcArea(){
		return this.getHeighth()*this.getWidth();
	}
	
	@Override
	public void isSmallerThan(Agreeable a) {
		Shape x = (Shape)a;
		if(this.calcArea() < x.calcArea()){
			System.out.println(x.calcArea());
		}else{
			System.out.println(this.calcArea());
		}
	}
}
