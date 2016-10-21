package Interfaces;

public class ResizableCircle extends Circle implements Resizable {
	
	public ResizableCircle(double radius) {
		super(radius);
	}

	@Override
	public void resize(double r) {
		super.setRadius(r * super.getRadius());
		
	}
	
}
