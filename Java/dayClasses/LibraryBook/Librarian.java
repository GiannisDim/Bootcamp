class Librarian{

  private Library library;

  public Librarian(Library library){
    this.library = library;
  }

  public Library getLibrary(){return this.library;}
  public Library setLibrary(Library library){return this.library = library;}


  public void findMeBooksFromAuthor(String a){
    System.out.println("\nBooks by author "+a);
    library.printBookFromAuthor(a);
  }

  public void findMeAvailableBooks(){
    System.out.println("\nThe following book are available at the library for renting: ");
    library.printAvailableBooks();
  }

  public void findMeBook(String b){
    System.out.println("\nBook found in the library!");
    library.printBookDetails(b);
  }

}
