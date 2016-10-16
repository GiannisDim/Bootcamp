class Author{

  // author name
    private String name;

  //getter for name
    public String getName(){return this.name;}
  // setter for name
    public String setName(){return this.name = name;}

  // auhtor constructor
    public Author(String name){
      this.name = name;
    }

  // toString method
    public String toString(){
         return this.getName();
    }

}
