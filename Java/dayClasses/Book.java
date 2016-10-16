class Book{

  // book title
    private String title;
  // author
    private Author author;
  // isbn field
    private final String isbn;
  // physical copies
    private int physical_copies;
  // available copies
    private int available_copies;
  // rent time
    private int time_rented;

  // book constructor
    public Book(String title, Author author, String isbn, int physical_copies,int available_copies,int time_rented){
      this.title = title;
      this.author = author;
      this.isbn = isbn;
      this.physical_copies = physical_copies;
      this.available_copies = available_copies;
      this.time_rented = time_rented;
    }

  //setters and getters
    public String getTitle(){ return this.title; }
    public String setTitle(String title){ return this.title = title; }
    public Author getAuthor(){ return this.author; }
    public Author setAuthor(Author author){ return this.author = author; }
    public int getPhysicalCopies(){ return this.physical_copies; }
    public int setPhysicalCopies(int physical_copies){ return this.physical_copies = physical_copies;}
    public int getAvailableCopies(){ return this.available_copies; }
    public int setAvailableCopies(int available_copies){ return this.available_copies = available_copies; }
    public int getTimeRented(){return this.time_rented;}
    public int setTimeRented(int time_rented){ return this.time_rented = time_rented; }

  // toString method
    public String toString(){
      return "Book title :"+getTitle()+"| Author :"+author.toString()+"| Number of copies :"+getPhysicalCopies()+"| Available copies :"+getAvailableCopies()+"| Rented time :"+getTimeRented();
    }

  // checking for available copies to rent
    public void rentPhysicalCopy(){
      if(getPhysicalCopies() > 0){
        System.out.print("There are available copies.");
      }else{
        System.out.print("There are no available copies.");
      }
    }

  //checking available copy of the book
    public boolean isAvailable(){
      if(getAvailableCopies()>=1){
        return true;
      }else{
        return false;
      }
    }

  //checking if the given name is the name of an author
   public boolean hasAuthor(String name){
      if(author.toString() == name){
        return true;
      }else{
        return false;
      }
    }

}
