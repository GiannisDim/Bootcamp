class Circle{

  // x coordinate
    private  int x;
  // y coordinate
    private int y;
  // circle's radius
    private int r;
  // final pi
    private final double pi;
  //count the number of created circles
    private static int number_of_circles ;

  // circle constructor
    Circle(){
      this.x = 0;
      this.y = 0;
      this.r = 3;
      this.pi = 3.14;
      number_of_circles += 1;
    }

  // overload constractor number 1
    Circle(int x,int y){
      this();
      this.x = x;
      this.y = y;
    }

  // overload constructor number 2
    Circle(int x,int y,int r){
      this();
      this.x = x;
      this.y = y;
      this.r = r;
    }


  // getter and setter x methods
    public int getX(){ return this.x;}
    public int setX(int x){ return this.x = x;}
  // getter and setter x methods
    public int getY(){return this.y;}
    public int setY(int y){ return this.y = y;}
  // getter and setter r methods
    public int getR(){return this.r;}
    public int setR(int r){return this.r = r;}

  // print method (prints the details of the circle)
    public void print(){
      System.out.println("I'm a circle at point ("+getX()+","+getY()+") with radius "+getR()+". Number of circles :"+number_of_circles);
      System.out.println("Area is :"+calculateArea());
      System.out.println("Perimeter is :"+calculatePerimeter());
    }

  // calculcateArea method (calculates and returns the area)
    public double calculateArea(){
      double r ;
      r = this.pi * (Math.pow(getR(),2));
      return r;
    }

  // calculatePerimeter (calculate and returns perimeter)
    public double calculatePerimeter(){
      double r ;
      r = 2 * this.pi * getR();
      return r;
    }

  // copy constructor
    public Circle copy(){
      Circle new_circle = new Circle();
      new_circle.x = this.x;
      new_circle.y = this.y;
      new_circle.r = this.r;
      return new_circle;
    }

  // cocentric method checking if two circles share the same center
    public boolean cocentric(Circle c){
        if(this.x == c.x && this.y == c.y){
            return false;
        }else{
            return true;
        }
    }




}
