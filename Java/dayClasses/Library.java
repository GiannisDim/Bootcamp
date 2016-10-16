class Library{

  // book table
    private Book[] books;

  // constructor
    public Library(Book[] books){
      this.books = books;
  }

  //getter and setter
    public Book[] getBooks(){ return this.books; }
    public Book[] setBooks(Book[] books){ return this.books = books; }

  //check the book collection and print those that are available
    public void printAvailableBooks(){
      for(int i=0; i < this.books.length; i++){
        if(this.books[i].isAvailable()){
          System.out.println(this.books[i].toString());
        }
      }
    }

  // searche for a book by title
    public void printBookDetails(String b){
      int x = 0;
      for(int i=0; i< this.books.length; i++){
        if(this.books[i].getTitle() == b){
          System.out.println(this.books[i].toString());
          x = 1;
        }
      }
      if(x == 0){
        System.out.println("This book doesn't exist");
      }
    }

  // prints only the books for a specific author
    public void printBookFromAuthor(String a){
      for(int i=0; i< this.books.length; i++){
        if(this.books[i].getAuthor().getName() == a){
          System.out.println(this.books[i].toString());
        }
      }
    }

}
