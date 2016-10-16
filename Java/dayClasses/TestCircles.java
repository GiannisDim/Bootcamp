public class TestCircles{

  //creating main method
    public static void main(String args[]){
      Circle c = new Circle();
      c.setX(5);
      c.setY(3);
      c.setR(4);
      c.print();

      Circle c1 = new Circle(5,5);
      c1.print();

      Circle c2 = new Circle(5,5,5);
      c2.print();
      System.out.println(c2.cocentric(c1));
      Circle c3 = c2.copy();
      c3.print();


    }

}
