package Exercise2;

public class TestRectangle {

	public static void main(String[] args) {
		
		Rectangle shape1 = new Rectangle(5,3);
		Rectangle shape2 = new Rectangle(6,6);
		
		shape1.areEqual(shape2);
		shape1.draw();
		System.out.println(shape2.isSquare());
		System.out.println(shape1.copy().toString());

	}

}
