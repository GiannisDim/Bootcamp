package Exercise3;

public class TestShape {

	public static void main(String[] args) {
		
		Shape rer1 = new Rectangle(2,3);
		Rectangle rec2 = new Rectangle(3,5);
		
		System.out.println(rer1.area());
		System.out.println(rec2.area());
		
		
		rec2.areEqual((Rectangle)rer1);
		System.out.println(((Rectangle)rer1).isSquare());
		
		Shape rec3 = new Circle(4.3);
		System.out.println(rec3.area());
		System.out.println(rec3.perimeter());
		
		Shape[] shapes = {rer1, rec2, rec3};
		for(int i=0; i<shapes.length; i++){
			System.out.println(shapes[i].toString());
		}
		
		
		
		
	}

}
